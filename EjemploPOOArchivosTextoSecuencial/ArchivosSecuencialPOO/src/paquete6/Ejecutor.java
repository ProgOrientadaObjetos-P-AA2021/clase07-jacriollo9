/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import paquete6.Hospital;

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

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
    }

}