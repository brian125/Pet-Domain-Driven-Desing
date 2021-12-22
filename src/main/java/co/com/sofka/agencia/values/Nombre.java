package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.util.Objects;

public final class Nombre implements Serializable {

    private final String valor;

    public Nombre(String valor){
        this.valor = Objects.requireNonNull(valor, "El nombre es requerido");
        if(this.valor.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nombre nombre = (Nombre) o;
        return Objects.equals(valor, nombre.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

}