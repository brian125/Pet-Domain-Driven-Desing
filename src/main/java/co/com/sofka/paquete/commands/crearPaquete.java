package co.com.sofka.paquete.commands;

import co.com.sofka.paquete.Paquete;
import co.com.sofka.paquete.values.PaqueteId;

public class crearPaquete {

    private final PaqueteId paqueteId;
    private final Paquete paquete;

    public crearPaquete(PaqueteId paqueteId, Paquete paquete) {
        this.paqueteId = paqueteId;
        this.paquete = paquete;
    }

    public PaqueteId getPaqueteId() {
        return paqueteId;
    }

    public Paquete getPaquete() {
        return paquete;
    }
}
