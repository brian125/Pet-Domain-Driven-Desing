package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.values.Lugar;
import co.com.sofka.paquete.values.TurismoId;

public class cambiarLugarTurismo {

    private final TurismoId turismoId;
    private final Lugar lugar;

    public cambiarLugarTurismo(TurismoId turismoId, Lugar lugar) {
        this.turismoId = turismoId;
        this.lugar = lugar;
    }

    public TurismoId getTurismoId() {
        return turismoId;
    }

    public Lugar getLugar() {
        return lugar;
    }
}
