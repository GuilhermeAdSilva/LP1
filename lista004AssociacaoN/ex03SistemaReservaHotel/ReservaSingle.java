package lista004AssociacaoN.ex03SistemaReservaHotel;

public class ReservaSingle extends Reserva {

    public float calcularValorReserva() {
        return (this.getDiasHospedagem() * 50);
    }
}
