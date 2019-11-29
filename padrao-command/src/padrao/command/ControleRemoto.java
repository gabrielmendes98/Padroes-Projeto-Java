/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao.command;

/**
 *
 * @author gabrielms
 */
public class ControleRemoto {
    Comando[] comandosOn;
    Comando[] comandosUndo;
    Comando[] comandosSet1;
    Comando[] comandosSet2;
    
    public ControleRemoto() {
        comandosOn = new Comando[4];
        comandosUndo = new Comando[4];
        comandosSet1 = new Comando[4];
        comandosSet2 = new Comando[4];
        Comando semComando = new ComandoNenhum();
        for (int i = 0; i < 4; i++) {
            comandosOn[i] = semComando;
            comandosUndo[i] = semComando;
            comandosSet1[i] = semComando;
            comandosSet2[i] = semComando;
        }
    }
    
    public void pressionarBotaoOn(int slot) {
        comandosOn[slot].executar();
    }
    
    public void pressionarBotaoUndo(int slot) {
        comandosUndo[slot].undo();
    }
    
    public void pressionarBotaoSet1(int slot) {
        comandosSet1[slot].executar();
    }
    
    public void pressionarBotaoSet2(int slot) {
        comandosSet2[slot].executar();
    }
    
    public void setCommand(int slot, Comando on, Comando undo, Comando set1, Comando set2) {
        comandosOn[slot] = on;
        comandosUndo[slot] = undo;
        comandosSet1[slot] = set1;
        comandosSet2[slot] = set2;
    }

}
