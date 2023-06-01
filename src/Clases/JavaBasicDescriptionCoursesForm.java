package Clases;

import javax.swing.*;

public class JavaBasicDescriptionCoursesForm extends javax.swing.JFrame {
    
    public JavaBasicDescriptionCoursesForm() {
        initComponents();
        int screenwidth = this.getWidth();
        int screenheight = this.getHeight();
        int formwidth = (int) (screenwidth*1);
        int formheight = (int) (screenheight *1);
        this.setLocationRelativeTo(this);
        this.setSize(formwidth, formheight);
        //Button buy, start
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        //Button buy, end
        //Button back start
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        //Button back, end
        //Account, start
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        //Account, end
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
    //Button buy, start
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {
    String clientName = JOptionPane.showInputDialog(this, "Client Name:");
    String course = "Java Basic";
    String professor = "Dennis del Castillo";
    double price = 50.0;
    String purchaseOrderNumber = "ABC123";

    String ticket = "Ticket de compra:\n"
            + "Client Name: " + clientName + "\n"
            + "Course: " + course + "\n"
            + "Professor: " + professor + "\n"
            + "Price: $" + price + "\n"
            + "Purchase Order Number: " + purchaseOrderNumber;

    JOptionPane.showMessageDialog(this, ticket);
    }
    //Button buy, end
    //Button back, start
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
    JOptionPane.showMessageDialog(this, "¡Regresa a la anterior ventana!");
    }
    //Button back, end
    //Account, start
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
    JOptionPane.showMessageDialog(this, "¡Vamos a la ventana Account!");
    }
    //Account, end
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 790));
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
        jLabel1.setText("Courses");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LoginLogo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 50));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addGap(363, 363, 363)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(1440, 636));
        jPanel2.setMinimumSize(new java.awt.Dimension(1440, 636));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1440, 636));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 53, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Unleash your creative genius with our JavaScript Essentials course guided by \nProfessor Jack Lee. With over 10 years of industry experience and a Ph.D. in \nComputer Science, Professor Lee will immerse you in captivating challenges and \npractical projects, mastering variables, functions, DOM manipulation, and more.\n \nBenefit from his expertise in developing cutting-edge web applications, stay ahead \nwith the latest trends, and receive constant support from Professor Lee and a \nvibrant learning community. Level up your web development skills and unlock a \nfuture of limitless opportunities. Join now!");
        jTextArea1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextArea1CaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 938, 310));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("                Key themes for the course:\n1. Explore the world of web development.\n2. Master Java, the language behind the internet.\n3. Build interactive and dynamic web applications.\n4. Create stunning user interfaces.\n5. Enhance user experiences through Java.");
        jScrollPane3.setViewportView(jTextArea3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 374, 753, 158));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonBuy.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 401, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonBackToCourses.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 547, -1, -1));

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel9.setText("$50 USD");
        jLabel9.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel9.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel9.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 585, 87, 41));

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel10.setText("Professor: Dennis del Castillo");
        jLabel10.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel10.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel10.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 437, -1));

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel11.setText("Duration: 24 hours");
        jLabel11.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel11.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel11.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 547, -1, -1));

        jLabel12.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel12.setText("Java From Basic to intermediate");
        jLabel12.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel12.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel12.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 6, 542, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yellow.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel6.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel6.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextArea1CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1CaretUpdate
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaBasicDescriptionCoursesForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}