package Personagem;

import Ataque.AtaqueVarinha;
import Movimento.MovimentoRapido;

public class Mage extends Personagem {
    public Mage(){
        setAtaque(new AtaqueVarinha());
        setMovimento(new MovimentoRapido());
    }
}
