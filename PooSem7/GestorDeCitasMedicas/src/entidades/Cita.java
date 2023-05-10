/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gian Carlo Valdivia
 */
public class Cita {
    
    private int hora;
    private Medico medico;
    private int fecha;
    private Paciente paciente;
    private Especialidad especialidad;

    public Cita(Medico medico, Paciente paciente, Especialidad especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.especialidad = especialidad;
        
    }

    public Cita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    public String mostrarDatos(){
        return this.getPaciente().getNombre() +" - "
                +gestordecitasmedicas.GestorDeCitasMedicas.fechasDisponibles.get(getFecha())+ " - " 
                +gestordecitasmedicas.GestorDeCitasMedicas.horasDisponibles.get(getHora())+" - "
                +" | Medico: "+this.getMedico().getNombre();
                     
    }   
}
