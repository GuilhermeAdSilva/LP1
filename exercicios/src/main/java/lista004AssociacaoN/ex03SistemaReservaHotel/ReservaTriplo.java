package lista004AssociacaoN.ex03SistemaReservaHotel;

public class ReservaTriplo extends Reserva {
    private int numeroRefeicoes;

    public ReservaTriplo(Hospede hospede) {
        super(hospede);
        this.numeroRefeicoes = 0;
    }

    public int getNumeroRefeicoes() {
        return this.numeroRefeicoes;
    }

    public void setNumeroRefeicoes(int numeroRefeicoes) {
        if (numeroRefeicoes < 0) {
            throw new IllegalArgumentException("Numero de refeições invalido");
        } else {
            this.numeroRefeicoes = numeroRefeicoes;
        }
    }

    public float calcularValorReserva() {
        return ((this.getDiasHospedagem() * 100) + (this.numeroRefeicoes * 10));
    }

    public String getTipoReserva() {
        return "Triplo";
    }
}
