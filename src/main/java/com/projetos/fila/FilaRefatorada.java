package com.projetos.fila;

public class FilaRefatorada<T> {

    private NoGenerics<T> refNoEntradaFila;

    public FilaRefatorada() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj){
        NoGenerics novoNo = new NoGenerics(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            NoGenerics primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                   break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            NoGenerics primeiroNo = refNoEntradaFila;
            NoGenerics noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoGenerics noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto= "+ noAuxiliar.getObject() + "}] --->";
                if(noAuxiliar.getRefNo() != null){
                   noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
