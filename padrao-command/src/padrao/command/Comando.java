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
public interface Comando {
    public void executar();
    public void undo();
}
