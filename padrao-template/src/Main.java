/*
    ALUNOS:
    GABRIEL MENDES DE SOUZA SANTIAGO - 11621BCC015
    YAN LUCAS DAMASCENO DIAS - 11621BCC029

 */

public class Main {

    public static void main(String[] args) {

        AbrirConta poupanca = new Poupanca();
        AbrirConta cpFisica = new CorrentePessoaFisica();
        AbrirConta cpJuridica = new CorrentePessoaJuridica();

        poupanca.criaConta();
        System.out.println("-----------------");
        cpFisica.criaConta();
        System.out.println("-----------------");
        cpJuridica.criaConta();

    }
}
