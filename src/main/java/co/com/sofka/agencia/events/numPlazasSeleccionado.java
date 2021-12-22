package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.NumPlazas;
import co.com.sofka.generico.DomainEvent;

public class numPlazasSeleccionado extends DomainEvent {

    private final NumPlazas numPlazas;

    public numPlazasSeleccionado(NumPlazas numPlazas) {
        super("sofka.agencia.numplazasseleccionado");
        this.numPlazas = numPlazas;
    }

    public NumPlazas getNumPlazas() {
        return numPlazas;
    }
}