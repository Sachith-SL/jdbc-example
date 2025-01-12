import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        String sql = "select name from t_company tc where id=1";

        String dbUrl ="jdbc:mysql://localhost:3306/bookmedb";
        String userName = "root";
        String password = "SC92@mysql";

        Connection con = DriverManager.getConnection(dbUrl,userName,password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        rs.next();
        System.out.println(rs.getString(1));
        con.close();




    }
}