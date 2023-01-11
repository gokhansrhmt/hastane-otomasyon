/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hastane_otomasyon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author gokan
 */
public class Hasta extends javax.swing.JFrame {

    /**
     * Creates new form Hasta
     */
    public Hasta() {
        initComponents();
        Selectional();
    }

    Connection Con =null;
    Statement St =null;
    ResultSet Rs=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HastaTablosu = new javax.swing.JTable();
        HastaId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        HastaAdı = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HastaAdresi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HastaTelNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        HastaYas = new javax.swing.JTextField();
        HastaCinsiyeti = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        HastaPat = new javax.swing.JTextField();
        HastaEkle = new javax.swing.JButton();
        HastaSil = new javax.swing.JButton();
        HastaGuncelle = new javax.swing.JButton();
        HastaTemizle = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        HastaKan = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        HastaTablosu.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 11)); // NOI18N
        HastaTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "HASTAADI", "ADRES", "TELNO", "YAŞ", "CİNSİYET", "KAN GRUBU", "PATOLOJİ"
            }
        ));
        HastaTablosu.setIntercellSpacing(new java.awt.Dimension(0, 0));
        HastaTablosu.setRowHeight(32);
        HastaTablosu.setSelectionBackground(new java.awt.Color(0, 0, 0));
        HastaTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HastaTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HastaTablosu);

        HastaId.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(153, 204, 255));
        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        jLabel7.setText("HASTA LİSTESİ");

        HastaAdı.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 48)); // NOI18N
        jLabel1.setText("HASTANE OTOMASYONU");

        jLabel2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        jLabel2.setText("HASTA İŞLEMLERİ");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel6.setText("ADRES");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel3.setText("AD");

        HastaAdresi.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel8.setText("TEL NO");

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel9.setText("CİNSİYET");

        HastaTelNo.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel10.setText("YAŞ");
        jLabel10.setToolTipText("");

        HastaYas.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        HastaCinsiyeti.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        HastaCinsiyeti.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kadın", "Erkek" }));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel11.setText("KAN GRUBU");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel12.setText("PATOLOJİ");

        HastaPat.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N

        HastaEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HastaEkle.setText("EKLE");
        HastaEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HastaEkleMouseClicked(evt);
            }
        });

        HastaSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HastaSil.setText("SİL");
        HastaSil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HastaSilMouseClicked(evt);
            }
        });

        HastaGuncelle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HastaGuncelle.setText("GÜNCELLE");
        HastaGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HastaGuncelleMouseClicked(evt);
            }
        });

        HastaTemizle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HastaTemizle.setText("TEMİZLE");
        HastaTemizle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HastaTemizleMouseClicked(evt);
            }
        });
        HastaTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HastaTemizleActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 11)); // NOI18N
        jButton5.setText("ANA MENÜ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        HastaKan.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        HastaKan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HastaAdresi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HastaAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(HastaId, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HastaCinsiyeti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HastaYas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HastaTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HastaKan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HastaPat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(428, 428, 428)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(HastaEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HastaGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(HastaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HastaTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(438, 438, 438)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(306, 306, 306)
                    .addComponent(jLabel2)
                    .addContainerGap(227, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(HastaTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(HastaKan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HastaYas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(HastaPat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HastaCinsiyeti, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(HastaId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(HastaAdı, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(HastaAdresi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HastaEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaTemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HastaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(635, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HastaTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HastaTemizleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HastaTemizleActionPerformed

    private void HastaTemizleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastaTemizleMouseClicked
        HastaId.setText("");
        HastaAdı.setText("");
        HastaAdresi.setText("");
        HastaYas.setText("");
        HastaTelNo.setText("");
        HastaPat.setText("");
        
    }//GEN-LAST:event_HastaTemizleMouseClicked
private void Selectional()
{
    
    try
    {
    Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
    St=Con.createStatement();
    Rs=St.executeQuery("select * from HASTALAR");
    HastaTablosu.setModel(DbUtils.resultSetToTableModel(Rs));
    
    }
    catch(Exception e)
            {
            e.printStackTrace();
            }
}
    private void HastaEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastaEkleMouseClicked
       if(HastaId.getText().isEmpty()|| HastaAdı.getText().isEmpty() || HastaAdresi.getText().isEmpty() || HastaYas.getText().isEmpty() || HastaPat.getText().isEmpty()||HastaTelNo.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Hatalı Giriş yaptınız kontrol ediniz");
       
       }
        
        try
        
        {
            
        Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
        PreparedStatement Ekle =Con.prepareStatement("insert into HASTALAR values(?,?,?,?,?,?,?,?)");
        Ekle.setInt(1,Integer.valueOf(HastaId.getText()));
        Ekle.setString(2,HastaAdı.getText());
        Ekle.setString(3,HastaAdresi.getText());
        Ekle.setString(4,HastaTelNo.getText());
        Ekle.setInt(5,Integer.valueOf(HastaYas.getText()));
        Ekle.setString(6,HastaCinsiyeti.getSelectedItem().toString());
        Ekle.setString(7,HastaKan.getSelectedItem().toString());
        Ekle.setString(8,HastaPat.getText());
        int row =Ekle.executeUpdate();
        JOptionPane.showMessageDialog(this, "Hasta başarı ile eklendi");
        Con.close();
        Selectional();
        
        }
        catch(Exception e )
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_HastaEkleMouseClicked

    private void HastaTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastaTablosuMouseClicked
         DefaultTableModel model =(DefaultTableModel)HastaTablosu.getModel();
        int indexno=HastaTablosu.getSelectedRow();
        HastaId.setText(model.getValueAt(indexno,0).toString());
        HastaAdı.setText(model.getValueAt(indexno,1).toString());
        HastaAdresi.setText(model.getValueAt(indexno,2).toString());
        HastaTelNo.setText(model.getValueAt(indexno,3).toString());
        HastaYas.setText(model.getValueAt(indexno,4).toString());
        HastaPat.setText(model.getValueAt(indexno,7).toString());
        
    }//GEN-LAST:event_HastaTablosuMouseClicked

    private void HastaSilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastaSilMouseClicked
        if(HastaId.getText().isEmpty())
        {
        
            JOptionPane.showMessageDialog(this, "Silinecek Hasta ıd giriniz");
        }
        else
        {
        try{
        Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
        String Id=HastaId.getText();
        String Query="Delete from HASTALAR where HASTAID="+Id;
        Statement Ekle=Con.createStatement();
        Ekle.executeUpdate(Query);
        Selectional();
        JOptionPane.showMessageDialog(this, "Hasta başarı ile silindi");
        }
        catch(Exception e)
                {
                    e.printStackTrace();
                }
        
        }
    }//GEN-LAST:event_HastaSilMouseClicked

    private void HastaGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HastaGuncelleMouseClicked
        if(HastaId.getText().isEmpty()|| HastaAdı.getText().isEmpty() || HastaAdresi.getText().isEmpty() || HastaYas.getText().isEmpty() || HastaPat.getText().isEmpty()||HastaTelNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Değiştirelecek değer bulunamadı");
        
        }
        else
        {
        
            try
            {
                Con=DriverManager.getConnection("jdbc:derby://localhost:1527/HastaneOtomasyonu","kullanici1","1234");
                String Query="Update HASTALAR set HASTAADI='"+HastaAdı.getText()+"'"+",HASTAADRESI='"+HastaAdresi.getText()+"'"+",HASTATELNO='"+HastaTelNo.getText()+"'"+",HASTAYAS="+HastaYas.getText()+""+",HASTACINSIYETI='"+HastaCinsiyeti.getSelectedItem().toString()+"'"+",HASTAKANGRB='"+HastaKan.getSelectedItem().toString()+"'"+",HASTAPATOLOJİ='"+HastaPat.getText()+"'"+"where HASTAID="+HastaId.getText();
                System.out.println(Query);
                Statement Ekle=Con.createStatement();
                Ekle.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Hasta bilgileri başarıyla güncellendi");
            Selectional();
            }
            catch(Exception e)
            {
            e.printStackTrace();
            }
        }
    }//GEN-LAST:event_HastaGuncelleMouseClicked

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
            java.util.logging.Logger.getLogger(Hasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hasta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hasta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HastaAdresi;
    private javax.swing.JTextField HastaAdı;
    private javax.swing.JComboBox HastaCinsiyeti;
    private javax.swing.JButton HastaEkle;
    private javax.swing.JButton HastaGuncelle;
    private javax.swing.JTextField HastaId;
    private javax.swing.JComboBox HastaKan;
    private javax.swing.JTextField HastaPat;
    private javax.swing.JButton HastaSil;
    private javax.swing.JTable HastaTablosu;
    private javax.swing.JTextField HastaTelNo;
    private javax.swing.JButton HastaTemizle;
    private javax.swing.JTextField HastaYas;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
