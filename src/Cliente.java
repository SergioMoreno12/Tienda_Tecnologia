import java.util.*;

public class Cliente {
    private String nombre;
    private String correo;

    public Cliente() {
    }

    public Cliente(String nombre, String correo, List<Producto> listproductos) {
        this.nombre = nombre;
        this.correo = correo;
        this.listproductos = listproductos;
    }


    private List<Producto> listproductos = new ArrayList<>();

}
