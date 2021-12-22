package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.FechaSalida;
import co.com.sofka.generico.DomainEvent;

public class fechaSalidaSeleccionada extends DomainEvent {

    private final FechaSalida FechaSalida;

    public fechaSalidaSeleccionada(FechaSalida fechaSalida) {
        super("sofka.agencia.fechasalidaseleccionada");
        this.FechaSalida = fechaSalida;
    }

    public co.com.sofka.agencia.values.FechaSalida getFechaSalida() {
        return FechaSalida;
    }
}
