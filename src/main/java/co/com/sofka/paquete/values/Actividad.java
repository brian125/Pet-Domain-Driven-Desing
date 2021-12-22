package co.com.sofka.paquete.values;

import java.util.Objects;

public class Actividad {

    private String valor;

    public Actividad(String valor) {
        this.valor = Objects.requireNonNull(valor, "La actividad turistica es requerida");
        if(valor.isBlank()){
            throw new IllegalArgumentException("La actividad turistica no puede estar vacia");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actividad actividad = (Actividad) o;
        return Objects.equals(valor, actividad.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
