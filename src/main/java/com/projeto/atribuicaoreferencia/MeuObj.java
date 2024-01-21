package com.projeto.atribuicaoreferencia;

public class MeuObj {

    private Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    public MeuObj(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "" + num;
    }
}
