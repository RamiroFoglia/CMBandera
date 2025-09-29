package ramasoft.cmbandera2.interfazGrafica;

import java.awt.Image;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import ramasoft.cmbandera2.logica.Controladora;
import ramasoft.cmbandera2.logica.Especialista;
import ramasoft.cmbandera2.logica.HistoriaClinica;
import ramasoft.cmbandera2.logica.Paciente;
import ramasoft.cmbandera2.logica.TipoEspecialidad;
import ramasoft.cmbandera2.logica.TipoSangre;

/**
 *
 * @author BarrileteCosmico
 */
public class VentanaPaciente extends javax.swing.JFrame {

    private Controladora control = null;
    private String titulo = "Consultorios Medicos Bandera";
    private HistoriaClinica historiaClinca = new HistoriaClinica();

    public VentanaPaciente() {
        control = new Controladora();
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Trabajando con Pacientes");
        llenarComboTipoDeSangre();
        deshabilitarBotones();
        //Fondo de pantalla
        ImageIcon fondoPantalla = new ImageIcon("src/main/java/Imagenes/img4.png");
        Icon icono = new ImageIcon(fondoPantalla.getImage().getScaledInstance(etiqueta_FondoPantalla.getWidth(), etiqueta_FondoPantalla.getHeight(), Image.SCALE_DEFAULT));
        etiqueta_FondoPantalla.setIcon(icono);
        this.repaint();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqueta_Titulo = new javax.swing.JLabel();
        etiqueta_Nombre = new javax.swing.JLabel();
        etiqueta_Apellido = new javax.swing.JLabel();
        etiqueta_Celular = new javax.swing.JLabel();
        etiqueta_FechaNac = new javax.swing.JLabel();
        etiqueta_ObraSocial = new javax.swing.JLabel();
        etiqueta_TipoSangre = new javax.swing.JLabel();
        txt_ObraSocial = new javax.swing.JTextField();
        txt_FechaNac = new javax.swing.JTextField();
        txt_Celular = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        btn_Nuevo = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Guardar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_generarHisCli = new javax.swing.JButton();
        jp_TablaEspecialistas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Especialistas = new javax.swing.JTable();
        cmb_TipoSangre = new javax.swing.JComboBox<>();
        etiqueta_FondoPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Titulo.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        etiqueta_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_Titulo.setText("Pacientes");
        getContentPane().add(etiqueta_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 280, 50));

        etiqueta_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Nombre.setText("Nombre");
        getContentPane().add(etiqueta_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 88, 70, 20));

        etiqueta_Apellido.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Apellido.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Apellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Apellido.setText("Apellido");
        getContentPane().add(etiqueta_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 115, 69, 28));

        etiqueta_Celular.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Celular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Celular.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Celular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Celular.setText("Celular");
        getContentPane().add(etiqueta_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 146, 69, 28));

        etiqueta_FechaNac.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_FechaNac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_FechaNac.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_FechaNac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_FechaNac.setText("Fecha Nacimiento");
        getContentPane().add(etiqueta_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 174, 130, 30));

        etiqueta_ObraSocial.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_ObraSocial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_ObraSocial.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_ObraSocial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_ObraSocial.setText("Obra Social");
        getContentPane().add(etiqueta_ObraSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 207, 100, 24));

        etiqueta_TipoSangre.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_TipoSangre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_TipoSangre.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_TipoSangre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_TipoSangre.setText("Tipo de Sangre");
        getContentPane().add(etiqueta_TipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 235, 120, 28));
        getContentPane().add(txt_ObraSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 160, -1));
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

        btn_Editar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Editar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_Editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar.setText("Editar");
        btn_Editar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 120, 30));

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
        getContentPane().add(btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 120, 30));

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
        getContentPane().add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, -1));

        btn_generarHisCli.setBackground(new java.awt.Color(102, 102, 255));
        btn_generarHisCli.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_generarHisCli.setForeground(new java.awt.Color(0, 0, 0));
        btn_generarHisCli.setText("Generar Historia Clinica");
        btn_generarHisCli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_generarHisCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarHisCliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generarHisCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 210, 30));

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

        getContentPane().add(cmb_TipoSangre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 130, -1));
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

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        Controladora control = new Controladora();
        //Obtengo los datos de los campos para pasarlos como argumentos al metodo gurdar de la controladora logica
        String nombre = txt_Nombre.getText();
        String apellido = txt_Apellido.getText();
        String celular = txt_Celular.getText();
        String fecha = txt_FechaNac.getText();
        String tipoSangre = (String) cmb_TipoSangre.getSelectedItem();
        String obraSocial = txt_ObraSocial.getText();     
       
        control.guardarPaciente(nombre, apellido, celular, fecha, tipoSangre, obraSocial);
        
      
        mostrarMensaje("El Paciente fue dado de alta", "Info", titulo);
        CargarTabla();
        limpiarCampos();
        deshabilitarBotones();

    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
