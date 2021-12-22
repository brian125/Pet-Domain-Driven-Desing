package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.values.Actividad;
import co.com.sofka.paquete.values.TurismoId;

public class actulizarActividadTurismo {

    private final TurismoId turismoId;
    private final Actividad actividad;

    public actulizarActividadTurismo(TurismoId turismoId, Actividad actividad) {
        this.turismoId = turismoId;
        this.actividad = actividad;
    }

    public TurismoId getTurismoId() {
        return turismoId;
    }

    public Actividad getActividad() {
        return actividad;
    }
}
