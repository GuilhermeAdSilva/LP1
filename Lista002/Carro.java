/*1. Classe Carro:
Atributos: marca, modelo, ano, velocidade_atual, estado
Métodos: acelerar, frear, ligar, desligar
• acelerar(quantidade): aumenta a velocidade atual do carro
pela quantidade especificada.
• frear(quantidade): diminui a velocidade atual do carro
pela quantidade especificada, sem deixar que a velocidade fique negativa.
• ligar(): altera o estado do carro para ligado.
• desligar(): altera o estado do carro para desligado e
zera a velocidade atual.*/

package lista002;

import java.time.LocalDate;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade_atual;
    private String estado;

    public Carro() {
        this.estado = "desligado";
        this.velocidade_atual = 0;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }
    public void setAno(int ano) {
        if (ano < 1886) {
            throw new IllegalArgumentException("Data invalida!");
        }
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if (ano > anoAtual) {
            throw new IllegalArgumentException("Ano invalido!");
        }
        this.ano = ano;
    }

    public int getVelocidade_atual() {
        return this.velocidade_atual;
    }

    public void setVelocidade_atual(int velocidade_atual) {
        if (velocidade_atual < 0) {
            throw new IllegalArgumentException("Velocidade invalida!");
        }
        this.velocidade_atual = velocidade_atual;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        if (estado.equalsIgnoreCase("ligado")) {
            this.estado = "ligado";
        } else if (estado.equalsIgnoreCase("desligado")) {
            this.estado = "desligado";
        } else {
            throw new IllegalArgumentException("Estado invalido!");
        }
    }

    public void acelerar(int quantidade) {
        if (this.estado.equalsIgnoreCase("desligado")) {
            throw new IllegalArgumentException("Nao e possivel acelerar o carro desligado!");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Valor de aceleracao invalido!");
        }
        this.velocidade_atual = this.velocidade_atual + quantidade;
    }

    public void frear(int quantidade) {
        if (this.estado.equalsIgnoreCase("desligado")) {
            throw new IllegalArgumentException("Nao e possivel frear o carro desligado!");
        }
        if (quantidade > this.velocidade_atual) {
            this.velocidade_atual = 0;
            return;
        }
        this.velocidade_atual = this.velocidade_atual - quantidade;
    }

    public void ligar() {
        if (this.estado.equalsIgnoreCase("ligado")) {
            throw new IllegalArgumentException("O carro ja esta ligado!");
        }
        this.estado = "ligado";
    }

    public void desligar() {
        if (this.estado.equalsIgnoreCase("desligado")) {
            throw new IllegalArgumentException("O carro ja esta desligado!");
        }
        this.estado = "desligado";
        this.velocidade_atual = 0;
    }
}
