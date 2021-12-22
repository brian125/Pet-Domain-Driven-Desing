package co.com.sofka.reserva.values;

import co.com.sofka.generico.Id;

public final class ReservaId extends Id {

    public ReservaId() {
    }

    private ReservaId(String valor) {
        super(valor);
    }

    public static ReservaId of(String valor){
        return new ReservaId(valor);
    }
}
