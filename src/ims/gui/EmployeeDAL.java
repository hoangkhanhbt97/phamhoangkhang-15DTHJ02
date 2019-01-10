/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class EmployeeDAL {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/nhanvien";
    static final String USER = "root";
    static final String PASS = "";
    public ResultSet readEmployee() {
        Connection conn = null;
        Statement stmt = null;
        try {
            
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhanvien";
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
//            try {
//                if (stmt != null)
//                    stmt.close();
//            } catch (SQLException ex) {
//            }
//            try {
//                if (conn != null)
//                    conn.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
        }
        return null;
    }
    
    
    
    public void addNewEmployee (int SHCC, String ho,String ten, String hovaten, String tengoikhac, String gioitinh, 
            String ngaysinh, String noisinh, int socmnd, String ngaycap, String noicap, int dtdd, int dtnr,
            String email, String dantoc, String tongiao,  String quoctich, String tthonnhan, String quequan,
            String dctt, String noht, String ghichu, String donvi, String daibieu, String loainhansu, String bienche,
            String ngaytdkhd, String ngaybng, String chucdanh, String chucvu, int chieucao, int cannang, 
            String nhommau, String trinhtrangsuckhoe, String thanhphanxuatthan, String uutiengiadinh, String uutienbanthan,
            String nguontuyendung, String ngaytuyendung) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "INSERT INTO nhanvien VALUES ("+ SHCC +", '"+ ho +"' ,'"+ ten +"','"+  hovaten +"',"
                    + "'"+ tengoikhac +"','"+ gioitinh +"', '"+ ngaysinh +"', '"+ noisinh +"', "+ socmnd +","
                    + "'"+ ngaycap +"', '"+ noicap +"', "+  dtdd +","+ dtnr +", '"+ email +"', '"+ dantoc+"',"
                    + "'"+ tongiao +"', '"+  quoctich +"', '"+  tthonnhan +"', '"+ quequan +"', '"+ dctt +"',"
                    + "'"+ noht +"', '"+ ghichu +"', '"+ donvi +"', '"+ daibieu +"', '"+  loainhansu +"', '"+ bienche +"',"
                    + "'"+ ngaytdkhd +"' , '"+ ngaybng +"', '"+ chucdanh +"', '"+  chucvu +"', "+  chieucao +", "
                    + ""+  cannang +", '"+ nhommau +"','"+ trinhtrangsuckhoe +"', '"+ thanhphanxuatthan +"', "
                    + "'"+ uutiengiadinh +"', '"+ uutienbanthan +"', '"+ nguontuyendung +"', '"+ ngaytuyendung +"')";
            stmt.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void deleteEmployee (String SHCC) {
        Connection conn = null;
        Statement stmt = null;
            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                stmt = conn.createStatement();
                String sql = "DELETE FROM nhanvien WHERE SHCC = " + SHCC;
                stmt.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void editEmployee(int SHCC, String ho,String ten, String hovaten, String tengoikhac, String gioitinh, 
            String ngaysinh, String noisinh, int socmnd, String ngaycap, String noicap, int dtdd, int dtnr,
            String email, String dantoc, String tongiao,  String quoctich, String tthonnhan, String quequan,
            String dctt, String noht, String ghichu, String donvi, String daibieu, String loainhansu, String bienche,
            String ngaytdkhd, String ngaybng, String chucdanh, String chucvu, int chieucao, int cannang, 
            String nhommau, String trinhtrangsuckhoe, String thanhphanxuatthan, String uutiengiadinh, String uutienbanthan,
            String nguontuyendung, String ngaytuyendung) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "UPDATE nhanvien SET SHCC = "+ SHCC +", ho = '"+ ho +"' ,ten = '"+ ten +"', hovaten = '"+  hovaten +"',"
                    + " tengoikhac = '"+ tengoikhac +"', gioitinh = '"+ gioitinh +"', ngaysinh = '"+ ngaysinh +"', noisinh = '"+ noisinh +"', socmnd = "+ socmnd +","
                    + " ngaycap = '"+ ngaycap +"', noicap = '"+ noicap +"', dtdd = "+  dtdd +", dtnr = "+ dtnr +", email = '"+ email +"', dantoc = '"+ dantoc+"', "
                    + " tongiao = '"+ tongiao +"', quoctich = '"+  quoctich +"', tthonnhan = '"+  tthonnhan +"', quequan = '"+ quequan +"', dctt = '"+ dctt +"', "
                    + " noht = '"+ noht +"', ghichu = '"+ ghichu +"', donvi = '"+ donvi +"', daibieu ='"+ daibieu +"', loainhansu =  '"+  loainhansu +"', bienche = '"+  bienche +"',"
                    + " ngaytdkhd = '"+ ngaytdkhd +"' , ngaybng = '"+ ngaybng +"',chucdanh = '"+ chucdanh +"',chucvu = '"+  chucvu +"', chieucao = "+  chieucao +", "
                    + " cannang = "+ cannang +", nhommau = '"+ nhommau +"', trinhtrangsuckhoe = '"+ trinhtrangsuckhoe +"', thanhphanxuatthan =  '"+ thanhphanxuatthan +"', "
                    + " uutiengiadinh = '"+ uutiengiadinh +"', uutienbanthan = '"+ uutienbanthan +"', nguontuyendung = '"+ nguontuyendung +"', ngaytuyendung = '"+ ngaytuyendung +"' WHERE SHCC = "+ SHCC;
           
            stmt.executeUpdate(sql);
//            ResultSet rs = stmt.executeQuery(sql);
//            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    
    public ResultSet editid(String SHCC) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            int shcc = Integer.parseInt(SHCC);
            String sql = "SELECT * FROM nhanvien WHERE SHCC = "+ shcc;
           
            stmt.executeUpdate(sql);
//            ResultSet rs = stmt.executeQuery(sql);
//            rs.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException ex) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

}
