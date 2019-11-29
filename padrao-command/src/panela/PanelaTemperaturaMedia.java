package panela;

import padrao.command.Comando;

public class PanelaTemperaturaMedia implements Comando {
    private Panela p;
    private Memento m;

    public PanelaTemperaturaMedia(Panela p) {
        this.p = p;
    }

    @Override
    public void executar() {
        this.m = this.p.criarMemento();
        p.medio();
    }

    @Override
    public void undo() {
        p.recuperarMemento(m);
    }
}
