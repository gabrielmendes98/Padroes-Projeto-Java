/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forno;

/**
 *
 * @author gabrielms
 */
public class Forno {
    private int temperatura = 200;
    private int timer = 0;
    
    public void ligar(){
        System.out.println("Forno ligado");
    }
    
    public void desligar(){
        System.out.println("Forno desligado");
    }
    
    public void setTemperatura(int t){
        this.temperatura = t;
        System.out.println("Temperatura setada para " +  t);
    }
    
    public void setTimer(int t){
        this.timer = t;
        System.out.println("Timer setado para " + t + " minutos");
    }
}
