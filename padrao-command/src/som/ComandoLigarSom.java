/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package som;

import padrao.command.Comando;

/**
 *
 * @author gabrielms
 */
public class ComandoLigarSom implements Comando{
    
    private Som som;
    
    public ComandoLigarSom(Som som){
        this.som = som;
    }
    
    public void executar(){
        som.ligar();
    }

    @Override
    public void undo() {
        som.desligar();
    }
}
