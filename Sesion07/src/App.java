import mx.utng.Lector;
import mx.utng.ListaTareas;
import mx.utng.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu ();
        Lector lector = new Lector();
        ListaTareas lista = new ListaTareas();

        byte opcionSeleccionada = 0;

        do {
            menu.muestraOpciones();
            opcionSeleccionada = lector.leeOpcion();

            System.out.println("\n\nLa opcion seleccionada es: "+ opcionSeleccionada);

            switch (opcionSeleccionada) {
                case 1:
                    lista.crearNuevaLista();
                    break;
                case 2:
                    lista.verListaTareas();
                    break;
                case 3:
                    lista.verTareasDeLista();
                    break;
                case 4:
                    lista.actualizarListaTareas();
                    break;
                case 5:
                    lista.eliminarListaTareas();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicacion...Adios");
                    break;
                
                default:
                    System.out.println("Opcion desconocida");
                    break;
            }

        } while (opcionSeleccionada != 6);
    }
}
