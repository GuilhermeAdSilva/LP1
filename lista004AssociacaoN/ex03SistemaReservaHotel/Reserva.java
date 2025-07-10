package lista004AssociacaoN.ex03SistemaReservaHotel;

public abstract class Reserva {
    private Hospede hospede;
    private int diasHospedagem;

    public Hospede getHospede() {
        return this.hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getDiasHospedagem() {
        return this.diasHospedagem;
    }

    public void setDiasHospedagem(int diasHospedagem) {
        this.diasHospedagem = diasHospedagem;
    }

    public abstract float calcularValorReserva();
}
