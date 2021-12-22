package co.com.sofka.generico;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public abstract class Id implements Serializable {

    private final String valor;

    public Id(){
        this(UUID.randomUUID().toString());
    }

    public Id(String valor){
        this.valor = Objects.requireNonNull(valor, "El valor es requerido");
        if(this.valor.isBlank()){
            throw new IllegalArgumentException("El valor no puede estar vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Id Id = (Id) o;
        return Objects.equals(valor, Id.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

}
