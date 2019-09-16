/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Fher
 */
public class Cita {
    private int idcita;
    private int doctor;
    private int paciente;
    private java.sql.Date fecha;
    private java.sql.Timestamp horainicio;
    private java.sql.Timestamp horafin;

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

    public Timestamp getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Timestamp horainicio) {
        this.horainicio = horainicio;
    }

    public Timestamp getHorafin() {
        return horafin;
    }

    public void setHorafin(Timestamp horafin) {
        this.horafin = horafin;
    }
    
    
}
