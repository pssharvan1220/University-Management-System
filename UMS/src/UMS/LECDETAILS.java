/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMS;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sharvan
 */
public class LECDETAILS extends javax.swing.JFrame {

    /**
     * Creates new form LECDETAILS
     */
    public LECDETAILS() {
        initComponents();
    }
    
    public LECDETAILS(String u, String p)
    {
        initComponents();
        tname.setBackground(new java.awt.Color(0,0,0,1));
        tage.setBackground(new java.awt.Color(0,0,0,1));
        tlecid.setBackground(new java.awt.Color(0,0,0,1));
        tcontactno.setBackground(new java.awt.Color(0,0,0,1));
        temail.setBackground(new java.awt.Color(0,0,0,1));
        tsex.setBackground(new java.awt.Color(0,0,0,1));
        sub1.setBackground(new java.awt.Color(0,0,0,1));
        sub2.setBackground(new java.awt.Color(0,0,0,1));
        sub3.setBackground(new java.awt.Color(0,0,0,1));
        sub4.setBackground(new java.awt.Color(0,0,0,1));
        sub5.setBackground(new java.awt.Color(0,0,0,1));
        sub6.setBackground(new java.awt.Color(0,0,0,1));
        sub7.setBackground(new java.awt.Color(0,0,0,1));
        sub8.setBackground(new java.awt.Color(0,0,0,1));
        
        
        String[] Course=new String[8];
        int count=0;
        DBConnection DBC = new DBConnection();
        try{
            Statement stmt=DBC.getConnection().createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM Lecturer AS L,CModule AS C WHERE L.Lec_ID=C.Lec_ID AND L.Lec_ID='"+u+"' AND L.Password='"+p+"'");
            
            while(rs.next())
            {
                tlecid.setText(rs.getString(1));
                tname.setText(rs.getString(2));
                tage.setText(rs.getString(3));
                tsex.setText(rs.getString(4));
                tcontactno.setText(rs.getString(5));
                temail.setText(rs.getString(6));
                Course[count]=rs.getString("Course");
                count++;
                
            }
            
            sub1.setText(Course[0]);
            sub2.setText(Course[1]);
            sub3.setText(Course[2]);
            sub4.setText(Course[3]);
            sub5.setText(Course[4]);
            sub6.setText(Course[5]);
            sub7.setText(Course[6]);
            sub8.setText(Course[7]);

        }catch(Exception e){ System.out.println(e);}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        sub8 = new javax.swing.JTextField();
        sub7 = new javax.swing.JTextField();
        sub6 = new javax.swing.JTextField();
        sub5 = new javax.swing.JTextField();
        sub4 = new javax.swing.JTextField();
        sub3 = new javax.swing.JTextField();
        sub2 = new javax.swing.JTextField();
        sub1 = new javax.swing.JTextField();
        course = new javax.swing.JLabel();
        temail = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        tsex = new javax.swing.JTextField();
        sex = new javax.swing.JLabel();
        tcontactno = new javax.swing.JTextField();
        contactno = new javax.swing.JLabel();
        tage = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        tlecid = new javax.swing.JTextField();
        lecid = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 230));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 204, 255));
        exit.setText("exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(720, 606, 69, 27);

        sub8.setEditable(false);
        sub8.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub8.setForeground(new java.awt.Color(0, 204, 255));
        sub8.setBorder(null);
        jPanel1.add(sub8);
        sub8.setBounds(380, 570, 440, 20);

        sub7.setEditable(false);
        sub7.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub7.setForeground(new java.awt.Color(0, 204, 255));
        sub7.setBorder(null);
        jPanel1.add(sub7);
        sub7.setBounds(380, 550, 440, 20);

        sub6.setEditable(false);
        sub6.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub6.setForeground(new java.awt.Color(0, 204, 255));
        sub6.setBorder(null);
        jPanel1.add(sub6);
        sub6.setBounds(380, 530, 440, 20);

        sub5.setEditable(false);
        sub5.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub5.setForeground(new java.awt.Color(0, 204, 255));
        sub5.setBorder(null);
        jPanel1.add(sub5);
        sub5.setBounds(380, 510, 440, 20);

        sub4.setEditable(false);
        sub4.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub4.setForeground(new java.awt.Color(0, 204, 255));
        sub4.setBorder(null);
        jPanel1.add(sub4);
        sub4.setBounds(380, 490, 440, 20);

        sub3.setEditable(false);
        sub3.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub3.setForeground(new java.awt.Color(0, 204, 255));
        sub3.setBorder(null);
        jPanel1.add(sub3);
        sub3.setBounds(380, 470, 440, 20);

        sub2.setEditable(false);
        sub2.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub2.setForeground(new java.awt.Color(0, 204, 255));
        sub2.setBorder(null);
        jPanel1.add(sub2);
        sub2.setBounds(380, 450, 440, 20);

        sub1.setEditable(false);
        sub1.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        sub1.setForeground(new java.awt.Color(0, 204, 255));
        sub1.setBorder(null);
        jPanel1.add(sub1);
        sub1.setBounds(380, 430, 440, 20);

        course.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        course.setForeground(new java.awt.Color(255, 0, 0));
        course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        course.setText("-------- conducting course modules --------");
        jPanel1.add(course);
        course.setBounds(380, 390, 440, 23);

        temail.setEditable(false);
        temail.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        temail.setForeground(new java.awt.Color(0, 204, 255));
        temail.setBorder(null);
        jPanel1.add(temail);
        temail.setBounds(510, 340, 310, 15);

        email.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 204, 255));
        email.setText("e-mail                  :");
        jPanel1.add(email);
        email.setBounds(380, 340, 120, 20);

        tsex.setEditable(false);
        tsex.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        tsex.setForeground(new java.awt.Color(0, 204, 255));
        tsex.setBorder(null);
        jPanel1.add(tsex);
        tsex.setBounds(510, 311, 310, 15);

        sex.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        sex.setForeground(new java.awt.Color(0, 204, 255));
        sex.setText("sex                           :");
        jPanel1.add(sex);
        sex.setBounds(380, 310, 120, 20);

        tcontactno.setEditable(false);
        tcontactno.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        tcontactno.setForeground(new java.awt.Color(0, 204, 255));
        tcontactno.setBorder(null);
        jPanel1.add(tcontactno);
        tcontactno.setBounds(510, 280, 310, 15);

        contactno.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        contactno.setForeground(new java.awt.Color(0, 204, 255));
        contactno.setText("contact no      :");
        jPanel1.add(contactno);
        contactno.setBounds(380, 280, 120, 20);

        tage.setEditable(false);
        tage.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        tage.setForeground(new java.awt.Color(0, 204, 255));
        tage.setBorder(null);
        jPanel1.add(tage);
        tage.setBounds(510, 250, 310, 15);

        age.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(0, 204, 255));
        age.setText("age                           :");
        jPanel1.add(age);
        age.setBounds(380, 250, 120, 20);

        tlecid.setEditable(false);
        tlecid.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        tlecid.setForeground(new java.awt.Color(0, 204, 255));
        tlecid.setBorder(null);
        jPanel1.add(tlecid);
        tlecid.setBounds(510, 220, 310, 15);

        lecid.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        lecid.setForeground(new java.awt.Color(0, 204, 255));
        lecid.setText("lecturer id    :");
        jPanel1.add(lecid);
        lecid.setBounds(380, 220, 120, 20);

        tname.setEditable(false);
        tname.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        tname.setForeground(new java.awt.Color(0, 204, 255));
        tname.setBorder(null);
        jPanel1.add(tname);
        tname.setBounds(510, 190, 310, 15);

        name.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 204, 255));
        name.setText("name                      :");
        jPanel1.add(name);
        name.setBounds(380, 190, 120, 20);

        head.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        head.setForeground(new java.awt.Color(255, 0, 0));
        head.setText("Lecturer details");
        jPanel1.add(head);
        head.setBounds(380, 120, 380, 40);

        bg.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\sharvan\\Pictures\\UOKbgr.jpg")); // NOI18N
        jPanel1.add(bg);
        bg.setBounds(0, 0, 830, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(LECDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LECDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LECDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LECDETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LECDETAILS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel contactno;
    private javax.swing.JLabel course;
    private javax.swing.JLabel email;
    private javax.swing.JButton exit;
    private javax.swing.JLabel head;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lecid;
    private javax.swing.JLabel name;
    private javax.swing.JLabel sex;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    private javax.swing.JTextField sub3;
    private javax.swing.JTextField sub4;
    private javax.swing.JTextField sub5;
    private javax.swing.JTextField sub6;
    private javax.swing.JTextField sub7;
    private javax.swing.JTextField sub8;
    private javax.swing.JTextField tage;
    private javax.swing.JTextField tcontactno;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tlecid;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tsex;
    // End of variables declaration//GEN-END:variables
}