package com.crio.qcalc;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
        System.out.println("Starting QCalc..");
        LogicCalculator calc = new LogicCalculator();
        // calc.OR(8, 6);        
        // calc.printResult();
        calc.AND(8, 6);
        calc.printResult();       
	}

}
