/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMS;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author sharvan
 */
public class Studetail extends javax.swing.JFrame {

    /**
     * Creates new form Studetail
     */
    public Studetail() {
        initComponents();
        
    }
    
    public Studetail(String u, String p)
    {
        initComponents();
        tname.setBackground(new java.awt.Color(0,0,0,1));
        tage.setBackground(new java.awt.Color(0,0,0,1));
        tstno.setBackground(new java.awt.Color(0,0,0,1));
        tcontactno.setBackground(new java.awt.Color(0,0,0,1));
        temail.setBackground(new java.awt.Color(0,0,0,1));
        tsex.setBackground(new java.awt.Color(0,0,0,1));
        sub1.setBackground(new java.awt.Color(0,0,0,1));
        sub2.setBackground(new java.awt.Color(0,0,0,1));
        sub3.setBackground(new java.awt.Color(0,0,0,1));
        sub4.setBackground(new java.awt.Color(0,0,0,1));
        exit.setBackground(new java.awt.Color(0,0,0,1));
        
        String[] Course=new String[4];
        int count=0;
        DBConnection DBC = new DBConnection();
        try{
            Statement stmt=DBC.getConnection().createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM Student AS S,Subject AS C WHERE S.Stu_no=C.Stu_no AND S.Stu_no='"+u+"' AND S.Password='"+p+"'");
            
            while(rs.next())
            {
                tstno.setText(rs.getString(1));
                tname.setText(rs.getString(2));
                tage.setText(rs.getString(3));
                tsex.setText(rs.getString(4));
                tcontactno.setText(rs.getString(5));
                temail.setText(rs.getString(6));
                Course[count]=rs.getString("Subject");
                count++;
                
            }
            
            sub1.setText(Course[0]);
            sub2.setText(Course[1]);
            sub3.setText(Course[2]);
            sub4.setText(Course[3]);

        }catch(Exception e){ System.out.println(e);
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

        jPanel4 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        exit = new javax.swing.JButton();
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
        tstno = new javax.swing.JTextField();
        stno = new javax.swing.JLabel();
        tage = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 230));
        setUndecorated(true);
        setResizable(false);

        jPanel4.setLayout(null);

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Bungee Inline", 0, 20)); // NOI18N
        add.setForeground(new java.awt.Color(0, 186, 255));
        add.setText("add courses");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel4.add(add);
        add.setBounds(490, 600, 200, 30);

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Bungee Inline", 0, 20)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 186, 255));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel4.add(exit);
        exit.setBounds(710, 600, 90, 30);

