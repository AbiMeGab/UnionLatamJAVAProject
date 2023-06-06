/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

import java.awt.Color;
import java.util.Arrays;

import Clases.Registration;
import Clases.User;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HP VICTUS
 */
public class LoginForm extends javax.swing.JFrame {
    
    
    private Registration UseRecord;
    private RegistrationForm registrationFormView;
    private UserStorage userStorage;
    private CoursesForm coursesForm;
    private AppGlobalState appGlobalState;


    public void setRegistrationFormView(RegistrationForm registrationFormView) {
        this.registrationFormView = registrationFormView;
    }
    
    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }
    
    public void setCoursesForm(CoursesForm coursesForm) {
        this.coursesForm = coursesForm;
    }
    
    public void setAppGlobalState(AppGlobalState appGlobalState) {
        this.appGlobalState = appGlobalState;
    }

    /**
     * Creates new form form
     * 
     *
     */
 
    
   // RegistrationForm formulario = new RegistrationForm();
    
    public LoginForm() {
      
    initComponents();
    int screenHeight = this.getHeight(); // Obtiene el alto de la pantalla
    int screenWidth = this.getWidth(); // Obtiene el ancho de la pantalla
    int formWidth = (int) (screenWidth * 0.82); // Calcula el ancho del formulario como el 80% del ancho de la pantalla
    int formHeight = (int) (screenHeight * 0.8); // Calcula el alto del formulario como el 60% del alto de la pantalla
    this.setSize(formWidth, formHeight); // Establece el tamaño del formulario
    this.setLocationRelativeTo(this); // Centra el formulario en la pantalla
    jLabel7.setForeground(Color.white);
    jLabel5.setForeground(Color.white);
  // UseRecord = new Registration();
   
}
    class jPanelGradient extends JPanel {
        protected void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth ();
            int height = getHeight ();
            
            /*Color color1 = new Color(210,220,23);    // 52,143,80
            Color color2 = new Color(180,165,50);   //86,180,211
            GradientPaint gp = new GradientPaint(0,0,color1,180,height,color2);      
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);*/
            

            Color color1 = new Color(255, 255, 100);   // Amarillo pálido
            Color color2 = new Color(250, 251, 231);   // Crema
            Color color3 = new Color(242, 243, 209);   // Amarillo claro
            Color color4 = new Color(212, 215, 97);    // Verde oliva
            Color color5 = new Color(221, 223, 115);   // Verde claro
            Color color6 = new Color(255, 255, 255);   // Blanco hueso
            GradientPaint gp = new GradientPaint(0,0,color6,180,height,color1);      
            g2d.setPaint(gp);
            g2d.fillRect(0,0,width,height);

           /* GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);

            gp = new GradientPaint(width / 2, 0, color3, width, height, color4);
            g2d.setPaint(gp);
            g2d.fillRect(width / 2, 0, width, height);

            gp = new GradientPaint(0, height, color4, width, height, color5);
            g2d.setPaint(gp);
            g2d.fillRect(0, height, width, height);

            gp = new GradientPaint(width / 2, height / 2, color5, width, height, color6);
            g2d.setPaint(gp);
            g2d.fillRect(width, height, width, height);*/
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel2();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        LogSign = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LogPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 80)); // NOI18N
        jLabel1.setText("Log in ");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        LogEmail.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("Sign up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LogSign.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        LogSign.setText("Sign in ");
        LogSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogSignActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 0, 90)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UnionLatam");

        jLabel5.setFont(new java.awt.Font("MS Gothic", 0, 36)); // NOI18N
        jLabel5.setText("e-Learnig");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(452, 452, 452)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LogEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(LogSign, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(LogPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogSign, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 265, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogSignActionPerformed
        
        String email = LogEmail.getText();
        String password = String.valueOf(LogPassword.getPassword());
        
//        UserModel userS.getUserByEmail()
        UserModel userFound = userStorage.getUserByEmail(email);
        
        if(userFound == null){
            JOptionPane.showMessageDialog(this, "Incorrect email or password");
            return;
        }
        
        if(!userFound.getPassword().equals(password)){
            JOptionPane.showMessageDialog(this, "Incorrect email or password");
            return;
        }
        
        JOptionPane.showMessageDialog(this,"User Logged in");
        
        this.coursesForm.setVisible(true);
        this.appGlobalState.setCurrentUser(userFound);
        this.setVisible(false);
        
//        CoursesForm Courses = new CoursesForm();
//        Courses.setVisible(true);
//        this.dispose();
        
        
//        int ind = User.verifyLogin(Email, Password);
//        
//        if (ind == -1 ){
//            JOptionPane.showMessageDialog(this, "Incorrect email or password");
//        }
//        else{
//            JOptionPane.showMessageDialog(this, "Iniciar session");
//            CoursesForm Courses = new CoursesForm();
//            Courses.setVisible(true);
//            this.dispose();
//        }
   
        
    }//GEN-LAST:event_LogSignActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        navigateToRegistrationForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Method to navigate to the registration form
     * 
     */
    private void navigateToRegistrationForm(){
        this.registrationFormView.setVisible(true);
        this.setVisible(false);
    }

    
    /*-----------------------clases-------------------------------*/
    
    static class FondoPanel2 extends JPanel
   {
        private Image imagen;
       
       @Override
       public void paint(Graphics g)
       {
           imagen = new ImageIcon(getClass().getResource("/Imagenes/Fondo3.png")).getImage();
           
           g.drawImage(imagen,0,0,getWidth(),getHeight(), this);
           
           setOpaque(false);
               
           
           super.paint(g);
       }
   }

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LogEmail;
    private javax.swing.JPasswordField LogPassword;
    private javax.swing.JButton LogSign;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
