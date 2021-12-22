package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.values.HotelId;
import co.com.sofka.paquete.values.Nombre;

public class cambiarNombreHotel {

    private final HotelId hotelId;
    private final Nombre nombre;

    public cambiarNombreHotel(HotelId hotelId, Nombre nombre) {
        this.hotelId = hotelId;
        this.nombre = nombre;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
