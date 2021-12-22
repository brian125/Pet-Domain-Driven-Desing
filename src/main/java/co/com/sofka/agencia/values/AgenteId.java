package co.com.sofka.agencia.values;

import co.com.sofka.generico.Id;

public final class AgenteId extends Id {

    private AgenteId(String valor){
        super(valor);
    }

    public AgenteId(){

    }

    public static AgenteId of(String valor){
        return new AgenteId(valor);
    }
}