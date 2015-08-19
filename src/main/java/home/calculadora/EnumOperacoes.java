/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.calculadora;

/**
 *
 * @author thiag
 */
enum EnumOperacoes {
    SOMA("+"),PRODUTO("x");
    final String operador;
    EnumOperacoes(String operador){
        this.operador = operador;
    }
    public String toString(){
        return operador;
    }
}
