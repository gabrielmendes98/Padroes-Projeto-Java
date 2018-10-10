package com.company;

import Observer.ClienteA;
import Subject.DadosRevista;

public class Main {

    public static void main(String[] args) {
        DadosRevista d = new DadosRevista();
        ClienteA c = new ClienteA(d);

        d.setTitulo("Sarve");
        d.setValor((float) 10.00);

        c.exibir();
    }
}
