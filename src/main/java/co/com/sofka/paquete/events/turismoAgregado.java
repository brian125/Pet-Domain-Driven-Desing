package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.Actividad;
import co.com.sofka.paquete.values.Lugar;
import co.com.sofka.paquete.values.TurismoId;

public class turismoAgregado extends DomainEvent {

    private final TurismoId turismoId;
    private final Actividad actividad;
    private final Lugar lugar;

    public turismoAgregado(TurismoId turismoId, Actividad actividad, Lugar lugar) {
        super("sofka.paquete.turismoagregado");
        this.turismoId = turismoId;
        this.actividad = actividad;
        this.lugar = lugar;
    }

    public TurismoId getTurismoId() {
        return turismoId;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public Lugar getLugar() {
        return lugar;
    }
}
