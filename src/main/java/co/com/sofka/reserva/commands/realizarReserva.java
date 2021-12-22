package co.com.sofka.reserva.commands;

import co.com.sofka.reserva.Reserva;
import co.com.sofka.reserva.values.ReservaId;

public class realizarReserva {

    private final ReservaId reservaId;
    private final Reserva reserva;

    public realizarReserva(ReservaId reservaId, Reserva reserva) {
        this.reservaId = reservaId;
        this.reserva = reserva;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public Reserva getReserva() {
        return reserva;
    }
}
