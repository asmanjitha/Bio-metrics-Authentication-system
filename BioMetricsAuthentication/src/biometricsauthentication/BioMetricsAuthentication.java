/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biometricsauthentication;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manjitha
 */
public class BioMetricsAuthentication {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        GUI gui = new GUI();
        gui.setVisible(true);
        try {
                FileWriter fileWriter = new FileWriter("fileName.txt");
            } catch (IOException ex) {
                Logger.getLogger(getPattern.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
