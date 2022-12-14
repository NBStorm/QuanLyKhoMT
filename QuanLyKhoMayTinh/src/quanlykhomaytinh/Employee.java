/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhomaytinh;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import static quanlykhomaytinh.Login.quyen;

/**
 *
 * @author ASUS
 */
public class Employee extends javax.swing.JFrame {
    private List<Nhanvien> list =new ArrayList<>();
    private DefaultTableModel model;
    private String [] columnHeaders=new String[]{"Manv","Name","Email","Sex","Phonenumber","Address","Chức vụ","Password"};
    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        initTable();
        list=NhanvienController.getAllEmployee();
        loadDataArrayListToTable();
    }
    
    private void initTable(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(columnHeaders);
        
        list.forEach(item->{
            model.addRow(new Object[]{item.getManv(),item.getName(),item.getEmail(),item.getSex(),item.getPhonenumber(),
                item.getAddress(),item.getChucvu(),item.getPassword()});
        });
        tblEmployee.setModel(model);
    }
    
    public void loadDataArrayListToTable(){
        model= (DefaultTableModel)tblEmployee.getModel();
        model.setRowCount(0);
        for(Nhanvien item : list){
            model.addRow(new Object[]{item.getManv(),item.getName(),item.getEmail(),item.getSex(),item.getPhonenumber(),
                item.getAddress(),item.getChucvu(),item.getPassword()});
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        rdoAdmin = new javax.swing.JRadioButton();
        rdoNhanvien = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        txtManv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        PhoneNB = new javax.swing.JLabel();
        txtPhonenumber = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnExport = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhân viên");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ListOfEmployee", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblEmployeeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("MãNV : ");

        jLabel2.setText("Họ Tên :");

        jLabel3.setText("Giới tính : ");

        jLabel4.setText("Email : ");

        jLabel5.setText("Address : ");

        jLabel6.setText("Chức vụ : ");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        buttonGroup2.add(rdoAdmin);
        rdoAdmin.setText("Admin");

        buttonGroup2.add(rdoNhanvien);
        rdoNhanvien.setText("Nhân viên");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Employee");

        jLabel8.setText("Password : ");

        PhoneNB.setText("PhoneNB : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(14, 14, 14)
                                .addComponent(rdoAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoNhanvien))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName)
                                        .addComponent(txtManv)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(rdoNam)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                        .addComponent(txtPassword)))))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(100, 100, 100)
                        .addComponent(rdoNu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(PhoneNB)
                        .addGap(10, 10, 10)
                        .addComponent(txtPhonenumber)
                        .addGap(56, 56, 56))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneNB)
                    .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(rdoAdmin))
                    .addComponent(rdoNhanvien))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);

        jMenu1.setText("Chức năng");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Nhập Kho");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Xuất Kho");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Đăng Xuất");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem3);

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("Menu");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("File");

        btnExport.setSelected(true);
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        jMenu2.add(btnExport);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMousePressed
        int selectedRow=tblEmployee.getSelectedRow();
        
        if(selectedRow>=0){
            Nhanvien nhanvien = list.get(selectedRow);
            txtManv.setText(nhanvien.getManv());
            txtName.setText(nhanvien.getName());
            boolean gt=nhanvien.getSex();
            if(gt==true){
                rdoNam.setSelected(true);
            }
            else {
                rdoNu.setSelected(true);
            }
            txtEmail.setText(nhanvien.getEmail());
            boolean cv=nhanvien.getChucvu();
            if(cv==true){
                rdoAdmin.setSelected(true);
            }
            else {
                rdoNhanvien.setSelected(true);
            }
            txtAddress.setText(nhanvien.getAddress());
            txtPhonenumber.setText(nhanvien.getPhonenumber());
            txtPassword.setText(nhanvien.getPassword());
        }
    }//GEN-LAST:event_tblEmployeeMousePressed

    public void clean(){
        txtManv.setText("");
        txtName.setText("");
        rdoNam.setSelected(false);
        rdoNu.setSelected(false);
        txtEmail.setText("");
        txtPhonenumber.setText("");
        rdoAdmin.setSelected(false);
        rdoNhanvien.setSelected(false);
        txtAddress.setText("");
        txtPassword.setText("");
    }
    public boolean checkTrung(String ma){
        for(int i=0;i<list.size();i++)
            if(list.get(i).Manv.equalsIgnoreCase(ma))
                return true;       
    return false;
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(checkTrung(txtManv.getText())==true)
          JOptionPane.showMessageDialog(this,"Khoá này đã xuất hiện");
        else{
        int row=0;
        try{
           Connection conn=DBConnection.getConnection();
           String sql="insert into NHANVIEN values(?,?,?,?,?,?,?,?)";
           PreparedStatement st=conn.prepareStatement(sql);
           st.setString(1, txtManv.getText());
           st.setString(2, txtName.getText());
           st.setString(3, txtEmail.getText());
           boolean gt;
           if(rdoNam.isSelected()){
               gt=true;
           }
           else{
               gt=false;
           }
           st.setBoolean(4, gt);
           st.setString(5, txtPhonenumber.getText());
           st.setString(6, txtAddress.getText());
           boolean cv;
           if(rdoAdmin.isSelected()){
               cv=true;
           }
           else{
               cv=false;
           }
           st.setBoolean(7, cv);
           st.setString(8, txtPassword.getText());
           
           row=st.executeUpdate();
           
           JOptionPane.showMessageDialog(this,"Đã thêm thành công");
          
           conn.close();
       }
        catch(Exception e){
           JOptionPane.showMessageDialog(this,"Errors");
       }
       list=NhanvienController.getAllEmployee();
       loadDataArrayListToTable();
       clean();
       }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtManv.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập Mã nhân viên");
            txtManv.requestFocus();return;
        }
        try{
            Connection conn = DBConnection.getConnection();
            String sql="update NHANVIEN set Name=? ,Email=? ,Sex=? ,Phonenumber=? ,Address=? ,Chucvu=? ,Password=?  where Manv=?";
            PreparedStatement st= conn.prepareStatement(sql);
            
            st.setString(1, txtName.getText());
            st.setString(2, txtEmail.getText());
            boolean gt;
            if(rdoNam.isSelected()){
                gt=true;
            }else{
                gt=false;
            }
            st.setBoolean(3, gt);
            st.setString(4, txtPhonenumber.getText());
            st.setString(5, txtAddress.getText());
            boolean cv;
            if(rdoAdmin.isSelected()){
                cv=true;
            }else{
                cv=false;
            }
            st.setBoolean(6, cv);
            st.setString(7, txtPassword.getText());
            st.setString(8, txtManv.getText());
            
            st.executeUpdate();
            JOptionPane.showMessageDialog(this,"Sửa thành công");
            conn.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(this,"Errors");
        }
        list=NhanvienController.getAllEmployee();
        loadDataArrayListToTable();
        clean();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(txtManv.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập Mã nhân viên");
            txtManv.requestFocus();return;
        }
        if(JOptionPane.showConfirmDialog(this,"Có muốn xoá nhân viên có mã "+
                   txtManv.getText(),"Confirmation",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
               return;
        }
        try{
            Connection conn = DBConnection.getConnection();
            String sql="delete from NHANVIEN where Manv=?";
            PreparedStatement st= conn.prepareStatement(sql);
            st.setString(1, txtManv.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this,"Xoá thành công");
            conn.close();
        }
        catch(Exception e){
            System.out.print(e);
            JOptionPane.showMessageDialog(this,"Errors");
        }
        list=NhanvienController.getAllEmployee();
        loadDataArrayListToTable();
        clean();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        Product pro=new Product();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        PhieuXuat px=new PhieuXuat();
        px.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    public void openFile(String file){
        try{
            File path = new File(file);
            Desktop.getDesktop().open(path);
        }catch(IOException ioe){
            System.out.println(ioe);
        }
    }
    
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        try{
           JFileChooser jFileChooser = new JFileChooser();
           jFileChooser.showSaveDialog(this);
           File saveFile = jFileChooser.getSelectedFile();
           
           if(saveFile != null){
               saveFile = new File(saveFile.toString()+".xlsx");
               XSSFWorkbook wb = new XSSFWorkbook();
               XSSFSheet sheet =wb.createSheet("Danh sách nhân viên");
               
               XSSFRow rowCol = sheet.createRow(0);
               for(int i=0;i<tblEmployee.getColumnCount();i++){
                   XSSFCell cell =rowCol.createCell(i);
                   cell.setCellValue(tblEmployee.getColumnName(i));
               }
               
               for(int j=0;j<tblEmployee.getRowCount();j++){
                   XSSFRow row = sheet.createRow(j+1);
                   for(int k=0;k<tblEmployee.getColumnCount();k++){
                       XSSFCell cell = row.createCell(k);
                       if(tblEmployee.getValueAt(j, k)!=null){
                           cell.setCellValue(tblEmployee.getValueAt(j, k).toString());
                       }
                   }
               }
               FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
               wb.write(out);
               wb.close();
               out.close();
               openFile(saveFile.toString());
           }else{
               JOptionPane.showMessageDialog(null,"Error al generar archivo");
           }
       }catch(FileNotFoundException e){
           System.out.println(e);
       }catch(IOException io){
           System.out.println(io);
       }
    }//GEN-LAST:event_btnExportActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        if(quyen==1){
            AdminView adv=new AdminView();
            adv.setVisible(true);
            this.dispose();
        }
        else{
            NhanVienView nvv=new NhanVienView();
            nvv.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PhoneNB;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JRadioButtonMenuItem btnExport;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoAdmin;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanvien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhonenumber;
    // End of variables declaration//GEN-END:variables
}
