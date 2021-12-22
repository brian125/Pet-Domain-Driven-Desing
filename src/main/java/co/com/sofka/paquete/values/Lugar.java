package co.com.sofka.paquete.values;

import java.util.Objects;

public final class Lugar {

    private final String valor;

    public Lugar(String valor) {
        this.valor = Objects.requireNonNull(valor, "El lugar es requerido");
        if (valor.isBlank()) {
            throw new IllegalArgumentException("El lugar turistico no puede estar vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lugar lugar = (Lugar) o;
        return Objects.equals(valor, lugar.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
