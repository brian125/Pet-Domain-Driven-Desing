package co.com.sofka.paquete.values;

import java.util.Objects;

public class EmpresaTransporte {

    private String valor;

    public EmpresaTransporte(String valor) {
        this.valor = Objects.requireNonNull(valor, "El nombre de la empresa de transporte es requerido");
        if(valor.isBlank()){
            throw new IllegalArgumentException("El nombre de la empresa de transporte no puede ir vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpresaTransporte that = (EmpresaTransporte) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
