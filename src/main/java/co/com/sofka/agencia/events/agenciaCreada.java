package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.AgenciaId;
import co.com.sofka.agencia.values.Email;
import co.com.sofka.agencia.values.Nombre;
import co.com.sofka.agencia.values.Telefono;
import co.com.sofka.generico.DomainEvent;

public class agenciaCreada extends DomainEvent {

    private final AgenciaId agenciaId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final Email email;

    public agenciaCreada(AgenciaId agenciaId, Nombre nombre, Telefono telefono, Email email) {
        super("sofka.agencia.agenciacreada");
        this.agenciaId = agenciaId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public AgenciaId getAgenciaId() {
        return agenciaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public Email getEmail() {
        return email;
    }
}
