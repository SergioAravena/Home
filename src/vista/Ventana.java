
package vista;

/**
 *
 * @author Sergio Aravena
 */

import modelo.*;

import controlador.*;

import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
     Cola Tail = new Cola();
    
    Pila Stack = new Pila();
     
     
    
    
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabIngresoDeLogeo = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtNombreLogeo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnIngresoDeLogeo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabIngresoJugador = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNombreJugadorSala = new javax.swing.JTextField();
        btnIngresarAEspera = new javax.swing.JButton();
        btnVaciarListaSala = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJugadorSalido = new javax.swing.JTextField();
        btnJugadorSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabIngresoDeLogeo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nickname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabIngresoDeLogeo);

        jLabel5.setText("Ingreso");

        jLabel6.setText("Nombre");

        btnIngresoDeLogeo.setText("Ingresar Cuenta");
        btnIngresoDeLogeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoDeLogeoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreLogeo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnIngresoDeLogeo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreLogeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnIngresoDeLogeo)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Logeo de jugadores", jPanel2);

        tabIngresoJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NickName"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabIngresoJugador);

        jLabel1.setText("Nombre");

        btnIngresarAEspera.setText("Ingresar");
        btnIngresarAEspera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAEsperaActionPerformed(evt);
            }
        });

        btnVaciarListaSala.setText("VaciarListadeJugadores");
        btnVaciarListaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarListaSalaActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingreso");

        jLabel3.setText("Jugador Salido");

        jLabel4.setText("Nombre ");

        txtJugadorSalido.setEnabled(false);

        btnJugadorSalida.setText("Jugar");
        btnJugadorSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtJugadorSalido, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(btnJugadorSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnIngresarAEspera)
                                .addGap(46, 46, 46)
                                .addComponent(btnVaciarListaSala))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombreJugadorSala, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtJugadorSalido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(btnJugadorSalida)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreJugadorSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarAEspera)
                    .addComponent(btnVaciarListaSala))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sala de espera", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugadorSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorSalidaActionPerformed
        if(Tail.tamaño()==0){

            javax.swing.JOptionPane.showMessageDialog(this, "No hay jugadores en la lista de espera");

        }else{

            Jugador jugador = Tail.Pop();
            this.txtJugadorSalido.setText(jugador.getNickname());

            DefaultTableModel model
            = (DefaultTableModel)this.tabIngresoJugador.getModel();

            model.removeRow(0);

        }
    }//GEN-LAST:event_btnJugadorSalidaActionPerformed

    private void btnVaciarListaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarListaSalaActionPerformed

        DefaultTableModel model = (DefaultTableModel)this.tabIngresoJugador.getModel();

        if(Tail.tamaño()<=0){

            javax.swing.JOptionPane.showMessageDialog(this, "no hay jugadores en la lista ");
        }else{
            Tail.Pop();
            model.removeRow(0);

        }

    }//GEN-LAST:event_btnVaciarListaSalaActionPerformed

    private void btnIngresarAEsperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAEsperaActionPerformed

        if(Tail.tamaño()==10){

            javax.swing.JOptionPane.showMessageDialog(this, "La cola esta llena ");
            javax.swing.JOptionPane.showMessageDialog(this, "La  sala a la quiere ingresar esta llena ");

        }else{

            Jugador jugador = new Jugador();

            jugador.setNickname(this.txtNombreJugadorSala.getText().trim());

            Tail.Push(jugador);

            DefaultTableModel model
            = (DefaultTableModel)this.tabIngresoJugador.getModel();

            Object[] data = new Object[]{

                jugador.getNickname()};

            model.addRow(data);

            this.txtNombreJugadorSala.setText("");
            
        }
    }//GEN-LAST:event_btnIngresarAEsperaActionPerformed

    private void btnIngresoDeLogeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoDeLogeoActionPerformed
        
        if(Stack.tamaño()==1){
            
            javax.swing.JOptionPane.showMessageDialog(this, "Solo puede ingresar un jugador por logeo");
        }else{
            
            Jugador jugador =  new Jugador();
            
            
            jugador.setNickname(this.txtNombreLogeo.getText().trim());
            
            Stack.Push(jugador);
            
            Stack.Peek();
            
            
            DefaultTableModel model = (DefaultTableModel)this.tabIngresoDeLogeo.getModel();
            
            
            Object[] data = new Object[]{
                
                
               jugador.getNickname()};
            
            
            model.addRow(data);
            
          
            
            javax.swing.JOptionPane.showMessageDialog(this, 
                    "A ingresado a la sala de servidores donde podra buscar su partida");
            
            
            
            model.removeRow(0);
            
            
            Tail.Push(jugador);
            
            
           model = (DefaultTableModel)this.tabIngresoJugador.getModel();
           
           
            
              Object[] data2 = new Object[]{
                
                
               jugador.getNickname()};
            
            
            model.addRow(data2);
            
           
           Stack.Pop();
           

            this.txtNombreLogeo.setText("");

            
        }
               
    }//GEN-LAST:event_btnIngresoDeLogeoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarAEspera;
    private javax.swing.JButton btnIngresoDeLogeo;
    private javax.swing.JButton btnJugadorSalida;
    private javax.swing.JButton btnVaciarListaSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabIngresoDeLogeo;
    private javax.swing.JTable tabIngresoJugador;
    private javax.swing.JTextField txtJugadorSalido;
    private javax.swing.JTextField txtNombreJugadorSala;
    private javax.swing.JTextField txtNombreLogeo;
    // End of variables declaration//GEN-END:variables
}
