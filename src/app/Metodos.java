/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Metodos {
    
    private List<Proyecto> listaProyectos;
    private List<Empleado> listaEmpleados;
    private List<Tarea> listaTareas;



    public Metodos() {
        this.listaProyectos = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaTareas = new ArrayList<>();
    }
    
    public void crearProyecto() 
    {
        int idProyecto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Proyecto"));
        String nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto");
        String liderEquipo = JOptionPane.showInputDialog("Ingrese el nombre del lider del proyecto");
        
        Proyecto proyecto = new Proyecto(idProyecto, nombreProyecto, liderEquipo);
        listaProyectos.add(proyecto);
        JOptionPane.showMessageDialog(null, "Proyecto creado");
        
        //FICHEROOO
        cargarProyectosFicheros(listaProyectos);
        
    }
    
    public void agregarEmpleado()
    {
        String nombre = JOptionPane.showInputDialog("Ingrese le nombre del empleado");
        String rol = JOptionPane.showInputDialog("Ingrese el rol del aprendiz");
        
        Empleado empleado = new Empleado(nombre, rol);
        listaEmpleados.add(empleado);
        JOptionPane.showMessageDialog(null,"Empleado creado ");
        
    }
    
    public void CrearTarea()
    {
        int idTarea = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la tarea"));
        String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion de la actividad");
        String estado = JOptionPane.showInputDialog("Ingrese el estado la tarea (pendiente/completada)");
        
        Tarea tarea = new Tarea(idTarea, descripcion, estado);
        listaTareas.add(tarea);
        
        cargarTareasFicheros(listaTareas);
        
    }
    
    public void asignarTarea()
    {
        int idTarea = Integer.parseInt(JOptionPane.showInputDialog("Inhrese el ID de la tarea"));
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        
        Tarea tarea = buscarTarea(idTarea);
        Empleado empleado =buscarEmpleado(nombreEmpleado);
        
        JOptionPane.showMessageDialog(null, "Empleado asignado"); 
                
    }
    private Tarea buscarTarea(int idT)
    {
        return listaTareas.stream()
                .filter(t -> t.getIdTarea() == idT)
                .findFirst()
                .orElse(null);
    }
    
    private Empleado buscarEmpleado(String nombre)
    {
        return listaEmpleados.stream()
                .filter(e ->e.getNombreEmpleado().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }
    private Proyecto buscarProyecto(String nombreProyecto)
    {
        for(Proyecto proyecto: listaProyectos){
            if(proyecto.getNombreProyecto().equalsIgnoreCase(nombreProyecto)){
                return proyecto;
            }
        }
        return null;
    }
    
    public void buscarProyectoPorNombre(){
    
        String nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto");
        Proyecto proyectoEncontrado = buscarProyecto(nombreProyecto);
    
        if(proyectoEncontrado != null){
        
        String mensaje = "Proyecto encontrado:\n"+
                "ID: " + proyectoEncontrado.getIdProyecto() + "\n" +
                "Nombre: " + proyectoEncontrado.getNombreProyecto() + "\n" +
                "lider: " + proyectoEncontrado.getLiderEquipo();
        JOptionPane.showMessageDialog(null, mensaje);
        }else{
            JOptionPane.showMessageDialog(null,"No se ecnontro el proyecto con ese nombre");
        }
    }
    
    
    //////////////////////////////FICHEROS/////////////////////////////////////////////////////////////////
    public void cargarProyectosFicheros(List<Proyecto> proyectos) 
    {
        try (BufferedWriter pro = new BufferedWriter(new FileWriter("ProyectosGuardados.txt", true))) 
        {
             for (Proyecto proyecto : proyectos) {
                 
                pro.write("idProyecto: " + proyecto.getIdProyecto() + ("\n"));
                pro.write("Nombre proyecto: " + proyecto.getNombreProyecto() + ("\n"));
                pro.write("Lider Equipo: " + proyecto.getLiderEquipo());
                pro.write("_______________________________________________");
                pro.newLine();
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
 
        }

    }
    
    public void cargarTareasFicheros(List<Tarea> tareas) 
    {
        try (BufferedWriter tare = new BufferedWriter(new FileWriter("TresGuardadas.txt", true))) 
        {
             for (Tarea tarea : tareas) {
                 
                tare.write("idTrea: " + tarea.getIdTarea() + ("\n"));
                tare.write(" Descripcion: " + tarea.getDescripcion()+ ("\n"));
                tare.write("Estado: " + tarea.getEstado());
                tare.write("_______________________________________________");
                tare.newLine();
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
 
        }

    }
    
    

    
}
