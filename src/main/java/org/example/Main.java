package org.example;

import org.example.log.LogarithmicFunctionCalculator;
import org.example.trig.Cos;
import org.example.trig.Sin;
import org.example.trig.TrigonometricFunctionCalculator;
import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {

        double[] a = new double[]{
                -PI/6,
                -PI/4,
                -PI/3,
                -2*PI/3,
                -3*PI/4,
                -5*PI/6,
                -7*PI/6,
                -5*PI/4,
                -4*PI/3
        };

        for (double c: a) {
            System.out.printf("%s, %s\n", c, new TrigonometricFunctionCalculator().calculateValue(c, 1e-9));
        }

//        for (int i = 1; i <= 15; i += 1){
//            if (i == 5) continue;
//            System.out.printf("%s, %s\n", -i/5.0, new TrigonometricFunctionCalculator().calculateValue(-i/5.0, 0.000001));
//            //System.out.println(String.format("%s, %s", i/5.0, Math.log(i/5.0)));
//        }

//        System.out.println(new Sin().calculateValue(Math.PI/4, 0.000001));
//        System.out.println(new Cos().calculateValue(Math.PI/4, 0.000001));
    }
}