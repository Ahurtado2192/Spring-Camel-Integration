package com.insoft.integracion;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insoft.dao.DataBaseIntf;
import com.insoft.pojo.Admin;

public class DataSourceBean implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"file:src/main/resources/META-INF/spring/camel-context.xml");

		DataBaseIntf baseIntf = (DataBaseIntf) applicationContext
				.getBean("DataBaseImpl");

		Timestamp ts = new Timestamp(new Date().getTime());

		Admin admin = new Admin();
		admin.setCargo("Consultor");
		admin.setfecha(ts);
		admin.setNombre("Alexis");

		// insertar un registro
		if (baseIntf.Insertar(admin)) {
			System.out.println("Registro Insertado");
		}

		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
