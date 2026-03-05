class ServicioDAOImpl implements ServicioDAO {

    @Override
    public void guardar(String tipoServicio) {
        System.out.println("Guardando en base de datos: " + tipoServicio);
    }
}
