/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Luis
 */
public class Doctor {

    private int iddoctor;
    private String nombre;
    private String especialidad;
    private String telefono;

    public Doctor() {
        nombre = "";
        especialidad = "";
        telefono = "";
        iddoctor = -1;
    }

    /**
     * @return the iddoctor
     */
    public int getIddoctor() {
        return iddoctor;
    }

    /**
     * @param iddoctor the iddoctor to set
     */
    public void setIddoctor(int iddoctor) {
        this.iddoctor = iddoctor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return this.nombre + " - " + this.especialidad;
    }
}
