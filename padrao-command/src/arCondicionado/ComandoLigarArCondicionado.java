/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arCondicionado;

import padrao.command.Comando;

/**
 *
 * @author gabrielms
 */
public class ComandoLigarArCondicionado implements Comando{
    
    private ArCondicionado ar;
    
    public ComandoLigarArCondicionado(ArCondicionado ar){
        this.ar = ar;
    }
    
    public void executar(){
        ar.ligar();
    }

    public void undo(){
        ar.desligar();
    }
    
}
