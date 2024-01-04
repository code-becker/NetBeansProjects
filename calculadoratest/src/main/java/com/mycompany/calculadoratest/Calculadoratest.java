/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoratest;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author luis
 */
public class Calculadoratest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label = new JLabel();
        label.setText("0");

        frame.add(label);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}    

