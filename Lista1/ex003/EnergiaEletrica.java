/*A partir do número de quilowatts consumidos, calcular o valor a
ser pago de energia elétrica, sabendo-se que o valor a pagar por
quilowatt é de 0,12. Apresentar o valor total a ser pago pelo
usuário acrescido de 18% de ICMS.*/

package org.ex003;

public class EnergiaEletrica {
    private float quantidadeQuilowatt;

    public void setQuantidadeQuilowatt(float quantidadeQuilowatt) {
        this.quantidadeQuilowatt = quantidadeQuilowatt;
    }
    public float getQuantidadeQuilowatt() {
        return this.quantidadeQuilowatt;
    }

    public float calcularValorContaEnergia (){
        return (0.12f * this.quantidadeQuilowatt) + (0.0216f * this.quantidadeQuilowatt);
    }
}
