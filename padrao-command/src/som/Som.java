/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package som;

/**
 *
 * @author gabrielms
 */
public class Som {
    private int volume = 15;
    
    public void ligar(){
        System.out.println("Som ligado");
    }
    
    public void desligar(){
        System.out.println("Som desligado");
    }
    
    public void setTemperatura(int volume){
        this.volume = volume;
        System.out.println("Volume setado para " +  volume);
    }
}
