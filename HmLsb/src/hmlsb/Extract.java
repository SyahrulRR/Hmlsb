/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmlsb;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Syahrul
 */
public class Extract extends javax.swing.JFrame {
    
    // init attribute
    String pathStegoImage = "";
    int flag = 1;

    /**
     * Creates new form Extract
     */
    public Extract() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnExtract = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        showImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistem Penyisipan Data Teks - Extract");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(34, 45, 65));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Extract Pesan");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Silahkan pilih gambar untuk menampilkan");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("pesan rahasia yang disisipkan");

        btnFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFileMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        jLabel2.setText("PILIH FILE GAMBAR");

        javax.swing.GroupLayout btnFileLayout = new javax.swing.GroupLayout(btnFile);
        btnFile.setLayout(btnFileLayout);
        btnFileLayout.setHorizontalGroup(
            btnFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
            .addGroup(btnFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnFileLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnFileLayout.setVerticalGroup(
            btnFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnFileLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnExtract.setBackground(new java.awt.Color(110, 217, 161));
        btnExtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExtractMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExtractMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExtractMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExtractMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EXTRACT PESAN");

        javax.swing.GroupLayout btnExtractLayout = new javax.swing.GroupLayout(btnExtract);
        btnExtract.setLayout(btnExtractLayout);
        btnExtractLayout.setHorizontalGroup(
            btnExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
            .addGroup(btnExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnExtractLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnExtractLayout.setVerticalGroup(
            btnExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnExtractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnExtractLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        showImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(showImage, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExtractMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExtractMouseEntered
        btnExtract.setBackground(new Color(97, 204, 148));
    }//GEN-LAST:event_btnExtractMouseEntered

    private void btnExtractMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExtractMouseExited
        btnExtract.setBackground(new Color(110, 217, 161));
    }//GEN-LAST:event_btnExtractMouseExited

    private void btnExtractMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExtractMousePressed
        btnExtract.setBackground(new Color(82, 192, 136));
    }//GEN-LAST:event_btnExtractMousePressed

    private void btnFileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseEntered
        btnFile.setBackground(new Color(227, 227, 227));
    }//GEN-LAST:event_btnFileMouseEntered

    private void btnFileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseExited
        btnFile.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_btnFileMouseExited

    private void btnFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMousePressed
        btnFile.setBackground(new Color(215, 215, 215));
    }//GEN-LAST:event_btnFileMousePressed

    private void btnFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFileMouseClicked
        try{
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File file = chooser.getSelectedFile();
            this.pathStegoImage = file.toString();
            Image img = ImageIO.read(file);
            Image newImg = img.getScaledInstance(showImage.getWidth(), showImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newImg);
            showImage.setIcon(icon);
        }catch (Exception e){
            System.out.println("Terjadi sebuah kesalahan!");
            System.out.println(e);
        }        
    }//GEN-LAST:event_btnFileMouseClicked

    private void btnExtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExtractMouseClicked
        LsbModule lsb = new LsbModule();
        HuffmanModule hm = new HuffmanModule();
        
        // ambil nilai dari huffmancode.txt
        String[] hmcode = new String[3];
        try {
            File myObj = new File("C:\\Users\\Syahrul\\Documents\\Hasil Data\\Embed\\HuffmanKey\\huffmancode.txt");
            Scanner myReader = new Scanner(myObj);
            
            int index = 0;
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                hmcode[index] = data;
                index++;
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        // ekstrak pesan dari stego.png meggunakan nilai huffmancode.txt
        String extMsg = "";
        try {
            extMsg = lsb.extract(this.pathStegoImage, Integer.parseInt(hmcode[2]));
        } catch (Exception e){
            System.out.println(e);
        }
        
        // write output hasil decoding
        try {
            String pathOutput = "C:\\Users\\Syahrul\\Documents\\Hasil Data\\Extract\\output.txt";
            FileWriter myWriter = new FileWriter(pathOutput);
            String output = hm.decode(hmcode[0], hmcode[1], extMsg);
            output = output.replace("-", " ");
            output = output.replace(",", "\n");
            myWriter.write(output);
            myWriter.close();
            JOptionPane.showMessageDialog(this, "Pesan berhasil disimpan di " + pathOutput);
        } catch (IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btnExtractMouseClicked

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
            java.util.logging.Logger.getLogger(Extract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExtract;
    private javax.swing.JPanel btnFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel showImage;
    // End of variables declaration//GEN-END:variables
}