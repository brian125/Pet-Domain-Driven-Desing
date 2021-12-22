package co.com.sofka.reserva.commands;

import co.com.sofka.reserva.Pago;
import co.com.sofka.reserva.values.PagoId;

public class agregarPago {

    private final PagoId pagoId;
    private final Pago pago;

    public agregarPago(PagoId pagoId, Pago pago) {
        this.pagoId = pagoId;
        this.pago = pago;
    }

    public PagoId getPagoId() {
        return pagoId;
    }

    public Pago getPago() {
        return pago;
    }
}
