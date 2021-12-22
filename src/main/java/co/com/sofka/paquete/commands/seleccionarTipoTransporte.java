package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.values.TipoTransporte;
import co.com.sofka.paquete.values.TransporteId;

public class seleccionarTipoTransporte {

    private final TransporteId transporteId;
    private final TipoTransporte tipoTransporte;

    public seleccionarTipoTransporte(TransporteId transporteId, TipoTransporte tipoTransporte) {
        this.transporteId = transporteId;
        this.tipoTransporte = tipoTransporte;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }
}
