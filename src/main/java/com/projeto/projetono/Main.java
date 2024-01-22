package com.projeto.projetono;

public class Main {

    public static void main(String[] args) {
        No<String> no1 = new No("Conteudo no1");
        No<String> no2 = new No("Conteudo no2");

        //Setando a referencia da memória do No2 no No1...
        no1.setProximoNo(no2);

        No<String> no3 = new No("Conteudo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No("Conteudo no4");
        no3.setProximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null;

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        No<String> obj = no2.getProximoNo();
        //O Conteudo guardado em obj, nesse caso, deve ser Conteudo no3
        System.out.println(obj);
        System.out.println(obj.getProximoNo());

        No<Integer> no5 = new No(10);
        no4.setProximoNo(no5);

        System.out.println("no4 = " + no4);
        System.out.println(no4.getProximoNo());

        System.out.println("Teste de metodo...");
        listarNos(no1);

    }

    public static void listarNos(No no) {

        while(no.getProximoNo() != null){
            System.out.println(no);
            no = no.getProximoNo();
        }
    }
}
