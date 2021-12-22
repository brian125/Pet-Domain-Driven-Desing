package co.com.sofka.reserva;

import co.com.sofka.agencia.Viaje;
import co.com.sofka.generico.Entity;
import co.com.sofka.reserva.values.*;

public class Cliente extends Entity<ClienteId> {

    private Nombre nombre;
    private Telefono telefono;
    private Sexo sexo;
    private Email email;
    private Cantidad cantidadClientes;
    private Viaje viaje;

    public Cliente(ClienteId clienteId, Nombre nombre, Telefono telefono, Sexo sexo, Email email,Cantidad cantidadClientes, Viaje viaje) {
        super(clienteId);
        this.nombre = nombre;
        this.telefono = telefono;
        this.sexo = sexo;
        this.email = email;
        this.cantidadClientes = cantidadClientes;
        this.viaje = viaje;
    }

    public void solicitarViaje(Viaje viaje){
        this.viaje = new Viaje(viaje.getId(),viaje.origen(),viaje.destino(),viaje.fechaSalida(), viaje.fechaLlegada(), viaje.numPlazas());
    }

    public Nombre nombre() {
        return nombre;
    }

    public Telefono telefono() {
        return telefono;
    }

    public Sexo sexo() {
        return sexo;
    }

    public Email email() {
        return email;
    }

    public Viaje viaje() {
        return viaje;
    }
}
