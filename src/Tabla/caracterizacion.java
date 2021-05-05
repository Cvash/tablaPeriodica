/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class caracterizacion extends JFrame{
    
    private void initPantalla(){
        
		setTitle("Eventos");
		setSize(240,390);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
        
	}
    
}
