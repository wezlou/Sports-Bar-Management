package bar;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Bar {
      private static java.sql.Connection connect;
         public static java.sql.Connection getConnected() {
        if(connect==null){
            try{
                String url="jdbc:mysql://localhost:3306/final_proj?zeroDateTimeBehavior=CONVERT_TO_NULL";
                 String user ="root";
                  String password ="";
                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    connect=DriverManager.getConnection(url,user,password);   
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }return connect;
}
    public static void main(String[] args) {
       
    }
}
