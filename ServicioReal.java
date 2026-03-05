class ServicioReal implements ServicioAcceso {

    private Servicio servicio;

    public ServicioReal(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public void ejecutarServicio() {
        servicio.procesarServicio();
    }
}