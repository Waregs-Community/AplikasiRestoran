package aplikasiRestoran.kelompok6.apps.view;

import aplikasiRestoran.kelompok6.apps.controller.LoginController;
import aplikasiRestoran.kelompok6.apps.event.LoginListener;
import aplikasiRestoran.kelompok6.apps.model.LoginModel;
import javax.swing.JFrame;


public class LoginView extends javax.swing.JFrame implements LoginListener {
    
    private LoginController controller;
    private LoginModel model;

    public LoginView() {
        
        model = new LoginModel();
        model.setListener(this);
        controller = new LoginController();
        controller.setModel(model);
        
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    public javax.swing.JTextField getTxtPassword() {
        return txtPassword;
    }
    public javax.swing.JTextField getTxtUsername() {
        return txtUsername;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBody = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        lblLoginForm = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

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
        panelLogin.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 158, 40));

        txtUsername.setBackground(new java.awt.Color(189, 195, 199));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        panelLogin.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 197, 295, 50));

        btnLogin.setBackground(new java.awt.Color(192, 57, 43));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        panelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 421, 115, 40));

        txtPassword.setBackground(new java.awt.Color(189, 195, 199));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        panelLogin.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 50));

        panelBody.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 400, 550));

        getContentPane().add(panelBody, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
      controller.login(this);
    }//GEN-LAST:event_btnLoginMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblLoginForm;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(LoginModel model) {
        this.txtUsername.setText(model.getUsername());
        this.txtPassword.setText(model.getPassword());
    }
}
