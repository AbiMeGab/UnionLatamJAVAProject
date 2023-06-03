package Clases;
import javax.swing.JOptionPane;//Para hacer un label como Button

public class JSDescriptionCoursesForm extends javax.swing.JFrame {
    
    private CoursesForm coursesForm;
    
    public void setCoursesForm(CoursesForm coursesForm) {
        this.coursesForm = coursesForm;
    }

    public JSDescriptionCoursesForm() {
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
    String course = "JavaScript Essentials";
    String duration = "12 hours";
    String professor = "Jack Lee";
    double price = 12.0;
    String purchaseOrderNumber = "ABC123";

    String ticket = "Ticket de compra:\n"
            + "Client Name: " + clientName + "\n"
            + "Course: " + course + "\n"
            + "Duration: " + duration + "\n"
            + "Professor: " + professor + "\n"
            + "Price: $" + price + "\n"
            + "Purchase Order Number: " + purchaseOrderNumber;

    JOptionPane.showMessageDialog(this, ticket);
    }
    //Button buy, end

    /**
     * @Method button back to Courses form
     * @param evt 
     */
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
        this.coursesForm.setVisible(true);
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
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JS.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 53, -1, -1));

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel12.setText("<html>Key themes for the course:<html>"
        );
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 350, 40));

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel9.setText("<html>1. Explore the world of web development.<p>2. Master JavaScript, the language behind the internet.<p>3. Build interactive and dynamic web applications.<p>4. Create stunning user interfaces.<p>5. Enhance user experiences through JavaScript.<html>"
        );
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 640, 110));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel4.setText("<html>Unleash your creative genius with our JavaScript Essentials course guided by <p> Professor Jack Lee. With over 10 years of industry experience and a Ph.D. in<p> Computer Science, Professor Lee will immerse you in captivating challenges and<p> practical projects, mastering variables, functions, DOM manipulation, and more.<p><p> Benefit from his expertise in developing cutting-edge web applications, stay ahead<p> with the latest trends, and receive constant support from Professor Lee and a<p> vibrant learning community. Level up your web development skills and unlock a<p> future of limitless opportunities. Join now!<html>"
        );
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 930, 180));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonBuy.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1028, 401, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ButtonBackToCourses.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 547, -1, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 3, 24)); // NOI18N
        jLabel6.setText("JavaScript Essential");
        jLabel6.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel6.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel6.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 6, 300, -1));

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel10.setText("Professor: Jack Lee");
        jLabel10.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel10.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel10.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 547, -1, -1));

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel11.setText("Duration: 12 hours");
        jLabel11.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel11.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel11.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 547, -1, -1));

        jLabel14.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel14.setText("$12 USD");
        jLabel14.setMaximumSize(new java.awt.Dimension(287, 32));
        jLabel14.setMinimumSize(new java.awt.Dimension(287, 32));
        jLabel14.setPreferredSize(new java.awt.Dimension(287, 32));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 585, 87, 41));

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
                new JSDescriptionCoursesForm().setVisible(true);
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