//        habilitarBotones();
//        if (tabla_Especialistas.getRowCount() > 0) { // controlo que la tabla no este vacia
//            if (tabla_Especialistas.getSelectedRow() != -1) { //controlo si se eligio un fila
//                int num_espe = Integer.parseInt(String.valueOf(tabla_Especialistas.getValueAt(tabla_Especialistas.getSelectedRow(), 0)));
//                control.eliminarEspecialista(num_espe);
//                mostrarMensaje("El Especialista fue dado de baja", "Info", titulo);
//                CargarTabla();
//                deshabilitarBotones();
//            } else {
//                mostrarMensaje("Debe seleccionar un Especialista", "Error", titulo);
//                deshabilitarBotones();
//            }
//        } else {
//            mostrarMensaje("La Tabla esta Vacia", "Error", titulo);
//            deshabilitarBotones();
//        }

    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
//        if (tabla_Especialistas.getRowCount() > 0) { // controlo que la tabla no este vacia
//            if (tabla_Especialistas.getSelectedRow() != -1) { //controlo si se eligio un fila
//                int num_espe = Integer.parseInt(String.valueOf(tabla_Especialistas.getValueAt(tabla_Especialistas.getSelectedRow(), 0)));
//                EditarEspecialista editEspe = new EditarEspecialista(num_espe);
//                editEspe.setVisible(true);                
//                this.dispose();
//            } else {
//                mostrarMensaje("Debe seleccionar un Especialista", "Error", titulo);
//                deshabilitarBotones();
//            }
//        } else {
//            mostrarMensaje("La Tabla esta Vacia", "Error", titulo);
//            deshabilitarBotones();
//        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_generarHisCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarHisCliActionPerformed
       HistoriaClinica paciente = new HistoriaClinica();
       btn_generarHisCli.setEnabled(false);
        mostrarMensaje("Historia Clinica creada", "Info", "Alta de Paciente");
       
    }//GEN-LAST:event_btn_generarHisCliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_generarHisCli;
    private javax.swing.JComboBox<String> cmb_TipoSangre;
    private javax.swing.JLabel etiqueta_Apellido;
    private javax.swing.JLabel etiqueta_Celular;
    private javax.swing.JLabel etiqueta_FechaNac;
    private javax.swing.JLabel etiqueta_FondoPantalla;
    private javax.swing.JLabel etiqueta_Nombre;
    private javax.swing.JLabel etiqueta_ObraSocial;
    private javax.swing.JLabel etiqueta_TipoSangre;
    private javax.swing.JLabel etiqueta_Titulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp_TablaEspecialistas;
    private javax.swing.JTable tabla_Especialistas;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Celular;
    private javax.swing.JTextField txt_FechaNac;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_ObraSocial;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarBotones() {
        btn_Limpiar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_Editar.setEnabled(false);
        btn_Guardar.setEnabled(false);
        btn_Nuevo.setEnabled(true);
        btn_generarHisCli.setEnabled(false);
        cmb_TipoSangre.setEnabled(false);
        txt_Nombre.setEditable(false);
        txt_Apellido.setEditable(false);        
        txt_FechaNac.setEditable(false);
        txt_ObraSocial.setEditable(false);
        txt_Celular.setEditable(false);
    }

    private void habilitarBotones() {
        btn_Limpiar.setEnabled(true);
        btn_Eliminar.setEnabled(true);
        btn_Editar.setEnabled(true);
        btn_Guardar.setEnabled(true);
        btn_Nuevo.setEnabled(false);  
         btn_generarHisCli.setEnabled(true);
        cmb_TipoSangre.setEnabled(true);
        txt_Nombre.setEditable(true);
        txt_Apellido.setEditable(true);
        txt_FechaNac.setEditable(true);
        txt_ObraSocial.setEditable(true);
        txt_Celular.setEditable(true);
    }

    private void limpiarCampos() {
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Celular.setText("");
        cmb_TipoSangre.selectWithKeyChar('s');
        txt_FechaNac.setText("");
        txt_ObraSocial.setText("");
    }

    private void CargarTabla() {
        //Defino el modelo que va a tener la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {// con este metodo las filas y las columnas no se van a poder editar
                return false;
            }
        };
        //Establezco los nombre de las columnas
        String titulos[] = {"ID", "Nombre", "Apellido", "Celular", "Obra Social", "Fecha de Nacimiento"};
        modeloTabla.setColumnIdentifiers(titulos);
        //Cargo los datos en la tabla desde la BD
        List<Paciente> datosPaciente = control.traerListaPacientes();
        if (datosPaciente != null) {
            for (Paciente paciente : datosPaciente) {
                Object[] objeto = {paciente.getId_persona(), paciente.getNombre(), paciente.getApellido(), paciente.getCelular(), paciente.getObraSocial(), paciente.getFechaNac(),};
                modeloTabla.addRow(objeto);
            }
        }
        tabla_Especialistas.setModel(modeloTabla);
    }

    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje); //Agrego el mensaje a la ventana de dialogo
        //Compruebo que tipo de mensaje es
        if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        JDialog diaLog = optionPane.createDialog(titulo); //Agrego el titulo a la ventana de dialogo
        diaLog.setAlwaysOnTop(true);
        diaLog.setVisible(true);
    }

    private void llenarComboTipoDeSangre() {
        TipoSangre[] listaTipoSangre = TipoSangre.values();
        for (TipoSangre tipoSangre : listaTipoSangre) {
            cmb_TipoSangre.addItem(tipoSangre.toString());
        }
    }    
}
