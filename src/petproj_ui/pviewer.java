/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproj_ui;
import java.sql.*;

/**
 *
 * @author User
 */
public class pviewer extends javax.swing.JFrame {

    /**
     * Creates new form pviewer
     */
    public pviewer() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        varlab = new javax.swing.JLabel();
        def = new javax.swing.JLabel();
        tabby = new javax.swing.JLabel();
        munchkin = new javax.swing.JLabel();
        calico = new javax.swing.JLabel();
        curl = new javax.swing.JLabel();
        fold = new javax.swing.JLabel();
        persian = new javax.swing.JLabel();
        husky = new javax.swing.JLabel();
        pitbull = new javax.swing.JLabel();
        german = new javax.swing.JLabel();
        gldrtr = new javax.swing.JLabel();
        greyh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jButton1.setText("Tabby");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Munchkin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("fold");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calico");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("A.Curl");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Persian");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Husky");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Pitbull");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("German shp");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Golden rtr");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Greyhound");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(68, 68, 68)
                .addComponent(jButton7)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 610));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        varlab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(varlab, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(varlab, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 800, 120));

        def.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/def.png"))); // NOI18N
        getContentPane().add(def, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 469));

        tabby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/tabby.png"))); // NOI18N
        tabby.setText("Tabby");
        getContentPane().add(tabby, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        munchkin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/munchkin.png"))); // NOI18N
        munchkin.setText("Munchkin");
        getContentPane().add(munchkin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        calico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/calico.png"))); // NOI18N
        calico.setText("Calico");
        getContentPane().add(calico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        curl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/curl.png"))); // NOI18N
        curl.setText("American Curl");
        getContentPane().add(curl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        fold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/fold.png"))); // NOI18N
        fold.setText("Scottish Fold");
        getContentPane().add(fold, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        persian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/persian.png"))); // NOI18N
        persian.setText("Persian");
        getContentPane().add(persian, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        husky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/husky.png"))); // NOI18N
        husky.setText("Husky");
        getContentPane().add(husky, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        pitbull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/pitbullinf.png"))); // NOI18N
        pitbull.setText("Pitbull");
        getContentPane().add(pitbull, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        german.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/german.png"))); // NOI18N
        german.setText("German Shepherd");
        getContentPane().add(german, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        gldrtr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/gldrtr.png"))); // NOI18N
        gldrtr.setText("Golden Retriever");
        getContentPane().add(gldrtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        greyh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/petproj_ui/greyh.png"))); // NOI18N
        greyh.setText("Greyhound");
        getContentPane().add(greyh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 750, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        
// TODO add your handling code here:
       // munchkin.setVisible(false);
       def.setVisible(false);
        tabby.setVisible(true);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=tabby.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
        
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(true);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=munchkin.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot"); 
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed

        // TODO add your handlong code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(true);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=calico.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(true);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=persian.getText();
       String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot"); 
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(true);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=fold.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot"); 
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(true);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=curl.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(true);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=husky.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(true);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=pitbull.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(true);
        gldrtr.setVisible(false);
        greyh.setVisible(false);
        String nm=german.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot"); 
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(true);
        greyh.setVisible(false);
        String nm=gldrtr.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        def.setVisible(false);
        tabby.setVisible(false);
        munchkin.setVisible(false);
        calico.setVisible(false);
        fold.setVisible(false);
        curl.setVisible(false);
        persian.setVisible(false);
        husky.setVisible(false);
        pitbull.setVisible(false);
        german.setVisible(false);
        gldrtr.setVisible(false);
        greyh.setVisible(true);
        String nm=greyh.getText();
        String price=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
                Statement stmt=con.createStatement();
		String sql="select * from pet ";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next())
                        {
                            String tname=rs.getString(3);
                            if(tname.equals(nm)){
                                price=rs.getString(5);
                                break;
                            }
                        }
                
        }catch(Exception ex){
            ex.printStackTrace();
        }
        varlab.setText("cost: "+price);
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(pviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pviewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calico;
    private javax.swing.JLabel curl;
    private javax.swing.JLabel def;
    private javax.swing.JLabel fold;
    private javax.swing.JLabel german;
    private javax.swing.JLabel gldrtr;
    private javax.swing.JLabel greyh;
    private javax.swing.JLabel husky;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel munchkin;
    private javax.swing.JLabel persian;
    private javax.swing.JLabel pitbull;
    private javax.swing.JLabel tabby;
    private javax.swing.JLabel varlab;
    // End of variables declaration//GEN-END:variables
}
