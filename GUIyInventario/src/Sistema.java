import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Sistema {
    List<Disco> listaDiscos = new ArrayList<Disco>();
    Scanner scanner = new Scanner(System.in);
    FILEIO file = new FILEIO();


    public void addDisco(){
        System.out.println("Escribe el nombre del disco");
        String nombre = scanner.nextLine();

        System.out.println("Escribe el artista del disco");
        String artista = scanner.nextLine();
        System.out.println("Escribe una parte de la letra que recuerdes");
        String letra = scanner.nextLine();
        System.out.println("Escribe el id");
        int id = scanner.nextInt();
        System.out.println("Escribe el stock");
        int stock = scanner.nextInt();
        System.out.println("escribe el precio");
        int precio = scanner.nextInt();

        listaDiscos.add(new Disco(id, stock, precio, nombre, artista, letra));

        file.saveAll(listaDiscos);
        
    }


    public void leerDiscos(){
        
    }
}
