/*A partir do número de quilowatts consumidos, calcular o valor a
ser pago de energia elétrica, sabendo-se que o valor a pagar por
quilowatt é de 0,12. Apresentar o valor total a ser pago pelo
usuário acrescido de 18% de ICMS.*/

package lista001.ex003;

public class Conta {
    private float quilowattsConsumido;

    public float getQuilowattsConsumido() {
        return this.quilowattsConsumido;
    }

    public void setQuilowattsConsumido(float quilowattsConsumido) {
        if (quilowattsConsumido < 0) {
            throw new IllegalArgumentException("Valor invalido de quilowatts!");
        }
        this.quilowattsConsumido = quilowattsConsumido;
    }

    public float calcularContaEnergiaEletrica() {
        return this.quilowattsConsumido * 0.12f + (this.quilowattsConsumido * 0.0216f);
    }
}
