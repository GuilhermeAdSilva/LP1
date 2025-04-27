/*Atributos: nome, idade, altura, peso
Métodos: envelhecer, crescer, ganhar_peso, perder_peso
• envelhecer(): Aumenta a idade da pessoa em um ano.
• Crescer(entímetros): Aumenta a altura da pessoa em entímetros, se a pessoa tiver menos de 21 anos.
• Ganhar_peso(quilos): Aumenta o peso da pessoa em quilos.
• Perder_peso(quilos): Diminui o peso da pessoa em quilos.*/

package lista002;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade invalida");
        }
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }

    public void envelhecer(){
        this.idade += 1;
    }

    public void crescer(float centimetros){
        if (centimetros <= 0) {
            throw new IllegalArgumentException("Altura adicionada invalida");
        }
        if (this.idade < 21) {
            this.altura += centimetros;
        }
    }

    public void ganhar_peso(float quilos){
        if (quilos <= 0) {
            throw new IllegalArgumentException("Peso adicionado invalido");
        }
        this.peso += quilos;
    }

    public void perder_peso(float quilos){
        if (quilos <= 0) {
            throw new IllegalArgumentException("Peso adicionado invalido");
        }
        this.peso -= quilos;
    }
}
