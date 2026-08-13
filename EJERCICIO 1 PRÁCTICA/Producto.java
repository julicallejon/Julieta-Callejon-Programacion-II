public class Producto {
    // a) Atributos
    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadStock;

    // b) Constructor: recibe código, nombre y precio. Stock inicia en 0
    public Producto(String codigo, String nombre, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = 0;
    }

    // c) Método que muestra los datos del producto
    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad en stock: " + cantidadStock);
        System.out.println("--------------------------");
    }
}