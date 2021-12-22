package co.com.sofka.paquete.values;

import co.com.sofka.generico.Id;

public final class TurismoId extends Id {

    public TurismoId() {
    }

    private TurismoId(String valor) {
        super(valor);
    }

    public static  TurismoId of(String valor){
        return  new TurismoId(valor);
    }
}
