/*Construa um algoritmo para calcular o índice de massa corporal (IMC)
de uma pessoa, através da fórmula IMC = peso / altura2. Para o resultado,
considere a tabela a seguir, apresentando a condição correspondente:

MULHERES
abaixo do peso	imc < 19,1
no peso normal	19,1 <= imc < 25,8
marginalmente acima do peso	25,8 <= imc < 27,3
acima do peso ideal	27,3 <= imc < 32,3
obeso	imc >= 32,3

HOMENS
abaixo do peso	imc < 20,7
no peso normal	20,7 <= imc < 26,4
marginalmente acima do peso	26,4 <= imc < 27,8
acima do peso ideal	27,8 <= imc < 31, 1
obeso	imc >= 31,1
*/

package lista001.ex005;

public class Pessoa {
    private char sexo; //M ou F
    private float altura; //em metro
    private float peso; //em kg

    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'm') {
            sexo = 'M';
        } else if (sexo == 'f') {
            sexo = 'F';
        } else if (sexo != 'M' && sexo != 'F') {
            throw new IllegalArgumentException("Sexo invalido!");
        }
        this.sexo = sexo;
    }

    public float getAltura() {
        return this.altura;
    }
    public void setAltura(float altura) {
        if (altura <= 0.0f) {
            throw new IllegalArgumentException("Altura invalida!");
        }
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }
    public void setPeso(float peso) {
        if (peso <= 0.0f) {
            throw new IllegalArgumentException("Peso invalido!");
        }
        this.peso = peso;
    }

    public float calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String informarImc(float imc) {
        if (this.sexo == 'F'){
            if (imc < 19.1f){
                return "Abaixo do peso";
            } else if (imc < 25.8f) {
                return "No peso normal";
            } else if (imc < 27.3f) {
                return "Marginalmente acima do peso";
            } else if (imc < 32.3f) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        } else {
            if (imc < 20.7f){
                return "Abaixo do peso";
            } else if (imc < 26.4f) {
                return "No peso normal";
            } else if (imc < 27.8f) {
                return "Marginalmente acima do peso";
            } else if (imc < 31.1f) {
                return "Acima do peso ideal";
            } else {
                return "Obeso";
            }
        }
    }
}
