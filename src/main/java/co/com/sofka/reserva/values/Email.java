package co.com.sofka.reserva.values;

import java.io.Serializable;
import java.util.Objects;

public final class Email implements Serializable {

    private final String valor;

    public Email(String valor) {
        this.valor = Objects.requireNonNull(valor, "El email es requerido");
        if(valor.isBlank()){
            throw new IllegalArgumentException("El email no puede ir vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(valor, email.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
