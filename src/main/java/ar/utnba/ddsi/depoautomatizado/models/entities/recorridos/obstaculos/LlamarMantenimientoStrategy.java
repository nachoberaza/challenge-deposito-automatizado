package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import ar.utnba.ddsi.depoautomatizado.models.entities.notificators.INotificador;
import ar.utnba.ddsi.depoautomatizado.models.entities.notificators.NotificadorMantenimiento;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class LlamarMantenimientoStrategy implements EstrategiaObstaculo {
    private INotificador notificador;

    public LlamarMantenimientoStrategy(String nroMantenimiento) {
        this.notificador = new NotificadorMantenimiento(nroMantenimiento);
    }

    @Override
    public void manejarObstaculo(Robot robot) {
        //TODO
    }
} 