package co.com.sofka.reserva.commands;

import co.com.sofka.agencia.Viaje;
import co.com.sofka.reserva.values.ClienteId;

public class solicitarViajePorElCliente {

    private final ClienteId clienteId;
    private final Viaje viaje;

    public solicitarViajePorElCliente(ClienteId clienteId, Viaje viaje) {
        this.clienteId = clienteId;
        this.viaje = viaje;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Viaje getViaje() {
        return viaje;
    }
}
