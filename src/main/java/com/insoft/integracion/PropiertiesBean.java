package com.insoft.integracion;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.insoft.propierties.propierties;

public class PropiertiesBean implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"file:src/main/resources/META-INF/spring/camel-context.xml");
		propierties propierties = (propierties) applicationContext
				.getBean("propierties");
		exchange.getOut().setBody(propierties.getDescripcion());
		((ClassPathXmlApplicationContext)applicationContext).close();
	}

}
