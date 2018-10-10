package Subject;

import java.util.ArrayList;
import Observer.*;

public class DadosRevista implements Subject {
    private ArrayList<Observer> observer;
    private float valor;
    private String titulo;

    public DadosRevista(){
        observer = new ArrayList<>();
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
        atualizaObserver();
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void registraObserver(Observer observer){
        this.observer.add(observer);
    }

    public void removeObserver(Observer observer){
        int i = this.observer.indexOf(observer);
        if(i>=0)
            this.observer.remove(i);
    }

    public void atualizaObserver(){
        for(Observer o: this.observer){
            o.atualizar(this.titulo, this.valor);
        }
    }
}
