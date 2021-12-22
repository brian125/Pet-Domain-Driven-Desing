package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.EmpresaTransporte;
import co.com.sofka.paquete.values.TipoTransporte;
import co.com.sofka.paquete.values.TransporteId;

public class transporteAgregado extends DomainEvent {

    private final TransporteId transporteId;
    private final TipoTransporte tipoTransporte;
    private final EmpresaTransporte empresaTransporte;

    public transporteAgregado(TransporteId transporteId, TipoTransporte tipoTransporte, EmpresaTransporte empresaTransporte) {
        super("sofka.paquete.transporteagregado");
        this.transporteId = transporteId;
        this.tipoTransporte = tipoTransporte;
        this.empresaTransporte = empresaTransporte;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }
}
