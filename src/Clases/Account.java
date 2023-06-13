package Clases;
import javax.swing.JOptionPane;//Para hacer un label como Button

public class Account extends javax.swing.JFrame {
    
    private CoursesForm coursesForm;
    
    public void setCoursesForm(CoursesForm coursesForm) {
        this.coursesForm = coursesForm;
    }

    public Account() {
        initComponents();
        int screenwidth = this.getWidth();
        int screenheight = this.getHeight();
        int formwidth = (int) (screenwidth*1);
        int formheight = (int) (screenheight *1);
        this.setLocationRelativeTo(this);
        this.setSize(formwidth, formheight);
        //Button Logout, start
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        //Button Logout, end
        //Button back start
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        //Button back, end
 
        //UnionLatam, start
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        //UnionLatam, end  
    }
    //Button Logout, start
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
    JOptionPane.showMessageDialog(this, "Cerrando sesión");
    }
    //Button Logout, end

    /**
     * @Method button back to Courses form
     * @param evt 
     */
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
        this.coursesForm.setVisible(true);
        this.setVisible(false);
    }
    //UnionLatam, start
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {
    JOptionPane.showMessageDialog(this, "¡Vamos a la ventana de cursos!");
    }
    //UnionLatam, end
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 790));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));
        jPanel1.setMaximumSize(new java.awt.Dimension(1440, 140));
        jPanel1.setMinimumSize(new java.awt.Dimension(1440, 140));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 140));

        jLabel8.setBackground(new java.awt.Color(26, 26, 26));
        jLabel8.setFont(new java.awt.Font("Courier New", 1, 110)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoHeader.png"))); // NOI18N
        jLabel8.setText("    ");
        jLabel8.setMaximumSize(new java.awt.Dimension(1024, 140));
        jLabel8.setMinimumSize(new java.awt.Dimension(1024, 140));
        jLabel8.setPreferredSize(new java.awt.Dimension(1024, 140));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 110)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addGap(468, 468, 468))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0))
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(1440, 636));
        jPanel2.setMinimumSize(new java.awt.Dimension(1440, 636));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1440, 636));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel15.setText("Jane doe");
        jLabel15.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel15.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel15.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 90, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profile picture.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel19.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel19.setText("5849656521");
        jLabel19.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel19.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel19.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 90, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonLogOut.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonBackToCourses.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 560, -1, -1));

        jLabel20.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel20.setText("2187712821");
        jLabel20.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel20.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel20.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 120, -1));

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel12.setText("#  Course Name");
        jLabel12.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel12.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel12.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 280, -1));

        jLabel21.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel21.setText("1 JavaScript Essentials");
        jLabel21.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel21.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel21.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 270, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 3, 36)); // NOI18N
        jLabel6.setText("ACCOUNT STATUS");
        jLabel6.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel6.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel6.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 6, 320, -1));

        jLabel18.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel18.setText("jan21@gmail.com");
        jLabel18.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel18.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel18.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 140, 20));

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel10.setText("Purchase record");
        jLabel10.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel10.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel10.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 230, -1));

        jLabel16.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel16.setText("Phone Number:");
        jLabel16.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel16.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel16.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 130, 20));

        jLabel17.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel17.setText("Email:");
        jLabel17.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel17.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel17.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, 20));

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel11.setText("Purchase Order Number");
        jLabel11.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel11.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel11.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 320, -1));

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel14.setText("Full name:");
        jLabel14.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel14.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel14.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 130, 20));

        jLabel13.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yellow.png"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel13.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel13.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}