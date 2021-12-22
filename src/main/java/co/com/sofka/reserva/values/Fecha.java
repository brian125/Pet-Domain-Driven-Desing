package co.com.sofka.reserva.values;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public final class Fecha implements Serializable {

    private Date valor;

    public Fecha(Date valor){
        this.valor = Objects.requireNonNull(valor, "La fecha de reserva es requerida");
        if(valor.after(new Date(Instant.now().toEpochMilli()))){
            throw new IllegalArgumentException("No puede colocar una fecha del pasado");
        }
    }

    public Date getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(valor, fecha.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
