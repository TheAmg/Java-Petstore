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
public class cardportal extends javax.swing.JFrame {

    /**
     * Creates new form cardportal
     */
    public cardportal() {
        initComponents();
        logenter();
        calc();
    }
    String ename=null;
    int ttl=0;
//boolean statchoice=false;
//ArrayList<String> plst=new ArrayList<String>();
//ArrayList<Integer> clst=new ArrayList<Integer>();
//String pincode=null;
 //String pmethod=null;   
private void logenter(){
          String logname=null;
          String pc=null;
          try{
              Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
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
private void calc(){
    String ol=" ";
    int total=0;
    try{
        Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
		Statement stmt=con.createStatement();
                String sql="select * from cart where cname='"+ename+"'";
                ResultSet rsx=stmt.executeQuery(sql);
                while(rsx.next()){
                   String appe=rsx.getString(2);
                  // plst.add(appe);
                   
                   ol=ol+" "+appe;
                   int x=Integer.parseInt(rsx.getString(3));
                   //clst.add(x);
                   total=total+x;
                   namel.setText("NAME: "+ename);
                   listl.setText("LIST : "+ol);
                   ttl=total;
                   totalcostl.setText("TOTAL COST: "+total);
                }
    }catch(Exception e){
        e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        namel = new javax.swing.JLabel();
        listl = new javax.swing.JLabel();
        totalcostl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cnametf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cnotf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cvvtf = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        namel.setText("name");

        listl.setText("listl");

        totalcostl.setText("totalcost");

        jButton1.setText("cancel");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setText("Card holder's name");

        jLabel2.setText("Card Number ");

        jLabel3.setText("CVV");

        cvvtf.setText("   ");

        jButton2.setText("PLACE ORDER");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cnametf)
                        .addComponent(cnotf)
                        .addComponent(cvvtf, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cvvtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namel)
                            .addComponent(listl)
                            .addComponent(totalcostl)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1)))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namel)
                .addGap(18, 18, 18)
                .addComponent(listl)
                .addGap(18, 18, 18)
                .addComponent(totalcostl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        new customerplaceorder().show();
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
        boolean stat1=false;
        boolean stat=false;
        String holdername=cnametf.getText().trim();
        String cardno=cnotf.getText().trim();
        String cvv=cvvtf.getText().trim();
        if(holdername==null||holdername.equals("")||cardno==null||cardno.equals("")||cvv==null||cvv.equals("")){
            JOptionPane.showMessageDialog(null," Enter card details and don't leave empty fields");
        }
        else{
        try{
            Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/bankdb","root","amgroot");
		Statement stmt=con.createStatement();
                Statement stmt1=con.createStatement();
                Statement stmt2=con.createStatement();
                Statement stmt3=con.createStatement();
                String sql1="select * from account where uname='"+holdername+"'";
                String sql="select * from card where uname='"+holdername+"'";
                ResultSet rsx=stmt.executeQuery(sql);
                if(rsx.next()){
                    String hn=rsx.getString(4);
                    String cv=rsx.getString(3);
                    String cn=rsx.getString(2);
                   if(cn.equals(cardno)&&(cv.equals(cvv)&&hn.equals(holdername))) {
                       ResultSet rs=stmt1.executeQuery(sql1);
                       if(rs.next()){
                           //JOptionPane.showMessageDialog(null," in rs bdb ");
                           String bill=totalcostl.getText();
                          // JOptionPane.showMessageDialog(null," before parseint ");
                           int bl=ttl;
                          // JOptionPane.showMessageDialog(null," in rs parse int 1 ");
                           String abal=rs.getString(2);
                           int abl=Integer.parseInt(abal);
                          // JOptionPane.showMessageDialog(null," in rs parse int 2 ");
                           if(bl>abl){
                               JOptionPane.showMessageDialog(null," Not enough money, select an alternative method of payment ");
                           }else{
                               abl=abl-bl;
                               String tt="Deducted";
                               String sql2="insert into translog(uname,amount,transtype) values('"+holdername+"','"+bl+"','"+tt+"')";
                               stmt2.executeUpdate(sql2);
                               String sql3="update account set amount='"+abl+"' where uname='"+holdername+"'";
                               stmt3.executeUpdate(sql3);
                               stat=true;
                           }
                           
                       }else{
                           JOptionPane.showMessageDialog(null," No such account found ");
                       }
                   }else{
                       JOptionPane.showMessageDialog(null," No such card found ");
                   }
                }
                if(stat){
                 Class.forName("com.mysql.jdbc.Driver");  
		Connection con1=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3307/petshop","root","amgroot");
		Statement stmt5=con1.createStatement(); 
                Statement stmt7=con1.createStatement();
                Statement stmt8=con1.createStatement();
                Statement stmt9=con1.createStatement();
                String sql9="select * from cart where cname='"+ename+"'";
                ResultSet rs1=stmt9.executeQuery(sql9);
                String sql7="select * from user where uname='"+ename+"'";
                ResultSet rs=stmt7.executeQuery(sql7);
                if(rs.next()){
                    String pincode=rs.getString(7);
                    while(rs1.next()){
                        String pname=rs1.getString(2);
                        String cst=rs1.getString(3);
                        String sql8="insert into orders(cname,petname,price,pincode) values('"+ename+"','"+pname+"','"+cst+"','"+pincode+"')";
                        stmt8.executeUpdate(sql8);
                    }stat1=true;
                     
                }else{
                    JOptionPane.showMessageDialog(null," No such account found ");
                }
                if(stat1){
                Statement stmt6=con1.createStatement();
               
                String sql5="delete from cart where cname='"+ename+"'";
                stmt5.executeUpdate(sql5);
                JOptionPane.showMessageDialog(null," Done ");
                this.setVisible(false);
                new customerorderviewer().show();
                }
                }
        }catch(Exception ex){
        ex.printStackTrace();
    }}
    }//GEN-LAST:event_jButton2MousePressed

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
            java.util.logging.Logger.getLogger(cardportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cardportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cardportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cardportal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardportal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnametf;
    private javax.swing.JTextField cnotf;
    private javax.swing.JTextField cvvtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel listl;
    private javax.swing.JLabel namel;
    private javax.swing.JLabel totalcostl;
    // End of variables declaration//GEN-END:variables
}
