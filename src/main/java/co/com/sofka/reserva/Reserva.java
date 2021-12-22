package co.com.sofka.reserva;

import co.com.sofka.agencia.Viaje;
import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.reserva.events.*;
import co.com.sofka.reserva.values.*;

import java.util.Objects;

public class Reserva extends AggregateRoot<ReservaId> {

    private final Fecha fecha;
    private Pago pago;
    private Cliente cliente;

    public Reserva(ReservaId reservaId, Fecha fecha, Pago pago, Cliente cliente) {
        super(reservaId);
        this.fecha = Objects.requireNonNull(fecha);
        this.pago = Objects.requireNonNull(pago);
        this.cliente = Objects.requireNonNull(cliente);
        this.applyChange(new reservaRealizada(reservaId,fecha, pago, cliente));
    }

    public void agregarCliente(Nombre nombre, Telefono telefono, Sexo sexo, Email email,Cantidad cantidadClientes, Viaje viaje) {
        var id = new ClienteId();
        cliente = (new Cliente(id,nombre,telefono,sexo,email,cantidadClientes,viaje));
        this.applyChange(new clienteAgregado(id,nombre,telefono,sexo,email,cantidadClientes,viaje));
    }

    public void agregarPago(TipoPago tipoPago, int precio){
        var id = new PagoId();
        pago = (new Pago(id, tipoPago, precio));
        this.applyChange(new pagoAgregado(id,tipoPago,precio));
    }

    public void solicitarViajeCliente(Viaje viaje, Cliente cliente){
        cliente.solicitarViaje(viaje);
        this.applyChange(new viajeSolicitado(viaje,cliente));
    }

    public void seleccionarTipoPago(Pago pago, TipoPago tipoPago){
        pago.seleccionarTipo(tipoPago);
        this.applyChange(new tipoPagoSeleccionado(tipoPago));
    }

    public void calcularPrecioPago(Pago pago, Precio precio, Cantidad cantidadClientes){
        pago.calcularPrecio(precio, cantidadClientes);
        this.applyChange(new precioCalculado(precio));
    }

    public Fecha fecha() {
        return fecha;
    }

    public Pago pago() {
        return pago;
    }

    public Cliente cliente() {
        return cliente;
    }
}
