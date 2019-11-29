/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panela;

/**
 *
 * @author gabrielms
 */
public class Panela {

    private int temperatura;

    public Panela() {
        temperatura = 200;
    }

    public void alto(){
        temperatura = 280;
        System.out.println("Temperatura setada para " + temperatura);
    }

    public void medio(){
        temperatura = 240;
        System.out.println("Temperatura setada para " + temperatura);
    }

    public void baixo(){
        temperatura = 180;
        System.out.println("Temperatura setada para " + temperatura);
    }

    public void off(){
        temperatura = 0;
        System.out.println("Panela desligada");
    }

    public Memento criarMemento() { return new Memento(this.temperatura); }

    public void recuperarMemento(Memento memento) {
        this.temperatura = memento.getTemperatura();
    }

}
