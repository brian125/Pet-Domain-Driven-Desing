package co.com.sofka.reserva.commands;

import co.com.sofka.reserva.Pago;
import co.com.sofka.reserva.values.Cantidad;
import co.com.sofka.reserva.values.PagoId;
import co.com.sofka.reserva.values.Precio;

public class calcularValorPago {

    private final PagoId pagoId;
    private final Precio precio;


    public calcularValorPago(PagoId pagoId, Precio precio) {
        this.pagoId = pagoId;
        this.precio = precio;
    }

    public PagoId getPagoId() {
        return pagoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
