/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class EmployeeBLL {
    EmployeeDAL dal = new EmployeeDAL();
    public ResultSet readEmployee () {
        ResultSet rs = dal.readEmployee();
        return rs;
    }
    public void addNewEmployee(int SHCC, String ho,String ten, String hovaten, String tengoikhac, String gioitinh, 
            String ngaysinh, String noisinh, int socmnd, String ngaycap, String noicap, int dtdd, int dtnr,
            String email, String dantoc, String tongiao,  String quoctich, String tthonnhan, String quequan,
            String dctt, String noht, String ghichu, String donvi, String daibieu, String loainhansu, String bienche,
            String ngaytdkhd, String ngaybng, String chucdanh, String chucvu, int chieucao, int cannang, 
            String nhommau, String trinhtrangsuckhoe, String thanhphanxuatthan, String uutiengiadinh, String uutienbanthan,
            String nguontuyendung, String ngaytuyendung) {
       
            dal.addNewEmployee( SHCC,  ho, ten,  hovaten,  tengoikhac,  gioitinh, 
             ngaysinh,  noisinh,  socmnd,  ngaycap,  noicap,  dtdd,  dtnr,
             email,  dantoc,  tongiao,   quoctich,  tthonnhan,  quequan,
             dctt,  noht,  ghichu,  donvi,  daibieu,  loainhansu,  bienche,
             ngaytdkhd,  ngaybng,  chucdanh,  chucvu,  chieucao,  cannang, 
             nhommau,  trinhtrangsuckhoe,  thanhphanxuatthan,  uutiengiadinh,  uutienbanthan,
             nguontuyendung,  ngaytuyendung);
     
    }
    
    public void deleteEmployee(String SHCC) throws Exception{
       
            dal.deleteEmployee(SHCC);
      
    }
    public void editEmployee(int SHCC, String ho,String ten, String hovaten, String tengoikhac, String gioitinh, 
            String ngaysinh, String noisinh, int socmnd, String ngaycap, String noicap, int dtdd, int dtnr,
            String email, String dantoc, String tongiao,  String quoctich, String tthonnhan, String quequan,
            String dctt, String noht, String ghichu, String donvi, String daibieu, String loainhansu, String bienche,
            String ngaytdkhd, String ngaybng, String chucdanh, String chucvu, int chieucao, int cannang, 
            String nhommau, String trinhtrangsuckhoe, String thanhphanxuatthan, String uutiengiadinh, String uutienbanthan,
            String nguontuyendung, String ngaytuyendung) {
        
            dal.editEmployee( SHCC ,  ho, ten,  hovaten,  tengoikhac,  gioitinh, 
             ngaysinh,  noisinh,  socmnd,  ngaycap,  noicap,  dtdd,  dtnr,
             email,  dantoc,  tongiao,   quoctich,  tthonnhan,  quequan,
             dctt,  noht,  ghichu,  donvi,  daibieu,  loainhansu,  bienche,
             ngaytdkhd,  ngaybng,  chucdanh,  chucvu,  chieucao,  cannang, 
             nhommau,  trinhtrangsuckhoe,  thanhphanxuatthan,  uutiengiadinh,  uutienbanthan,
             nguontuyendung,  ngaytuyendung);
     
    }
    public void editid(String id){
        dal.editid(id);
        
    }
    public static void main(String[] args) {
        
    }

    ResultSet editid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
