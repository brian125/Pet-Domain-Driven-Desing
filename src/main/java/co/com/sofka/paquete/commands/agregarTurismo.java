package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.Turismo;
import co.com.sofka.paquete.values.TurismoId;

public class agregarTurismo {

    private final TurismoId turismoId;
    private final Turismo turismo;

    public agregarTurismo(TurismoId turismoId, Turismo turismo) {
        this.turismoId = turismoId;
        this.turismo = turismo;
    }

    public TurismoId getTurismoId() {
        return turismoId;
    }

    public Turismo getTurismo() {
        return turismo;
    }
}
