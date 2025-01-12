import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        String query = "select name from t_company tc where id=?";

        String dbUrl ="jdbc:mysql://localhost:3306/bookmedb";
        String userName = "root";
        String password = "SC92@mysql";

        Connection con = DriverManager.getConnection(dbUrl,userName,password);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,1);
        ResultSet rs = st.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));
        con.close();




    }
}