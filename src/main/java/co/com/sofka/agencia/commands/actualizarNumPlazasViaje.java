package co.com.sofka.agencia.commands;

import co.com.sofka.agencia.values.NumPlazas;
import co.com.sofka.agencia.values.ViajeId;

public class actualizarNumPlazasViaje {

    private final ViajeId viajeId;
    private final NumPlazas numPlazas;

    public actualizarNumPlazasViaje(ViajeId viajeId, NumPlazas numPlazas) {
        this.viajeId = viajeId;
        this.numPlazas = numPlazas;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public NumPlazas getNumPlazas() {
        return numPlazas;
    }
}
