package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.Nombre;

public class nombreCambiado extends DomainEvent {

    private final Nombre nombre;

    public nombreCambiado(Nombre nombre) {
        super("sofka.paquete.nombrecambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
