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
public abstract class Enemy {
    int Xaxis;
    int Yaxis;
    int PXposition;
    int PYposition;
    
    public void atualizar (int x, int y){
        this.PXposition = x;
        this.PYposition = y;
        exibe();
    }
    
    public void exibe(){
        System.out.println("O Personagem esta em :");
        System.out.println("X:" + this.PXposition + " Y:" + this.PYposition);
    }

    public Enemy(int Xaxis, int Yaxis) {
        this.Xaxis = Xaxis;
        this.Yaxis = Yaxis;
        this.PXposition = 0;
        this.PYposition = 0;
    }
    
    
}
