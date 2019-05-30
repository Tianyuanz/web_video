package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnetion {
    private final String DRIVER_NAME="com.mysql.jdbc.Driver";
    private final String URL="jdbc:mysql://localhost:3306/user_db?serverTimezone=GMT";
    private final String user="root";
    private final String pwd="1314520zty";
    private Connection conn=null;
    private Statement stmt=null;
    private String DBDriver;

    public DBConnetion(){
        try{
            Class.forName(DRIVER_NAME);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            conn= DriverManager.getConnection(URL,user,pwd);
            stmt=conn.createStatement();
            System.out.println("数据库连接成功");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public Connection getMyConnection(){
        return conn;
    }
    public Statement getMyStatement(){
        return stmt;
    }
    public void closeMyConnection(){//关闭数据库连接
        try{
            stmt.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public String toString(){
        return "数据库驱动程序"+DBDriver+"，链接地址"+URL+"，用户名"+user+"，密码"+pwd;
    }

}
