package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.util.Objects;

public final class Telefono implements Serializable {

    private final Long telefono;

    public Telefono(Long telefono){
        this.telefono = Objects.requireNonNull(telefono, "El telefono es requerido");
        if( telefono < 999999){
            throw new IllegalArgumentException("El telefono debe contener almenos 7 digitos");
        }
    }

    public Long getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefono telefono1 = (Telefono) o;
        return Objects.equals(telefono, telefono1.telefono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono);
    }
}
