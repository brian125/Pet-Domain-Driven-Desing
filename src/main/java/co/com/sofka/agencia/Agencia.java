package co.com.sofka.agencia;

import co.com.sofka.agencia.events.*;
import co.com.sofka.agencia.values.*;
import co.com.sofka.generico.AggregateRoot;

import java.util.Objects;

public class Agencia extends AggregateRoot<AgenciaId> {

    private final Nombre nombre;
    private final Telefono telefono;
    private final Email email;
    private Agente agente;
    private Viaje viaje;

    public Agencia(AgenciaId agenciaId, Nombre nombre, Telefono telefono, Email email) {
        super(agenciaId);
        this.nombre = Objects.requireNonNull(nombre, "El nombre de la agencia es requerido");
        this.telefono = Objects.requireNonNull(telefono, "El telefono de la agencia es requerido");
        this.email = Objects.requireNonNull(email, "El email de la agencia es requerido");
        this.applyChange(new agenciaCreada(agenciaId,nombre,telefono,email));
    }

    public void agregarAgente(Nombre nombre, Email email, Telefono telefono){
        var id = new AgenteId();
        agente = (new Agente(id, nombre, email, telefono));
        this.applyChange(new agenteAgregado(id, nombre, email, telefono));
    }

    public void agregarViaje(Origen origen,Destino destino, FechaSalida fechaSalida, FechaLlegada fechaLlegada, NumPlazas numplazas){
        var id = new ViajeId();
        viaje = (new Viaje(id, origen, destino,fechaSalida,fechaLlegada,numplazas));
        this.applyChange(new viajeAgregado(id,origen,destino,fechaSalida,fechaLlegada,numplazas));
    }

    public void seleccionarOrigenViaje(Viaje viaje, Origen origen){
        viaje.seleccionarOrigen(origen);
        this.applyChange(new origenSeleccionado(origen));
    }

    public void seleccionarOrigenViaje(Viaje viaje, Destino destino){
        viaje.seleccionarDestino(destino);
        this.applyChange(new destinoSeleccionado(destino));
    }

    public void seleccionarFechaSalidaViaje(Viaje viaje, FechaSalida fechaSalida){
        viaje.seleccionarFechaSalida(fechaSalida);
        this.applyChange(new fechaSalidaSeleccionada(fechaSalida));
    }

    public void seleccionarFechaLlegadaViaje(Viaje viaje, FechaLlegada fechaLlegada){
        viaje.seleccionarFechaLlegada(fechaLlegada);
        this.applyChange(new fechaLlegadaSeleccionada(fechaLlegada));
    }

    public void seleccionarNumPlazasViaje(Viaje viaje, NumPlazas numPlazas){
        viaje.seleccionarNumPlazas(numPlazas);
        this.applyChange(new numPlazasSeleccionado(numPlazas));
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }

    public Email email() {
        return email;
    }

    public Agente agente() {
        return agente;
    }

    public Viaje viaje() {
        return viaje;
    }
}
