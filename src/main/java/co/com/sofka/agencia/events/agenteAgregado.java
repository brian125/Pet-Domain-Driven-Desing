package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.AgenteId;
import co.com.sofka.agencia.values.Email;
import co.com.sofka.agencia.values.Nombre;
import co.com.sofka.agencia.values.Telefono;
import co.com.sofka.generico.DomainEvent;

public class agenteAgregado extends DomainEvent {

    private final AgenteId id;
    private final Nombre nombre;
    private final Email email;
    private final Telefono telefono;

    public agenteAgregado(AgenteId id, Nombre nombre, Email email, Telefono telefono) {
        super("sofka.agencia.agenteagregado");
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public AgenteId getId() {
        return id;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
