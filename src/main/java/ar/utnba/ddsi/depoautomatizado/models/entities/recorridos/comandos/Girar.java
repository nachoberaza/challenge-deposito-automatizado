package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.comandos;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class Girar implements IComando {
    private Integer grados;

    @Override
    public void ejecutar(Robot robot) {
    }
}
