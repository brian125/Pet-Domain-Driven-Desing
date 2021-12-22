package co.com.sofka.paquete.values;

import co.com.sofka.generico.Id;

public final class TransporteId extends Id {

    public TransporteId() {
    }

    private TransporteId(String valor) {
        super(valor);
    }

    public static TransporteId of(String valor){
        return new TransporteId(valor);
    }
}
