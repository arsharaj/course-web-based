// package com.google.calculators;

import java.lang.*;     // Imported by default and * imports only files and not folders
import java.util.ArrayList;
import calculators.BasicCalculator;
import calculators.EnhancedCalculator;
import others.A;

class Packages {
    public static void main(String args[]) {
        BasicCalculator basicCalculator = new BasicCalculator();
        EnhancedCalculator enhancedCalculator = new EnhancedCalculator();
        ArrayList list = new ArrayList();

        A a = new A();
        a.show();
        // System.out.println(a.num1);
        B b = new B();
        // System.out.println(b.num1);
        C c = new C();
        c.show();
    }
}