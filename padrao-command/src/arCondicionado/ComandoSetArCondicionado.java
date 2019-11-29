/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arCondicionado;

import padrao.command.Comando;

/**
 *
 * @author gabrielms
 */
public class ComandoSetArCondicionado implements Comando{
    
    private ArCondicionado ar;
    private int temperatura;

    public ComandoSetArCondicionado(ArCondicionado ar, int temperatura) {
        this.ar = ar;
        this.temperatura = temperatura;
    }

    @Override
    public void executar() {
        ar.setTemperatura(this.temperatura);
    }

    @Override
    public void undo() {

    }
}
