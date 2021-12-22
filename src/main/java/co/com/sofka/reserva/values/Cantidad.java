package co.com.sofka.reserva.values;

import java.io.Serializable;
import java.util.Objects;

public class Cantidad implements Serializable {

    private Integer valor;

    public Cantidad(Integer valor) {
        this.valor = Objects.requireNonNull(valor, "La cantidad de clientes es requerida");
        if(valor <= 0 ){
            throw new IllegalArgumentException("La cantidad de clientes no puede ser negativa");
        }
    }

    public Integer getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cantidad cantidad = (Cantidad) o;
        return Objects.equals(valor, cantidad.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
