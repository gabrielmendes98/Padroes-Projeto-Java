/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package som;

import padrao.command.Comando;

/**
 *
 * @author gabrielms
 */
public class ComandoSetSom implements Comando{
    
    private Som som;
    private int volume;

    public ComandoSetSom(Som som, int volume) {
        this.som = som;
        this.volume = volume;
    }

    @Override
    public void executar() {
        som.setTemperatura(this.volume);
    }

    @Override
    public void undo() {

    }
}
