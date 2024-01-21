package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + "\nintB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + "\nintB = " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("\n\n");
        System.out.println("objA = " + objA + "\nobjB = " + objB);

        objB.setNum(3);
        System.out.println("\nobjA = " + objA + "\nobjB = " + objB);

//        String a = "Ola";
//        String b = a;
//
//        System.out.println("A = " + a + " B = " + b);
//        b = "Hello";
//        System.out.println("A = " + a + " B = " + b);
    }
}
