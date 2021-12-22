package co.com.sofka.reserva.commands;

import co.com.sofka.reserva.values.PagoId;
import co.com.sofka.reserva.values.TipoPago;

public class seleccionarTipoPago {

    private final PagoId pagoId;
    private final TipoPago seleccionarTipoPago;

    public seleccionarTipoPago(PagoId pagoId, TipoPago seleccionarTipoPago) {
        this.pagoId = pagoId;
        this.seleccionarTipoPago = seleccionarTipoPago;
    }

    public PagoId getPagoId() {
        return pagoId;
    }

    public TipoPago getSeleccionarTipoPago() {
        return seleccionarTipoPago;
    }
}
