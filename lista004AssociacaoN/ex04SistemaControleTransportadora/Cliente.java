package lista004AssociacaoN.ex04SistemaControleTransportadora;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.fretes = new ArrayList<Frete>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Frete> getFretes() {
        return this.fretes;
    }

    public void setFretes(ArrayList<Frete> fretes) {
        this.fretes = fretes;
    }

    public void alocarFrete(Frete frete) {
        this.fretes.add(frete);
    }

    public int calcularQuantidadeFretes() {
        return this.fretes.size();
    }

    public ArrayList<String> verificarFretesCliente() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Frete frete : fretes) {
            if (frete.getClass().equals(FreteNormal.class)) {
                resultado.add("Frete normal");
            } else if (frete.getClass().equals(FreteEspecial.class)) {
                resultado.add("Frete especial");
            } else if (frete.getClass().equals(FreteUrgente.class)) {
                resultado.add("Frete urgente");
            }
        }
        return resultado;
    }

    public ArrayList<Float> verificarValoresFrete() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Frete frete : fretes) {
            resultado.add(frete.calcularFrete());
        }
        return resultado;
    }
}
