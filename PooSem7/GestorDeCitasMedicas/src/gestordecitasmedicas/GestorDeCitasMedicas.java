/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitasmedicas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import gestordecitasmedicas.pantallas.JRFrameGestCita;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gian Carlo
 */
public class GestorDeCitasMedicas {
    
    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
    
    public static List<String> horasDisponibles = new ArrayList<String>();
    public static List<String> fechasDisponibles = new ArrayList<String>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        
        horasDisponibles.add("9:00");
        horasDisponibles.add("9:30");
        horasDisponibles.add("10:00");
        horasDisponibles.add("10:30");
        horasDisponibles.add("11:00");
        horasDisponibles.add("11:30");
        
        fechasDisponibles.add("05/05/2023");
        fechasDisponibles.add("06/05/2023");
        fechasDisponibles.add("07/05/2023");
        fechasDisponibles.add("08/05/2023");
        fechasDisponibles.add("09/05/2023");
        
        JRFrameGestCita Frame = new JRFrameGestCita(); //Crea el objeto pantalla
        Frame.setLocationRelativeTo(null); // Centra formulario
        Frame.setVisible(true); //
        
    }
    
}
