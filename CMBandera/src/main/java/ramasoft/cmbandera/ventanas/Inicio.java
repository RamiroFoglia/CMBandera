package ramasoft.cmbandera.ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Inicio extends javax.swing.JFrame {
    
    public Inicio() {
        initComponents();
        setSize(640, 430);
        setResizable(false);
        setTitle("Consultorios Médicos Bandera");
        setLocationRelativeTo(null);
        //Fondo de pantalla
        ImageIcon fondoPantalla = new ImageIcon("src/main/java/Imagenes/img4.png");
        Icon icono = new ImageIcon(fondoPantalla.getImage().getScaledInstance(jlb_FondoPantallaInicio.getWidth(), jlb_FondoPantallaInicio.getHeight(), Image.SCALE_DEFAULT));
        jlb_FondoPantallaInicio.setIcon(icono);
        this.repaint();
        
        //MEDIANTE OTRO JLABEL, VOY A PONER EL LOGO EN LA  VENTADA
        ImageIcon logoPantalla = new ImageIcon("src/main/java/Imagenes/cmbandera.png");
        Icon icono_logo = new ImageIcon(logoPantalla.getImage().getScaledInstance(etiqueta_Inicio.getWidth(), etiqueta_Inicio.getHeight(), Image.SCALE_DEFAULT));
        etiqueta_Inicio.setIcon(icono_logo);
        this.repaint();
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //metodo para finalizar el programa si se cierra esta ventana

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb_CMBandera = new javax.swing.JLabel();
        btn_Especialistas = new javax.swing.JButton();
        btn_Pacientes = new javax.swing.JButton();
        btn_HistoriaClinica = new javax.swing.JButton();
        etiqueta_Inicio = new javax.swing.JLabel();
        jlb_FondoPantallaInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_CMBandera.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jlb_CMBandera.setForeground(new java.awt.Color(0, 0, 0));
        jlb_CMBandera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_CMBandera.setText("Consultorios Medicos Bandera");
        getContentPane().add(jlb_CMBandera, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 370, 50));

        btn_Especialistas.setBackground(new java.awt.Color(102, 102, 255));
        btn_Especialistas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Especialistas.setForeground(new java.awt.Color(0, 0, 0));
        btn_Especialistas.setText("Especialistas");
        btn_Especialistas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Especialistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EspecialistasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Especialistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 185, 39));

        btn_Pacientes.setBackground(new java.awt.Color(102, 102, 255));
        btn_Pacientes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_Pacientes.setForeground(new java.awt.Color(0, 0, 0));
        btn_Pacientes.setText("Pacientes");
        btn_Pacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_Pacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 185, 39));

        btn_HistoriaClinica.setBackground(new java.awt.Color(102, 102, 255));
        btn_HistoriaClinica.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_HistoriaClinica.setForeground(new java.awt.Color(0, 0, 0));
        btn_HistoriaClinica.setText("Historia Clinica");
        btn_HistoriaClinica.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btn_HistoriaClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 185, 39));
        getContentPane().add(etiqueta_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 290, 260));
        getContentPane().add(jlb_FondoPantallaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EspecialistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EspecialistasActionPerformed
        Especialistas especialista = new Especialistas();
        especialista.setVisible(true);
    }//GEN-LAST:event_btn_EspecialistasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Especialistas;
    private javax.swing.JButton btn_HistoriaClinica;
    private javax.swing.JButton btn_Pacientes;
    private javax.swing.JLabel etiqueta_Inicio;
    private javax.swing.JLabel jlb_CMBandera;
    private javax.swing.JLabel jlb_FondoPantallaInicio;
    // End of variables declaration//GEN-END:variables
}
