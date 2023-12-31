/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadproyecto.Vistas;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadproyecto.AccesoADatos.AlumnoData;
import universidadproyecto.Entidades.Alumno;
import universidadproyecto.AccesoADatos.InscripcionData;
import universidadproyecto.AccesoADatos.MateriaData;
import universidadproyecto.Entidades.Inscripcion;
import universidadproyecto.Entidades.Materia;

/**
 *
 * @author ayala
 */
public class Inscripciones extends javax.swing.JInternalFrame {
private DefaultTableModel model =  new DefaultTableModel(); 
private InscripcionData inscripcionData;

    /**
     * Creates new form Inscripciones
     */
    public Inscripciones() {
        initComponents();
        modificarTabla();
        llenarComboBoxAlumnos();
        inscripcionData = new InscripcionData();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxInscripcion = new javax.swing.JComboBox<>();
        jRadioButtonInscripto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFormularioInscripcion = new javax.swing.JTable();
        jButtonInscribir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jRadioButtonNoInscripto = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripciones");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setBackground(new java.awt.Color(51, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Listado De Materia");

        jComboBoxInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxInscripcionActionPerformed(evt);
            }
        });

        jRadioButtonInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonInscriptoActionPerformed(evt);
            }
        });

        jTableFormularioInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableFormularioInscripcion);

        jButtonInscribir.setBackground(new java.awt.Color(102, 102, 102));
        jButtonInscribir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonInscribir.setText("Inscribir");
        jButtonInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscribirActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Anular Inscripcion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setText("Materia No Inscripta:");

        jTextField2.setText("Materia Inscripta");

        jRadioButtonNoInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNoInscriptoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addComponent(jComboBoxInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRadioButtonInscripto)
                                                .addGap(242, 242, 242)
                                                .addComponent(jRadioButtonNoInscripto))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(276, 276, 276)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jButtonInscribir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(102, 102, 102)))
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonInscripto)
                    .addComponent(jRadioButtonNoInscripto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInscribir)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBoxInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxInscripcionActionPerformed
       
    }//GEN-LAST:event_jComboBoxInscripcionActionPerformed

    private void jRadioButtonNoInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNoInscriptoActionPerformed
     try{
        Alumno alumno = (Alumno)jComboBoxInscripcion.getSelectedItem();
      List<Materia> materias = inscripcionData.obetenerMateriaNoCursada(alumno.getIdAlumno());
      
        cleanTable();
        jRadioButtonInscripto.setSelected(false);
        jButtonInscribir.setEnabled(true);
      for(Materia materia : materias){
          model.addRow(new Object[]{
              materia.getIdMateria(),
              materia.getNombre(),
              materia.getAnio()
          });
      }
     }catch(NullPointerException nf){
     
     }
    }//GEN-LAST:event_jRadioButtonNoInscriptoActionPerformed

    private void jRadioButtonInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonInscriptoActionPerformed
        Alumno alumno = (Alumno)jComboBoxInscripcion.getSelectedItem();
      List<Materia> materias = inscripcionData.obtenerMateriasCursadas(alumno.getIdAlumno());
        cleanTable();
        jRadioButtonNoInscripto.setSelected(false);
          jButtonInscribir.setEnabled(false);
      for(Materia materia : materias){
          model.addRow(new Object[]{
              materia.getIdMateria(),
              materia.getNombre(),
              materia.getAnio()
          });
      }
    }//GEN-LAST:event_jRadioButtonInscriptoActionPerformed

    private void jButtonInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscribirActionPerformed
//       Alumno alumno = (Alumno)jComboBoxInscripcion.getSelectedItem();
//       int filaSeleccionada = jTableFormularioInscripcion.getSelectedRow();
//       int idMateria = (Integer)jTableFormularioInscripcion.getValueAt(filaSeleccionada, 0);
//       String nombre = (String)jTableFormularioInscripcion.getValueAt(filaSeleccionada,1 );
//       int anio = (Integer)jTableFormularioInscripcion.getValueAt(filaSeleccionada,2 );
//       Materia materia = new Materia(idMateria, nombre, anio, true);
//       Inscripcion inscripto = new Inscripcion(0.0,alumno,materia);
//       inscripcionData.guardarInscripcion(inscripto);
//       
       
    }//GEN-LAST:event_jButtonInscribirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Alumno alumno = (Alumno)jComboBoxInscripcion.getSelectedItem();
           int idAlumno = alumno.getIdAlumno();
           int filaSeleccionada = jTableFormularioInscripcion.getSelectedRow();
           int idMateria = (Integer)jTableFormularioInscripcion.getValueAt(filaSeleccionada, 0);
           inscripcionData.borrarInscripcionAlumnoMateria(idAlumno, idMateria);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonInscribir;
    private javax.swing.JComboBox<Alumno> jComboBoxInscripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonInscripto;
    private javax.swing.JRadioButton jRadioButtonNoInscripto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFormularioInscripcion;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
    //MODIFICANDO LAS COLUMNAS DE LA TABLA
    private void modificarTabla(){
model.addColumn("ID 😎");
model.addColumn("Nombre ");
model.addColumn("Año 💫");
jTableFormularioInscripcion.setModel(model);
}

    // LLENANDO EL COMBO BOX
    private void llenarComboBoxAlumnos() {
    //DefaultComboBoxModel<String> modeloAlumnos = new DefaultComboBoxModel<>();
     AlumnoData alumnoData = new AlumnoData();
    List<Alumno> listaAlumnos = alumnoData.listarAlumnos();
           
    for (Alumno alumno : listaAlumnos) {
        jComboBoxInscripcion.addItem(alumno);
    }
    }
    
    
private void cleanTable(){
    
for(int i = jTableFormularioInscripcion.getRowCount()-1; i >= 0; i--){

model.removeRow(i);
}
}
    
}
