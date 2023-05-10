/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        
        Ciudad ciudad1 = new Ciudad("Loja");
        
        Barrio barrio1 = new Barrio("El Valle", ciudad1);
        
        Persona persona1 = new Persona("Kelvin Sarango", "1100909909", barrio1);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        
        Ciudad ciudad2 = new Ciudad("Cuenca");
        
        Barrio barrio2 = new Barrio("Central", ciudad2);
        
        Persona persona2 = new Persona("Julio Bravo", "1122245445", barrio2);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil
        
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio3 = new Barrio("Centenario", ciudad3);
        
        Persona persona3 = new Persona("Rodrigo Agila", "1256314789", barrio3);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\nY pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        
        
    }
}
