package com.projeto.atribuicaoereferencia;

public class MeuOBJ {
    Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

    public MeuOBJ(Integer num) {
        this.num = num;
    }
}
