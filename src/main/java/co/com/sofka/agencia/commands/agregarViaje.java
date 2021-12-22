package co.com.sofka.agencia.commands;

import co.com.sofka.agencia.Viaje;
import co.com.sofka.agencia.values.ViajeId;

public class agregarViaje {

    private final ViajeId viajeId;
    private final Viaje viaje;

    public agregarViaje(ViajeId viajeId,Viaje viaje) {
        this.viajeId = viajeId;
        this.viaje = viaje;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public Viaje getViaje() {
        return viaje;
    }
}
