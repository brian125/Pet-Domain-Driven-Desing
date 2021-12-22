package co.com.sofka.reserva.commands;

import co.com.sofka.reserva.Cliente;
import co.com.sofka.reserva.values.ClienteId;

public class agregarCliente {

    private final ClienteId clienteId;
    private final Cliente cliente;

    public agregarCliente(ClienteId clienteId, Cliente cliente) {
        this.clienteId = clienteId;
        this.cliente = cliente;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
