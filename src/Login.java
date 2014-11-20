

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EdoTyran
 */
public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    /**
     * Creates new form Login
     */
    public Login() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        Mini = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        DragFrame = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        Login = new javax.swing.JLabel();
        Achtergrond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MiniMouseClicked(evt);
            }
        });
        getContentPane().add(Mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 4, 16, 17));

        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 4, 16, 17));

        DragFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragFrameMouseDragged(evt);
            }
        });
        DragFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragFrameMousePressed(evt);
            }
        });
        getContentPane().add(DragFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        Username.setBackground(new java.awt.Color(111, 13, 17));
        Username.setForeground(new java.awt.Color(250, 250, 250));
        Username.setText("Username");
        Username.setBorder(null);
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 152, 250, 20));

        jPasswordField1.setBackground(new java.awt.Color(111, 13, 17));
        jPasswordField1.setForeground(new java.awt.Color(250, 250, 250));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 200, 250, 20));

        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 234, 40, 20));

        Achtergrond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginScherm2.png"))); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Achtergrond, org.jdesktop.beansbinding.ELProperty.create("${background}"), Achtergrond, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        getContentPane().add(Achtergrond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void MiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MiniMouseClicked
        this.setState(Main.ICONIFIED);
    }//GEN-LAST:event_MiniMouseClicked

    private void DragFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_DragFrameMousePressed

    private void DragFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_DragFrameMouseDragged

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked

        // TODO add your handling code here:
        
    }//GEN-LAST:event_LoginMouseClicked
                                      
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Achtergrond;
    private javax.swing.JLabel DragFrame;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Mini;
    private javax.swing.JTextField Username;
    private javax.swing.JPasswordField jPasswordField1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
