class ServicioProxy implements ServicioAcceso {

    private ServicioReal servicioReal;
    private boolean autenticado;

    public ServicioProxy(Servicio servicio, boolean autenticado) {
        this.servicioReal = new ServicioReal(servicio);
        this.autenticado = autenticado;
    }

    @Override
    public void ejecutarServicio() {
        if (autenticado) {
            servicioReal.ejecutarServicio();
        } else {
            System.out.println("Acceso denegado. Usuario no autenticado.");
        }
    }
}