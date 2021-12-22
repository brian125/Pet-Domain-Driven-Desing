package co.com.sofka.agencia.values;

import co.com.sofka.generico.Id;

public final class ViajeId extends Id {

    private ViajeId(String valor){
        super(valor);
    }

    public ViajeId(){

    }

    public static ViajeId of(String valor){
        return new ViajeId(valor);
    }
}
