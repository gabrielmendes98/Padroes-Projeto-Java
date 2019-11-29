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
public class ComandoSetTempForno implements Comando {
    
    private Forno forno;
    private int temperatura;

    public ComandoSetTempForno(Forno forno, int temperatura) {
        this.forno = forno;
        this.temperatura = temperatura;
    }

    @Override
    public void executar() {
        forno.setTemperatura(this.temperatura);
    }

    @Override
    public void undo() {

    }
}
