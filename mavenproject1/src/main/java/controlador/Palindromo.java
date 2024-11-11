/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import vista.Vista;

import java.awt.event.ActionEvent;



/**
 *
 * @author yocpm
 */

public class Palindromo {
    // Método estático que verifica si una texto es un palíndromo
    public static boolean validaPalindromo(String cadena) {
        // Convierte la cadena a minúsculas y elimina caracteres no alfanuméricos
        // limpia la texto de espacios, puntuación, y otros caracteres no relevantes para la comprobación de palíndromos.
        // Luego, elimina todos los caracteres que no sean letras o números utilizando una expresión regular.
        cadena = cadena.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        // Invierte la texto procesada utilizando StringBuilder
        // StringBuilder es una clase que permite manipular cadenas de texto de manera eficiente.
        // El método reverse() invierte los caracteres de la cadena.
        String invertida = new StringBuilder(cadena).reverse().toString();
        
        // Compara la cadena original (procesada) con la cadena invertida.
        // Si ambas son iguales, significa que la cadena es un palíndromo, por lo que devuelve true.
        // Si no son iguales, devuelve false.
        return cadena.equals(invertida);
    }
}

