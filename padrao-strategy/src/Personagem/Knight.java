package Personagem;

import Ataque.AtaqueEspada;
import Movimento.MovimentoLento;

public class Knight extends Personagem {
    public Knight(){
        setAtaque(new AtaqueEspada());
        setMovimento(new MovimentoLento());
    }
}
