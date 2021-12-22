package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class FechaSalida implements Serializable {

    private Date valor;

    public FechaSalida(Date valor) {
        this.valor = Objects.requireNonNull(valor, "la fecha de salida es requerida");
        if(valor.after(new Date(Instant.now().toEpochMilli()))){
            throw new IllegalArgumentException("No se puede colocar una fecha de salida del pasado");
        }
    }

    public Date getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaSalida that = (FechaSalida) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
