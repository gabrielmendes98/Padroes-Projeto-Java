package Personagem;

import Ataque.*;
import Movimento.*;

public abstract class Personagem {
    private Ataque a;
    private Movimento m;

    void setAtaque(Ataque a){
        this.a = a;
    }

    public void atacar(){
        a.atacar();
    }

    void setMovimento(Movimento m){
        this.m = m;
    }

    public void movimentar(){
        m.movimentar();
    }
}
