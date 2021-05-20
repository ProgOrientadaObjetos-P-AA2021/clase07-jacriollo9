/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Hospital h = new Hospital("Hospital Isidro Ayora", 300, 600000.000);
        Hospital h1 = new Hospital("Hospital Del Seguro", 250, 4000000.000);
        Hospital h2 = new Hospital("Hospital Militar", 200, 2000000.000);

        String nombreArchivo = "hospital.txt";

        Hospital[] lista = {h, h1, h};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial
        (nombreArchivo);
        
        archivo.establecerRegistro(h);
        archivo.establecerSalida();
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
    
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial
        (nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
    }
}

