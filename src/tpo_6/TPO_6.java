/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpo_6;

import javax.swing.JOptionPane;
import tp6.negocio.Cliente;
import tp6.negocio.Directorio;

/**
 *
 * @author santi
 */
public class TPO_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio d=new Directorio();
        //Cliente martin lucero de la punta mod 11 mz 33 dni 123 telefono 4242
        boolean resultado=d.agregarCliente("2664",new Cliente(111,"Paula","Gonzalez","San Luis","Casa 14 M:M") );
       if(resultado){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
       boolean resultado2=d.agregarCliente("3434",new Cliente(2323,"Lisandro","Priotti","La Toma","Olegario Andrade 14") );
       if(resultado2){
       
           JOptionPane.showMessageDialog(null,"Dato registrado");
       }else{
       
           JOptionPane.showMessageDialog(null,"Dato No registrado");
           
       }
    }
    
}
