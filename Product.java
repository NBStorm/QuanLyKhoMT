/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project;
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MayTinh;

/**
 *
 * @author ASUS
 */
public class Product extends javax.swing.JFrame {
    private List<MayTinh> list =new ArrayList<>();
    private DefaultTableModel model;
    private String [] columnHeaders=new String[]{"ID","Name","CPU","RAM","GPU","Screen","Hard Disk","Weight","NamSX","HangSX","Giá","Số lượng"};
    
    public Product() {
        initComponents();
        
        initTable();
    }

    private void initTable(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(columnHeaders);
        
        list.forEach(item->{
            model.addRow(new Object[]{item.getId(),item.getName(),item.getCpu(),item.getRam(),item.getGpu(),
                item.getManhinh(),item.getOcung(),item.getKhoiluong(),item.getNamsx(),item.getHangsx(),item.getPrice(),item.getAmount()});
        });
        tblProducts.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCpu = new javax.swing.JTextField();
        txtRam = new javax.swing.JTextField();
        txthdh = new javax.swing.JTextField();
        txtGpu = new javax.swing.JTextField();
        txtScreen = new javax.swing.JTextField();
        txtHD = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtNamsx = new javax.swing.JTextField();
        txtHangsx = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("List of Product"));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProductsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Name");

        jLabel2.setText("CPU");

        jLabel3.setText("RAM");

        jLabel4.setText("HĐH");

        jLabel5.setText("GPU");

        jLabel6.setText("Screen");

        jLabel7.setText("Hard Disk");

        jLabel8.setText("Weight");

        jLabel9.setText("Năm SX");

        jLabel10.setText("Hãng SX");

        jLabel11.setText("Price");

        jLabel12.setText("ID");

