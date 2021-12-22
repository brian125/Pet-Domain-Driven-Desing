package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.*;
import co.com.sofka.generico.DomainEvent;

public class viajeAgregado extends DomainEvent {

    private final ViajeId viajeId;
    private final Origen origen;
    private final Destino destino;
    private final FechaSalida fechaSalida;
    private final FechaLlegada fechaLlegada;
    private final NumPlazas numPlazas;

    public viajeAgregado(ViajeId viajeId, Origen origen, Destino destino, FechaSalida fechaSalida, FechaLlegada fechaLlegada, NumPlazas numplazas) {
        super("sofka.agencia.viajeAgregado");
        this.viajeId = viajeId;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.numPlazas = numplazas;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public Origen getOrigen() {
        return origen;
    }

    public Destino getDestino() {
        return destino;
    }

    public FechaSalida getFechaSalida() {
        return fechaSalida;
    }

    public FechaLlegada getFechaLlegada() {
        return fechaLlegada;
    }

    public NumPlazas getNumPlazas() {
        return numPlazas;
    }
}
