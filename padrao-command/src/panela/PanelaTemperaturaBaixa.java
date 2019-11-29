package panela;

import padrao.command.Comando;

public class PanelaTemperaturaBaixa implements Comando {
    private Panela p;
    private Memento m;

    public PanelaTemperaturaBaixa(Panela p) {
        this.p = p;
    }

    @Override
    public void executar() {
        this.m = this.p.criarMemento();
        p.baixo();
    }

    @Override
    public void undo() {
        p.recuperarMemento(m);
    }
}
