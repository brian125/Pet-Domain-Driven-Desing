package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.Transporte;
import co.com.sofka.paquete.values.TransporteId;

public class agregarTransporte {

    private final TransporteId transporteId;
    private final Transporte transporte;

    public agregarTransporte(TransporteId transporteId, Transporte transporte) {
        this.transporteId = transporteId;
        this.transporte = transporte;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public Transporte getTransporte() {
        return transporte;
    }
}
