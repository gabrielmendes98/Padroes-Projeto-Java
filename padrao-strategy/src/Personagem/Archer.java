package Personagem;

import Ataque.*;
import Movimento.*;

public class Archer extends Personagem {
    public Archer(){
        setAtaque(new AtaqueArco());
        setMovimento(new MovimentoMedio());
    }
}
