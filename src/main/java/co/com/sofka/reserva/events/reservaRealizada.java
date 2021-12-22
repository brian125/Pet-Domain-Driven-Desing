package co.com.sofka.reserva.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reserva.Cliente;
import co.com.sofka.reserva.Pago;
import co.com.sofka.reserva.values.Fecha;
import co.com.sofka.reserva.values.ReservaId;

public class reservaRealizada extends DomainEvent {

    private final ReservaId reservaId;
    private final Fecha fecha;
    private final Pago pago;
    private final Cliente cliente;


    public reservaRealizada(ReservaId reservaId, Fecha fecha, Pago pago, Cliente cliente) {
        super("sofka.reserva.reservarealizada");
        this.reservaId = reservaId;
        this.fecha = fecha;
        this.pago = pago;
        this.cliente = cliente;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Pago getPago() {
        return pago;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
