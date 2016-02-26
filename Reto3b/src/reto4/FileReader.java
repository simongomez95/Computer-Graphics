package reto4;

import reto3b.Punto2Dh;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by nekothecat on 2/22/16.
 */
public class FileReader {

    private static String fileName = "objeto.txt";
    private String line = null;

    private File file;

    private FileInputStream fis;

    private BufferedReader br;

    private List<int[]> listaAristas = new LinkedList<int[]>();
    private List<Punto2Dh> listaPuntos = new LinkedList<Punto2Dh>();

    public FileReader () {

        try {
            fis = new FileInputStream(fileName);
            br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        leerObjeto();


    }

    private void leerObjeto() {

        int numeroPuntos = 0;

        String[] aristaStr = null;
        String[] punto = null;

        try {
            numeroPuntos = Integer.parseInt(br.readLine());
            for (int i = 0; i < numeroPuntos; i++) {
                punto = br.readLine().split(" ");
                listaPuntos.add(new Punto2Dh(Double.parseDouble(punto[0]), Double.parseDouble(punto[1])));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int numeroAristas = 0;
        try {
            numeroAristas = Integer.parseInt(br.readLine());

            for (int j=0; j < numeroAristas; j++) {

                aristaStr = br.readLine().split(" ");
                int[] arista = new int[2];
                arista[0] = Integer.parseInt(aristaStr[0]);
                arista [1] = Integer.parseInt(aristaStr[1]);
                listaAristas.add(arista);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public List<Punto2Dh> getPuntos() {
        return listaPuntos;
    }

    public List<int[]> getAristas() {
        return listaAristas;
    }

}
