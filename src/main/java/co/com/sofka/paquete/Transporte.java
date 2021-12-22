package co.com.sofka.paquete;

import co.com.sofka.generico.Entity;
import co.com.sofka.paquete.values.EmpresaTransporte;
import co.com.sofka.paquete.values.TipoTransporte;
import co.com.sofka.paquete.values.TransporteId;

public class Transporte extends Entity<TransporteId> {

    private TipoTransporte tipoTransporte;
    private EmpresaTransporte empresaTransporte;

    public Transporte(TransporteId transporteId, TipoTransporte tipoTransporte, EmpresaTransporte empresaTransporte) {
        super(transporteId);
        this.tipoTransporte = tipoTransporte;
        this.empresaTransporte = empresaTransporte;
    }

    public void seleccionarTipo(TipoTransporte tipoTransporte){
        this.tipoTransporte = tipoTransporte;
    }

    public void nombreEmpresa(EmpresaTransporte empresaTransporte){
        this.empresaTransporte = empresaTransporte;
    }

    public TipoTransporte tipoTransporte() {
        return tipoTransporte;
    }

    public EmpresaTransporte empresaTransporte() {
        return empresaTransporte;
    }
}
