/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controller.Controller;
import model.Model;
import view.View;

/**
 *
 * @author Gerardo De la cruz
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Model mod = new Model();
        View view = new View();
        
        Controller ctrl = new Controller(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
        
    }
    
}
