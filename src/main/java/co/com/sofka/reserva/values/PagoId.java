package co.com.sofka.reserva.values;

import co.com.sofka.generico.Id;

public final class PagoId extends Id {

    public PagoId() {
    }

    private PagoId(String valor) {
        super(valor);
    }

    public static PagoId og(String valor){
        return new PagoId(valor);
    }
}
