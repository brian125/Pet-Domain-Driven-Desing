package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.Hotel;
import co.com.sofka.paquete.values.HotelId;

public class agregarHotel {

    private final HotelId hotelId;
    private final Hotel hotel;

    public agregarHotel(HotelId hotelId, Hotel hotel) {
        this.hotelId = hotelId;
        this.hotel = hotel;
    }

    public HotelId getHotelId() {
        return hotelId;
    }

    public Hotel getHotel() {
        return hotel;
    }
}
