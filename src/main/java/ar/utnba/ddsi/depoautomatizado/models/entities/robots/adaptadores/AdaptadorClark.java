package ar.utnba.ddsi.depoautomatizado.models.entities.robots.adaptadores;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Clark;

public class AdaptadorClark implements IAdaptadorRobot {
    private Clark robot;

    public AdaptadorClark(Clark robot) {
        this.robot = robot;
    }

    @Override
    public void avanzar() {

    }

    @Override
    public void girar() {

    }

    @Override
    public void recoger(Integer valor) {

    }

    @Override
    public void soltar(Integer valor) {

    }
}
