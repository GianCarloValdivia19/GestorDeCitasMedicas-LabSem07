/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gian Carlo Valdivia
 */
public class Medico {

    private String nombre;
    private String cmp;
    private List<Especialidad> especialidades;

    public Medico(String nombre, String cmp, List<Especialidad> especialidadaes) throws Exception {
        this.nombre = nombre;
        this.cmp = cmp;
        this.especialidades = especialidadaes;
        if (especialidadaes == null) {
            throw new Exception("No se puede crear");
        }
    }

    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);   
    }
    
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }
    
    public String getDatosMostrar(){
        return this.nombre + " | CMP: "+this.cmp;   
    }
    
    
   
    
}
