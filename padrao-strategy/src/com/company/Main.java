package com.company;

import Personagem.*;
import Ataque.*;
import Movimento.*;

public class Main {

    public static void main(String[] args) {
        Personagem p = new Archer();
        p.atacar();
        p.movimentar();

    }
}
