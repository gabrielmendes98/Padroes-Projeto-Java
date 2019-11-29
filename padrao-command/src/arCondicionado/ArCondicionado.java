/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arCondicionado;

/**
 *
 * @author gabrielms
 */
public class ArCondicionado {
    private int temperatura = 28;
    
    public void ligar(){
        System.out.println("Ar ligado");
    }
    
    public void desligar(){
        System.out.println("Ar desligado");
    }
    
    public void setTemperatura(int t){
        this.temperatura = t;
        System.out.println("Temperatura setada para " +  t);
    }
}
