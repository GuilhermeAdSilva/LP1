package lista004AssociacaoN.ex03SistemaReservaHotel;

public class ReservaTriplo extends Reserva {
    private int numeroRefeicoes;

    public int getNumeroRefeicoes() {
        return this.numeroRefeicoes;
    }

    public void setNumeroRefeicoes(int numeroRefeicoes) {
        this.numeroRefeicoes = numeroRefeicoes;
    }

    public float calcularValorReserva() {
        return ((this.getDiasHospedagem() * 100) + (this.numeroRefeicoes * 10));
    }
}
