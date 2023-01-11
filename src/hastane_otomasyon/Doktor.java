/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastane_otomasyon;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import org.apache.commons.dbutils.DbUtils;
import sun.security.pkcs11.Secmod;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author gokan
 */
public class Doktor extends javax.swing.JFrame {

    /**
     * Creates new form Doktor
     */
    public Doktor() {
        initComponents();
        Selectional();
    }

    Connection Con =null;
    Statement St =null;
    ResultSet Rs=null;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DoktorId = new javax.swing.JTextField();
        DoktorAdı = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DoktorŞifresi = new javax.swing.JTextField();
        DoktorDeneyimi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eklebtn = new javax.swing.JButton();
        guncellebtn = new javax.swing.JButton();
        silbtn = new javax.swing.JButton();
        temizlebtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoktorTablosu = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 48)); // NOI18N
        jLabel1.setText("HASTANE OTOMASYONU");

        jLabel2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        jLabel2.setText("DOKTOR İŞLEMLERİ");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel3.setText("AD");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        DoktorId.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        DoktorAdı.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel6.setText("ŞİFRE");

        DoktorŞifresi.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        DoktorDeneyimi.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel4.setText("DENEYİM");

        jLabel7.setBackground(new java.awt.Color(153, 204, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        jLabel7.setText("DOKTOR LİSTESİ");

        eklebtn.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        eklebtn.setText("EKLE");
        eklebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eklebtnMouseClicked(evt);
            }
        });
        eklebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eklebtnActionPerformed(evt);
            }
        });

        guncellebtn.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        guncellebtn.setText("GÜNCELLE");
        guncellebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guncellebtnMouseClicked(evt);
            }
        });

        silbtn.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        silbtn.setText("SİL");
        silbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                silbtnMouseClicked(evt);
            }
        });

        temizlebtn.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        temizlebtn.setText("TEMİZLE");
        temizlebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temizlebtnMouseClicked(evt);
            }
        });

        DoktorTablosu.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 11)); // NOI18N
        DoktorTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DOKTORID", "DOKTORADI", "ŞİFRE", "DENEYİM"
            }
        ));
        DoktorTablosu.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DoktorTablosu.setRowHeight(32);
        DoktorTablosu.setSelectionBackground(new java.awt.Color(0, 0, 0));
        DoktorTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoktorTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DoktorTablosu);

        jButton5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 11)); // NOI18N
        jButton5.setText("ANA MENÜ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DoktorAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DoktorId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(4, 4, 4)
                        .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(temizlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DoktorDeneyimi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DoktorŞifresi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(107, 107, 107)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(DoktorId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(DoktorAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DoktorŞifresi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(DoktorDeneyimi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eklebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temizlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void Selectional()
{
    
    try
    {
    Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
    St=Con.createStatement();
    Rs=St.executeQuery("select * from DOKTORLAR");
    DoktorTablosu.setModel(DbUtils.resultSetToTableModel(Rs));
    
    }
    catch(Exception e)
            {
            e.printStackTrace();
            }




}
    private void eklebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eklebtnMouseClicked
        try
        
        {
            
        Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
        PreparedStatement Ekle =Con.prepareStatement("insert into DOKTORLAR values(?,?,?,?)");
        Ekle.setInt(1,Integer.valueOf(DoktorId.getText()));
        Ekle.setString(2,DoktorAdı.getText());
        Ekle.setInt(3,Integer.valueOf(DoktorDeneyimi.getText()));
        Ekle.setString(4,DoktorŞifresi.getText());
        int row =Ekle.executeUpdate();
        JOptionPane.showMessageDialog(this, "Doktor başarı ile eklendi");
        Con.close();
        Selectional();
        
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_eklebtnMouseClicked

    private void temizlebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temizlebtnMouseClicked
       DoktorId.setText("");
       DoktorAdı.setText("");
       DoktorŞifresi.setText("");
       DoktorDeneyimi.setText("");
    }//GEN-LAST:event_temizlebtnMouseClicked

    private void DoktorTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoktorTablosuMouseClicked
        DefaultTableModel model =(DefaultTableModel)DoktorTablosu.getModel();
        int indexno=DoktorTablosu.getSelectedRow();
        DoktorId.setText(model.getValueAt(indexno,0).toString());
        DoktorAdı.setText(model.getValueAt(indexno,1).toString());
        DoktorŞifresi.setText(model.getValueAt(indexno,2).toString());
        DoktorDeneyimi.setText(model.getValueAt(indexno,3).toString());
    }//GEN-LAST:event_DoktorTablosuMouseClicked

    private void silbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_silbtnMouseClicked
        if(DoktorId.getText().isEmpty())
        {
        
            JOptionPane.showMessageDialog(this, "Silinecek Doktor ıd giriniz");
        }
        else
        {
        try{
        Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
        String Id=DoktorId.getText();
        String Query="Delete from DOKTORLAR where DOKTORID="+Id;
        Statement Ekle=Con.createStatement();
        Ekle.executeUpdate(Query);
        Selectional();
        JOptionPane.showMessageDialog(this, "Doktor başarı ile silindi");
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
        
        }
    }//GEN-LAST:event_silbtnMouseClicked

    private void guncellebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guncellebtnMouseClicked
        if(DoktorId.getText().isEmpty() || DoktorAdı.getText().isEmpty() || DoktorŞifresi.getText().isEmpty() || DoktorDeneyimi.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Değiştirelecek değer bulunamadı");
        
        }
        else
        {
        
            try
            {
                Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
                String Query="Update DOKTORLAR set DOKTORADI='"+DoktorAdı.getText()+"'"+",DOKTORDENEYIMI="+DoktorDeneyimi.getText()+""+",DOKTORŞIFRE='"+DoktorŞifresi.getText()+"'"+"where DOKTORID="+DoktorId.getText();
                Statement Ekle=Con.createStatement();
                Ekle.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Doktor bilgileri başarıyla güncellendi");
            Selectional();
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_guncellebtnMouseClicked

    private void eklebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eklebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eklebtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new AnaForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doktor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doktor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DoktorAdı;
    private javax.swing.JTextField DoktorDeneyimi;
    private javax.swing.JTextField DoktorId;
    private javax.swing.JTable DoktorTablosu;
    private javax.swing.JTextField DoktorŞifresi;
    private javax.swing.JButton eklebtn;
    private javax.swing.JButton guncellebtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton silbtn;
    private javax.swing.JButton temizlebtn;
    // End of variables declaration//GEN-END:variables
}
