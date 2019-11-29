public abstract class AbrirConta {

    private boolean querCartao = false;

    public final void criaConta() {
        System.out.println("Criando conta!");
        cadastrarPessoa();
        validar();
        depositoInicial();
        configurarLimite();
        cadastrarSenha();
        if (querCartao == true)
            solicitarCartao();
        finalizar();
    }

    public void setQuerCartao(boolean querCartao) {
        this.querCartao = querCartao;
    }

    public void finalizar(){
        System.out.println("Conta criada com sucesso!");
    }

    public void depositoInicial(){
        System.out.println("Fazendo deposito inicial...");
    }

    public void cadastrarSenha() {
        System.out.println("Cadastrando senha...");
    }

    public void solicitarCartao(){
        System.out.println("Solicitando cartao...");
    };

    protected abstract void cadastrarPessoa();
    protected abstract void validar();
    protected abstract void configurarLimite();

}
