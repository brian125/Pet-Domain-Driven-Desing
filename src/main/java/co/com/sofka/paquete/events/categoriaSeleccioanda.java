package co.com.sofka.paquete.events;

import co.com.sofka.generico.DomainEvent;
import co.com.sofka.paquete.values.Categoria;

public class categoriaSeleccioanda extends DomainEvent {

    private final Categoria categoria;

    public categoriaSeleccioanda(Categoria categoria) {
        super("sofka.paquete.categoriaseleccionada");
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
