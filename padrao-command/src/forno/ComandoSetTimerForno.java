/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forno;

import padrao.command.Comando;

/**
 *
 * @author gabrielms
 */
public class ComandoSetTimerForno implements Comando {
    
    private Forno forno;
    private int timer;

    public ComandoSetTimerForno(Forno forno, int timer) {
        this.forno = forno;
        this.timer = timer;
    }

    @Override
    public void executar() {
        forno.setTimer(this.timer);
    }

    @Override
    public void undo() {

    }
}
