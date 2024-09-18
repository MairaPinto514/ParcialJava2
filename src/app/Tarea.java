/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author USUARIO
 */
public class Tarea {
    
    private int idTarea;
    private String descripcion;
    private String estado;
    private Empleado empleadoAsignado;

    public Tarea(int idTarea, String descripcion, String estado) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
    
}
