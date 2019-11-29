/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;
import Acoes.*;
import java.util.ArrayList;

public abstract class Personagem {
   private Atacar a;
   private Correr c;
   private Pular p;
   private int XAxis;
   private int YAxis;
   public ArrayList<Enemy> Enemys = new ArrayList<Enemy>();

   public void registrarInimigo(Enemy o) {
        Enemys.add(o);
   }

   public void removerObservadores(Enemy o) {
        int i = Enemys.indexOf(o);
        if (i >= 0) {
            Enemys.remove(i);
        }
    }

   public void notificaObservadores() {
        for (int i = 0; i < Enemys.size(); i++) {
            Enemys.get(i).atualizar(XAxis, YAxis);
        }
    }

   public void setposition(int X,int Y){
        this.XAxis = X;
        this.YAxis = Y;
        posicaoalterada();
    }

   
   public void posicaoalterada(){
       System.out.println("Posição alterada para");
       System.out.println(" X:" + this.XAxis + " Y:" + this.YAxis);
       notificaObservadores();
   }
   
   
   
   public void setPular(Pular p){
        this.p = p;
    }    
   public void Pular(){
        p.Pular();
    }   
   
   public void setCorrer(Correr c){
        this.c = c;
    }    
   public void Correr(){
        c.Correr();
    }

    public void setAtaque(Atacar a) {
        this.a = a;
    }
    public void Atacar(){
       a.Atacar();
    }

}
