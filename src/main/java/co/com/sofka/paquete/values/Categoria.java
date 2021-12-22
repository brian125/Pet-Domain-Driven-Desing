package co.com.sofka.paquete.values;

import java.util.Objects;

public final class Categoria {

    private final String valor;

    public Categoria(String valor) {
        this.valor = Objects.requireNonNull(valor, "La categoria del hotel no puede estar vacia");
        if(valor.isBlank()){
            throw new IllegalArgumentException("La categoria no puede estar en blanco");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(valor, categoria.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
