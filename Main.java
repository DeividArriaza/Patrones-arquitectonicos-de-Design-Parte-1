public class Main {

    public static void main(String[] args) {

        ServicioFactory factory = new ServicioDomesticoFactory();
        ServicioDAO dao = new ServicioDAOImpl();

        ServicioController controller = new ServicioController(factory, dao);

        System.out.println("Cliente solicita servicio...\n");

        controller.solicitarServicio(true); // Cambia a false para probar el Proxy
    }
}