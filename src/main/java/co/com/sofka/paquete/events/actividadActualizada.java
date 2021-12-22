package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.Actividad;

public class actividadActualizada extends DomainEvent {

    private final Actividad actividad;

    public actividadActualizada(Actividad actividad) {
        super("sofka.paquete.actividadactualizada");
        this.actividad = actividad;
    }

    public Actividad getActividad() {
        return actividad;
    }
}
