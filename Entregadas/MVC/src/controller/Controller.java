/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;

/**
 *
 * @author Axel Israel VH
 */
public class Controller implements ActionListener{
    
    private View view;
    private Model model;
    public Controller(View view, Model model){
        
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar()
    {
        view.setTitle("MVC Multiplicar");
        view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e){
        
        model.setNumero1(Integer.parseInt(view.txtNumero1.getText()));
        model.setNumero2(Integer.parseInt(view.txtNumero2.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
}
