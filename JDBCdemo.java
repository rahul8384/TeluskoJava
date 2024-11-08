import java.util.*;
import java.sql.*;

/* let's remember the theory
1. import the package which is --> java.sql.*;
2. a) load -->to load the connector we have to download the mysql connector since we'll be using that

   b) Register  --> to register the driver, there is a function called forname("pass the driver")
                    now this function belong to a class called Class.

3. To establish the connection we need to implement an interface called connection
   now to get the object of this interface we have a static method called getConnection
   this method belongs to the driver class.

4.create the statement --> statement is also an interface
5. execute the query
6. process the query
7. get the object of the connection, close it and get the object of the statement and close it.

* */

public class jdbcDemo {

    public static void main(String[] args) throws Exception{

        String url = "jdbc:mysql://localhost:3306/aliens";
        String username = "";
        String password = "";
        int userid = 6;
        String uname = "Aditi";
        String query = "Insert into students values (?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, userid);
        st.setString(2, uname);
        int rs = st.executeUpdate();
//        var meta = rs.getMetaData();

        //all the below methods are used to print all the values from the database

//        for(int i=1; i<=meta.getColumnCount(); i++){
//            System.out.printf("%s ",meta.getColumnName(i).toUpperCase());
//        }
//        System.out.println();
//
//        String userData = " ";
//        while(rs.next()){
//            userData = rs.getInt(1) + " : " + rs.getString(2);
//            System.out.println(userData);
//        }

//       while(rs.next()) {
////           for(int i=1; i<=meta.getColumnCount(); i++){
////               System.out.printf("%s",rs.getString(i));
////           }
//           ^ and below one are two different method to get all the data (by tim buchalka)

////           System.out.printf("%d %s %n",
////           rs.getInt("userid"),
////           rs.getString("username"));
//       }
//      this is below print statement is used to get the affected number of rows because of updating the data
        System.out.println(rs + " rows affected ");
        st.close();
        con.close();
    }
}
