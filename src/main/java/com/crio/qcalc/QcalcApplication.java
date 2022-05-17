package com.crio.qcalc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
        System.out.println("Starting QCalc..");
        StandardCalculator calc = new StandardCalculator(); 
        calc.add(1, 2); 
        System.out.println(calc.getResult());
	}

}
