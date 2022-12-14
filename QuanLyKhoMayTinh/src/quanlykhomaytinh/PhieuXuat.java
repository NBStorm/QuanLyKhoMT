/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhomaytinh;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class PhieuXuat extends javax.swing.JFrame {
    private List<MiniProduct> list1 =new ArrayList<>();
    private List<PhieuXuatinf> list2 =new ArrayList<>();
    private List<ChiTietPhieuXuat> list3 =new ArrayList<>();
    private DefaultTableModel model;
    private String [] columnHeaders1=new String[]{"ID","Name","Price","Amount"};
    private String [] columnHeaders2=new String[]{"Mã Phiếu Xuất","Mã Nhân Viên","Khách Hàng","Tổng tiền"};
    private String [] columnHeaders3=new String[]{"Mã CT Phiếu Xuất","Mã Phiếu Xuất","ID","Amount","Tổng tiền"};
    /**
     * Creates new form PhieuXuat
     */
    public PhieuXuat() {
        initComponents();
        initTable1();
        list1=MnProductController.getAllMnProduct();
        LoadDateToTableMP();
        initTable2();
        list2=PhieuXuatController.getPX();
        LoadDateToTablePX();
        initTable3();
        list3=CtpxController.getCTPX();
        LoadDateToTableCTPX();
        
    }
    private void initTable1(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(columnHeaders1);
        
        list1.forEach(item->{
            model.addRow(new Object[]{item.getId(),item.getName(),item.getGia(),item.getAmount()});
        });
        tblMnProduct.setModel(model);
    }
    
    private void initTable2(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(columnHeaders2);
        
        list2.forEach(item->{
            model.addRow(new Object[]{item.getMapx(),item.getManv(),item.getKhachhang(),item.getTongtien()});
        });
        tblPX.setModel(model);
    }
    private void initTable3(){
        model =new DefaultTableModel();
        model.setColumnIdentifiers(columnHeaders3);
        
        list3.forEach(item->{
            model.addRow(new Object[]{item.getMactpx(),item.getMapx(),item.getId(),item.getAmount(),item.getTongtien()});
        });
        tblCTPX.setModel(model);
    }
    
    public void LoadDateToTableMP(){
        model= (DefaultTableModel)tblMnProduct.getModel();
        model.setRowCount(0);
        for(MiniProduct item : list1){
            model.addRow(new Object[]{item.getId(),item.getName(),item.getGia(),item.getAmount()});
        }
    }
    
    public void LoadDateToTablePX(){
        model= (DefaultTableModel)tblPX.getModel();
        model.setRowCount(0);
        for(PhieuXuatinf item : list2){
            model.addRow(new Object[]{item.getMapx(),item.getManv(),item.getKhachhang(),item.getTongtien()});
        }
    }
    
    public void LoadDateToTableCTPX(){
        model= (DefaultTableModel)tblCTPX.getModel();
        model.setRowCount(0);
        for(ChiTietPhieuXuat item : list3){
            model.addRow(new Object[]{item.getMactpx(),item.getMapx(),item.getId(),item.getAmount(),item.getTongtien()});
        }
    }
    
    public void LayDuLieuChiTietPhieuXuat(String MaPhieuXuat) throws SQLException {
        String cautruyvan = "";
        cautruyvan = "select MaCTPX,CTPHIEUXUAT.Mapx ,SANPHAM.ID,CTPHIEUXUAT.Amount,"
                + "CTPHIEUXUAT.Tongtien"
                + " from PHIEUXUAT,CTPHIEUXUAT,SANPHAM where "
                + "PHIEUXUAT.Mapx=CTPHIEUXUAT.Mapx and"
                + " SANPHAM.ID=CTPHIEUXUAT.ID and CTPHIEUXUAT.Mapx='" + MaPhieuXuat+"'";
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery(cautruyvan);
        Object[] obj = new Object[]{"Mã CT Phiếu Xuất","Mã Phiếu Xuất","ID","Amount","Tổng tiền"};
        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
        tblCTPX.setModel(tableModel);
        
        try {
            while (rs.next()) {
                Object[] item = new Object[5];
                
                item[0] = rs.getString("MaCTPX");
                item[1] = rs.getString("Mapx");
                item[2] = rs.getString("ID");
                item[3] = rs.getString("Amount");
                item[4] = rs.getString("Tongtien");
               
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtkhachhang = new javax.swing.JTextArea();
        txtmapx = new javax.swing.JTextField();
        txtmanv = new javax.swing.JTextField();
        txttongtien = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtctpx = new javax.swing.JTextField();
        txtmapx_ctpx = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        txttongtien_ctpx = new javax.swing.JTextField();
        btnAdd1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPX = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCTPX = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMnProduct = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("Mã Px :");

        jLabel5.setText("Mã NV :");

        jLabel6.setText("Tổng tiền:");

        jLabel7.setText("Khách Hàng");

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtkhachhang.setColumns(20);
        txtkhachhang.setRows(5);
        jScrollPane3.setViewportView(txtkhachhang);

        txttongtien.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmapx)
                            .addComponent(txtmanv)
                            .addComponent(txttongtien)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(33, 33, 33)
                        .addComponent(btnDelete)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmapx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel8.setText("Mã CTPX :");

        jLabel9.setText("Mã PX :");

        jLabel10.setText("ID SP :");

        jLabel11.setText("Số Lượng :");

        jLabel12.setText("Tổng tiền :");

        txtmapx_ctpx.setEditable(false);

        txtamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtamountKeyReleased(evt);
            }
        });

        txttongtien_ctpx.setEditable(false);

        btnAdd1.setText("Thêm");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        btnUpdate1.setText("Sửa");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnDelete1.setText("Xoá");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txttongtien_ctpx, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmapx_ctpx)
                                    .addComponent(txtctpx, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtid)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAdd1)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate1)
                        .addGap(28, 28, 28)
                        .addComponent(btnDelete1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtctpx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtmapx_ctpx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txttongtien_ctpx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd1)
                    .addComponent(btnUpdate1)
                    .addComponent(btnDelete1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setText("Bảng phiếu xuất");

        tblPX.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPXMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPX);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));

        jLabel2.setText("Chi tiết phiếu xuất");

        tblCTPX.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCTPX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblCTPXMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblCTPX);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));

        tblMnProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblMnProduct);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Bảng sản phẩm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setBackground(new java.awt.Color(204, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phiếu Xuất");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        jRadioButtonMenuItem2.setText("Đăng Xuất");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPXMousePressed
        int selectedRow=tblPX.getSelectedRow();
        
        if(selectedRow>=0){
            try {
                PhieuXuatinf PhieuXuatinf=list2.get(selectedRow);
                txtmapx.setText(PhieuXuatinf.getMapx());
                txtmanv.setText(PhieuXuatinf.getManv());
                txttongtien.setText(String.valueOf(PhieuXuatinf.getTongtien()));
                txtkhachhang.setText(PhieuXuatinf.getKhachhang());
                LayDuLieuChiTietPhieuXuat(txtmapx.getText());
                txtmapx_ctpx.setText(PhieuXuatinf.getMapx());
            } catch (SQLException ex) {
                Logger.getLogger(PhieuXuat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblPXMousePressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int row=0;
        try{
           Connection conn=DBConnection.getConnection();
           String sql="insert into PHIEUXUAT values(?,?,?,?)";
           PreparedStatement st=conn.prepareStatement(sql);
           st.setString(1, txtmapx.getText());
           st.setString(2, txtmanv.getText());
           st.setString(3, txtkhachhang.getText());
           st.setString(4, "0");
           
           row=st.executeUpdate();
           
           JOptionPane.showMessageDialog(this,"Đã thêm thành công");
          
           conn.close();
       }
        catch(Exception e){
           JOptionPane.showMessageDialog(this,"Errors");
       }
        list2=PhieuXuatController.getPX();
        LoadDateToTablePX();
    }//GEN-LAST:event_btnAddActionPerformed
    public Double GetGiaSanPham(String id) throws SQLException {
        Double Gia =0.0;
        String cautruyvan = "select * from SanPham where ID='" + id + "'";
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery(cautruyvan);
        try {
            if (rs.next()) {
                Gia = rs.getDouble("Price");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return Gia;
    }
    public int GetPreAmount(String id) throws SQLException {
        int amount=0;
        String cautruyvan = "select * from SanPham where ID='" + id + "'";
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery(cautruyvan);
        try {
            if (rs.next()) {
                amount = rs.getInt("Amount");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return amount;
    }
    public void SetTongTien(String Mapx) throws SQLException {
        String cautruyvan = "select sum(CTPHIEUXUAT.Tongtien) as TongTienHienTai,PHIEUXUAT.Mapx from PHIEUXUAT,CTPHIEUXUAT "
                + "where PHIEUXUAT.Mapx=CTPHIEUXUAT.Mapx"
                + " and PHIEUXUAT.Mapx='" + Mapx + "' group by PHIEUXUAT.Mapx";
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery(cautruyvan);
        String ttht = "";

        try {
            if (rs.next()) {
                ttht = rs.getString("TongTienHienTai");
                txttongtien.setText(ttht);
                String ctv = "update PHIEUXUAT set Tongtien= " + ttht + "where Mapx='" + Mapx+"'";
                
                
                st.executeUpdate(ctv);
                list2=PhieuXuatController.getPX();
                LoadDateToTablePX();
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }

    }
    
    private void txtamountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtamountKeyReleased
        int SoLuong = 0;
        double Tien = 0;
        try {
            SoLuong = Integer.valueOf(txtamount.getText());
            Double Gia = GetGiaSanPham(txtid.getText());
            Tien =  Gia * SoLuong;
            txttongtien_ctpx.setText(String.valueOf(Tien));
        } catch (Exception e) {
            
        }   
    }//GEN-LAST:event_txtamountKeyReleased
    
    
    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        int row=0;
        try{
           Connection conn=DBConnection.getConnection();
           int soluongtruoc=GetPreAmount(txtid.getText());
           int soluongdaxuat=Integer.parseInt(txtamount.getText());
           int soluongconlai=soluongtruoc-soluongdaxuat;
           String id=txtid.getText();
           if(soluongconlai>=0){
               String sql="insert into CTPHIEUXUAT values(?,?,?,?,?)";
               PreparedStatement st=conn.prepareStatement(sql);
               st.setString(1, txtctpx.getText());
               st.setString(2, txtmapx_ctpx.getText());
               st.setString(3, txtid.getText());
               st.setString(4, txtamount.getText());
               st.setString(5, txttongtien_ctpx.getText());
           
                row=st.executeUpdate();
           
                JOptionPane.showMessageDialog(this,"Đã thêm thành công");
           
                sql="update SANPHAM set Amount='"+soluongconlai+"' where ID='"+id+"'";
                Statement stmt=conn.createStatement();
                stmt.executeUpdate(sql);
                list1=MnProductController.getAllMnProduct();
                LoadDateToTableMP();
           
                String mapx=txtmapx_ctpx.getText();
           
                conn.close();
                list3=CtpxController.getCTPX();
                LayDuLieuChiTietPhieuXuat(mapx);
                SetTongTien(mapx);
           }
           else{
               JOptionPane.showMessageDialog(this,"Không còn sản phẩm");
           }
           
       }
        catch(Exception e){
           JOptionPane.showMessageDialog(this,"Errors");
       }
        
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtmapx.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập Mã phiếu xuất");
            txtmapx.requestFocus();return;
        }
        try{
            Connection conn = DBConnection.getConnection();
            String sql="update PHIEUXUAT set Manv=? ,KhachHang=? where Mapx=?";
            PreparedStatement st= conn.prepareStatement(sql);
            
            st.setString(1, txtmanv.getText());
            st.setString(2, txtkhachhang.getText());
            st.setString(3, txtmapx.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this,"Sửa thành công");
            conn.close();
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(this,"Errors");
        }
        list2=PhieuXuatController.getPX();
        LoadDateToTablePX();     
    }//GEN-LAST:event_btnUpdateActionPerformed
    private int GetAmountHientai(String mactpx) throws SQLException{
        int amount=0;
        String cautruyvan = "select * from CTPHIEUXUAT where MaCTPX='" + mactpx + "'";
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs = st.executeQuery(cautruyvan);
        try {
            if (rs.next()) {
                amount = rs.getInt("Amount");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return amount;
        
    }
    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        if(txtmapx.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập Mã phiếu xuất");
            txtmapx.requestFocus();return;
        }
        try{
            Connection conn = DBConnection.getConnection();
            int sltrongkho=GetPreAmount(txtid.getText());
            int slhientai=GetAmountHientai(txtctpx.getText());
            String id=txtid.getText();
            String mapx=txtmapx_ctpx.getText();
            String sql="update CTPHIEUXUAT set ID=? ,Amount=?,Tongtien=? where MaCTPX=?";
            PreparedStatement st= conn.prepareStatement(sql);
            
            st.setString(1, txtid.getText());
            st.setString(2, txtamount.getText());
            st.setString(3, txttongtien_ctpx.getText());
            st.setString(4, txtctpx.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this,"Sửa thành công");
            
            
            int slmoi=Integer.valueOf(txtamount.getText());
            int soluongconlai=sltrongkho+slhientai-slmoi;
            sql="update SANPHAM set Amount='"+soluongconlai+"' where ID='"+id+"'";
                Statement stmt=conn.createStatement();
                stmt.executeUpdate(sql);
                list1=MnProductController.getAllMnProduct();
                LoadDateToTableMP();
            
            conn.close();
            list3=CtpxController.getCTPX();
            LayDuLieuChiTietPhieuXuat(mapx);
            SetTongTien(mapx);
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(this,"Errors");
        }
        
    }//GEN-LAST:event_btnUpdate1ActionPerformed
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(txtmapx.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập Mã phiếu xuất");
            txtmapx.requestFocus();return;
        }
        if(JOptionPane.showConfirmDialog(this,"Có muốn xoá phiếu xuất có mã "+
                   txtmapx.getText(),"Confirmation",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
               return;
        }
        try{
            Connection conn = DBConnection.getConnection();
            
            String sql="delete from PHIEUXUAT where Mapx=?";
            String ktra="select count(MaCTPX) as SoChiTietPhieuXuat from PHIEUXUAT,CTPHIEUXUAT where PHIEUXUAT.Mapx=CTPHIEUXUAT.Mapx "
                    + "and PHIEUXUAT.Mapx=?";
            PreparedStatement st= conn.prepareStatement(ktra);
            st.setString(1, txtmapx.getText());
            ResultSet rs=st.executeQuery();
            
            if(rs.next()){
                if(rs.getInt("SoChiTietPhieuXuat")==0){
                    PreparedStatement st1= conn.prepareStatement(sql);
                    st1.setString(1, txtmapx.getText());
                    st1.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Xoá thành công");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Còn Chi tiết phiếu xuất");
                }
            }
            conn.close();
            list2=PhieuXuatController.getPX();
            LoadDateToTablePX();
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(this,"Errors");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblCTPXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCTPXMousePressed
        int selectedRow=tblCTPX.getSelectedRow();
        
        if(selectedRow>=0){
            
            ChiTietPhieuXuat ChiTietPhieuXuat=list3.get(selectedRow);
            txtctpx.setText(ChiTietPhieuXuat.getMactpx());
            txtid.setText(ChiTietPhieuXuat.getId());
            txtamount.setText(String.valueOf(ChiTietPhieuXuat.getAmount()));
            txttongtien_ctpx.setText(String.valueOf(ChiTietPhieuXuat.getTongtien()));   
        }
    }//GEN-LAST:event_tblCTPXMousePressed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        if(txtctpx.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhập Mã chi tiết phiếu xuất");
            txtctpx.requestFocus();return;
        }
        if(JOptionPane.showConfirmDialog(this,"Có muốn xoá chi tiết phiếu xuất có mã "+
                   txtctpx.getText(),"Confirmation",JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){
               return;
        }
        try{
            Connection conn = DBConnection.getConnection();
            int sltrongkho=GetPreAmount(txtid.getText());
            int slhientai=Integer.valueOf(txtamount.getText());
            String mapx=txtmapx_ctpx.getText();
            String id=txtid.getText();
            String sql="delete from CTPHIEUXUAT where MaCTPX=?";
            PreparedStatement st=conn.prepareStatement(sql);
            st.setString(1, txtctpx.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this,"Xoá thành công");
            int slmoi=sltrongkho+slhientai;
            sql="update SANPHAM set Amount='"+slmoi+"' where ID='"+id+"'";
                Statement stmt=conn.createStatement();
                stmt.executeUpdate(sql);
                list1=MnProductController.getAllMnProduct();
                LoadDateToTableMP();
            
            conn.close();
            list3=CtpxController.getCTPX();
            LayDuLieuChiTietPhieuXuat(mapx);
            SetTongTien(mapx);
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(this,"Errors");
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        Product pro=new Product();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuXuat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuXuat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCTPX;
    private javax.swing.JTable tblMnProduct;
    private javax.swing.JTable tblPX;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtctpx;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextArea txtkhachhang;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtmapx;
    private javax.swing.JTextField txtmapx_ctpx;
    private javax.swing.JTextField txttongtien;
    private javax.swing.JTextField txttongtien_ctpx;
    // End of variables declaration//GEN-END:variables
}
