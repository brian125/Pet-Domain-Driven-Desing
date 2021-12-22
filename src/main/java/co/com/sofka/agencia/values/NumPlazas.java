package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.util.Objects;

public class NumPlazas implements Serializable {

    private Integer valor;

    public NumPlazas(Integer valor) {
        this.valor = Objects.requireNonNull(valor, "El numero de plazas es requerido");
        if(valor <= 0){
            throw new IllegalArgumentException("La cantidad de plazas no puede ser negativa");
        }
    }

    public Integer getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumPlazas numPlazas = (NumPlazas) o;
        return Objects.equals(valor, numPlazas.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
