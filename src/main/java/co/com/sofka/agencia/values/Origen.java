package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.util.Objects;

public class Origen implements Serializable {

    private String valor;

    public Origen(String valor) {
        this.valor = Objects.requireNonNull(valor, "El origen del viaje es requerido");
        if(valor.isBlank()){
            throw new IllegalArgumentException("El origen del viaje no puede estar vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Origen origen = (Origen) o;
        return Objects.equals(valor, origen.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
