package ramasoft.cmbandera2.interfazGrafica;

import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import ramasoft.cmbandera2.logica.Controladora;
import ramasoft.cmbandera2.logica.Especialista;
import ramasoft.cmbandera2.logica.TipoEspecialidad;

/**
 *
 * @author BarrileteCosmico
 */
public class VentanaEspecialistas extends javax.swing.JFrame {

    Controladora control = null;

    public VentanaEspecialistas() {
        control = new Controladora();
        initComponents();
        setResizable(false);
//        setSize(840, 480);
        setTitle("Consultorios Médicos Bandera");
        llenarComboEspecialistas();
        setLocationRelativeTo(null);
        deshabilitarBotones();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //Fondo de pantalla
        ImageIcon fondoPantalla = new ImageIcon("src/main/java/Imagenes/img4.png");
        Icon icono = new ImageIcon(fondoPantalla.getImage().getScaledInstance(etiqueta_FondoPantalla.getWidth(), etiqueta_FondoPantalla.getHeight(), Image.SCALE_DEFAULT));
        etiqueta_FondoPantalla.setIcon(icono);
        this.repaint();
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
        cmb_Espe = new javax.swing.JComboBox<>();
        txt_FechaNac = new javax.swing.JTextField();
        txt_Celular = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        btn_Nuevo = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Guardar1 = new javax.swing.JButton();
        btn_Editar1 = new javax.swing.JButton();
        jp_TablaEspecialistas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Especialistas = new javax.swing.JTable();
        etiqueta_FondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jlb_Titulo.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        jlb_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        jlb_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_Titulo.setText("Especialistas");
        getContentPane().add(jlb_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 280, 50));

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
        getContentPane().add(txt_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 160, -1));

        getContentPane().add(cmb_Espe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 208, 150, 22));
        getContentPane().add(txt_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 180, 115, -1));
        getContentPane().add(txt_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, -1));
        getContentPane().add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, -1));

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, -1));

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
        getContentPane().add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 120, 30));

        btn_Eliminar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Eliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 120, 30));

        btn_Limpiar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Limpiar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Limpiar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Limpiar.setText("Limpiar Campos");
        btn_Limpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 100, -1));

        btn_Guardar1.setBackground(new java.awt.Color(102, 102, 255));
        btn_Guardar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Guardar1.setForeground(new java.awt.Color(0, 0, 0));
        btn_Guardar1.setText("Guardar");
        btn_Guardar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 120, 30));

        btn_Editar1.setBackground(new java.awt.Color(102, 102, 255));
        btn_Editar1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Editar1.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar1.setText("Editar");
        btn_Editar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_Editar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 120, 30));

        jp_TablaEspecialistas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_TablaEspecialistas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_Especialistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla_Especialistas);

        jp_TablaEspecialistas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 310));

        getContentPane().add(jp_TablaEspecialistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 520, 330));
        getContentPane().add(etiqueta_FondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        limpiarCampos();
        habilitarBotones();
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        limpiarCampos();
        deshabilitarBotones();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar1ActionPerformed
        Controladora control = new Controladora();
        //Obtengo los datos de los campos para pasarlos como argumentos al metodo gurdar de la controladora logica
        String nombre = txt_Nombre.getText();
        String apellido = txt_Apellido.getText();
        String celular = txt_Celular.getText();
        String fecha = txt_FechaNac.getText();
        String espe = (String) cmb_Espe.getSelectedItem();
        String matrcula = txt_Matricula.getText();

        control.guardar(nombre, apellido, celular, fecha, espe, matrcula);

        JOptionPane.showMessageDialog(this, "Los datos se guardaron correctramente");
        CargarTabla();
        limpiarCampos();
        deshabilitarBotones();

    }//GEN-LAST:event_btn_Guardar1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        habilitarBotones();
        if (tabla_Especialistas.getRowCount() > 0) { // controlo que la tabla no este vacia
            if (tabla_Especialistas.getSelectedRow() != -1) { //controlo si se eligio un fila
                int num_espe = Integer.parseInt(String.valueOf(tabla_Especialistas.getValueAt(tabla_Especialistas.getSelectedRow(), 0)));
                control.eliminarEspecialista(num_espe);
                CargarTabla();
                deshabilitarBotones();
            } else {
//                mostrarMensaje
                JOptionPane.showMessageDialog(this, "Debe seleccionar un especialista");
                deshabilitarBotones();
            }
        } else {
            JOptionPane.showMessageDialog(this, "La Tabla esta Vacia");
            deshabilitarBotones();
        }

    }//GEN-LAST:event_btn_EliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar1;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar1;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JComboBox<String> cmb_Espe;
    private javax.swing.JLabel etiqueta_FondoPantalla;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlb_Apellido;
    private javax.swing.JLabel jlb_Celular;
    private javax.swing.JLabel jlb_Especialidad;
    private javax.swing.JLabel jlb_FechaNac;
    private javax.swing.JLabel jlb_Matricula;
    private javax.swing.JLabel jlb_Nombre;
    private javax.swing.JLabel jlb_Titulo;
    private javax.swing.JPanel jp_TablaEspecialistas;
    private javax.swing.JTable tabla_Especialistas;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Celular;
    private javax.swing.JTextField txt_FechaNac;
    private javax.swing.JTextField txt_Matricula;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarBotones() {
        btn_Limpiar.setEnabled(false);
        btn_Eliminar.setEnabled(true);
        btn_Editar1.setEnabled(false);
        btn_Guardar1.setEnabled(false);
        btn_Nuevo.setEnabled(true);
        txt_Nombre.setEditable(false);
        txt_Apellido.setEditable(false);
        cmb_Espe.setEnabled(false);
        txt_FechaNac.setEditable(false);
        txt_Matricula.setEditable(false);
        txt_Celular.setEditable(false);
    }

    private void habilitarBotones() {
        btn_Limpiar.setEnabled(true);
        btn_Guardar1.setEnabled(true);
        btn_Nuevo.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_Editar1.setEnabled(false);
        cmb_Espe.setEnabled(true);
        txt_Nombre.setEditable(true);
        txt_Apellido.setEditable(true);
        txt_FechaNac.setEditable(true);
        txt_Matricula.setEditable(true);
        txt_Celular.setEditable(true);
    }

    private void limpiarCampos() {
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Celular.setText("");
        cmb_Espe.selectWithKeyChar('s');
        txt_FechaNac.setText("");
        txt_Matricula.setText("");
    }

    private void llenarComboEspecialistas() {
        TipoEspecialidad[] listaEspe = TipoEspecialidad.values();
        for (TipoEspecialidad espe : listaEspe) {
            cmb_Espe.addItem(espe.toString());
        }

    }

    private void CargarTabla() {
        //Defino el modelo que va a tener la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {// con este metodo las filas y las columnas no se va a poder editar
                return false;
            }
        };
        //Establezco los nombre de las columnas
        String titulos[] = {"ID", "Nombre", "Apellido", "Especialidad", "Celular"};
        modeloTabla.setColumnIdentifiers(titulos);
        //Cargo los datos en la tabla desde la BD
        List<Especialista> datosEspe = control.traerListaEspecialista();
        if (datosEspe != null) {
            for (Especialista espe : datosEspe) {
                Object[] objeto = {espe.getId_persona(), espe.getNombre(), espe.getApellido(), espe.getEspecialidad(), espe.getCelular()};
                modeloTabla.addRow(objeto);
            }
        }
        tabla_Especialistas.setModel(modeloTabla);
    }
}
