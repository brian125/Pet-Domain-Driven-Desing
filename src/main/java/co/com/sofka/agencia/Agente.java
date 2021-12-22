package co.com.sofka.agencia;

import co.com.sofka.agencia.values.AgenteId;
import co.com.sofka.agencia.values.Email;
import co.com.sofka.agencia.values.Nombre;
import co.com.sofka.agencia.values.Telefono;
import co.com.sofka.generico.Entity;

import java.util.Objects;

public class Agente extends Entity<AgenteId> {

    private final Nombre nombre;
    private final Email email;
    private final Telefono telefono;

    public Agente(AgenteId agenteId, Nombre nombre, Email email, Telefono telefono){
        super(agenteId);
        this.nombre = Objects.requireNonNull(nombre);
        this.email = Objects.requireNonNull(email);
        this.telefono = Objects.requireNonNull(telefono);
    }

    //Pensar en comportamientos para el  agente NO HACE NADA !!!! HAY DIOOOOOS
    //Tambien pensar en otra entidad de una agencia de viajes y cambiar esta.
    //Entidad ANEMICA!!

}