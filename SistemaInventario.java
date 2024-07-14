abstract class Registro {
    String nombreProducto;
    String categoria;
    double precio;  //tipo double para representar valores monetarios correctamente
    int cantidadDisponible;

    public Registro(String nombreProducto, String categoria, double precio, int cantidadDisponible) {
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public abstract void describir();  // Método que devuelve una cadena que contiene los detalles del producto
    public String getDetalles() {
        return "Nombre del Producto: " + nombreProducto + "\nCategoría: " + categoria + "\nPrecio: "
                + precio + "\nCantidad Disponible: " + cantidadDisponible;
    }
}

interface EstadoInventario {
    void completo();
    void vacio();
}

class Busqueda extends Registro implements EstadoInventario {

    public Busqueda(String nombreProducto, String categoria, double precio, int cantidadDisponible) {
        super(nombreProducto, categoria, precio, cantidadDisponible);
    }

    @Override
    public void describir() {
        System.out.println("\nDetalles del producto:");
        System.out.println(getDetalles());
    }

    @Override
    public void completo() {
        System.out.println("El inventario está completo");
    }

    @Override
    public void vacio() {
        System.out.println("El inventario está vacío");
    }
}

class Modificacion extends Registro implements EstadoInventario {
    String descripcion;  

    public Modificacion(String nombreProducto, String categoria, double precio, int cantidadDisponible, String descripcion) {
        super(nombreProducto, categoria, precio, cantidadDisponible);
        this.descripcion = descripcion;
    }

    @Override
    public void describir() {
        System.out.println("\nDescripción del producto " + nombreProducto + ": " + descripcion);
        System.out.println(getDetalles());
    }

    @Override
    public void completo() {
        System.out.println("El inventario está completo");
    }

    @Override
    public void vacio() {
        System.out.println("El inventario está vacío");
    }
}

public class SistemaInventario {
    public static void main(String[] args) {
       
        Busqueda productoExistente = new Busqueda("Donas", "Panadería", 25.99, 300);
        Busqueda productoExistente2 = new Busqueda("Leche", "Lacteos", 30.99, 100);
        productoExistente.describir();  // Imprimir los detalles del producto
        productoExistente.completo();   // Imprimir "El inventario está completo"

        productoExistente2.describir();  // Imprimir los detalles del producto
        productoExistente2.completo();

        Modificacion productoModificado = new Modificacion("OppoReno5", "Electrónicos", 1500.99, 0, "Nuevo modelo");
        productoModificado.describir();  // Imprimir los detalles del producto con la nueva descripción
        productoModificado.vacio();      // Imprimir"El inventario está vacío"
    }
}