package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.EmpresaTransporte;

public class empresaNombrada extends DomainEvent {

    private final EmpresaTransporte empresaTransporte;

    public empresaNombrada(EmpresaTransporte empresaTransporte) {
        super("sofka.paquete.empresatransportenombrada");
        this.empresaTransporte = empresaTransporte;
    }
}
