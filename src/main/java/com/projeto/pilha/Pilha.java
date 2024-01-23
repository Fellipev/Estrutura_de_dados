package com.projeto.pilha;

public class Pilha {

    private No refNoEntradaPilha;


    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setProximoNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getProximoNo();
            return noPoped;
        }

        return null;
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {

//        if(refNoEntradaPilha == null) {
//            return true;
//        }
//
//        return false;

        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringReturn = "---------------\n";
        stringReturn += "     Pilha\n";
        stringReturn += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {

            if (noAuxiliar != null) {
                stringReturn += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getProximoNo();
            } else {
                break;
            }
        }
        
        return stringReturn;
    }
}
