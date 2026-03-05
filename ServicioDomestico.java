class ServicioDomestico extends Servicio {

    @Override
    protected void validarDisponibilidad() {
        System.out.println("Validando disponibilidad doméstica...");
    }

    @Override
    protected void calcularCosto() {
        System.out.println("Costo calculado: Q150");
    }
}