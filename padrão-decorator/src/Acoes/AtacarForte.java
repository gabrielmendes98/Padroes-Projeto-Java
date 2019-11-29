/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acoes;

/**
 *
 * @author a11621BCC029
 */
public class AtacarForte extends Atacar {
    public AtacarForte() {
        this.descricao = "Ataque forte";
    }

    @Override
    public float getDano() {
        return (float) 15.00;
    }

}
