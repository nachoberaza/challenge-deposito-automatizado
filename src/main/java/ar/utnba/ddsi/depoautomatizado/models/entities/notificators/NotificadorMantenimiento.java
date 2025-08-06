package ar.utnba.ddsi.depoautomatizado.models.entities.notificators;

public class NotificadorMantenimiento implements INotificador {
    private String nroMantenimiento;

    public NotificadorMantenimiento(String nroMantenimiento) {
        this.nroMantenimiento = nroMantenimiento;
    }

    @Override
    public void notificar() {
        System.out.println("Notificando Mantenimiento...");
    }
}
