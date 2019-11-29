import Acoes.*;
import Acoes.AtaqueAr;
import Personagem.*;

/**
 * Alunos : Gabriel Mendes De Souza Santiago - 11621BCC015
 * Alunos : Yan Lucas Damasceno Dias - 11621BCC029
 * Alunos : Gabriel Mendes Santiago - 11621bcc015
 * @author a11621BCC029
 */


public class Main {


    public static void main(String[] args) {
        /*
        Atacar atacar = new AtacarForte();

        atacar = new AtaqueAr(atacar);

        System.out.println("Ataques:");
        System.out.println(atacar.getDescricao() + '\n' + "Dano causado:\n" + atacar.getDano());
        */

        System.out.println("\nPersonagem 1");
        Personagem p1 = new Personagem1();
        p1.Pular();
        p1.Correr();
        p1.Atacar();
    }

}
