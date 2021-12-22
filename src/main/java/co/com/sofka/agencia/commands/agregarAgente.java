package co.com.sofka.agencia.commands;

import co.com.sofka.agencia.Agente;
import co.com.sofka.agencia.values.AgenteId;

public class agregarAgente {

    private final AgenteId agenteId;
    private final Agente agente;

    public agregarAgente(AgenteId agenteId,Agente agente) {
        this.agenteId = agenteId;
        this.agente = agente;
    }

    public AgenteId getAgenteId() {
        return agenteId;
    }

    public Agente getAgente() {
        return agente;
    }
}
