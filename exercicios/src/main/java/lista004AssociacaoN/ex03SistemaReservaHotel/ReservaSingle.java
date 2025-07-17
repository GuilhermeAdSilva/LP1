package lista004AssociacaoN.ex03SistemaReservaHotel;

public class ReservaSingle extends Reserva {

    public ReservaSingle(Hospede hospede) {
        super(hospede);
    }

    public float calcularValorReserva() {
        return (this.getDiasHospedagem() * 50);
    }

    public String getTipoReserva() {
        return "Single";
    }
}
