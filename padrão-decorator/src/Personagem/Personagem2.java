/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

import Acoes.*;

/**
 *
 * @author a11621BCC029
 */
public class Personagem2 extends Personagem{
    public Personagem2(){
        setAtaque(new Atacar());
        setCorrer(new CorrerRapido());
        setPular(new PularAlto());
    }
}
