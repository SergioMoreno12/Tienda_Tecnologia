public class Laptop extends Producto implements Vendible{
    private String procesador;
    private int memoriaRAM;

    public Laptop() {
    }

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRAM) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadStock=" + cantidadStock +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad Stock: " + cantidadStock + " unidades");
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: ");
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
