package b;

import java.io.*;

public class SepararPalabras {
    public static void main(String[] args) {

        File palabrasBien = new File("src\\b\\palabrasBien.txt");
        try {
            FileWriter writter = new FileWriter(palabrasBien);
            File palabrasMal = new File("src\\b\\palabras.txt");
            FileReader reader = new FileReader(palabrasMal);
            //Recojo las 5 letras
            char[] letras = new char[(int) 5];
            //Compruebo que estemos en la primera linea
            int i = 0;
            while ((reader.read(letras)) != -1) {
                //Si no estoy en la primera linea
                if (i != 0) {
                    writter.write("\n");
                }
                writter.write(letras);
                //Para que solo se escriba una vez
                i++;
            }
            writter.close(); //cerrar fichero
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}