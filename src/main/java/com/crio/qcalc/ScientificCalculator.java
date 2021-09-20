package com.crio.qcalc;

public class ScientificCalculator extends StandardCalculator{

    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        result = Math.sin(a);
    }
    public void cos(double a){
        result = Math.cos(a);
    }
    public void square(double a){
        multiply(a,a);
    }

}