        sub4.setEditable(false);
        sub4.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        sub4.setForeground(new java.awt.Color(0, 186, 255));
        sub4.setBorder(null);
        sub4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub4ActionPerformed(evt);
            }
        });
        jPanel4.add(sub4);
        sub4.setBounds(370, 520, 450, 30);

        sub3.setEditable(false);
        sub3.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        sub3.setForeground(new java.awt.Color(0, 186, 255));
        sub3.setBorder(null);
        sub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub3ActionPerformed(evt);
            }
        });
        jPanel4.add(sub3);
        sub3.setBounds(370, 490, 450, 30);

        sub2.setEditable(false);
        sub2.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        sub2.setForeground(new java.awt.Color(0, 186, 255));
        sub2.setBorder(null);
        sub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub2ActionPerformed(evt);
            }
        });
        jPanel4.add(sub2);
        sub2.setBounds(370, 460, 450, 30);

        sub1.setEditable(false);
        sub1.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        sub1.setForeground(new java.awt.Color(0, 186, 255));
        sub1.setBorder(null);
        sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1ActionPerformed(evt);
            }
        });
        jPanel4.add(sub1);
        sub1.setBounds(370, 430, 450, 30);

        course.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        course.setForeground(new java.awt.Color(255, 0, 51));
        course.setText("------------- SELECTED COURSES --------------");
        jPanel4.add(course);
        course.setBounds(370, 400, 420, 23);

        temail.setEditable(false);
        temail.setFont(new java.awt.Font("Bungee Inline", 0, 12)); // NOI18N
        temail.setForeground(new java.awt.Color(0, 186, 255));
        temail.setBorder(null);
        temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temailActionPerformed(evt);
            }
        });
        jPanel4.add(temail);
        temail.setBounds(510, 358, 310, 30);

        email.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 186, 255));
        email.setText("EMAIL              :");
        jPanel4.add(email);
        email.setBounds(370, 360, 130, 23);

        tsex.setEditable(false);
        tsex.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        tsex.setForeground(new java.awt.Color(0, 186, 255));
        tsex.setBorder(null);
        tsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsexActionPerformed(evt);
            }
        });
        jPanel4.add(tsex);
        tsex.setBounds(510, 328, 310, 30);

        sex.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        sex.setForeground(new java.awt.Color(0, 186, 255));
        sex.setText("Sex                     :");
        jPanel4.add(sex);
        sex.setBounds(370, 330, 130, 23);

        tcontactno.setEditable(false);
        tcontactno.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        tcontactno.setForeground(new java.awt.Color(0, 186, 255));
        tcontactno.setBorder(null);
        tcontactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcontactnoActionPerformed(evt);
            }
        });
        jPanel4.add(tcontactno);
        tcontactno.setBounds(510, 298, 310, 30);

        contactno.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        contactno.setForeground(new java.awt.Color(0, 186, 255));
        contactno.setText("CONTACT NO :");
        jPanel4.add(contactno);
        contactno.setBounds(370, 300, 130, 23);

        tstno.setEditable(false);
        tstno.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        tstno.setForeground(new java.awt.Color(0, 186, 255));
        tstno.setBorder(null);
        tstno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tstnoActionPerformed(evt);
            }
        });
        jPanel4.add(tstno);
        tstno.setBounds(510, 268, 310, 30);

        stno.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        stno.setForeground(new java.awt.Color(0, 186, 255));
        stno.setText("STUDENT NO :");
        jPanel4.add(stno);
        stno.setBounds(370, 270, 130, 23);

        tage.setEditable(false);
        tage.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        tage.setForeground(new java.awt.Color(0, 186, 255));
        tage.setBorder(null);
        tage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tageActionPerformed(evt);
            }
        });
        jPanel4.add(tage);
        tage.setBounds(510, 238, 310, 30);

        age.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        age.setForeground(new java.awt.Color(0, 186, 255));
        age.setText("AGE                     :");
        jPanel4.add(age);
        age.setBounds(370, 240, 130, 23);

        tname.setEditable(false);
        tname.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        tname.setForeground(new java.awt.Color(0, 186, 255));
        tname.setBorder(null);
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        jPanel4.add(tname);
        tname.setBounds(510, 208, 310, 30);

        name.setFont(new java.awt.Font("Bungee Inline", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 186, 255));
        name.setText("NAME                 :");
        jPanel4.add(name);
        name.setBounds(370, 210, 130, 23);

        jLabel1.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("STUDENT DETAILS");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(370, 130, 370, 40);

        jLabel3.setFont(new java.awt.Font("Bungee Inline", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contact the admin if any detals are incorrect !");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 186, 255), 3));
        jPanel4.add(jLabel3);
        jLabel3.setBounds(400, 560, 420, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sharvan\\Pictures\\UOKbgr.jpg")); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsexActionPerformed

    private void tageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tageActionPerformed

    private void tstnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tstnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tstnoActionPerformed

    private void tcontactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcontactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcontactnoActionPerformed

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void temailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_temailActionPerformed

    private void sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub1ActionPerformed

    private void sub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub2ActionPerformed

    private void sub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub3ActionPerformed

    private void sub4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub4ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        ADDCOURSE AC =new ADDCOURSE();
        AC.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel age;
    private javax.swing.JLabel contactno;
    private javax.swing.JLabel course;
    private javax.swing.JLabel email;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel sex;
    private javax.swing.JLabel stno;
    private javax.swing.JTextField sub1;
    private javax.swing.JTextField sub2;
    private javax.swing.JTextField sub3;
    private javax.swing.JTextField sub4;
    private javax.swing.JTextField tage;
    private javax.swing.JTextField tcontactno;
    private javax.swing.JTextField temail;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tsex;
    private javax.swing.JTextField tstno;
    // End of variables declaration//GEN-END:variables
}