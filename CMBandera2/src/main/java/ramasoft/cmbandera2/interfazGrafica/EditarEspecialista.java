package ramasoft.cmbandera2.interfazGrafica;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import ramasoft.cmbandera2.logica.Controladora;
import ramasoft.cmbandera2.logica.Especialista;
import ramasoft.cmbandera2.logica.TipoEspecialidad;

/**
 *
 * @author Ramiro Foglia
 */
public class EditarEspecialista extends javax.swing.JFrame {

    //Variables
    VentanaEspecialistas vEsp = new VentanaEspecialistas();
    String titulo = "Consultorios Médicos Bandera";
    Controladora control;
    int id_espeActualizar = 0;

    public EditarEspecialista(int num_espe) {
        control = new Controladora();
        id_espeActualizar = num_espe;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Consultorios Médicos Bandera");
        llenarComboEspecialistas();

        CargarFormularios(id_espeActualizar);
        //Fondo de pantalla
        ImageIcon fondoPantalla = new ImageIcon("src/main/java/Imagenes/img4.png");
        Icon icono = new ImageIcon(fondoPantalla.getImage().getScaledInstance(etiqueta_FondoPantalla.getWidth(), etiqueta_FondoPantalla.getHeight(), Image.SCALE_DEFAULT));
        etiqueta_FondoPantalla.setIcon(icono);
        this.repaint();
        //Foto ilustrativa
        ImageIcon logoPantalla = new ImageIcon("src/main/java/Imagenes/img2.png");
        Icon icono_logo = new ImageIcon(logoPantalla.getImage().getScaledInstance(etiqueta_Foto.getWidth(), etiqueta_Foto.getHeight(), Image.SCALE_DEFAULT));
        etiqueta_Foto.setIcon(icono_logo);
        this.repaint();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqueta_Imagen = new javax.swing.JLabel();
        jPanel_EditarEspe = new javax.swing.JPanel();
        etiqueta_Nombre = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        etiqueta_Apellido = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        etiqueta_Celular = new javax.swing.JLabel();
        txt_Celular = new javax.swing.JTextField();
        etiqueta_FechaNac = new javax.swing.JLabel();
        txt_FechaNac = new javax.swing.JTextField();
        etiqueta_Especialidad = new javax.swing.JLabel();
        cmb_Espe = new javax.swing.JComboBox<>();
        etiqueta_Matricula = new javax.swing.JLabel();
        txt_Matricula = new javax.swing.JTextField();
        btn_Guardar1 = new javax.swing.JButton();
        etiqueta_Titulo = new javax.swing.JLabel();
        etiqueta_Foto = new javax.swing.JLabel();
        etiqueta_FondoPantalla = new javax.swing.JLabel();

        etiqueta_Imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ramiro Foglia\\Documents\\NetBeansProjects\\CMBandera2\\src\\main\\java\\Imagenes\\espe2IMG.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_EditarEspe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiqueta_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Nombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Nombre.setText("Nombre");
        jPanel_EditarEspe.add(etiqueta_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, 20));

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        jPanel_EditarEspe.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, -1));

        etiqueta_Apellido.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Apellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Apellido.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Apellido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Apellido.setText("Apellido");
        jPanel_EditarEspe.add(etiqueta_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 69, 28));
        jPanel_EditarEspe.add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        etiqueta_Celular.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Celular.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Celular.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Celular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Celular.setText("Celular");
        jPanel_EditarEspe.add(etiqueta_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 69, 28));
        jPanel_EditarEspe.add(txt_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, -1));

        etiqueta_FechaNac.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_FechaNac.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_FechaNac.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_FechaNac.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_FechaNac.setText("Fecha Nacimiento");
        jPanel_EditarEspe.add(etiqueta_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));
        jPanel_EditarEspe.add(txt_FechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 180, 115, -1));

        etiqueta_Especialidad.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Especialidad.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Especialidad.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Especialidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Especialidad.setText("Especialidad");
        jPanel_EditarEspe.add(etiqueta_Especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 24));

        jPanel_EditarEspe.add(cmb_Espe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 150, 22));

        etiqueta_Matricula.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Matricula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiqueta_Matricula.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Matricula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiqueta_Matricula.setText("Matricula");
        jPanel_EditarEspe.add(etiqueta_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 73, 28));
        jPanel_EditarEspe.add(txt_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, -1));

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
        jPanel_EditarEspe.add(btn_Guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, 30));

        etiqueta_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        etiqueta_Titulo.setFont(new java.awt.Font("Constantia", 1, 36)); // NOI18N
        etiqueta_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_Titulo.setText("Modificar Especialista");
        jPanel_EditarEspe.add(etiqueta_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 400, 50));

        etiqueta_Foto.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        etiqueta_Foto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel_EditarEspe.add(etiqueta_Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 270, 210));
        jPanel_EditarEspe.add(etiqueta_FondoPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_EditarEspe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_EditarEspe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void btn_Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar1ActionPerformed
        if (verificarCampos()) {
            Especialista e = control.traerEspecialista(id_espeActualizar);
            e.setNombre(txt_Nombre.getText());
            e.setApellido(txt_Apellido.getText());
            e.setCelular(txt_Celular.getText());
            e.setEspecialidad((String) cmb_Espe.getSelectedItem());
            e.setFechaNac(txt_FechaNac.getText());
            e.setMatricula(txt_Matricula.getText());
            control.editarEspecialista(e);
            mostrarMensaje("El Especialista fue actualizado", "Info", titulo);
        }

        VentanaEspecialistas vEsp = new VentanaEspecialistas();
        vEsp.setVisible(true);
        this.dispose(); //Para cerrar la ventana

    }//GEN-LAST:event_btn_Guardar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar1;
    private javax.swing.JComboBox<String> cmb_Espe;
    private javax.swing.JLabel etiqueta_Apellido;
    private javax.swing.JLabel etiqueta_Celular;
    private javax.swing.JLabel etiqueta_Especialidad;
    private javax.swing.JLabel etiqueta_FechaNac;
    private javax.swing.JLabel etiqueta_FondoPantalla;
    private javax.swing.JLabel etiqueta_Foto;
    private javax.swing.JLabel etiqueta_Imagen;
    private javax.swing.JLabel etiqueta_Matricula;
    private javax.swing.JLabel etiqueta_Nombre;
    private javax.swing.JLabel etiqueta_Titulo;
    private javax.swing.JPanel jPanel_EditarEspe;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Celular;
    private javax.swing.JTextField txt_FechaNac;
    private javax.swing.JTextField txt_Matricula;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables

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

    private boolean verificarCampos() {
        boolean condicion = true;
        if (txt_Nombre.getText().equals("")) {
            txt_Nombre.setBackground(Color.ORANGE);
            condicion = false;
        } else if (txt_Apellido.getText().equals("")) {
            txt_Apellido.setBackground(Color.ORANGE);
            condicion = false;
        } else if (txt_Celular.getText().equals("")) {
            txt_Celular.setBackground(Color.ORANGE);
            condicion = false;
        } else if (txt_FechaNac.getText().equals("")) {
            txt_FechaNac.setBackground(Color.ORANGE);
            condicion = false;
        } else if (txt_Matricula.getText().equals("")) {
            txt_Matricula.setBackground(Color.ORANGE);
            condicion = false;
        }
        return condicion;
    }

    private void CargarFormularios(int id_espeActualizar) {
        Especialista espTemp = control.traerEspecialista(id_espeActualizar);
        txt_Nombre.setText(espTemp.getNombre());
        txt_Apellido.setText(espTemp.getApellido());
        txt_FechaNac.setText(espTemp.getFechaNac());
        txt_Celular.setText(espTemp.getCelular());
        txt_Matricula.setText(espTemp.getMatricula());
        cmb_Espe.setSelectedItem(espTemp.getEspecialidad());
    }

    private void llenarComboEspecialistas() {
        TipoEspecialidad[] listaEspe = TipoEspecialidad.values();
        for (TipoEspecialidad espe : listaEspe) {
            cmb_Espe.addItem(espe.toString());
        }
    }
}
