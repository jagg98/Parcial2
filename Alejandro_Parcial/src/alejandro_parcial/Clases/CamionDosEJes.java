/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alejandro_parcial.Clases;

/**
 *
 * @author USER
 */
public class CamionDosEJes extends Vehiculo{
    
    private int ejes;

    public CamionDosEJes(String placa, String marca) {
        super(placa, marca, 5000,"Camion dos ejes");
        ejes = 1;
    }
    
    
}
