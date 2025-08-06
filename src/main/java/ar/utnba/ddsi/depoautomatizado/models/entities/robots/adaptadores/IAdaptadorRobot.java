package ar.utnba.ddsi.depoautomatizado.models.entities.robots.adaptadores;

public interface IAdaptadorRobot {
    void avanzar();
    void girar();
    void recoger(Integer valor);
    void soltar(Integer valor);
}
