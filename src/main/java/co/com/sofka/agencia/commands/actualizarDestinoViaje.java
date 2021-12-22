package co.com.sofka.agencia.commands;

import co.com.sofka.agencia.values.Destino;
import co.com.sofka.agencia.values.ViajeId;

public class actualizarDestinoViaje {

    private final ViajeId viajeId;
    private final Destino  destino;

    public actualizarDestinoViaje(ViajeId viajeId, Destino destino){
        this.viajeId = viajeId;
        this.destino = destino;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public Destino getDestino() {
        return destino;
    }
}
