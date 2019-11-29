public class MarioGrande implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("+1000 Pontos");
        return new MarioGrande();
    }

    public MarioState pegarFlor(){
        System.out.println("Mario Fogo");
        return new MarioFogo();
    }

    public MarioState pegarPena(){
        System.out.println("Mario com Capa");
        return new MarioCapa();
    }

    public MarioState levarDano(){
        System.out.println("Mario Pequeno");
        return new MarioPequeno();
    }
}
