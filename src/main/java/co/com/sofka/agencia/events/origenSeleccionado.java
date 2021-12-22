package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.Origen;
import co.com.sofka.generico.DomainEvent;

public class origenSeleccionado extends DomainEvent {

    private final Origen origen;

    public origenSeleccionado(Origen origen) {
        super("sofka.agencia.origenseleccionado");
        this.origen = origen;
    }

    public Origen getOrigen() {
        return origen;
    }
}
