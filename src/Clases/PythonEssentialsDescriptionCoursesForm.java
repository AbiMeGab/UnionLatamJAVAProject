package Clases;
import javax.swing.JOptionPane;//Para hacer un label como Button

public class PythonEssentialsDescriptionCoursesForm extends javax.swing.JFrame {

    
    final private String  courseId = "PY";
    private AppGlobalState appGlobalState;
    private AppGlobalViews appGlobalViews;
    
    
    public PythonEssentialsDescriptionCoursesForm() {
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

    public PythonEssentialsDescriptionCoursesForm(AppGlobalViews appGlobalViews ,AppGlobalState appGlobalState) {
        this.appGlobalState = appGlobalState;
        this.appGlobalViews = appGlobalViews;
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
        if(appGlobalState.isUserLoggedIn()){
            PaymentForm paymentForm = new PaymentForm(appGlobalViews,appGlobalState, "Python Essential",courseId,"10USD","Brian Higgins");
            paymentForm.setVisible(true);
            this.setVisible(false);
       }
    }
    //Button buy, end

    /**
     * @Method Button back to Courses form
     * @param evt
     */
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
        this.appGlobalViews.getCoursesForm().setVisible(true);
        this.setVisible(false);
    }
    //Account, start
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
    JOptionPane.showMessageDialog(this, "¡Vamos a la ventana Account!");
    }
    //Account, end
    //UnionLatam, start
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {
    JOptionPane.showMessageDialog(this, "¡Vamos a la ventana de cursos!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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

        jLabel14.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel14.setText("<html>1. Dive into the world of Python programming.<p>2. Master the fundamentals of Python syntax and data structures.<p>3. Harness the power of Python libraries for data manipulation and analysis.<p>4. Build versatile applications using Python frameworks.<p>5. Gain insights into machine learning and data visualization with Python.<html>"
        );
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 890, 110));

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel13.setText("<html>Key themes for the course:<html>"
        );
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 350, 40));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel4.setText("<html>Embark on a transformative journey with our Python Essentials course. Explore the power of Python as you delve into the fundamentals of programming, data manipulation, and algorithmic thinking. Master key concepts through engaging projects and practical exercises, and gain the skills to develop versatile applications. Ignite your passion for coding and unlock endless possibilities with Python. Enroll now and pave the way to a dynamic future!<P><P> Introducing Professor Brian Higgins, a renowned expert in Python programming. With a Ph.D. in Computer Science and a remarkable track record, learn from his invaluable expertise in Python Essentials.<html>"
        );
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 930, 210));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Python.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 53, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonBuy.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 401, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonBackToCourses.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 547, -1, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel6.setText("Python Essential");
        jLabel6.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel6.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel6.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 6, 300, -1));

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel10.setText("Professor: Brian Higgins");
        jLabel10.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel10.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel10.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 547, 372, -1));

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel11.setText("Duration: 12 hours");
        jLabel11.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel11.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel11.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 547, -1, -1));

        jLabel12.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel12.setText("$10 USD");
        jLabel12.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel12.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel12.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 585, 87, 41));

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Yellow.png"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel9.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel9.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 650));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PythonEssentialsDescriptionCoursesForm().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}