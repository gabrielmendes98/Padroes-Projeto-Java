public class CorrentePessoaJuridica extends AbrirConta {
    @Override
    protected void cadastrarPessoa() {
        System.out.println("Cadastrando pessoa juridica");
    }

    @Override
    protected void validar() {
        System.out.println("Validando pessoa juridica...");
    }

    @Override
    protected void configurarLimite() {
        System.out.println("Configurando Limite...");
    }

}
