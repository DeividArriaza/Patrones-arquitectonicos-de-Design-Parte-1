class ServicioController {

    private ServicioFactory factory;
    private ServicioDAO dao;

    public ServicioController(ServicioFactory factory, ServicioDAO dao) {
        this.factory = factory;
        this.dao = dao;
    }

    public void solicitarServicio(boolean autenticado) {

        Servicio servicio = factory.crearServicio();

        ServicioAcceso proxy = new ServicioProxy(servicio, autenticado);

        proxy.ejecutarServicio();

        dao.guardar("Servicio Doméstico");
    }
}