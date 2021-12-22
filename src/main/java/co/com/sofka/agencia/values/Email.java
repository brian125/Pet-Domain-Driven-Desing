package co.com.sofka.agencia.values;

import java.io.Serializable;
import java.util.Objects;

public final class Email implements Serializable {

    private final String valor;

    public Email(String valor){
        //Aplicar pattern y match para la validacion del correo de momento solo enviamos el dato
        this.valor = Objects.requireNonNull(valor, "El correo es requerido");
        if(this.valor.isBlank()){
            throw new IllegalArgumentException("El correo no puede estar vacio");
        }
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(valor, email.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
