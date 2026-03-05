abstract class Servicio {

    // Template Method
    public final void procesarServicio() {
        validarDisponibilidad();
        calcularCosto();
        generarSolicitud();
        notificarTrabajador();
    }

    protected abstract void validarDisponibilidad();
    protected abstract void calcularCosto();

    protected void generarSolicitud() {
        System.out.println("Solicitud generada.");
    }

    protected void notificarTrabajador() {
        System.out.println("Trabajador notificado.");
    }
}


