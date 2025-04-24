/*Calcular a média de combustível gasto pelo usuário,
sendo informado a quantidade de quilômetros rodados e
a quantidade de combustível consumido.*/
package org.ex004;

public class Combustivel {
    private float quantidadeKmRodado;
    private float quantidadeCombustivelConsumido;

    public float getQuantidadeKmRodado() {
        return this.quantidadeKmRodado;
    }
    public void setQuantidadeKmRodado(float quantidadeKmRodado) {
        this.quantidadeKmRodado = quantidadeKmRodado;
    }

    public float getQuantidadeCombustivelConsumido() {
        return this.quantidadeCombustivelConsumido;
    }
    public void setQuantidadeCombustivelConsumido(float quantidadeCombustivelConsumido) {
        this.quantidadeCombustivelConsumido = quantidadeCombustivelConsumido;
    }

    public float calcularMediaCombustivelGasto() {
        return this.quantidadeCombustivelConsumido / this.quantidadeKmRodado;
    }
}
