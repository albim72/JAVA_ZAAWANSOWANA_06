package marcin.com;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bazatestowa";
        String user = "root";
        String password = "abc123";

        String query = "CREATE TABLE IF NOT EXISTS registration " +
                "(id INTEGER not NULL, " +
                "first VARCHAR(50)," +
                "last VARCHAR(50)," +
                "age INTEGER," +
                "PRIMARY KEY(id))";

        String mSelect = "SELECT id, first,last,age FROM registration";

        try(Connection con = DriverManager.getConnection(url,user,password);
            Statement st = con.createStatement();
            ){
            st.executeUpdate(query);
            System.out.println("Tabela została utworzona!");

//            System.out.println("dodanie rekordu do tabeli...");
//            String sql_z  = "INSERT INTO registration VALUES(107,'Anna','Kot',45)";
//            st.executeUpdate(sql_z);
//            System.out.println("dodanie rekordu do tabeli...");
//            String sql_u  = "INSERT INTO registration VALUES(102,'Leon','Krupa',22)";
//            st.executeUpdate(sql_u);
//            System.out.println("dodanie rekordu do tabeli...");
//            String sql_v  = "INSERT INTO registration VALUES(104,'Lidia','Bona',30)";
//            st.executeUpdate(sql_v);

            ResultSet rs = st.executeQuery(mSelect + " ORDER BY first ASC");
            while (rs.next()){
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", WIEK: " + rs.getInt("age"));
                System.out.print(", IMIĘ: " + rs.getString("first"));
                System.out.print(", NAZWISKO: " + rs.getString("last") + "\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
