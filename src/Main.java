import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int contador = 0;

        //BUFFERED READER
        try (BufferedReader reader = new BufferedReader(new FileReader("../EscribirFichero-ERepaso14/nombres.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
                contador++;
            }
        } catch (
    IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Hay un total de " + contador + " lineas.");
    }
}