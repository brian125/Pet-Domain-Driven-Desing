package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.Hotel;
import co.com.sofka.paquete.Transporte;
import co.com.sofka.paquete.Turismo;
import co.com.sofka.paquete.values.Estado;
import co.com.sofka.paquete.values.Nombre;
import co.com.sofka.paquete.values.PaqueteId;

public class paqueteCreado extends DomainEvent {

    private final PaqueteId paqueteId;
    private final Nombre nombre;
    private Estado estado;
    private Hotel hotel;
    private Turismo turismo;
    private Transporte transporte;

    public paqueteCreado(PaqueteId paqueteId, Nombre nombre, Estado estado, Hotel hotel, Turismo turismo, Transporte transporte) {
        super("sofka.paquete.paquetecreado");
        this.paqueteId = paqueteId;
        this.nombre = nombre;
        this.estado = estado;
        this.hotel = hotel;
        this.turismo = turismo;
        this.transporte = transporte;
    }

    public PaqueteId getPaqueteId() {
        return paqueteId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Turismo getTurismo() {
        return turismo;
    }

    public Transporte getTransporte() {
        return transporte;
    }
}
