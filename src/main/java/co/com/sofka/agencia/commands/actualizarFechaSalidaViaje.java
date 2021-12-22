package co.com.sofka.agencia.commands;

import co.com.sofka.agencia.values.FechaSalida;
import co.com.sofka.agencia.values.ViajeId;

public class actualizarFechaSalidaViaje {

    private final ViajeId viajeId;
    private final FechaSalida fechaSalida;

    public actualizarFechaSalidaViaje(ViajeId viajeId, FechaSalida fechaSalida){
        this.viajeId = viajeId;
        this.fechaSalida = fechaSalida;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public FechaSalida getFechaSalida() {
        return fechaSalida;
    }
}
