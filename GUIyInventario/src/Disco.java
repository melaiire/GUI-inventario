public class Disco extends Producto{

    String artista;
    String letra;
    Disco(int id, int stock, int precio, String nombre, String artista, String letra){
        super(id, stock, precio, nombre);
        this.artista = artista;
        this.letra = letra;
    }


    public String reproducir(String letra){
        return this.letra;
    }
    
    public int getId(){
        return id;
    }

    public int getStock(){
        return stock;
    }

    public int getPrecio(){
        return precio;
    }

    public String getNombre(){
        return nombre;
    }

    public String getArtista(){
        return artista;
    }

    public String getLetra(){
        return letra;
    }

}
