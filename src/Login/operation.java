package Login;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class operation {
    private Connection conn=null;
    public operation(DBConnetion mydb){
        conn=mydb.getMyConnection();
    }
    public Type judge_pwd(String username,String pwd){
        Type type=new Type();
        PreparedStatement prst=null;
        ResultSet rs=null;
        String sql=" SELECT * FROM user WHERE id="+username +" AND pwd="+pwd ;
        System.out.println(sql);
        try{
            prst=conn.prepareStatement(sql);
            rs=prst.executeQuery();
            while(rs.next()){
                type.b=true;
                type.u=new user(rs.getString("id"),rs.getString("name")
                ,rs.getString("pwd"),rs.getString("phone"),rs.getString("school"),
                        rs.getString("email"),rs.getString("gender"),rs.getString("hobits"),
                        rs.getString("class"));
                return type;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            conn.close();
            prst.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        type.b=false;
        return type;
    }
    public boolean signup(String username,String email,String pwd){
        String sql="insert into user ( id,email,pwd ) values"+"("+username+", "+email+", "+pwd+")";
        PreparedStatement prst=null;
        int rs;
        System.out.println(sql);
        try{
            prst=conn.prepareStatement(sql);
            rs=prst.executeUpdate();
            System.out.println(rs);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try {
            prst.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
