package co.com.sofka.reserva.values;

import java.io.Serializable;
import java.util.Objects;

public class Precio implements Serializable {

    private Integer valor;

    public Precio(Integer valor) {
        this.valor = Objects.requireNonNull(valor, "El precio es requerido");
        if(valor <= 0) {
            throw new IllegalArgumentException("El precio del viaje no puede ser negativo");
        }
    }

    public Integer getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio precio = (Precio) o;
        return Objects.equals(valor, precio.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
