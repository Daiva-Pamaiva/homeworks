package lt.bit.tiekimas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    List<Tiekejas> kolekcija = new ArrayList<>();
    kolekcija = uzkrautiDuomenis();
    for (Tiekejas tiekejas : kolekcija) {
      System.out.println(tiekejas.toString());
    }
  }

  public static List<Tiekejas> uzkrautiDuomenis() throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con =
        DriverManager.getConnection("jdbc:mysql://localhost:3306/tiekimas", "dbaleviciute", "programuotojas");
    PreparedStatement st = con.prepareStatement(
        "SELECT tiekejas.Id, tiekejas.vardas, tiekejas.pavarde, tiekejas.el_pastas, patiekta.vnt\n"
            + "FROM tiekejas JOIN patiekta ON tiekejas.Id = patiekta.tiekejas_id;");
    ResultSet rs = st.executeQuery();
    List<Tiekejas> tarpinis = new ArrayList<>();
    while (rs.next()) {

      int id = rs.getInt(1);
      String vardas = rs.getString(2);
      String pavarde = rs.getString(3);
      String elPastas = rs.getString(4);

      Tiekejas tiek = tarpinis.stream().filter(s -> s.getId() == id).findAny().orElseGet(() -> {
        Tiekejas tie = new Tiekejas(id, vardas, pavarde, elPastas);
        tarpinis.add(tie);
        return tie;
      });

      int vnt = rs.getInt("vnt");
      tiek.getPatiekta().add(vnt);
    }
    con.close();
    return tarpinis;
  }
  
  public static void uzkrautiDuomenisDu() {}
}
