/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forno;

import forno.Forno;
import padrao.command.Comando;
import padrao.command.Comando;

/**
 *
 * @author gabrielms
 */
public class ComandoLigarForno implements Comando{
    
    private Forno forno;
    
    public ComandoLigarForno(Forno forno){
        this.forno = forno;
    }
    
    public void executar(){
        forno.ligar();
    }

    @Override
    public void undo() {
        forno.desligar();
    }
}
