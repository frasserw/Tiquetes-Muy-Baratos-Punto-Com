/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author willi
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mPasajero = new javax.swing.JMenuItem();
        mPiloto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mVuelo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mReserva = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mCPasajero = new javax.swing.JMenuItem();
        mCPiloto = new javax.swing.JMenuItem();
        mCvuelo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tiquetes Muy Baratos Punto Comm");

        jMenu1.setText("Dato");

        mPasajero.setText("Pasajero");
        jMenu1.add(mPasajero);

        mPiloto.setText("Piloto");
        jMenu1.add(mPiloto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Vuelo");

        mVuelo.setText("Crear Vuelo");
        jMenu2.add(mVuelo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reserva");

        mReserva.setText("Reserva pasajero");
        jMenu3.add(mReserva);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        mCPasajero.setText("Pasajero");
        jMenu4.add(mCPasajero);

        mCPiloto.setText("Pilto");
        jMenu4.add(mCPiloto);

        mCvuelo.setText("Vuelo");
        jMenu4.add(mCvuelo);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");

        mSalir.setText("Salir");
        jMenu5.add(mSalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem mCPasajero;
    public javax.swing.JMenuItem mCPiloto;
    public javax.swing.JMenuItem mCvuelo;
    public javax.swing.JMenuItem mPasajero;
    public javax.swing.JMenuItem mPiloto;
    public javax.swing.JMenuItem mReserva;
    public javax.swing.JMenuItem mSalir;
    public javax.swing.JMenuItem mVuelo;
    // End of variables declaration//GEN-END:variables
}
