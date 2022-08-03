package aplikasiRestoran.kelompok6.apps.view;


public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
    }

    public javax.swing.JTextField getTxtPassword() {
        return txtPassword;
    }
    public javax.swing.JTextField getTxtUsername() {
        return txtUsername;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBody = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        lblLoginForm = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN FORM ADMIN");
        setMinimumSize(new java.awt.Dimension(600, 620));
        setPreferredSize(new java.awt.Dimension(800, 720));
        getContentPane().setLayout(new java.awt.CardLayout());

        panelBody.setBackground(new java.awt.Color(192, 57, 42));
        panelBody.setMinimumSize(new java.awt.Dimension(600, 620));
        panelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setMinimumSize(new java.awt.Dimension(0, 0));
        panelLogin.setPreferredSize(new java.awt.Dimension(400, 550));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoginForm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLoginForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasiRestoran/kelompok6/apps/asset/user (1).png"))); // NOI18N
        lblLoginForm.setText("LOGIN FORM");
        lblLoginForm.setIconTextGap(10);
        panelLogin.add(lblLoginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 38, 240, 51));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("USERNAME");
        panelLogin.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 151, 158, 40));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("PASSWORD");
        panelLogin.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 270, 158, 40));

        txtUsername.setBackground(new java.awt.Color(189, 195, 199));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelLogin.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 197, 295, 50));

        txtPassword.setBackground(new java.awt.Color(189, 195, 199));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 316, 295, 52));

        jButton1.setBackground(new java.awt.Color(192, 57, 43));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        panelLogin.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 421, 115, 40));

        panelBody.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 400, 550));

        getContentPane().add(panelBody, "card2");

        pack();
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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblLoginForm;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}