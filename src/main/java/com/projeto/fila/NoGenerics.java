package com.projeto.fila;

public class NoGenerics<T> {

    private T object;
    private NoGenerics<T> refNo;

    public NoGenerics() {
    }

    public NoGenerics(T object) {
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public NoGenerics getRefNo() {
        return refNo;
    }

    public void setRefNo(NoGenerics refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
