package co.com.sofka.agencia.events;

import co.com.sofka.agencia.values.FechaLlegada;

public class fechaLlegadaSeleccionada extends co.com.sofka.generico.DomainEvent {

    private final FechaLlegada fechaLlegada;

    public fechaLlegadaSeleccionada(FechaLlegada fechaLlegada) {
        super("sofka.agencia.fechallegadaseleccionado");
        this.fechaLlegada = fechaLlegada;
    }

    public FechaLlegada getFechaLlegada() {
        return fechaLlegada;
    }
}
