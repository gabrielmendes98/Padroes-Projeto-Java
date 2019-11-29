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
public class AtacarFraco extends Atacar {
    public AtacarFraco() {
        this.descricao = "Atque fraco";
    }

    @Override
    public float getDano() {
        return (float) 5.00;
    }
}
