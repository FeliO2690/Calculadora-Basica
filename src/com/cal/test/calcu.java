/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.cal.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author felip
 */
public class calcu extends JFrame {

    
   
    private JComboBox<String> menuPrincipal;
    
    public calcu() {

        setSize(300, 200);
        setTitle("Calculadora");
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        mostrarMenuprincipal();
        panel.add(menuPrincipal);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void mostrarMenuprincipal() {

        metodosCalcu metodos = new metodosCalcu();
        String[] menu = {
            "Eliga una opcion",
            "1.-Suma",
            "2.-Resta",
            "3.-Multiplicacion",
            "4.-Division",
            "5.-Salir"

        };

        menuPrincipal = new JComboBox<>(menu);
        menuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int select = menuPrincipal.getSelectedIndex();
                switch (select) {
                    case 1:
                        metodos.Sumar();

                        break;
                    case 2:
                        metodos.Restar();
                        break;
                    case 3:
                        metodos.Multiplicar();
                        break;
                    case 4:
                        metodos.Dividir();
                        break;
                    case 5:
                        metodos.Salir();
                        break;
                }
            }
        });

    }

    public static void main(String[] args) {
      
        calcu ventana = new calcu();
        
        ventana.setVisible(true);
    }

}
