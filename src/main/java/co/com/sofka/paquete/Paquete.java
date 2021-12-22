package co.com.sofka.paquete;

import co.com.sofka.generico.AggregateRoot;
import co.com.sofka.generico.Id;
import co.com.sofka.paquete.events.*;
import co.com.sofka.paquete.values.*;

import java.util.Objects;

public class Paquete extends AggregateRoot<PaqueteId> {

    private final Nombre nombre;
    private Estado estado;
    private Hotel hotel;
    private Turismo turismo;
    private Transporte transporte;

    public Paquete(PaqueteId paqueteId, Nombre nombre, Estado estado, Hotel hotel, Turismo turismo, Transporte transporte) {
        super(paqueteId);
        this.nombre = Objects.requireNonNull(nombre);
        this.estado = Objects.requireNonNull(estado);
        this.hotel = Objects.requireNonNull(hotel);
        this.turismo = Objects.requireNonNull(turismo);
        this.transporte = Objects.requireNonNull(transporte);
        this.applyChange(new paqueteCreado(paqueteId, nombre, estado, hotel, turismo, transporte));
    }

    public void agregarHotel(Nombre nombre, Categoria categoria){
        var id = new HotelId();
        hotel = (new Hotel(id, nombre, categoria));
        this.applyChange(new hotelAgregado(id, nombre, categoria));
    }

    public void agregarTurismo(Actividad actividad, Lugar lugar){
        var id = new TurismoId();
        turismo = (new Turismo(id, actividad, lugar));
        this.applyChange(new turismoAgregado(id,actividad,lugar));
    }

    public void agregarTransporte(TipoTransporte tipoTransporte, EmpresaTransporte empresaTransporte){
        var id = new TransporteId();
        transporte = (new Transporte(id, tipoTransporte, empresaTransporte));
        this.applyChange(new transporteAgregado(id,tipoTransporte,empresaTransporte));
    }

    public void cambiarNombreHotel(Hotel hotel, Nombre nombre){
        hotel.cambiarNombre(nombre);
        this.applyChange(new nombreCambiado(nombre));
    }

    public  void seleccionarCategoriaHotel(Hotel hotel, Categoria categoria){
        hotel.seleccionarCategoria(categoria);
        this.applyChange(new categoriaSeleccioanda(categoria));
    }

    public void actualizarActividadTurismo(Turismo turismo, Actividad actividad){
        turismo.actualizarActividad(actividad);
        this.applyChange(new actividadActualizada(actividad));
    }

    public void cambiarLugarTurismo(Turismo turismo, Lugar lugar){
        turismo.cambiarLugar(lugar);
        this.applyChange(new lugarCambiado(lugar));
    }

    public void seleccionarTipoTransporte(Transporte transporte, TipoTransporte tipoTransporte){
        transporte.seleccionarTipo(tipoTransporte);
        this.applyChange(new tipoSeleccionado(tipoTransporte));
    }

    public void nombreEmpresaTransporte(Transporte transporte, EmpresaTransporte empresaTransporte){
        transporte.nombreEmpresa(empresaTransporte);
        this.applyChange(new empresaNombrada(empresaTransporte));
    }

    public Nombre nombre() {
        return nombre;
    }

    public Estado estado() {
        return estado;
    }

    public Hotel hotel() {
        return hotel;
    }

    public Turismo turismo() {
        return turismo;
    }

    public Transporte transporte() {
        return transporte;
    }
}
