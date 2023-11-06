/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadproyecto.Vistas;

import java.awt.Color;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import universidadproyecto.AccesoADatos.AlumnoData;
import universidadproyecto.Entidades.Alumno;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author ayala
 */
public class GestiondeAlumno extends javax.swing.JInternalFrame {

     private AlumnoData alumnoData;
  
    public GestiondeAlumno() {
        initComponents();
        alumnoData = new AlumnoData();
        
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButtonestado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jDatenacimiento = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jtfieldApellido = new javax.swing.JTextField();
        jtfieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jtfieldDni = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(51, 51, 51));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 204));
        setIconifiable(true);
        setMaximizable(true);
        setTitle("          Alumno");
        setFont(new java.awt.Font("Century Schoolbook", 1, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Documento");

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento");

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jButtonBuscar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(204, 204, 204));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonNuevo.setBackground(new java.awt.Color(0, 0, 102));
        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(153, 153, 153));
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(153, 153, 153));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(102, 51, 255));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(153, 153, 153));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(102, 51, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(153, 153, 153));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salir_1.png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(null);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/student.png"))); // NOI18N
        jLabel7.setText("Alumno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonEliminar)
                                .addGap(112, 112, 112)
                                .addComponent(jButtonSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(492, 492, 492)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfieldDni, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRadioButtonestado)
                        .addComponent(jtfieldApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addComponent(jtfieldNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBuscar)
                .addGap(175, 175, 175))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel7)
                .addGap(296, 296, 296))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNuevo)
                        .addGap(78, 78, 78)
                        .addComponent(jButtonGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jDatenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDatenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButtonestado))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)))
                .addGap(36, 36, 36)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                    //BUTTON SALIR
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed
            //BUTTON GUARDAR
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
              try{
         String dniAlu = jtfieldDni.getText();
           
           if(!(dniAlu.equals(""))){
                int dniAlumno = Integer.parseInt(dniAlu);
       // AlumnoData alumnoData = new AlumnoData();
       
        Alumno alumno =  alumnoData.buscarAlumnoPorDni(dniAlumno);
         jtfieldNombre.setText(alumno.getNombre());
        jtfieldApellido.setText(alumno.getApellido());
        jRadioButtonestado.setSelected(alumno.isEstado());
        LocalDate localDate = alumno.getFechaNacimiento();
    Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());        
    jDatenacimiento.setDate(date);
           }else{
               JOptionPane.showMessageDialog(this, "El campo no puede estar vacio para buscar el Alumno");
               limpiarCampo();
           } 
           
       }catch(NumberFormatException nf){
       JOptionPane.showMessageDialog(this, "Por favor Ingrese solo numeros");
       }catch(NullPointerException nx){
           
       }
         
    }//GEN-LAST:event_jButtonBuscarActionPerformed
                //BUTTON NUEVO
    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
     limpiarCampo();
     
    }//GEN-LAST:event_jButtonNuevoActionPerformed
                    //BUTTON ELIMINAR   INCOMPLETO
    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try{
            
            String dni = jtfieldDni.getText();
             if(!(dni.equals(""))){
        int dniAlumno = Integer.parseInt( dni);
       // AlumnoData alumnoData = new AlumnoData();
        alumnoData.eliminarAlumno(dniAlumno);
        limpiarCampo();
             }else{  
               JOptionPane.showMessageDialog(this,"Por favor ingese el numero de documento del alumno que desea eliminar");  
          }
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "Ingrese formato numerico, el dni no lleva string ni caracteres especiales");
        }
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

                    //BUTTON GUARDAR
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
       try{ 
           //variables de los jtextfield y demas
        String documento = jtfieldDni.getText();
        String apellido = jtfieldApellido.getText();
        String nombre = jtfieldNombre.getText();
        Boolean estado = jRadioButtonestado.isSelected();       
        Date fecha    = jDatenacimiento.getDate();
                    //validando que no esten vacios
        if(!documento.isEmpty() && !apellido.isEmpty() && !nombre.isEmpty() && fecha != null){
            int dniAlumno = Integer.parseInt(documento);
             Instant instant = fecha.toInstant();
             ZoneId zoneId = ZoneId.systemDefault();
             LocalDate fechaNacimiento = instant.atZone(zoneId).toLocalDate();
            Alumno alumno = new Alumno(dniAlumno,nombre,apellido,fechaNacimiento,estado);
            AlumnoData alumnoData = new AlumnoData();
            alumnoData.guardarAlumno(alumno);
            
        }else{
        
        JOptionPane.showMessageDialog(this, "Rellene todos los campos!");
        }
        
       }catch(NumberFormatException nf){
           JOptionPane.showMessageDialog(this, "Verifique los datos ingresados!");
       }
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private com.toedter.calendar.JDateChooser jDatenacimiento;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtfieldApellido;
    private javax.swing.JTextField jtfieldDni;
    private javax.swing.JTextField jtfieldNombre;
    // End of variables declaration//GEN-END:variables
private void limpiarCampo(){
jtfieldDni.setText("");
jtfieldApellido.setText("");
jtfieldNombre.setText("");
jRadioButtonestado.setSelected(false);
jDatenacimiento.setDate(null);

}
}
