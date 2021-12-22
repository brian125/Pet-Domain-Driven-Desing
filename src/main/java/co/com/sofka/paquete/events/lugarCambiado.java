package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.Lugar;

public class lugarCambiado extends DomainEvent {

    private final Lugar lugar;

    public lugarCambiado(Lugar lugar) {
        super("sofka.paquete.lugarcambiado");
        this.lugar = lugar;
    }

    public Lugar getLugar() {
        return lugar;
    }
}
