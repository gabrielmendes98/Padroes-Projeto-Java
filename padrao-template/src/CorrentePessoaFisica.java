public class CorrentePessoaFisica extends AbrirConta {
    @Override
    protected void cadastrarPessoa() {
        System.out.println("Cadastrando pessoa fisica");
    }

    @Override
    protected void validar() {
        System.out.println("Validando pessoa fisica...");
    }

    @Override
    protected void configurarLimite() {
        System.out.println("Configurando Limite...");
    }
}
