package co.com.sofka.reserva.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.reserva.values.Precio;

public class precioCalculado extends DomainEvent {

    private Precio precio;

    public precioCalculado(Precio precio) {
        super("sofka.reserva.precioCalculado");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}