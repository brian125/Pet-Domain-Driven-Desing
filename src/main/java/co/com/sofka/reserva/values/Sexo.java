package co.com.sofka.reserva.values;

import java.io.Serializable;
import java.util.Objects;

public final class Sexo implements Serializable {

    private final Character valor;

    public Sexo(Character valor) {
        this.valor = Objects.requireNonNull(valor, "El sexo es requerido");
        if (valor.charValue() != 'F' || valor.charValue() != 'M'){
            throw new IllegalArgumentException("Los unicos valores permitidos son M y F");
        }
    }

    public Character getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sexo sexo = (Sexo) o;
        return Objects.equals(valor, sexo.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
