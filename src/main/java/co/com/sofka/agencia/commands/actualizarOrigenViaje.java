package co.com.sofka.agencia.commands;

import co.com.sofka.agencia.Viaje;
import co.com.sofka.agencia.values.Origen;
import co.com.sofka.agencia.values.ViajeId;

public class actualizarOrigenViaje {

    private final ViajeId viajeId;
    private final Origen origen;

    public actualizarOrigenViaje(ViajeId viajeId, Origen origen){
        this.viajeId = viajeId;
        this.origen = origen;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public Origen getOrigen() {
        return origen;
    }
}
