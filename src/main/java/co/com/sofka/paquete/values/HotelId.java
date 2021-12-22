package co.com.sofka.paquete.values;

import co.com.sofka.generico.Id;


public final class HotelId extends Id {

    public HotelId() {
    }

    private HotelId(String valor) {
        super(valor);
    }

    public static HotelId of(String valor){
        return new HotelId(valor);
    }
}
