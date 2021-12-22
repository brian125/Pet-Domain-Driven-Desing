package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.TipoTransporte;

public class tipoSeleccionado extends DomainEvent {

    private final TipoTransporte tipoTransporte;

    public tipoSeleccionado(TipoTransporte tipoTransporte) {
        super("sofka.paquete.tipotransporteseleccionado");
        this.tipoTransporte = tipoTransporte;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }
}
