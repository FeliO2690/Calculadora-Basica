/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cal.test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author felip
 */
public class metodosCalcu {

    JFrame frame = new JFrame();

    public void Sumar() {

        frame = new JFrame();
        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad: ", "Suma", JOptionPane.PLAIN_MESSAGE);
        String input2 = JOptionPane.showInputDialog(frame, "Ingresa otra cantidad: ", "Suma", JOptionPane.PLAIN_MESSAGE);
        try {

            if (input != null | !input.isEmpty() && input2 != null | !input2.isEmpty()) {

                double num1 = Double.parseDouble(input);
                double num2 = Double.parseDouble(input2);
                double resul = num1 + num2;

                JOptionPane.showMessageDialog(null, "La suma de  es: " + resul);

            }

        } catch (NumberFormatException | NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Ingresa una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Restar() {

        frame = new JFrame();

        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad : ", "Resta", JOptionPane.PLAIN_MESSAGE);
        String input2 = JOptionPane.showInputDialog(frame, "Ingresa otra cantidad : ", "Resta", JOptionPane.PLAIN_MESSAGE);
        try {

            if (input != null | !input.isEmpty() | input2 != null | !input2.isEmpty()) {

                double num1 = Double.parseDouble(input);
                double num2 = Double.parseDouble(input2);

                double resul = num1 - num2;
                JOptionPane.showMessageDialog(frame, "Resultado : " + resul, "Resta", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Multiplicar() {

        frame = new JFrame();

        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad : ", "Multiplicación", JOptionPane.PLAIN_MESSAGE);
        String input2 = JOptionPane.showInputDialog(frame, "Ingresa otra cantidad : ", "Multiplicación", JOptionPane.PLAIN_MESSAGE);
        try {

            if (input != null | !input.isEmpty() && input2 != null | !input2.isEmpty()) {

                double num1 = Double.parseDouble(input);
                double num2 = Double.parseDouble(input2);

                double resul = num1 * num2;
                JOptionPane.showMessageDialog(frame, "Resultado : " + resul, "Multiplicación", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Dividir() {

        frame = new JFrame();

        String input = JOptionPane.showInputDialog(frame, "Ingresa una cantidad : ", "Division", JOptionPane.PLAIN_MESSAGE);
        String input2 = JOptionPane.showInputDialog(frame, "Ingresa otra cantidad : ", "Division", JOptionPane.PLAIN_MESSAGE);
        try {

            if (input != null | !input.isEmpty() && input2 != null | !input2.isEmpty()) {

                double num1 = Double.parseDouble(input);
                double num2 = Double.parseDouble(input2);

                double resul = num1 / num2;
                JOptionPane.showMessageDialog(frame, "Resultado : " + resul, "Division", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Ingresa una cantidad válida", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    public void Salir(){
        
        frame = new JFrame();
        frame.setSize(300,200);
        
        JLabel label = new JLabel("Saliendo del programa");
        frame.add(label);
        
        Timer time = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        time.start();
        time.setRepeats(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
        
        
    }

}
