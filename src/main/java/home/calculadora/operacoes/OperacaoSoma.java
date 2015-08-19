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
public class OperacaoSoma implements Operacao {

    @Override
    public Number calcular(Number[] operandos) {
        if (operandos == null) {
            return null;
        }
        if (operandos.length == 1) {
            return operandos[0];
        }
        double resultado = 0;
        for (Number o : operandos) {
            resultado += (Double) o;
        }
        return resultado;
    }

}
