/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panela;

import padrao.command.Comando;

/**
 *
 * @author gabrielms
 */
public class PanelaTemperaturaAlta implements Comando{
    private Panela p;
    private Memento m;

    public PanelaTemperaturaAlta(Panela p) {
        this.p = p;
    }
    
    @Override
    public void executar() {
        this.m = this.p.criarMemento();
        p.alto();
    }

    @Override
    public void undo() {
        p.recuperarMemento(m);
    }
}
