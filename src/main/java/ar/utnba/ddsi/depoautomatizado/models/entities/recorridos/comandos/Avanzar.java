package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Avanzar implements IComando {
    private Integer distanciaMetros;

    public Avanzar(Integer distanciaMetros) {
        this.distanciaMetros = distanciaMetros;
    }

    @Override
    public void ejecutar(Robot robot) {
        robot.getAdaptador().avanzar();
    }
}
