/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Metodos metodos = new Metodos();
        
        boolean continuar = true;
        
        while(continuar){
        
            String[] opciones = {
            
                "crear proyecto",
                "crear empleado",
                "crear tarea",
                "asignar tarea",
                "buscar proyecto",

            };
            
            String selecion = (String) JOptionPane.showInputDialog(null,"Selecciona una opcion:",
                    "Gestion empresa", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            
            switch(selecion){
            
                case "crear proyecto":
                    metodos.crearProyecto();
                    break;
                    
                case "crear empleado":
                    metodos.agregarEmpleado();
                    break;
                    
                case "crear tarea":
                    metodos.CrearTarea();
                    break;
                    
                case "asignar tarea":
                    metodos.asignarTarea();
                    break;
                    
                case "buscar proyecto":
                    metodos.buscarProyectoPorNombre();
                    break;
                    
                default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
            }
                            
        }
        

        

    }
    
}
