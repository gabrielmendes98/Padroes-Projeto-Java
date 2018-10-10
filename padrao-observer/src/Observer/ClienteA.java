package Observer;

import Subject.Subject;
import Observer.Observer;

public class ClienteA implements Observer {
    private String titulo;
    private float valor;
    private Subject revista;

    public ClienteA(Subject revista){
        this.revista = revista;
        this.revista.registraObserver(this);
    }

    public void atualizar(String titulo, float valor){
        this.titulo = titulo;
        this.valor = valor;
    }

    public void exibir(){
        System.out.println("Titulo = " + this.titulo);
        System.out.println("Valor = " + this.valor);
    }
}
