package ar.utnba.ddsi.depoautomatizado.models.entities.robots;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.adaptadores.AdaptadorDrone;

public class Drone extends Robot {
    
    public Drone(Long id) {
        super(id);
        this.setAdaptador(new AdaptadorDrone(this));
    }

    //TODO
} 