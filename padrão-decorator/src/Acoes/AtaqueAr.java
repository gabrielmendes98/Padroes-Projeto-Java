package Acoes;

public class AtaqueAr extends AtaquesDecorator {
    Atacar ataque;

    public AtaqueAr(Atacar ataque){
        this.ataque = ataque;
    }

    @Override
    public String getDescricao() {
        return ataque.getDescricao() + "+ Ataque de ar";
    }

    @Override
    public float getDano() {
        return ataque.getDano() + (float) 30.00;
    }

}