        jLabel13.setText("Amount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAmount))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txthdh))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRam))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtWeight))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtGpu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtHD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHangsx)
                            .addComponent(txtPrice)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNamsx, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(txtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHangsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(txthdh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnChange.setText("Sửa");

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAdd)
                .addGap(48, 48, 48)
                .addComponent(btnChange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnChange)
                    .addComponent(btnAdd)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        try{
            StringBuilder errors =new StringBuilder();
            if(txtId.getText().equals("")){
                errors.append("Chưa nhập id\n");
                txtId.setBackground(Color.red); 
            }
            else{
                txtId.setBackground(Color.white); 
            }
            if(txtName.getText().equals("")){
                errors.append("Chưa nhập tên\n");
                txtName.setBackground(Color.red); 
            }
            else{
                txtName.setBackground(Color.white);
            }
            if(txtCpu.getText().equals("")){
                errors.append("Chưa nhập CPU\n");
                txtCpu.setBackground(Color.red); 
            }
            else{
                txtCpu.setBackground(Color.white); 
            }
            if(txtRam.getText().equals("")){
                errors.append("Chưa nhập RAM\n");
                txtRam.setBackground(Color.red); 
            }
            else{
                txtRam.setBackground(Color.white); 
            }
            if(txthdh.getText().equals("")){
                errors.append("Chưa nhập hệ điều hành\n");
                txthdh.setBackground(Color.red); 
            }
            else{
                txthdh.setBackground(Color.white); 
            }
            if(txtGpu.getText().equals("")){
                errors.append("Chưa nhập GPU\n");
                txtGpu.setBackground(Color.red); 
            }
            else{
                txtGpu.setBackground(Color.white); 
            }
            if(txtScreen.getText().equals("")){
                errors.append("Chưa nhập Screen\n");
                txtScreen.setBackground(Color.red); 
            }
            else{
                txtScreen.setBackground(Color.white); 
            }
            if(txtHD.getText().equals("")){
                errors.append("Chưa nhập Hard Disk\n");
                txtHD.setBackground(Color.red); 
            }
            else{
                txtHD.setBackground(Color.white); 
            }
            if(txtWeight.getText().equals("")){
                errors.append("Chưa nhập khối lượng\n");
                txtWeight.setBackground(Color.red); 
            }
            else{
                txtWeight.setBackground(Color.white); 
            }
            if(txtNamsx.getText().equals("")){
                errors.append("Chưa nhập năm sản xuất\n");
                txtNamsx.setBackground(Color.red); 
            }
            else{
                txtNamsx.setBackground(Color.white); 
            }
            if(txtHangsx.getText().equals("")){
                errors.append("Chưa nhập hãng sản xuất\n");
                txtHangsx.setBackground(Color.red); 
            }
            else{
                txtHangsx.setBackground(Color.white); 
            }
            if(txtPrice.getText().equals("")){
                errors.append("Chưa nhập giá\n");
                txtPrice.setBackground(Color.red); 
            }
            else{
                txtPrice.setBackground(Color.white); 
            }
            if(txtAmount.getText().equals("")){
                errors.append("Chưa nhập giá\n");
                txtAmount.setBackground(Color.red); 
            }
            else{
                txtAmount.setBackground(Color.white); 
            }
            if(!errors.isEmpty()){
                JOptionPane.showMessageDialog(this,errors.toString());
                return;
            }
            
            MayTinh maytinh=new MayTinh();
            maytinh.setId(txtId.getText());
            maytinh.setName(txtName.getText());
            maytinh.setCpu(txtCpu.getText());
            maytinh.setRam(txtRam.getText());
            maytinh.setOs(txthdh.getText());
            maytinh.setGpu(txtGpu.getText());
            maytinh.setOcung(txtHD.getText());
            maytinh.setManhinh(txtScreen.getText());
            maytinh.setKhoiluong(Double.parseDouble(txtWeight.getText()));
            maytinh.setNamsx((int) Double.parseDouble(txtNamsx.getText()));
            maytinh.setHangsx(txtHangsx.getText());
            maytinh.setPrice(Double.parseDouble(txtPrice.getText()));
            maytinh.setAmount((int) Double.parseDouble(txtAmount.getText()));
        
            boolean isExited =false;
            for(int i=0;i<list.size();i++){
                MayTinh mt =list.get(i);
                if(mt.getId().equals(maytinh.getId())){
                    list.set(i,maytinh);
                    isExited=true;
                    break;
                }
            }
            
            if(!isExited){
                list.add(maytinh);
            }
            
            model.setRowCount(0);
            list.forEach(item->{
            model.addRow(new Object[]{item.getId(),item.getName(),item.getCpu(),item.getRam(),item.getGpu(),
                item.getManhinh(),item.getOcung(),item.getKhoiluong(),item.getNamsx(),item.getHangsx(),item.getPrice(),item.getAmount()});
            });
            
            model.fireTableDataChanged();
            
            JOptionPane.showMessageDialog(this,"Đã lưu");
        }
        catch (Exception e){
            
        }
        txtId.setText("");
        txtName.setText("");
        txtCpu.setText("");
        txthdh.setText("");
        txtRam.setText("");
        txtGpu.setText("");
        txtScreen.setText("");
        txtHD.setText("");
        txtWeight.setText("");
        txtNamsx.setText("");
        txtHangsx.setText("");
        txtPrice.setText("");
        txtAmount.setText("");
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMousePressed
        int selectedRow=tblProducts.getSelectedRow();
        
        if(selectedRow>=0){
            MayTinh maytinh=list.get(selectedRow);
            txtId.setText(maytinh.getId());
            txtName.setText(maytinh.getName());
            txtCpu.setText(maytinh.getCpu());
            txtRam.setText(maytinh.getRam());
            txthdh.setText(maytinh.getOs());
            txtGpu.setText(maytinh.getGpu());
            txtScreen.setText(maytinh.getManhinh());
            txtHD.setText(maytinh.getOcung());
            txtWeight.setText(String.valueOf(maytinh.getKhoiluong()));
            txtNamsx.setText(String.valueOf(maytinh.getNamsx()));
            txtHangsx.setText(maytinh.getHangsx());
            txtPrice.setText(String.valueOf(maytinh.getPrice()));
            txtAmount.setText(String.valueOf(maytinh.getAmount())); 
        }
        
    }//GEN-LAST:event_tblProductsMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
           if(txtId.getText().equals("")){
               JOptionPane.showMessageDialog(this,"chưa nhập id");
               return;
           }
           if(JOptionPane.showConfirmDialog(this,"Có muốn xoá sản phẩm này"+
                   txtId.getText(),"Confirmation",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
               return;
           }
           boolean isDeleted=false;
           for(int i=0;i<list.size();i++){
               MayTinh mt=list.get(i);
               if(mt.getId().equals(txtId.getText())){
                   list.remove(i);
                   isDeleted=true;
                   break;
               }
           }
           if(isDeleted){
               model.setRowCount(0);
               list.forEach(item->{
               model.addRow(new Object[]{item.getId(),item.getName(),item.getCpu(),item.getRam(),item.getGpu(),
               item.getManhinh(),item.getOcung(),item.getKhoiluong(),item.getNamsx(),item.getHangsx(),item.getPrice(),item.getAmount()});
               });
            
            model.fireTableDataChanged();
               JOptionPane.showMessageDialog(this,"Đã xoá");
           }
           else{
               JOptionPane.showMessageDialog(this,"Không tìm được sản phẩm");
           }
        }
        catch(Exception e)
        {  
            JOptionPane.showMessageDialog(this,"Error :" +e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCpu;
    private javax.swing.JTextField txtGpu;
    private javax.swing.JTextField txtHD;
    private javax.swing.JTextField txtHangsx;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNamsx;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtScreen;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txthdh;
    // End of variables declaration//GEN-END:variables

}