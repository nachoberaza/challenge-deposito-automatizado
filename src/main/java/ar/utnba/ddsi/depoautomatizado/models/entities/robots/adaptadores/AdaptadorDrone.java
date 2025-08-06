package ar.utnba.ddsi.depoautomatizado.models.entities.robots.adaptadores;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class AdaptadorDrone implements IAdaptadorRobot {
    private Robot robot;

    public AdaptadorDrone(Robot robot) {
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
