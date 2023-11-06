
package universidadproyecto.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import universidadproyecto.AccesoADatos.MateriaData;
import universidadproyecto.AccesoADatos.TutorData;
import universidadproyecto.Entidades.Materia;
import universidadproyecto.Entidades.Tutor;


public class GestionMateria extends javax.swing.JInternalFrame {

    
    public GestionMateria() {
        initComponents();
        llenarComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfieldCodigo = new javax.swing.JTextField();
        jtfieldNombre = new javax.swing.JTextField();
        jtfieldaño = new javax.swing.JTextField();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxMaterias = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        jPanel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/books_library.png"))); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Codigo:");

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Año");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Estado");

        jtfieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfieldNombreActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir_1.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(102, 51, 255));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setEnabled(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonBuscar.setBackground(new java.awt.Color(102, 102, 102));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBuscar.setText("Bucar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Actualizar");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tutor:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jRadioButton1))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(363, 363, 363))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfieldaño, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonEstado))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButtonBuscar)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1))
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGuardar)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfieldaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonEstado)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
      
        try{
            Tutor idtutor = (Tutor)jComboBoxMaterias.getSelectedItem();
        String nombre = jtfieldNombre.getText();
        if(!(nombre.equals(""))&& idtutor != null){
        int anio = Integer.parseInt(jtfieldaño.getText());
        Boolean estado = jRadioButtonEstado.isSelected();
        idtutor.getIdTutor();
        Materia materia = new Materia(nombre,anio,estado,idtutor);
        MateriaData materiaData = new MateriaData();
       materiaData.guardarMateria(materia);
        limpiarCampo();
        }else{
        JOptionPane.showMessageDialog(this, "Rellene todos los campos");
        }
        }catch(NumberFormatException ef){
        JOptionPane.showMessageDialog(this, "Verfique los datos ingresados!");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
      try{
          String codigo1 = jtfieldCodigo.getText();
          if(!(codigo1.equals(""))){
        int codigo = Integer.parseInt( codigo1);
      MateriaData materiaData = new MateriaData();
      materiaData.eliminarMateria(codigo);
      limpiarCampo();
          }else{
          JOptionPane.showMessageDialog(this, "Ingrese codigo de la materia para eliminar");     
          }
      }catch(NumberFormatException nf){
          JOptionPane.showMessageDialog(this,"Ingrese formato numerico");
        
      } catch(NullPointerException nf){
           
      }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        jButtonEliminar.setEnabled(true);

        try {
            String codigo1 = jtfieldCodigo.getText();

            if (!(codigo1.equals(""))) {
                int codigoMateria = Integer.parseInt(codigo1);
                MateriaData materiaData = new MateriaData();
                Materia materia = materiaData.buscarMateria(codigoMateria);
                jtfieldNombre.setText(materia.getNombre());
                jtfieldaño.setText(materia.getAnio()+"");
                jRadioButtonEstado.setSelected(materia.isEstado());
                
                for (int i = 0; i < jComboBoxMaterias.getItemCount(); i++) {
                Tutor tutor = jComboBoxMaterias.getItemAt(i);
                if (tutor.getIdTutor() == materia.getTutor().getIdTutor()) {
                    jComboBoxMaterias.setSelectedIndex(i);
                    break;
                }
            }

                
                
            } else {
                JOptionPane.showMessageDialog(this, "El campo no puede estar vacio para buscar la Materia deseada");
                limpiarCampo();
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Por favor Ingrese solo numeros");
            limpiarCampo();
        }catch(NullPointerException nf){
            
      }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this, "Para nueva materia, NO RELLENE EL CAMPO CODIGO!");
        jtfieldCodigo.setEditable(false);
        limpiarCampo();
      jButtonGuardar.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfieldNombreActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
       jtfieldCodigo.setEditable(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<Tutor> jComboBoxMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JTextField jtfieldCodigo;
    private javax.swing.JTextField jtfieldNombre;
    private javax.swing.JTextField jtfieldaño;
    // End of variables declaration//GEN-END:variables
 
    private void limpiarCampo(){
     jtfieldCodigo.setText("");
     jtfieldNombre.setText("");
     jtfieldaño.setText("");
    jRadioButtonEstado.setSelected(false);
    
 }
    
     private void llenarComboBox() {        
          
     TutorData tutorData = new TutorData();
    List<Tutor> listaTutor = tutorData.listadoTutores();
       //  Tutor tutores = null; 
       jComboBoxMaterias.removeAllItems();
    for (Tutor tutor : listaTutor) {
        jComboBoxMaterias.addItem(tutor); 
    }
     }
     
}
