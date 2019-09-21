/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.sql.Time;


/**
 *
 * @author Fher
 */
public class Cita {
    private int idcita;
    private int doctor;
    private int paciente;
    private java.sql.Date fecha;
    private java.sql.Time horainicio;
    private java.sql.Time horafin;
    
    public Cita(){
        idcita = -1;
        doctor = -1;
        paciente = -1;
        fecha = null;
        horainicio = null;
        horafin = null;
    }
    
    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Time horainicio) {
        this.horainicio = horainicio;
    }

    public Time getHorafin() {
        return horafin;
    }

    public void setHorafin(Time horafin) {
        this.horafin = horafin;
    }
    
    @Override
    public String toString() {
        return "" + this.getIdcita() + " - " + this.fecha.toString();
    }
}
