/*Calcular a média de combustível gasto pelo usuário,
sendo informado a quantidade de quilômetros rodados e
a quantidade de combustível consumido.*/

package lista001.ex004;

public class Carro {
    private float quantidadeKmRodado;
    private float quantidadeKmConsumido;

    public float getQuantidadeKmRodado() {
        return this.quantidadeKmRodado;
    }

    public void setQuantidadeKmRodado(float quantidadeKmRodado) {
        if (quantidadeKmRodado <= 0) {
            throw new IllegalArgumentException("Quantidade de Km rodados invalida!");
        }
        this.quantidadeKmRodado = quantidadeKmRodado;
    }

    public float getQuantidadeKmConsumido() {
        return this.quantidadeKmConsumido;
    }

    public void setQuantidadeKmConsumido(float quantidadeKmConsumido) {
        if (quantidadeKmConsumido < 0) {
            throw new IllegalArgumentException("Quantidade de Km consumidos invalida!");
        }
        this.quantidadeKmConsumido = quantidadeKmConsumido;
    }

    public float calcularMediaCombustivelGasto() {
        return this.quantidadeKmConsumido / this.quantidadeKmRodado;
    }
}
