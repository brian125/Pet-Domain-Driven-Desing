package co.com.sofka.paquete.values;

import java.util.Objects;

public final class TipoTransporte {

    private final String valor;

    public TipoTransporte(String valor) {
        this.valor = Objects.requireNonNull(valor, "El tipo de transporte es requerido");
        if(valor.isBlank()){
            throw new IllegalArgumentException("El tipo de transporte no puede ir vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoTransporte that = (TipoTransporte) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
