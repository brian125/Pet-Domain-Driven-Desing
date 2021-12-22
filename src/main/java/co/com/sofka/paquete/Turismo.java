package co.com.sofka.paquete;

import co.com.sofka.generico.Entity;
import co.com.sofka.paquete.values.Actividad;
import co.com.sofka.paquete.values.Lugar;
import co.com.sofka.paquete.values.TurismoId;

public class Turismo extends Entity<TurismoId> {

    private Actividad actividad;
    private Lugar lugar;

    public Turismo(TurismoId turismoId, Actividad actividad, Lugar lugar) {
        super(turismoId);
        this.actividad = actividad;
        this.lugar = lugar;
    }

    public void actualizarActividad(Actividad actividad){
        this.actividad = actividad;
    }

    public void cambiarLugar(Lugar lugar){
        this.lugar = lugar;
    }

    public Actividad actividad() {
        return actividad;
    }

    public Lugar lugar() {
        return lugar;
    }
}
