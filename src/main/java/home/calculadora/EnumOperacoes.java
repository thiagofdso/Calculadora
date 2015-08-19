/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.calculadora;

import home.calculadora.operacoes.Operacao;
import home.calculadora.operacoes.OperacaoProduto;
import home.calculadora.operacoes.OperacaoSoma;

/**
 *
 * @author thiag
 */
enum EnumOperacoes {
    SOMA("+",new OperacaoSoma()),PRODUTO("x",new OperacaoProduto());
    final String operador;
    final Operacao calculadora;
    EnumOperacoes(String operador,Operacao calculadora){
        this.operador = operador;
        this.calculadora = calculadora;
    }
    public Number calcular(Number[] operandos){
        return calculadora.calcular(operandos);
    }
    @Override
    public String toString(){
        return operador;
    }
}
