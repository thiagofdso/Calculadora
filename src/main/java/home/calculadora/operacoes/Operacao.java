/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.calculadora.operacoes;

/**
 *
 * @author thiag
 */
public interface Operacao {

    /**
     * Executa uma operacao.
     * @param operandos
     * @return 
     */
    public Number calcular(Number[] operandos);
}
