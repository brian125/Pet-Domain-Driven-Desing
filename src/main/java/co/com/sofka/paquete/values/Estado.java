package co.com.sofka.paquete.values;

import java.util.Objects;

public class Estado {

    private Boolean valor;

    public Estado(Boolean valor) {
        this.valor = Objects.requireNonNull(valor, "El estado del paquete es requerido");
        if(!valor){
            throw new IllegalArgumentException("El estado del paquete debe estar activo(ser true)");
        }
    }

    public Boolean getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(valor, estado.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
