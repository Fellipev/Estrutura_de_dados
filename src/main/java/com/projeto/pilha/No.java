package com.projeto.pilha;

public class No {
    private int dado;
    private No proximoNo;

    public No(int dado) {
        this.proximoNo = null;
        this.dado = dado;
    }

    public No() {
        this.proximoNo = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }

}
