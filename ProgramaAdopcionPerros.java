import java.util.Scanner;
class Perro {
    String raza;
    int cantidadDisponible;

    public Perro(String raza, int cantidadDisponible) {
        this.raza = raza;
        this.cantidadDisponible = cantidadDisponible;
    }
}

class CatalogoPerros {
    static final int MAX_PERROS = 10;
    Perro[] perros = new Perro[MAX_PERROS];
    int totalPerros = 0;


    public void insertarPerro(String raza, int cantidad) {
        if (totalPerros < MAX_PERROS) {
            perros[totalPerros++] = new Perro(raza, cantidad);
            System.out.println("Perro insertado correctamente.");
        } else {
            System.out.println("Catálogo completo. No se pueden agregar más perros.");
        }
    }

    
    public void consultarPerro(String raza) {
        for (int i = 0; i < totalPerros; i++) {
            if (perros[i].raza.equalsIgnoreCase(raza)) {
                System.out.println("Raza: " + perros[i].raza);
                System.out.println("Cantidad disponible: " + perros[i].cantidadDisponible);
                return;
            }
        }
        System.out.println("No se encontró información para la raza especificada.");
    }

    
    public void modificarCantidad(String raza, int nuevaCantidad) {
        for (int i = 0; i < totalPerros; i++) {
            if (perros[i].raza.equalsIgnoreCase(raza)) {
                perros[i].cantidadDisponible = nuevaCantidad;
                System.out.println("Cantidad modificada correctamente.");
                return;
            }
        }
        System.out.println("No se encontró información para la raza especificada.");
    }

    
    public void eliminarPerro(String raza) {
        for (int i = 0; i < totalPerros; i++) {
            if (perros[i].raza.equalsIgnoreCase(raza)) {
                for (int j = i; j < totalPerros - 1; j++) {
                    perros[j] = perros[j + 1];
                }
                totalPerros--;
                System.out.println("Perro eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró información para la raza especificada.");
    }

    
    public void listarPerros() {
        if (totalPerros == 0) {
            System.out.println("No hay perros en el catálogo.");
            return;
        }
        System.out.println("Lista de perros en el catálogo:");
        for (int i = 0; i < totalPerros; i++) {
            System.out.println("Raza: " + perros[i].raza + ", Cantidad disponible: " + perros[i].cantidadDisponible);
        }
    }
}

public class ProgramaAdopcionPerros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CatalogoPerros catalogo = new CatalogoPerros();

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Insertar perro");
            System.out.println("2. Consultar perro");
            System.out.println("3. Modificar cantidad de perros");
            System.out.println("4. Eliminar perro");
            System.out.println("5. Listar perros");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la raza del perro: ");
                    String raza = scanner.nextLine();
                    System.out.print("Ingrese la cantidad disponible: ");
                    int cantidad = scanner.nextInt();
                    catalogo.insertarPerro(raza, cantidad);
                    break;
                case 2:
                    System.out.print("Ingrese la raza del perro a consultar: ");
                    raza = scanner.nextLine();
                    catalogo.consultarPerro(raza);
                    break;
                case 3:
                    System.out.print("Ingrese la raza del perro a modificar: ");
                    raza = scanner.nextLine();
                    System.out.print("Ingrese la nueva cantidad: ");
                    cantidad = scanner.nextInt();
                    catalogo.modificarCantidad(raza, cantidad);
                    break;
                case 4:
                    System.out.print("Ingrese la raza del perro a eliminar: ");
                    raza = scanner.nextLine();
                    catalogo.eliminarPerro(raza);
                    break;
                case 5:
                    catalogo.listarPerros();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
            scanner.close();
        }
    }
}
