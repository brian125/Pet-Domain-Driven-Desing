package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class FechaLlegada implements Serializable {

    private Date valor;

    public FechaLlegada(Date valor){
        //Aplicar pattern y match para la validacion del correo de momento solo enviamos el dato
        this.valor = Objects.requireNonNull(valor, "La fecha de llegada es requerida");
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
        FechaLlegada that = (FechaLlegada) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
