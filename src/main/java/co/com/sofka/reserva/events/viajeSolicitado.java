package co.com.sofka.reserva.events;

import co.com.sofka.agencia.Viaje;
import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reserva.Cliente;

public class viajeSolicitado extends DomainEvent {

    private final Viaje viaje;
    private  final Cliente cliente;

    public viajeSolicitado(Viaje viaje, Cliente cliente) {
        super("sofka.reserva.viajesolicitado");
        this.viaje = viaje;
        this.cliente = cliente;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
