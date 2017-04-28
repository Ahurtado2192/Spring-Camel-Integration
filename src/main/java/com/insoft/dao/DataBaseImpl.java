package com.insoft.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.insoft.pojo.Admin;

@Component("DataBaseImpl")
public class DataBaseImpl implements DataBaseIntf {
	private NamedParameterJdbcTemplate jdbcTemplate;
	private String insert = "insert into Admin (nombre, cargo, fecha) values (:nombre, :cargo, :fecha)";

	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public boolean Insertar(Admin admin) {
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(
				admin);
		return jdbcTemplate.update(insert, paramMap) == 1;

	}

}
