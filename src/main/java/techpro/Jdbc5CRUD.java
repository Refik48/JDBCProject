package techpro;

import java.sql.*;

public class Jdbc5CRUD {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String yol = "jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection(yol, "Refik", "1234");
        Statement st = con.createStatement();
         /*=======================================================================
		  ORNEK1: urunler adinda bir tablo olusturalim id(NUMBER(3),
		  isim VARCHAR2(10) fiyat NUMBER(7,2)
		========================================================================*/
//        String createQuery = "CREATE TABLE urunler2("
//                + " id NUMBER(3),"
//                + " isim VARCHAR2(10),"
//                + " fiyat NUMBER(7,2))";
//
//        st.execute(createQuery);
//        System.out.println("urunler2 tablosu olusturuldu..");
           /*=======================================================================
		  ORNEK2: urunler tablosuna asagidaki kayitlari toplu bir sekilde ekleyelim
		========================================================================*/

        // Cok miktarda kayit eklemek icin PreparedStatement metodu kullanilabilir.
        // PreparedStatement hem hizli hem de daha guvenli (SQL injection saldirilari icin) bir yontemdir.
        // Bunun icin;
        // 	1) Veri girisine uygun bir POJO(Plain Old Java Object) sinifi olusturulur.
        // 	2) POJO Class nesnelerini saklayacak bir collection olusturulur
        // 	3) bir dongu ile kayitlar eklenir.


    }
}
