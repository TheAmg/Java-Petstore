/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproj_ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author win10
 */
public class buypets extends javax.swing.JFrame {

    /**
     * Creates new form buypets
     */
    public buypets() {
        initComponents();
        logenter();
        addtocartl.setVisible(false);
    }
    String ename=null;
    String psel=null;
private void logenter(){
          String logname=null;
          try{
              Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/petshop","root","");
		Statement stmt=con.createStatement();
                String sql3="select * from atlogs";
                ResultSet rsx=stmt.executeQuery(sql3);
                while(rsx.next()){
                    logname=rsx.getString(2);
                }
                ename=logname;
          }catch(Exception ex){
              ex.printStackTrace();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        catpane = new javax.swing.JPanel();
        tabby = new javax.swing.JLabel();
        munchkin = new javax.swing.JLabel();
        fold = new javax.swing.JLabel();
        calico = new javax.swing.JLabel();
        curl = new javax.swing.JLabel();
        persian = new javax.swing.JLabel();
        dogpane = new javax.swing.JPanel();
        husky = new javax.swing.JLabel();
        pitbull = new javax.swing.JLabel();
        gldrtr = new javax.swing.JLabel();
        german = new javax.swing.JLabel();
        greyh = new javax.swing.JLabel();
        costl = new javax.swing.JLabel();
        infota = new javax.swing.JTextArea();
        addtocartl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/icons8-back-50.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/icons8-shopping-cart-50.png"))); // NOI18N
        jLabel4.setText("VIEW CART");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_tabby.jpg"))); // NOI18N
        tabby.setText("Tabby");
        tabby.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabby.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabbyMousePressed(evt);
            }
        });

        munchkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_munchkin.jpg"))); // NOI18N
        munchkin.setText("Munchkin");
        munchkin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        munchkin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        munchkin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                munchkinMousePressed(evt);
            }
        });

        fold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_fold.jpg"))); // NOI18N
        fold.setText("Scottish Fold");
        fold.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fold.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                foldMousePressed(evt);
            }
        });

        calico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_calico.jpg"))); // NOI18N
        calico.setText("Calico");
        calico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        calico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calicoMousePressed(evt);
            }
        });

        curl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_curl.jpg"))); // NOI18N
        curl.setText("American Curl");
        curl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        curl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        curl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                curlMousePressed(evt);
            }
        });

        persian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_persian.jpg"))); // NOI18N
        persian.setText("Persian");
        persian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        persian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        persian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                persianMousePressed(evt);
            }
        });

        javax.swing.GroupLayout catpaneLayout = new javax.swing.GroupLayout(catpane);
        catpane.setLayout(catpaneLayout);
        catpaneLayout.setHorizontalGroup(
            catpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catpaneLayout.createSequentialGroup()
                .addGroup(catpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catpaneLayout.createSequentialGroup()
                        .addComponent(tabby, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(munchkin, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(persian, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(catpaneLayout.createSequentialGroup()
                        .addComponent(calico, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(curl, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fold, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        catpaneLayout.setVerticalGroup(
            catpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(catpaneLayout.createSequentialGroup()
                .addGroup(catpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(catpaneLayout.createSequentialGroup()
                        .addComponent(munchkin)
                        .addGap(18, 18, 18)
                        .addComponent(curl))
                    .addGroup(catpaneLayout.createSequentialGroup()
                        .addComponent(tabby)
                        .addGap(18, 18, 18)
                        .addComponent(calico))
                    .addGroup(catpaneLayout.createSequentialGroup()
                        .addComponent(persian)
                        .addGap(18, 18, 18)
                        .addComponent(fold)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CATS", catpane);

        husky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_husky.jpg"))); // NOI18N
        husky.setText("Husky");
        husky.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        husky.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        husky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                huskyMousePressed(evt);
            }
        });

        pitbull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_pitbull.jpg"))); // NOI18N
        pitbull.setText("Pitbull");
        pitbull.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pitbull.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pitbull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pitbullMousePressed(evt);
            }
        });

        gldrtr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_gldrtr.jpg"))); // NOI18N
        gldrtr.setText("Golden Retriever");
        gldrtr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gldrtr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gldrtr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gldrtrMousePressed(evt);
            }
        });

        german.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_german.jpg"))); // NOI18N
        german.setText("German Shepherd");
        german.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        german.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        german.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                germanMousePressed(evt);
            }
        });

        greyh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/lowres_greyh.jpg"))); // NOI18N
        greyh.setText("Greyhound");
        greyh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        greyh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        greyh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                greyhMousePressed(evt);
            }
        });

        javax.swing.GroupLayout dogpaneLayout = new javax.swing.GroupLayout(dogpane);
        dogpane.setLayout(dogpaneLayout);
        dogpaneLayout.setHorizontalGroup(
            dogpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dogpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(husky, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(german, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dogpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dogpaneLayout.createSequentialGroup()
                        .addComponent(pitbull, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gldrtr, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dogpaneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(greyh, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        dogpaneLayout.setVerticalGroup(
            dogpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dogpaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dogpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dogpaneLayout.createSequentialGroup()
                        .addGroup(dogpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(husky)
                            .addComponent(pitbull))
                        .addGap(18, 18, 18)
                        .addComponent(german))
                    .addGroup(dogpaneLayout.createSequentialGroup()
                        .addComponent(gldrtr)
                        .addGap(18, 18, 18)
                        .addComponent(greyh)))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("DOGS", dogpane);

        costl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        costl.setText("COST");

        infota.setEditable(false);
        infota.setBackground(new java.awt.Color(240, 240, 240));
        infota.setColumns(20);
        infota.setRows(5);
        infota.setBorder(null);

        addtocartl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addtocartl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/icons8-add-new-50.png"))); // NOI18N
        addtocartl.setText("ADD TO CART");
        addtocartl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addtocartl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addtocartl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addtocartlMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infota)
                    .addComponent(addtocartl, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(costl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(costl)
                        .addGap(18, 18, 18)
                        .addComponent(infota, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addtocartl))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        new customermenu().show();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
        new viewcart().show();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MousePressed

    private void tabbyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbyMousePressed
        // TODO add your handling code here:
        retrieveinfo(tabby.getText());
        
    }//GEN-LAST:event_tabbyMousePressed

    private void munchkinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_munchkinMousePressed
        // TODO add your handling code here:
        retrieveinfo(munchkin.getText());
    }//GEN-LAST:event_munchkinMousePressed

    private void persianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_persianMousePressed
        // TODO add your handling code here:
        retrieveinfo(persian.getText());
    }//GEN-LAST:event_persianMousePressed

    private void calicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calicoMousePressed
        // TODO add your handling code here:
        retrieveinfo(calico.getText());
    }//GEN-LAST:event_calicoMousePressed

    private void curlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_curlMousePressed
        // TODO add your handling code here:
        retrieveinfo(curl.getText());
    }//GEN-LAST:event_curlMousePressed

    private void foldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foldMousePressed
        // TODO add your handling code here:
        retrieveinfo(fold.getText());
    }//GEN-LAST:event_foldMousePressed

    private void huskyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_huskyMousePressed
        // TODO add your handling code here:
        retrieveinfo(husky.getText());
    }//GEN-LAST:event_huskyMousePressed

    private void pitbullMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pitbullMousePressed
        // TODO add your handling code here:
        retrieveinfo(pitbull.getText());
    }//GEN-LAST:event_pitbullMousePressed

    private void gldrtrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gldrtrMousePressed
        // TODO add your handling code here:
        retrieveinfo(gldrtr.getText());
    }//GEN-LAST:event_gldrtrMousePressed

    private void germanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_germanMousePressed
        // TODO add your handling code here:
        retrieveinfo(german.getText());
    }//GEN-LAST:event_germanMousePressed

    private void greyhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greyhMousePressed
        // TODO add your handling code here:
        retrieveinfo(greyh.getText());
    }//GEN-LAST:event_greyhMousePressed

    private void addtocartlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addtocartlMousePressed
        // TODO add your handling code here:
        String price=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/petshop","root","");
                Statement stmt=con.createStatement();
                Statement stmt1=con.createStatement();
                
		String sql="select * from pet";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){
                    //JOptionPane.showMessageDialog(null,"psel "+psel);
                    String nm=rs.getString(3);
                    String prc=rs.getString(5);
                    //JOptionPane.showMessageDialog(null,"prc "+prc);
                    if(nm.equals(psel)){
                        price=prc;
                        String sql1="insert into cart(cname,pet,petcost) values('"+ename+"','"+psel+"','"+prc+"')";
                        stmt1.executeUpdate(sql1);
                JOptionPane.showMessageDialog(null,"PET: "+psel+" added to cart");
                    }
                }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_addtocartlMousePressed
private void retrieveinfo(String pname){
    String info=null;
    String cost=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/petshop","root","");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(pname)){
                                info=rs.getString(4);
                                cost=rs.getString(5);
                                break;
                            }
                        }
    }catch(Exception ex){
        ex.printStackTrace();
    }
    infota.setText(info);
    costl.setText(cost);
    psel=pname;
    addtocartl.setVisible(true);
}

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
            java.util.logging.Logger.getLogger(buypets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buypets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buypets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buypets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buypets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addtocartl;
    private javax.swing.JLabel calico;
    private javax.swing.JPanel catpane;
    private javax.swing.JLabel costl;
    private javax.swing.JLabel curl;
    private javax.swing.JPanel dogpane;
    private javax.swing.JLabel fold;
    private javax.swing.JLabel german;
    private javax.swing.JLabel gldrtr;
    private javax.swing.JLabel greyh;
    private javax.swing.JLabel husky;
    private javax.swing.JTextArea infota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel munchkin;
    private javax.swing.JLabel persian;
    private javax.swing.JLabel pitbull;
    private javax.swing.JLabel tabby;
    // End of variables declaration//GEN-END:variables
}
