package co.com.sofka.agencia.commands;

import co.com.sofka.agencia.values.FechaLlegada;
import co.com.sofka.agencia.values.ViajeId;

public class actualizarFechaLlegadaViaje {

    private final ViajeId viajeId;
    private final FechaLlegada fechaLlegada;

    public actualizarFechaLlegadaViaje(ViajeId viajeId, FechaLlegada fechaLlegada) {
        this.viajeId = viajeId;
        this.fechaLlegada = fechaLlegada;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public FechaLlegada getFechaLlegada() {
        return fechaLlegada;
    }
}
