/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package convocatoriaseleccion;

import java.util.Scanner;
import jugadores.Jugadores;

/**
 *
 * @author USUARIO
 */
public class ConvocatoriaSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int opcion;
       int contador =0;
       int buscarCamiseta; 
       int cambiarJugador;
      
      
       
       Jugadores []jugadores = new Jugadores [23];
        do {
            System.out.println ("Bienvenido a la seleccion");
           
            System.out.println ("*************  ");
            System.out.println ("*************** ");
            
            
             System.out.println ("1.Agregar Jugador:" );
             System.out.println ("2.Buscar jugador :" );
             System.out.println ("3.Editar Jugador : " );
             System.out.println ("4.Mostar Jugadores convocado:" );
             System.out.println ("5.Salir: " );
             
             System.out.println("Digite una opcion: ");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Registro de jugador: ");
                    System.out.println("***********");
                    
                    jugadores [contador]=new Jugadores();
                    jugadores [contador].setNroCamiseta(contador);
                     
                    System.out.println("Digite el numero de la camiseta: ");
                     jugadores[contador].setNroCamiseta(entrada.nextInt());
                    
                     System.out.println("Digite el nombre del jugador: ");
                     jugadores[contador].setNombre(entrada.next());
                     
                      System.out.println("Digite el apellido del jugador: ");
                     jugadores[contador].setApellido(entrada.next());
                     
                     
                     System.out.println("Digite la posicion del jugador: ");
                     jugadores[contador].setPosicion(entrada.next());
                     
                     
                    System.out.println("Digite la edad del jugador: ");
                    jugadores[contador].setEdad(entrada.nextInt());
                    
                     System.out.println("Digite el equipo de origen del jugador: ");
                    jugadores[contador].setEquipo(entrada.next());
                    
                    contador++;                 
                   
                    
                    
                break;
            
                case 2:
               
                System.out.println("Digite # de camiseta: ");
                buscarCamiseta=entrada.nextInt();
                
                    for(int i=0; i<contador; i++){
                        
                        if(buscarCamiseta ==jugadores[i].getNroCamiseta()){
                    
                        System.out.println("La remera del jugador es:" +jugadores[i].getNroCamiseta());                       
                        System.out.println("El nombre del jugador es:" +jugadores[i].getNombre());
                        System.out.println("El apellido del jugador es:" +jugadores[i].getApellido());
                        System.out.println("La posición del jugador es:" +jugadores[i].getPosicion());
                        System.out.println("La edad del jugador es:"+ jugadores[i].getEdad());
                        System.out.println("La el equipo del jugador es:" +jugadores[i].getEquipo());
                         break;
                        } else{                        
                      System.out.println ("el jugador no esta convocado");
                                  
               
                        }
                        }
                        break;
                case 3:
                     
                    
                System.out.println("EDITAR INFORMACION: ");
                  
                System.out.println("Numero de camiseta ");
                
                cambiarJugador=entrada.nextInt();
                
                for(int i=0; i<contador; i++){
                        
                if(cambiarJugador ==jugadores[i].getNroCamiseta()){
                    
                    System.out.println("La remera del jugador es:" + jugadores[i].getNroCamiseta());
                    System.out.println("Digite el numero de la nueva remera");
                    jugadores[i].setNroCamiseta(entrada.nextInt());
                   
                    
                    System.out.println("El nombre del jugador es:" +jugadores[i].getNombre());
                    System.out.println("Digite el nombre del nuevo jugador");
                      jugadores[i].setNombre(entrada.next());
                    
                    
                    System.out.println("El apellido del jugador es:" + jugadores[i].getApellido());
                     System.out.println("Digite el apellido del nuevo jugador");
                     jugadores[i].setApellido(entrada.next());
                     
                     
                    System.out.println("La posicion del jugador es:"+jugadores[i].getPosicion());
                       System.out.println("Digite la posicion del nuevo jugador");
                        jugadores[i].setPosicion(entrada.next());
                    
                    
                    
                    System.out.println("La edad del jugador es:"+ jugadores[i].getEdad());
                    System.out.println("Digite la edad del nuevo jugador");
                     jugadores[i].setEdad(entrada.nextInt());
                    
                    
                    System.out.println("El equipo del jugador es:"+jugadores[i].getEquipo());
                    System.out.println("Digite el equipo del nuevo jugador");
                     jugadores[i].setEquipo(entrada.next());
                    
                    
                         break;
                        } else{                        
                    System.out.println ("el jugador no esta convocado");
                                  
               
                        }
                        }  
                                                     

                break;
                
                case 4:
                      System.out.println("Lista de convocados");
                        System.out.println("");                    
                        for(int i=0; i<contador; i++){
                        System.out.println("Nro Camiseta jugador convocado"+jugadores[i].getNroCamiseta());
                        System.out.println("Nombre del jugador convocado"+jugadores[i].getNombre());
                        System.out.println("Apellido del jugador convocado"+jugadores[i].getApellido());
                        System.out.println("Posición jugador convocado"+jugadores[i].getPosicion());
                        System.out.println("Edad jugador covocado"+jugadores[i].getEdad());
                        System.out.println("Equipo donde juega jugador convocado"+jugadores[i].getEquipo());
                        System.out.println("");                        
                    }          
                    
                break;
                
                case 5:
                    System.exit (0);
                break;
                
                default:
                    break;
            }
            
            
            
        } while (opcion!=5);
    }

}
