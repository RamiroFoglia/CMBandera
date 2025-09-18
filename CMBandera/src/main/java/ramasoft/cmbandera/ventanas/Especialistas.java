package ramasoft.cmbandera.ventanas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import ramasoft.cmbandera.logica.Especialidades;

public class Especialistas extends javax.swing.JFrame {

    
    public Especialistas() {
        initComponents();
        setResizable(false);
        setSize(640, 480);
        setTitle("Especialistas");
        setLocationRelativeTo(null);
        //Poner una imagen de fondo
        ImageIcon fondoPantalla = new ImageIcon("src/main/java/Imagenes/img4.png");
            Icon icono = new ImageIcon(fondoPantalla.getImage().getScaledInstance(etiqueta_FondPantallaEsp.getWidth(), etiqueta_FondPantallaEsp.getHeight(), Image.SCALE_DEFAULT));
            etiqueta_FondPantallaEsp.setIcon(icono);
            this.repaint();
            llenarComboEspecialistas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb_Titulo = new javax.swing.JLabel();
        jlb_Nombre = new javax.swing.JLabel();
        jlb_Apellido = new javax.swing.JLabel();
        jlb_Celular = new javax.swing.JLabel();
        jlb_FechaNac = new javax.swing.JLabel();
        jlb_Especialidad = new javax.swing.JLabel();
        jlb_Matricula = new javax.swing.JLabel();
        txt_Matricula = new javax.swing.JTextField();
        txt_FechaNac = new javax.swing.JTextField();
        txt_Celular = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_DatosEspecialistas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtb_DatosEspecialistas1 = new javax.swing.JTable();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        cmb_Espe = new javax.swing.JComboBox<>();
        etiqueta_FondPantallaEsp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jlb_Titulo.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jlb_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        jlb_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_Titulo.setText("Especialistas");
        getContentPane().add(jlb_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, 50));

        jlb_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        jlb_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlb_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        jlb_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_Nombre.setText("Nombre");
        getContentPane().add(jlb_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 88, 70, 20));

        jlb_Apellido.setBackground(new java.awt.Color(255, 255, 255));
        jlb_Apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlb_Apellido.setForeground(new java.awt.Color(0, 0, 0));
        jlb_Apellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_Apellido.setText("Apellido");
        getContentPane().add(jlb_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, 69, 28));

        jlb_Celular.setBackground(new java.awt.Color(255, 255, 255));
        jlb_Celular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlb_Celular.setForeground(new java.awt.Color(0, 0, 0));
        jlb_Celular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_Celular.setText("Celular");
        getContentPane().add(jlb_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 146, 69, 28));

        jlb_FechaNac.setBackground(new java.awt.Color(255, 255, 255));
        jlb_FechaNac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlb_FechaNac.setForeground(new java.awt.Color(0, 0, 0));
        jlb_FechaNac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_FechaNac.setText("Fecha Nacimiento");
        getContentPane().add(jlb_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 174, 130, 30));

        jlb_Especialidad.setBackground(new java.awt.Color(255, 255, 255));
        jlb_Especialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlb_Especialidad.setForeground(new java.awt.Color(0, 0, 0));
        jlb_Especialidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_Especialidad.setText("Especialidad");
        getContentPane().add(jlb_Especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 207, 100, 24));

        jlb_Matricula.setBackground(new java.awt.Color(255, 255, 255));
        jlb_Matricula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlb_Matricula.setForeground(new java.awt.Color(0, 0, 0));
        jlb_Matricula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlb_Matricula.setText("Matricula");
        getContentPane().add(jlb_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, 73, 28));
        getContentPane().add(txt_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 136, -1));
        getContentPane().add(txt_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 180, 90, -1));
        getContentPane().add(txt_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 136, -1));
        getContentPane().add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 136, -1));

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 136, -1));

        jtb_DatosEspecialistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Apellido", "Nombre", "Especialidad", "Matricula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtb_DatosEspecialistas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 340, 270));

        jtb_DatosEspecialistas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Apellido", "Nombre", "Especialidad", "Matricula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtb_DatosEspecialistas1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 340, 270));

        btn_Nuevo.setBackground(new java.awt.Color(102, 102, 255));
        btn_Nuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, -1));

        btn_Editar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Editar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar.setText("Editar");
        btn_Editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, -1));

        btn_Guardar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Guardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Guardar.setText("Guardar");
        btn_Guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 100, -1));

        getContentPane().add(cmb_Espe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 208, 125, 22));
        getContentPane().add(etiqueta_FondPantallaEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        limpiarCampos();
        habilitarBotones();
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        String nombre = txt_Nombre.getText();
        String apellido = txt_Apellido.getText();
        String celular = txt_Celular.getText();
        ////////////DATOS DEL COMBOBOX
        String matricula = txt_Matricula.getText();
        String fechaNac = txt_FechaNac.getText();

    }//GEN-LAST:event_btn_GuardarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cmb_Espe;
    private javax.swing.JLabel etiqueta_FondPantallaEsp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlb_Apellido;
    private javax.swing.JLabel jlb_Celular;
    private javax.swing.JLabel jlb_Especialidad;
    private javax.swing.JLabel jlb_FechaNac;
    private javax.swing.JLabel jlb_Matricula;
    private javax.swing.JLabel jlb_Nombre;
    private javax.swing.JLabel jlb_Titulo;
    private javax.swing.JTable jtb_DatosEspecialistas;
    private javax.swing.JTable jtb_DatosEspecialistas1;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Celular;
    private javax.swing.JTextField txt_FechaNac;
    private javax.swing.JTextField txt_Matricula;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarBotones() {
        btn_Guardar.setEnabled(false);
        txt_Nombre.setEditable(false);
        txt_Apellido.setEditable(false);
////////////DATOS DEL COMBOBOX
        txt_FechaNac.setEditable(false);
        txt_Matricula.setEditable(false);
        txt_Celular.setEditable(false);
    }

    private void habilitarBotones() {
        btn_Guardar.setEnabled(true);
        btn_Nuevo.setEnabled(false);
        btn_Editar.setEnabled(false);
        txt_Nombre.setEditable(true);
        txt_Apellido.setEditable(true);
////////////DATOS DEL COMBOBOX
        txt_FechaNac.setEditable(true);
        txt_Matricula.setEditable(true);
        txt_Celular.setEditable(true);
    }

    private void limpiarCampos() {
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Celular.setText("");
////////////DATOS DEL COMBOBOX
        txt_FechaNac.setText("");
        txt_Matricula.setText("");
    }

    private void llenarComboEspecialistas() {
        for (Object object : col) {
            
        }
        cmb_Espe.addItem(item);
    }
}
