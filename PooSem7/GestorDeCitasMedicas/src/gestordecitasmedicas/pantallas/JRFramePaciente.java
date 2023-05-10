/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitasmedicas.pantallas;

import entidades.Paciente;
import gestordecitasmedicas.GestorDeCitasMedicas;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Estudiante
 */
public class JRFramePaciente extends javax.swing.JFrame {

    private JRFrameCita padre;
    private List<Paciente> pacientes;
    private DefaultListModel<String> modeloListPaciente;
    
   
    public JRFramePaciente(JRFrameCita padre) {
        initComponents();
        this.padre = padre;
        this.pacientes = GestorDeCitasMedicas.listaDePacientes;
        modeloListPaciente = new DefaultListModel<>();
        this.lstpaciente.setModel(modeloListPaciente);
        buscar("");
    }
    
    public void buscar(String criterio){
        this.modeloListPaciente.removeAllElements();
        
        for (Paciente paciente: pacientes) {
            if (paciente.getNombre()!=null && paciente.getNombre().contains(criterio)) {
                this.modeloListPaciente.addElement(paciente.getDatosMostrar());
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstpaciente = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        btn_Crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstpaciente.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstpaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstpacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstpaciente);

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        btn_Crear.setText("Crear");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Pacientes ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btn_Buscar)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Salir)
                    .addComponent(btn_Crear))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        JRFrameEditPaciente pantallaPaciente = new JRFrameEditPaciente(this);
        pantallaPaciente.setLocationRelativeTo(null);
        pantallaPaciente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        pantallaPaciente.setVisible(true);  
    }//GEN-LAST:event_btn_CrearActionPerformed

    private void lstpacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstpacienteMouseClicked
        if (evt.getClickCount() > 1) {
            Paciente paciente = pacientes.get(lstpaciente.getSelectedIndex());
            this.padre.setPaciente(paciente);
            Salir();
        }        
    }//GEN-LAST:event_lstpacienteMouseClicked

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        Salir();
    }//GEN-LAST:event_btn_SalirActionPerformed

    
    public void AgregarNuevoPaciente(Paciente paciente){
        pacientes.add(paciente);
        buscar("");
    }
    
    private void Salir(){
        padre.setVisible(true); //Muestra la ventana padre   
        this.dispose();//Elimina esta ventana para no ocupar espacio en la memoria
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JRFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRFramePaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRFramePaciente(new JRFrameCita(new JRFrameGestCita())).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> lstpaciente;
    // End of variables declaration//GEN-END:variables

    void agregarNuevoPaciente(Paciente paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
