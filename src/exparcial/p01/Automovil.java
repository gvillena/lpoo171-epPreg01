/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exparcial.p01;

/**
 *
 * @author LPOO
 */
public class Automovil {
    

    private String marca;
    private String modelo;
    private String color;
    private int anio;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Automovil() {
        this.marca = "SIN MARCA";
        this.modelo = "SIN MODELO";
        this.color = "SIN COLOR";
        this.anio = 0;
    }

    public Automovil(String marca, String modelo, String color, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }
    
        
}
