/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exparcial.p01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franconoel
 */
public class ExparcialP01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String marca01 = "";
        String modelo01 = "";
        String color01 = "";
        int anio01 = 0;
        
        String marca02 = "";
        String modelo02 = "";
        String color02 = "";
        int anio02 = 0;
        
        String marca03 = "";
        String modelo03 = "";
        String color03 = "";
        int anio03 = 0;
       
        String marca04 = "";
        String modelo04 = "";
        String color04 = "";
        int anio04 = 0;
        
        String marca05 = "";
        String modelo05 = "";
        String color05 = "";
        int anio05 = 0;
        
        String marca06 = "";
        String modelo06 = "";
        String color06 = "";
        int anio06 = 0;
        
        System.out.println("");
        System.out.println("AUTOMOVIL 01");
        System.out.println("------------");        
        System.out.print("MARCA: ");
        marca01 = sc.nextLine();        
        System.out.print("MODELO: ");
        modelo01 = sc.nextLine();        
        System.out.print("COLOR: ");
        color01 = sc.nextLine();        
        System.out.print("AÑO: ");
        anio01 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("");     
        
        System.out.println("");
        System.out.println("AUTOMOVIL 02");
        System.out.println("------------");        
        System.out.print("MARCA: ");
        marca02 = sc.nextLine();        
        System.out.print("MODELO: ");
        modelo02 = sc.nextLine();        
        System.out.print("COLOR: ");
        color02 = sc.nextLine();        
        System.out.print("AÑO: ");
        anio02 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("");     
        
        System.out.println("");
        System.out.println("AUTOMOVIL 03");
        System.out.println("------------");        
        System.out.print("MARCA: ");
        marca03 = sc.nextLine();        
        System.out.print("MODELO: ");
        modelo03 = sc.nextLine();        
        System.out.print("COLOR: ");
        color03 = sc.nextLine();        
        System.out.print("AÑO: ");
        anio03 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("");     
        
        System.out.println("");
        System.out.println("AUTOMOVIL 04");
        System.out.println("------------");        
        System.out.print("MARCA: ");
        marca04 = sc.nextLine();        
        System.out.print("MODELO: ");
        modelo04 = sc.nextLine();        
        System.out.print("COLOR: ");
        color04 = sc.nextLine();        
        System.out.print("AÑO: ");
        anio04 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("");     
        
        System.out.println("");
        System.out.println("AUTOMOVIL 05");
        System.out.println("------------");        
        System.out.print("MARCA: ");
        marca05 = sc.nextLine();        
        System.out.print("MODELO: ");
        modelo05 = sc.nextLine();        
        System.out.print("COLOR: ");
        color05 = sc.nextLine();        
        System.out.print("AÑO: ");
        anio05 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("");     
        
        System.out.println("");
        System.out.println("AUTOMOVIL 06");
        System.out.println("------------");        
        System.out.print("MARCA: ");
        marca06 = sc.nextLine();        
        System.out.print("MODELO: ");
        modelo06 = sc.nextLine();        
        System.out.print("COLOR: ");
        color06 = sc.nextLine();        
        System.out.print("AÑO: ");
        anio06 = Integer.parseInt(sc.nextLine());
        System.out.println("");
        System.out.println("");     
        
        Automovil auto01 = new Automovil();
        auto01.setMarca(marca01);
        auto01.setModelo(modelo01);
        auto01.setColor(color01);
        auto01.setAnio(anio01);
        
        Automovil auto02 = new Automovil();
        auto02.setMarca(marca02);
        auto02.setModelo(modelo02);
        auto02.setColor(color02);
        auto02.setAnio(anio02);
        
        Automovil auto03 = new Automovil();
        auto03.setMarca(marca03);
        auto03.setModelo(modelo03);
        auto03.setColor(color03);
        auto03.setAnio(anio03);
        
        Automovil auto04 = new Automovil();
        auto04.setMarca(marca04);
        auto04.setModelo(modelo04);
        auto04.setColor(color04);
        auto04.setAnio(anio04);
        
        Automovil auto05 = new Automovil();
        auto05.setMarca(marca05);
        auto05.setModelo(modelo05);
        auto05.setColor(color05);
        auto05.setAnio(anio05);
        
        Automovil auto06 = new Automovil();
        auto06.setMarca(marca06);
        auto06.setModelo(modelo06);
        auto06.setColor(color06);
        auto06.setAnio(anio06);
        
        ArrayList<Automovil> listaAutomoviles = new ArrayList<>();
        listaAutomoviles.add(auto01);
        listaAutomoviles.add(auto02);
        listaAutomoviles.add(auto03);
        listaAutomoviles.add(auto04);
        listaAutomoviles.add(auto05);
        listaAutomoviles.add(auto06);
        
        ArrayList<String> listaMarcas = new ArrayList<>();
        
        for (Automovil auto : listaAutomoviles) {
            String marca = auto.getMarca();
            if (!listaMarcas.contains(marca)) {
                listaMarcas.add(marca);                
            }
        }
        
        for (String marca : listaMarcas) {            
            System.out.println(marca.toUpperCase());
            for (Automovil auto : listaAutomoviles) {
                if (auto.getMarca().equals(marca)) {                    
                    System.out.println("Marca: " + auto.getMarca() + ", Modelo: " + auto.getModelo() + ", Año: " + auto.getAnio() + ", Color: " + auto.getColor());                    
                }
            }       
            System.out.println("");
        }
    }
    
}
