package com.projeto.fila;

public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){

        return refNoEntradaFila == null? true : false;
    }

    public void enqueue(No novoNo) {

        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public No first() {

        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if(primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    return primeiroNo;
                }
            }
        }
        return null;
    }

    public No dequeue() {

        if(!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true) {
                if(primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while(true) {
                stringReturn += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    break;
                }
            }
        } else {
            stringReturn = "null";
        }

        return stringReturn;
    }
}
