package co.com.sofka.reserva.values;

import java.io.Serializable;
import java.util.Objects;

public final class Telefono implements Serializable {

    private final Long valor;

    public Telefono(Long valor) {
        this.valor = Objects.requireNonNull(valor, "El telefono es requerido");
        if( valor < 999999){
            throw new IllegalArgumentException("El telefono debe contener almenos 7 digitos");
        }
    }

    public Long getValor() {
        return valor;
    }


}
