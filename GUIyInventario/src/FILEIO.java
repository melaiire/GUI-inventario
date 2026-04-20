import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class FILEIO {
    
    public void save(Disco disco){
        System.out.println("Empezando guardado.");

        try {
            FileWriter writer = new FileWriter("baseDiscos.txt", true);
            writer.write(disco.getId()+ " |"+disco.getStock()+" |"+disco.getPrecio()+" |"+disco.getNombre()+" |"+disco.getArtista()+" |"+disco.getLetra()+System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void read(){
        System.out.println("Empezando a leer archivo");
        try {
            FileReader reader = new FileReader("baseDiscos.txt");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void saveAll(List<Disco> lista){
        for(Disco disco : lista){
            try {
            FileWriter writer = new FileWriter("baseDiscos.txt", true);
            writer.write(disco.getId()+ " |"+disco.getStock()+" |"+disco.getPrecio()+" |"+disco.getNombre()+" |"+disco.getArtista()+" |"+disco.getLetra()+System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

}
