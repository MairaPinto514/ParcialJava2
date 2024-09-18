/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author USUARIO
 */
public class Proyecto {
    private int idProyecto;
    private String nombreProyecto;
    private String liderEquipo;

    public Proyecto(int idProyecto, String nombreProyecto, String liderEquipo) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.liderEquipo = liderEquipo;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getLiderEquipo() {
        return liderEquipo;
    }

}
