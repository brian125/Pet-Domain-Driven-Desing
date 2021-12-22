package co.com.sofka.reserva.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reserva.values.PagoId;
import co.com.sofka.reserva.values.Precio;
import co.com.sofka.reserva.values.TipoPago;

public class pagoAgregado extends DomainEvent {

    private final PagoId pagoId;
    private final TipoPago tipoPago;
    private final int precio;

    public pagoAgregado(PagoId pagoId, TipoPago tipoPago, int precio) {
        super("sofka.reserva.pagoagregado");
        this.pagoId = pagoId;
        this.tipoPago = tipoPago;
        this.precio = precio;
    }

    public PagoId getPagoId() {
        return pagoId;
    }

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public int getPrecio() {
        return precio;
    }
}
