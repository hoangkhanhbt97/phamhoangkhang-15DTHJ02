/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import static ims.gui.EmployeeDAL.JDBC_DRIVER;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NAT
 */
public class Employee extends javax.swing.JFrame {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/nhanvien";
    static final String USER = "root";
    static final String PASS = "";
    String SHCC2;
    String edit2;
//    DefaultTableModel model;
    EmployeeBLL bll = new EmployeeBLL();
    private int id;
     public Employee(int id) {
          this();
         this.id=id;
        
     }
    public Employee() {
        initComponents();
        stateButton(true);
         setInfoDialog();
         loadDataCBnoicap();
         loadDataCBdonvi();
         loadDataCBloainhansu ();
         loadDataCBchucdanh ();
         loadDataCBchucvu ();
         loadDataCdantoc ();
         loadDataCBtongiao ();
         loadDataCBquoctich ();
         loadDataCBhonnhan ();
         loadDataCBnhommau ();
         loadDataCBsuckhoe ();
         loadDataCBxuatthan ();
         loadDataCBuutiengiadinh ();
         loadDataCBuutienbanthan ();
         
    }
    public  void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);        
        setResizable(false);
    }
    public void setId(int id) {
        this.id=id;
    }
    EmployeeList tt = new EmployeeList();
    
    public void loadDataCBnoicap () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.thanhpho";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                this.txtnoicap.addItem(rs.getString("tenthanhpho"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBdonvi() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.donvi";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                
                this.txtdonvi.addItem(rs.getString("tendonvi"));
               
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBloainhansu () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.loainhansu";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
              
               this.txtloainhansu.addItem(rs.getString("tenloainhansu"));
             
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    } 
    public void loadDataCBchucdanh () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.chucdanh";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
              
                this.txtchucdanh.addItem(rs.getString("tenchucdanh"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBchucvu () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.chucvu";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
               
                this.txtchucvu.addItem(rs.getString("tenchucvu"));
               
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCdantoc () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.dantoc";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
               
                this.txtdantoc.addItem(rs.getString("tendantoc"));
            
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBtongiao () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.tongiao";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){

                this.txttongiao.addItem(rs.getString("tentongiao"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBquoctich () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.quocgia";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                
                this.txtquoctich.addItem(rs.getString("tenquocgia"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBhonnhan () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.honnhan";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
    
                this.txttrinhtranghonnhan.addItem(rs.getString("trinhtrang"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBnhommau () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.nhommau";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
               
                this.txtnhommau.addItem(rs.getString("tennhommau"));
              
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBsuckhoe () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.suckhoe";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
               
                this.txttinhtrangsuckhoe.addItem(rs.getString("tensuckhoe"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBxuatthan () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.xuatthan";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
               
                this.txtthanhphanxuatthan.addItem(rs.getString("tenxuatthan"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBuutiengiadinh () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.uutiengiadinh";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
               
                this.txtuutiengiadinh.addItem(rs.getString("tenuutiengiadinh"));

            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    public void loadDataCBuutienbanthan () {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien.uutienbanthan";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
              
                this.txtuutienbanthan.addItem(rs.getString("tenuutienbanthan"));
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
    
    public void stateButton(boolean value){
        
//        btNew.setVisible(value);
//        btEdit.setVisible(value);
//        btDelete.setVisible(value);
//        btPrint.setVisible(value);
//        btClose.setVisible(value);
//        btSave.setVisible(!value);
//        btCancel.setVisible(!value);
        
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
        txtsohieucongchuc = new javax.swing.JTextField();
        txtho = new javax.swing.JTextField();
        txtten = new javax.swing.JTextField();
        txthovaten = new javax.swing.JTextField();
        txttengoikhac = new javax.swing.JTextField();
        txtnoisinh = new javax.swing.JTextField();
        txtsocmnd = new javax.swing.JTextField();
        txtgioitinh = new javax.swing.JComboBox<>();
        txtngaysinh = new com.toedter.calendar.JDateChooser();
        txtngaycap = new com.toedter.calendar.JDateChooser();
        txtnoicap = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdienthoaididong = new javax.swing.JTextField();
        txtdienthoainharieng = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtdantoc = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txttongiao = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtquoctich = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txttrinhtranghonnhan = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtquequan = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtdiachithuongtru = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtnoiohiennay = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtdonvi = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtloainhansu = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtchucdanh = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        txtchucvu = new javax.swing.JComboBox<>();
        txtngaytuyendungkyhopdong = new com.toedter.calendar.JDateChooser();
        txtngaybonhiem = new com.toedter.calendar.JDateChooser();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtchieucao = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        txtcannang = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        txtnhommau = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        txttinhtrangsuckhoe = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        txtthanhphanxuatthan = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        txtuutiengiadinh = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        txtuutienbanthan = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtngaytuyendung = new com.toedter.calendar.JDateChooser();
        txtnguontuyendung = new javax.swing.JTextField();
        btsua = new javax.swing.JButton();
        btthoat = new javax.swing.JButton();
        Btthem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Số hiệu công chức:");

        jLabel2.setText("Họ:");

        jLabel3.setText("Tên:");

        jLabel4.setText("Họ và tên:");

        jLabel5.setText("Tên gọi khác:");

        jLabel6.setText("Giới tính:");

        jLabel7.setText("Ngày sinh:");

        jLabel8.setText("Nơi sinh:");

        jLabel9.setText("Số CMND:");

        jLabel10.setText("Ngày cấp:");

        jLabel11.setText("Nơi cấp");

        txtgioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Nam", "Nữ" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsohieucongchuc)
                    .addComponent(txtngaycap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsocmnd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnoisinh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtgioitinh, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttengoikhac, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txthovaten, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtten, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtho)
                    .addComponent(txtnoicap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtsohieucongchuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttengoikhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtnoisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtsocmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(txtngaycap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtnoicap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Điện thoại di động:");

        jLabel13.setText("Điện thoại nhà riêng:");

        jLabel14.setText("Email:");

        jLabel15.setText("Dân tộc:");

        jLabel16.setText("Tôn giáo:");

        jLabel17.setText("Quốc tịch:");

        jLabel18.setText("Tình trạng hôn nhân:");

        jLabel19.setText("Quê quán:");

        jLabel20.setText("Địa chỉ thường trú:");

        jLabel21.setText("Nơi ở hiện nay:");

        jLabel22.setText("Ghi chú:");

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        jScrollPane1.setViewportView(txtghichu);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdienthoaididong, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdienthoainharieng, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdantoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttongiao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtquoctich, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttrinhtranghonnhan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtquequan)
                    .addComponent(txtdiachithuongtru)
                    .addComponent(txtnoiohiennay)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtdienthoaididong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdienthoainharieng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtdantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txttongiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(txtquoctich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txttrinhtranghonnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtquequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtdiachithuongtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtnoiohiennay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );

        jLabel23.setText("Đơn vị:");

        jLabel24.setText("Loại nhân sự: ");

        jLabel25.setText("Ngày tuyển dụng/Ký hợp đồng:");

        jLabel26.setText("Ngày bổ nhiệm ngạch/Chức danh nghề nghiệp:");

        jLabel27.setText("Chức danh:");

        jLabel28.setText("Chức vụ:");

        cb1.setText("Đại biểu quốc hội");

        cb2.setText("Đại biểu HĐND cấp tỉnh");

        cb3.setText("Đại biểu HĐND cấp huyện");

        cb4.setText("Đại biểu HĐND cấp xã");

        cb5.setText("Biên chế");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cb5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb1)
                                    .addComponent(cb3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdonvi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtloainhansu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(txtngaytuyendungkyhopdong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtchucdanh, javax.swing.GroupLayout.Alignment.TRAILING, 0, 109, Short.MAX_VALUE)
                            .addComponent(txtchucvu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtngaybonhiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cb4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(txtloainhansu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel25)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(cb5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtngaytuyendungkyhopdong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(txtngaybonhiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(txtchucdanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(txtchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb1)
                            .addComponent(cb2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel29.setText("Chiều cao (Cm):");

        jLabel30.setText("Cân nặng (Kg):");

        jLabel31.setText("Nhóm máu:");

        jLabel32.setText("Tình trạng sức khỏe:");

        jLabel33.setText("Thành phần xuất thân:");

        jLabel34.setText("Ưu tiên gia đình:");

        jLabel35.setText("Ưu tiên bản thân:");

        jLabel36.setText("Nguồn tuyển dụng:");

        jLabel37.setText("Ngày tuyển dụng:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtchieucao)
                    .addComponent(txtcannang)
                    .addComponent(txtnhommau, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttinhtrangsuckhoe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtthanhphanxuatthan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtuutiengiadinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtuutienbanthan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtngaytuyendung, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(txtnguontuyendung)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtchieucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcannang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(txtnhommau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttinhtrangsuckhoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(txtthanhphanxuatthan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(txtuutiengiadinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtuutienbanthan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtnguontuyendung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(txtngaytuyendung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(750, 750, 750)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btsua.setText("Sửa");
        btsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsuaActionPerformed(evt);
            }
        });

        btthoat.setText("Thoát");
        btthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btthoatActionPerformed(evt);
            }
        });

        Btthem.setText("Thêm");
        Btthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtthemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btthem)
                .addGap(36, 36, 36)
                .addComponent(btsua)
                .addGap(51, 51, 51)
                .addComponent(btthoat)
                .addGap(412, 412, 412))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsua)
                    .addComponent(btthoat)
                    .addComponent(Btthem))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtthemActionPerformed
         String sohieucongchuc = txtsohieucongchuc.getText();
        int shcc = Integer.parseInt(sohieucongchuc);
        String ho = txtho.getText();
        String ten = txtten.getText();
        String hovaten = txthovaten.getText();
        String tengoikhac = txttengoikhac.getText();
        String gioitinh = txtgioitinh.getSelectedItem().toString();
        SimpleDateFormat ns = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaysinh = ns.format(txtngaycap.getDate());
        
        String noisinh = txtnoisinh.getText();
        String socmnd = txtsocmnd.getText();
        int socmnd2 = Integer.parseInt(sohieucongchuc);
        SimpleDateFormat nc = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaycap = nc.format(txtngaycap.getDate());
        
        String noicap = txtnoicap.getSelectedItem().toString();
        String dienthoatdidong = txtdienthoaididong.getText();
        int dienthoatdidong2 = Integer.parseInt(dienthoatdidong);
        String dienthoainharieng = txtdienthoainharieng.getText();
        int dienthoainharieng2 = Integer.parseInt(dienthoainharieng);
        String email = txtemail.getText();
        String dantoc = txtdantoc.getSelectedItem().toString();
        String tongiao = txttongiao.getSelectedItem().toString();
        String quoctich = txtquoctich.getSelectedItem().toString();
        String trinhtranghonnhan = txttrinhtranghonnhan.getSelectedItem().toString();
        String quequan = txtquequan.getText();
        String diachithuongtru = txtdiachithuongtru.getText();
        String noiohiennay = txtnoiohiennay.getText();
        String ghichu = txtghichu.getText();
        String donvi = txtdonvi.getSelectedItem().toString();
        String daibieu = null;
        if(cb1.isSelected()){
             daibieu = "Đại biểu quốc hội";
        }if(cb2.isSelected()){
             daibieu = "Đại biểu HĐND cấp tỉnh";
        }if(cb3.isSelected()){
             daibieu = "Đại biểu HĐND cấp huyện";
        }if(cb4.isSelected()){
             daibieu = "Đại biểu HĐND cấp xã";
        }
        String loainhansu = txtloainhansu.getSelectedItem().toString();
        String bienche = null;
        if(cb5.isSelected()){
             bienche = "co";
        }else{
             bienche = "khong";
        }
        
        SimpleDateFormat ntdkhd = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaytuyendungkyhopdong = ntdkhd.format(txtngaycap.getDate());
        SimpleDateFormat nbnn = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaybonhiemngach = nbnn.format(txtngaycap.getDate());
        
        String chucdanh = txtchucdanh.getSelectedItem().toString();
        String chucvu = txtchucvu.getSelectedItem().toString();
        String chieucao = txtchieucao.getValue().toString();
        int chieucao2 = Integer.parseInt(chieucao);
        String cannang = txtcannang.getValue().toString();
        int cannang2 = Integer.parseInt(cannang);
        String nhommau = txtnhommau.getSelectedItem().toString();
        String tinhtrangsuckhoe = txttinhtrangsuckhoe.getSelectedItem().toString();
        String thanhphanxuatthan = txtthanhphanxuatthan.getSelectedItem().toString();
        String uutiengiadinh = txtuutiengiadinh.getSelectedItem().toString();
        String uutienbanthan = txtuutienbanthan.getSelectedItem().toString();
        String nguontuyendung = txtnguontuyendung.getText();
      
        SimpleDateFormat ntd = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaytuyendung = ntd.format(txtngaycap.getDate());
        
        bll.addNewEmployee( shcc,  ho, ten,  hovaten,  tengoikhac,  gioitinh, 
             ngaysinh,  noisinh,  socmnd2,  ngaycap,  noicap,  dienthoatdidong2,  dienthoainharieng2,
             email,  dantoc,  tongiao,   quoctich,  trinhtranghonnhan,  quequan,
             diachithuongtru,  noiohiennay,  ghichu,  donvi,  daibieu,  loainhansu,  bienche,
             ngaytuyendungkyhopdong,  ngaybonhiemngach,  chucdanh,  chucvu,  chieucao2,  cannang2, 
             nhommau,  tinhtrangsuckhoe,  thanhphanxuatthan,  uutiengiadinh,  uutienbanthan,
             nguontuyendung,  ngaytuyendung);
      
        
    }//GEN-LAST:event_BtthemActionPerformed

    private void btsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsuaActionPerformed
        String sohieucongchuc = txtsohieucongchuc.getText();
        int shcc = Integer.parseInt(sohieucongchuc);
        String ho = txtho.getText();
        String ten = txtten.getText();
        String hovaten = txthovaten.getText();
        String tengoikhac = txttengoikhac.getText();
        String gioitinh = txtgioitinh.getSelectedItem().toString();
        SimpleDateFormat ns = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaysinh = ns.format(txtngaycap.getDate());
        
        String noisinh = txtnoisinh.getText();
        String socmnd = txtsocmnd.getText();
        int socmnd2 = Integer.parseInt(sohieucongchuc);
        SimpleDateFormat nc = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaycap = nc.format(txtngaycap.getDate());
        
        String noicap = txtnoicap.getSelectedItem().toString();
        String dienthoatdidong = txtdienthoaididong.getText();
        int dienthoatdidong2 = Integer.parseInt(dienthoatdidong);
        String dienthoainharieng = txtdienthoainharieng.getText();
        int dienthoainharieng2 = Integer.parseInt(dienthoainharieng);
        String email = txtemail.getText();
        String dantoc = txtdantoc.getSelectedItem().toString();
        String tongiao = txttongiao.getSelectedItem().toString();
        String quoctich = txtquoctich.getSelectedItem().toString();
        String trinhtranghonnhan = txttrinhtranghonnhan.getSelectedItem().toString();
        String quequan = txtquequan.getText();
        String diachithuongtru = txtdiachithuongtru.getText();
        String noiohiennay = txtnoiohiennay.getText();
        String ghichu = txtghichu.getText();
        String donvi = txtdonvi.getSelectedItem().toString();
        String daibieu = null;
        if(cb1.isSelected()){
             daibieu = "Đại biểu quốc hội";
        }if(cb2.isSelected()){
             daibieu = "Đại biểu HĐND cấp tỉnh";
        }if(cb3.isSelected()){
             daibieu = "Đại biểu HĐND cấp huyện";
        }if(cb4.isSelected()){
             daibieu = "Đại biểu HĐND cấp xã";
        }
        String loainhansu = txtloainhansu.getSelectedItem().toString();
        String bienche = null;
        if(cb5.isSelected()){
             bienche = "co";
        }else{
             bienche = "khong";
        }
        
        SimpleDateFormat ntdkhd = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaytuyendungkyhopdong = ntdkhd.format(txtngaycap.getDate());
        SimpleDateFormat nbnn = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaybonhiemngach = nbnn.format(txtngaycap.getDate());
        
        String chucdanh = txtchucdanh.getSelectedItem().toString();
        String chucvu = txtchucvu.getSelectedItem().toString();
        String chieucao = txtchieucao.getValue().toString();
        int chieucao2 = Integer.parseInt(chieucao);
        String cannang = txtcannang.getValue().toString();
        int cannang2 = Integer.parseInt(cannang);
        String nhommau = txtnhommau.getSelectedItem().toString();
        String tinhtrangsuckhoe = txttinhtrangsuckhoe.getSelectedItem().toString();
        String thanhphanxuatthan = txtthanhphanxuatthan.getSelectedItem().toString();
        String uutiengiadinh = txtuutiengiadinh.getSelectedItem().toString();
        String uutienbanthan = txtuutienbanthan.getSelectedItem().toString();
        String nguontuyendung = txtnguontuyendung.getText();
      
        SimpleDateFormat ntd = new   SimpleDateFormat("dd-MM-yyyy");
        String ngaytuyendung = ntd.format(txtngaycap.getDate());
        
        bll.editEmployee(shcc,  ho, ten,  hovaten,  tengoikhac,  gioitinh, 
             ngaysinh,  noisinh,  socmnd2,  ngaycap,  noicap,  dienthoatdidong2,  dienthoainharieng2,
             email,  dantoc,  tongiao,   quoctich,  trinhtranghonnhan,  quequan,
             diachithuongtru,  noiohiennay,  ghichu,  donvi,  daibieu,  loainhansu,  bienche,
             ngaytuyendungkyhopdong,  ngaybonhiemngach,  chucdanh,  chucvu,  chieucao2,  cannang2, 
             nhommau,  tinhtrangsuckhoe,  thanhphanxuatthan,  uutiengiadinh,  uutienbanthan,
             nguontuyendung,  ngaytuyendung);
    }//GEN-LAST:event_btsuaActionPerformed

    private void btthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btthoatActionPerformed
        dispose();
    }//GEN-LAST:event_btthoatActionPerformed

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
    private javax.swing.JButton Btthem;
    private javax.swing.JButton btsua;
    private javax.swing.JButton btthoat;
    public javax.swing.JCheckBox cb1;
    public javax.swing.JCheckBox cb2;
    public javax.swing.JCheckBox cb3;
    public javax.swing.JCheckBox cb4;
    public javax.swing.JCheckBox cb5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner txtcannang;
    public javax.swing.JSpinner txtchieucao;
    public javax.swing.JComboBox<String> txtchucdanh;
    public javax.swing.JComboBox<String> txtchucvu;
    public javax.swing.JComboBox<String> txtdantoc;
    public javax.swing.JTextField txtdiachithuongtru;
    public javax.swing.JTextField txtdienthoaididong;
    public javax.swing.JTextField txtdienthoainharieng;
    public javax.swing.JComboBox<String> txtdonvi;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextArea txtghichu;
    public javax.swing.JComboBox<String> txtgioitinh;
    public javax.swing.JTextField txtho;
    public javax.swing.JTextField txthovaten;
    public javax.swing.JComboBox<String> txtloainhansu;
    public com.toedter.calendar.JDateChooser txtngaybonhiem;
    public com.toedter.calendar.JDateChooser txtngaycap;
    public com.toedter.calendar.JDateChooser txtngaysinh;
    public com.toedter.calendar.JDateChooser txtngaytuyendung;
    public com.toedter.calendar.JDateChooser txtngaytuyendungkyhopdong;
    public javax.swing.JTextField txtnguontuyendung;
    public javax.swing.JComboBox<String> txtnhommau;
    public javax.swing.JComboBox<String> txtnoicap;
    public javax.swing.JTextField txtnoiohiennay;
    public javax.swing.JTextField txtnoisinh;
    public javax.swing.JTextField txtquequan;
    public javax.swing.JComboBox<String> txtquoctich;
    public javax.swing.JTextField txtsocmnd;
    public javax.swing.JTextField txtsohieucongchuc;
    public javax.swing.JTextField txtten;
    public javax.swing.JTextField txttengoikhac;
    public javax.swing.JComboBox<String> txtthanhphanxuatthan;
    public javax.swing.JComboBox<String> txttinhtrangsuckhoe;
    public javax.swing.JComboBox<String> txttongiao;
    public javax.swing.JComboBox<String> txttrinhtranghonnhan;
    public javax.swing.JComboBox<String> txtuutienbanthan;
    public javax.swing.JComboBox<String> txtuutiengiadinh;
    // End of variables declaration//GEN-END:variables
}
