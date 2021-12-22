package co.com.sofka.agencia;

import co.com.sofka.agencia.values.*;
import co.com.sofka.generico.Entity;

import java.util.Objects;

public class Viaje extends Entity<ViajeId> {

    private Origen origen;
    private Destino destino;
    private FechaSalida fechaSalida;
    private FechaLlegada fechaLlegada;
    private NumPlazas numPlazas;

    public Viaje(ViajeId viajeId, Origen origen, Destino destino, FechaSalida fechaSalida, FechaLlegada fechaLlegada, NumPlazas numPlazas){
        super(viajeId);
        this.origen = Objects.requireNonNull(origen);
        this.destino = Objects.requireNonNull(destino);
        this.fechaSalida = Objects.requireNonNull(fechaSalida);
        this.fechaLlegada = Objects.requireNonNull(fechaLlegada);
        this.numPlazas = Objects.requireNonNull(numPlazas);
    }

    public void seleccionarOrigen(Origen origen){
        this.origen = origen;
    }

    public void seleccionarDestino(Destino destino){
        this.destino = destino;
    }

    public void seleccionarFechaSalida(FechaSalida fechaSalida){
        this.fechaSalida = fechaSalida;
    }

    public void seleccionarFechaLlegada(FechaLlegada fechaLlegada){
        this.fechaLlegada = fechaLlegada;
    }

    public void seleccionarNumPlazas (NumPlazas numPlazas){
        this.numPlazas = numPlazas;
    }

    public Origen origen() {
        return origen;
    }

    public Destino destino() {
        return destino;
    }

    public FechaSalida fechaSalida() {
        return fechaSalida;
    }

    public FechaLlegada fechaLlegada() {
        return fechaLlegada;
    }

    public NumPlazas numPlazas() {
        return numPlazas;
    }
}