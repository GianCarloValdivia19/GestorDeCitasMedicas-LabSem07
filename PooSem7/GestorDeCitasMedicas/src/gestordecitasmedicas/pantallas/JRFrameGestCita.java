/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitasmedicas.pantallas;

import entidades.Cita;
import gestordecitasmedicas.GestorDeCitasMedicas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Estudiante
 */
public class JRFrameGestCita extends javax.swing.JFrame {
    
    private List<Cita> listaCitas;
    private DefaultListModel<String> modelListasCitashow;
    /**
     * Creates new form JRFrameGestCita
     */
    public JRFrameGestCita() {
        initComponents();      
        listaCitas = GestorDeCitasMedicas.citasEnElSistema;
        modelListasCitashow = new DefaultListModel<>();
        this.lst_Citas.setModel(modelListasCitashow);
        modelListasCitashow.removeAllElements();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Crear = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst_Citas = new javax.swing.JList<>();
        txt_Buscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btn_Crear.setText("Nueva Cita");
        btn_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearActionPerformed(evt);
            }
        });

        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        btn_Salir.setText("Cancelar Cita");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        lst_Citas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lst_Citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lst_CitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lst_Citas);

        txt_Buscar.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Citas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Buscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Salir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Buscar)
                    .addComponent(txt_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Crear)
                    .addComponent(btn_Salir))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverAcargarCitas(String criterio){
        
        modelListasCitashow.removeAllElements();
        for (Cita cita: listaCitas) {
            if (cita.getPaciente().getNombre().contains(criterio)) {
                modelListasCitashow.addElement(cita.mostrarDatos());
            }
        }  
    }
    
    private void btn_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearActionPerformed
        // TODO add your handling code here:
        JRFrameCita nuevaCita =  new JRFrameCita(this);
        nuevaCita.setLocationRelativeTo(this);
        nuevaCita.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_btn_CrearActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        volverAcargarCitas(txt_Buscar.getSelectedText().trim());
        
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
   
    }//GEN-LAST:event_formMouseClicked

    private void lst_CitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lst_CitasMouseClicked
        
        if (evt.getClickCount()>1) {
            JRFrameCita cita = new JRFrameCita(this, listaCitas.get(lst_Citas.getSelectedIndex()));
            cita.setLocationRelativeTo(null);
            cita.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_lst_CitasMouseClicked

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
       int index = lst_Citas.getSelectedIndex();
       listaCitas.remove(index);
       volverAcargarCitas("");
        
    }//GEN-LAST:event_btn_SalirActionPerformed

    public void agregarCita(Cita nuevaCita){
    
        listaCitas.add(nuevaCita);
        modelListasCitashow.removeAllElements();
        for(Cita citaDelista: listaCitas) {
            modelListasCitashow.addElement(citaDelista.mostrarDatos());
        }
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
            java.util.logging.Logger.getLogger(JRFrameGestCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRFrameGestCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRFrameGestCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRFrameGestCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRFrameGestCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Crear;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst_Citas;
    private javax.swing.JTextField txt_Buscar;
    // End of variables declaration//GEN-END:variables
}
