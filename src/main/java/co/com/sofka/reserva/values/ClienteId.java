package co.com.sofka.reserva.values;

import co.com.sofka.generico.Id;

public final class ClienteId extends Id {

    public ClienteId() {
    }

    private ClienteId(String valor) {
        super(valor);
    }

    public static ClienteId of(String valor){
        return new ClienteId(valor);
    }
}
