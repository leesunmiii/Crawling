package com.sist.gocamping;

import java.util.*;
import com.sist.gocamping.GoCampingVO;
import java.sql.*;

public class GoCampingDAO {
   private Connection conn;
   private PreparedStatement ps; //sql문장을 전송하는 역할
   private final String URL="jdbc:oracle:thin:@211.238.142.111:1521:XE";
   
   public GoCampingDAO()
   {
      try
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      }catch(Exception ex) {}
   }
   
   public void getConnetcion()
   {
      try
      {
         conn=DriverManager.getConnection(URL,"hr","happy");
         
      }catch(Exception ex) {}
   }
   
   public void disConnection()
   {
      try
      {
         if(ps!=null) ps.close();
         if(conn!=null) conn.close();
      }catch(Exception ex) {}
   }
   
   public void campInsert(GoCampingVO vo)
   {
      try
      {
         getConnetcion();
         String sql="INSERT INTO GoCamping1 VALUES("
                  +"GoCamping1_mno_seq.nextval,"
                  + "?,?,?,?,?,?,?,?,?,?,"
                  + "?,?,?,?,?,?,?,?,?,?,"
                  + "?,?,?,?,?,?,?,?,?,?,"
                  + "?,?,?,?,?,?,?)";
         ps=conn.prepareStatement(sql);
         ps.setString(1, vo.getTitle());
         ps.setString(2, vo.getSubtitle());
         ps.setString(3, vo.getPoster());
         ps.setString(4, vo.getLoc());
         ps.setString(5, vo.getNum());
         ps.setString(6, vo.getEnvir());
         ps.setString(7, vo.getCategory());
         ps.setString(8, vo.getSeason());
         ps.setString(9, vo.getOpen());
         ps.setString(10, vo.getHomepage());
         ps.setString(11, vo.getReservation());
         ps.setString(12, vo.getFacility());
         ps.setString(13, vo.getPic1());
         ps.setString(14, vo.getPic2());
         ps.setString(15, vo.getPic3());
         ps.setString(16, vo.getExplain());
         ps.setInt(17, vo.getHit());
         ps.setString(18,vo.getPicc1());
         ps.setString(19,vo.getPicc2());
         ps.setString(20,vo.getPicc3());
         ps.setString(21,vo.getPicc4());
         ps.setString(22,vo.getPicc5());
         ps.setString(23,vo.getPicc6());
         ps.setString(24,vo.getPicc7());
         ps.setString(25,vo.getPicc8());
         ps.setString(26,vo.getPicc9());
         ps.setString(27,vo.getPicc10());
         ps.setString(28,vo.getPicc11());
         ps.setString(29,vo.getPicc12());
         ps.setString(30,vo.getPicc13());
         ps.setString(31,vo.getPicc14());
         ps.setString(32,vo.getPicc15());
         ps.setString(33,vo.getPicc16());
         ps.setString(34,vo.getPicc17());
         ps.setString(35,vo.getPicc18());
         ps.setString(36,vo.getPicc19());
         ps.setString(37,vo.getPicc20());
         
         ps.executeUpdate();
         
      }catch(Exception ex)
      {
         ex.printStackTrace();
      }
      finally
      {
         disConnection();   
      }
   }
      
   }   
