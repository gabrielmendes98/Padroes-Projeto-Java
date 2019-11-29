public class MarioCapa implements MarioState {
    public MarioState pegarCogumelo(){
        System.out.println("+1000 Pontos");
        return new MarioGrande();
    }

    public MarioState pegarFlor(){
        System.out.println("Mario Fogo");
        return new MarioFogo();
    }

    public MarioState pegarPena(){
        System.out.println("+1000 Pontos");
        return new MarioCapa();
    }

    public MarioState levarDano(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
}
