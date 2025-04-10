public class Celular extends Producto implements Vendible{
    private int capacidadBateria;
    private int camaraResolucion;

    public Celular() {
    }

    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, int camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public int getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public void setCamaraResolucion(int camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public String toString() {
        return "Celular{" +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                "capacidadBateria=" + capacidadBateria +
                ", camaraResolucion=" + camaraResolucion +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad Stock: " + cantidadStock + " unidades");
        System.out.println("Capacidad bateria: " + capacidadBateria + " mAh");
        System.out.println("Resolucion de la camara: " + camaraResolucion + " Mpx");
    }

    @Override
    public void calcularPrecioVenta(int cantidad) {
        if (cantidad>5){
            double subtotal = cantidad * precio;
            double descuento = subtotal * 0.20;
            double total = subtotal - descuento;
        } else if (cantidad==0){
            System.out.println("No ha agregado productos ");
        }
    }
}
