/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    
    private String nombreEmpleado;
    private String rol;
    private List<Tarea> listaTaresAsignadas;

    public Empleado(String nombreEmpleado, String rol) {
        this.nombreEmpleado = nombreEmpleado;
        this.rol = rol;
        this.listaTaresAsignadas = new ArrayList<>();    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getRol() {
        return rol;
    }

    public List<Tarea> getListaTaresAsignadas() {
        return listaTaresAsignadas;
    }
   
    
}
