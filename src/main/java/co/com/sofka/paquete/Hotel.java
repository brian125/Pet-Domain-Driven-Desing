package co.com.sofka.paquete;

import co.com.sofka.generico.Entity;
import co.com.sofka.paquete.values.Categoria;
import co.com.sofka.paquete.values.HotelId;
import co.com.sofka.paquete.values.Nombre;

public class Hotel extends Entity<HotelId> {

    private Nombre nombre;
    private Categoria categoria;

    public Hotel(HotelId hotelIdid, Nombre nombre, Categoria categoria) {
        super(hotelIdid);
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void seleccionarCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Categoria categoria() {
        return categoria;
    }
}
