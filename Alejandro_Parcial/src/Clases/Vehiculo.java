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
public class Vehiculo {
    private String placa;
    private String marca;
    private float valorPeaje;
    private String tipo;

    public Vehiculo(String placa, String marca, float valorPeaje, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.valorPeaje = valorPeaje;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", valorPeaje=" + valorPeaje + ", tipo=" + tipo + '}'+"\n";
    }
    
   
    
    
    
}
