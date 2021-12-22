package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.Categoria;
import co.com.sofka.paquete.values.HotelId;
import co.com.sofka.paquete.values.Nombre;

public class hotelAgregado extends DomainEvent {

    private final HotelId hotelId;
    private final Nombre nombre;
    private final Categoria categoria;


    public hotelAgregado(HotelId hotelId, Nombre nombre, Categoria categoria) {
        super("sofka.paquete.paquetecreado");
        this.hotelId = hotelId;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
