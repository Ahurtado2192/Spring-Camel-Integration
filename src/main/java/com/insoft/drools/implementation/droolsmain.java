package com.insoft.drools.implementation;

import java.io.IOException;
import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.WorkingMemory;

public class droolsmain {

	public static void main(String[] args) throws DroolsParserException,IOException {
		DroolsInstance droolsInstance = new DroolsInstance();
		WorkingMemory workingMemory = droolsInstance.executeDrools();

		Product product = new Product();
		product.setType("diamond");
		workingMemory.insert(product);
		workingMemory.fireAllRules();
		System.out.println(product.getDiscount());

		empleado emp=new empleado();
		emp.setNombre("pedro");
		
		
		workingMemory.insert(emp);
		workingMemory.fireAllRules();

		System.out.println(emp.getNumero());

	}

}
