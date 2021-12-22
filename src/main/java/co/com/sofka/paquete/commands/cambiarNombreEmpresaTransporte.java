package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.values.EmpresaTransporte;
import co.com.sofka.paquete.values.TransporteId;

public class cambiarNombreEmpresaTransporte {

    private final TransporteId transporteId;
    private  final EmpresaTransporte empresaTransporte;


    public cambiarNombreEmpresaTransporte(TransporteId transporteId, EmpresaTransporte empresaTransporte) {
        this.transporteId = transporteId;
        this.empresaTransporte = empresaTransporte;
    }

    public TransporteId getTransporteId() {
        return transporteId;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }
}
