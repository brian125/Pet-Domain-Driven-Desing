package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.util.Objects;

public class Destino implements Serializable {

    private String valor;

    public Destino(String valor){
        this.valor = Objects.requireNonNull(valor, "El destino es requerido");
        if(this.valor.isBlank()){
            throw new IllegalArgumentException("El destino no puede estar vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destino destino = (Destino) o;
        return Objects.equals(valor, destino.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
