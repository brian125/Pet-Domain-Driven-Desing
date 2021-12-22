package co.com.sofka.reserva.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reserva.values.TipoPago;

public class tipoPagoSeleccionado extends DomainEvent {

    private final TipoPago tipoPago;

    public tipoPagoSeleccionado(TipoPago tipoPago) {
        super("sofka.reserva.tipoPagoSeleccionado");
        this.tipoPago = tipoPago;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }
}
