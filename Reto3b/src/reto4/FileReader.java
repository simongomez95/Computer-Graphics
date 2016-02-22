package reto4;

import reto3b.punto2Dh;

import java.io.*;
import java.util.List;

/**
 * Created by nekothecat on 2/22/16.
 */
public class FileReader {

    String fileName = "objeto.txt";
    String line = null;

    File file;

    FileInputStream fis;

    BufferedReader br;

    public FileReader () {

        try {
            fis = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    public void leerObjeto() {

        int numeroPuntos = 0;
        try {
            numeroPuntos = Integer.parseInt(br.readLine());
            List<punto2Dh> listaPuntos = null;
            for (int i = 0; i < numeroPuntos; i++) {
                String[] punto = br.readLine().split(" ");
                listaPuntos.add(new punto2Dh(Double.parseDouble(punto[0]), Double.parseDouble(punto[1])));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
