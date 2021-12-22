package co.com.sofka.reserva;

import co.com.sofka.generico.Entity;
import co.com.sofka.reserva.values.Cantidad;
import co.com.sofka.reserva.values.PagoId;
import co.com.sofka.reserva.values.Precio;
import co.com.sofka.reserva.values.TipoPago;

public class Pago extends Entity<PagoId> {

    private TipoPago tipoPago;
    private int precio;

    public Pago(PagoId pagoId, TipoPago tipoPago, int precio) {
        super(pagoId);
        this.tipoPago = tipoPago;
        this.precio = precio;
    }

    public void seleccionarTipo(TipoPago tipoPago){
        this.tipoPago = tipoPago;
    }

    public void calcularPrecio(Precio precio, Cantidad cantidadClientes){
        this.precio = (precio.getValor() * cantidadClientes.getValor());
    }

    public TipoPago tipoPago() {
        return tipoPago;
    }

    public int precio() {
        return precio;
    }
}