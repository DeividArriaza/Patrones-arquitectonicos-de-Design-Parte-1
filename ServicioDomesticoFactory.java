class ServicioDomesticoFactory implements ServicioFactory {

    @Override
    public Servicio crearServicio() {
        return new ServicioDomestico();
    }
}