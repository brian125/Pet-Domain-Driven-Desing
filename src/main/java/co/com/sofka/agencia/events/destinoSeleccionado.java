package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.Destino;
import co.com.sofka.generico.DomainEvent;

public class destinoSeleccionado extends DomainEvent {

    private final Destino destino;

    public destinoSeleccionado(Destino destino) {
        super("sofka.agencia.destinoseleccionado");
        this.destino = destino;
    }

    public Destino getDestino() {
        return destino;
    }
}
