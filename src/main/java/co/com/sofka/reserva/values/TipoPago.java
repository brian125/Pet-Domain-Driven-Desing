package co.com.sofka.reserva.values;

import java.io.Serializable;
import java.util.Objects;

public final class TipoPago implements Serializable {

    private final String valor;

    public TipoPago(String valor) {
        this.valor = Objects.requireNonNull(valor, "El tipo de pago es requerido");
        if(valor.isBlank()){
            throw new IllegalArgumentException("El tipo de pago no puede ir vacio");
        }
    }
}
