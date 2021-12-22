package co.com.sofka.agencia.values;

import co.com.sofka.generico.Id;

public final class AgenciaId extends Id {

    private AgenciaId(String valor){
        super(valor);
    }

    public static AgenciaId of(String valor){
        return new AgenciaId(valor);
    }
}
