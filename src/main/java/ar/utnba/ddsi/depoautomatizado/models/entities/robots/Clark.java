package ar.utnba.ddsi.depoautomatizado.models.entities.robots;

import ar.utnba.ddsi.depoautomatizado.models.entities.robots.adaptadores.AdaptadorClark;

public class Clark extends Robot {
    
    public Clark(Long id) {
        super(id);
        this.setAdaptador(new AdaptadorClark(this));
    }

    public void avanzar(){
        System.out.println("Clark avanza..");
    }
} 