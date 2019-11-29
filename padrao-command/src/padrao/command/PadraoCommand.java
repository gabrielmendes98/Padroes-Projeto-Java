/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.command;

import forno.Forno;
import arCondicionado.*;
import forno.*;
import panela.*;
import som.*;
/**
 *
 * @author gabrielms
 */
public class PadraoCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        ComandoNenhum nada = new ComandoNenhum();
        Panela panela = new Panela();
        ArmazenaMemoria m = new ArmazenaMemoria();


        PanelaTemperaturaAlta tempAlta = new PanelaTemperaturaAlta(panela);
        m.addMemento(panela.criarMemento());

        PanelaTemperaturaMedia tempMedia = new PanelaTemperaturaMedia(panela);
        m.addMemento(panela.criarMemento());

        panela.recuperarMemento(m.getMemento(0));


        controle.setCommand(0, tempAlta, tempAlta, nada, nada);
        controle.setCommand(0, tempMedia, tempMedia, nada, nada);
        controle.pressionarBotaoOn(0);
        controle.pressionarBotaoUndo(0);

    }
    
}
