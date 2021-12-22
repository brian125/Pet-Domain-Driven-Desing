package co.com.sofka.reserva.events;

import co.com.sofka.agencia.Viaje;
import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reserva.values.*;

public class clienteAgregado extends DomainEvent {

    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final Sexo sexo;
    private final Email email;
    private final Cantidad cantidadClientes;
    private final Viaje viaje;

    public clienteAgregado(ClienteId clienteId, Nombre nombre, Telefono telefono, Sexo sexo, Email email,Cantidad cantidadClientes, Viaje viaje) {
        super("sofka.reserva.clienteagregado");
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.sexo = sexo;
        this.email = email;
        this.cantidadClientes = cantidadClientes;
        this.viaje = viaje;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Email getEmail() {
        return email;
    }

    public Cantidad getCantidadClientes() {
        return cantidadClientes;
    }

    public Viaje getViaje() {
        return viaje;
    }
}
