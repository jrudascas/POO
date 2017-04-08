package finalize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AbrirUnFichero {

    FileInputStream unFichero = null;

    AbrirUnFichero(String nombreFichero) throws FileNotFoundException {
        unFichero = new FileInputStream(nombreFichero);
    }

    @Override
    public void finalize() throws IOException{
        if (unFichero != null) {
            unFichero.close();
            unFichero = null;
        }
    }
}
