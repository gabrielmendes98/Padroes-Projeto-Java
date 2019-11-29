public class Poupanca extends AbrirConta {

    @Override
    public void cadastrarPessoa(){
        System.out.println("Cadastrando pessoa fisica");
    }

    @Override
    public void validar(){
        System.out.println("Validando pessoa fisica...");
    }

    @Override
    protected void configurarLimite() {

    }
}
