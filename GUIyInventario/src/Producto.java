public class Producto {
    public int id, stock;
    public int precio;
    public String nombre;

    Producto(int id, int stock, int precio, String nombre){
        this.id = id;
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
        id++;
    }

}
