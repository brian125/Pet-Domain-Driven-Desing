package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.values.Categoria;
import co.com.sofka.paquete.values.HotelId;

public class seleccionarCategoriaHotel {

    private final HotelId hotelId;
    private final Categoria categoria;

    public seleccionarCategoriaHotel(HotelId hotelId, Categoria categoria) {
        this.hotelId = hotelId;
        this.categoria = categoria;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
