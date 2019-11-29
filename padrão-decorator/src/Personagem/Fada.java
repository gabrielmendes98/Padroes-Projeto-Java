/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;

/**
 *
 * @author a11621BCC029
 */
public class Fada extends Enemy{

    public Fada(int Xaxis, int Yaxis) {
        super(Xaxis, Yaxis);
    }
    
    public void exibe(){
        System.out.println("O Personagem esta em :");
        System.out.println("X:" + this.PXposition + " Y:" + this.PYposition);
    }
}
