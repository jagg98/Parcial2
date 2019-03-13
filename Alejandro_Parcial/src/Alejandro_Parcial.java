/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandro_parcial;

import alejandro_parcial.Clases.Automovil;
import alejandro_parcial.Clases.CamionDosEJes;
import alejandro_parcial.Clases.CamionUnEje;
import alejandro_parcial.Clases.Vehiculo;
import alejandro_parcial.Clases.moto;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Alejandro_Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vh1;
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        vh1 = new moto("a125c", "honda2");
        listaVehiculos.add(vh1);
        vh1 = new CamionUnEje("SDA125", "Has");
        listaVehiculos.add(vh1);
        vh1 = new Automovil("VFG256", "renault", 7000);
        listaVehiculos.add(vh1);
        vh1 = new CamionDosEJes("56325", "renault");
        listaVehiculos.add(vh1);
        System.out.println(listaVehiculos.toString());
        
        
    }
    
}
