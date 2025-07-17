package lista004AssociacaoN.ex03SistemaReservaHotel;

public abstract class Reserva {
    private int diasHospedagem;
    private Hospede hospede;

    public Reserva(Hospede hospede) {
        this.diasHospedagem = 0;
        this.hospede = hospede;
    }

    public int getDiasHospedagem() {
        return this.diasHospedagem;
    }

    public void setDiasHospedagem(int diasHospedagem) {
        if (diasHospedagem <= 0) {
            throw new IllegalArgumentException("Dias invalidos");
        } else {
            this.diasHospedagem = diasHospedagem;
        }
    }

    public Hospede getHospede() {
        return this.hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public abstract float calcularValorReserva();

    public abstract String getTipoReserva();
}
