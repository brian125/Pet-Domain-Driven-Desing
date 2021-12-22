package co.com.sofka.paquete.values;

import co.com.sofka.generico.Id;

public final class PaqueteId  extends Id {

    private PaqueteId(String valor){
        super(valor);
    }

    public static PaqueteId of(String valor){
        return new PaqueteId(valor);
    }
}
