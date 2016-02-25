/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3b;

import reto4.*;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author lope
 */
public class Reto3b extends JPanel {



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        Dimension size = getSize();

        g2d.setColor(Color.BLUE);



        draw.dibujarObjeto();


    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        FileReader fr = new FileReader();
        ObjectDraw draw = new ObjectDraw(fr, g2d);
        // Crear un nuevo Frame
        JFrame frame = new JFrame("Lines");
        // Al cerrar el frame, termina la ejecución de este programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Agregar un JPanel que se llama Points (esta clase)
        frame.add(new Reto3b());
        // Asignarle tamaño
        frame.setSize(1024, 768);
        // Poner el frame en el centro de la pantalla
        frame.setLocationRelativeTo(null);
        // Mostrar el frame
        frame.setVisible(true);

        Test_main test = new Test_main();
        test.test();
    }
    
}
