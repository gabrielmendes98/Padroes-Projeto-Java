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
public class PanelaDesligada implements Comando{
    private Panela p;
    private Memento m;

    public PanelaDesligada(Panela p) {
        this.p = p;
    }
    
    @Override
    public void executar() {
        this.m = this.p.criarMemento();
        p.off();
    }

    @Override
    public void undo() {
        p.recuperarMemento(m);
    }
}
