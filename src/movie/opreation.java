package movie;

import java.sql.*;
import java.util.List;

public class opreation {
    private Connection conn = null;

    public opreation(DBConnetion db) {
        conn = db.getMyConnection();
    }
    public boolean judge(String name){
        PreparedStatement prst=null;
        ResultSet res=null;
        String sql=" SELECT * FROM movie WHERE name = "+ "\""+name+"\"";
        System.out.println(sql);
        try{
            prst=conn.prepareStatement(sql);
            res=prst.executeQuery();
            if (res.next()){
               // System.out.println("找到这个片子了");
                return true;
            }
            else
                return false;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println("未找到这个片子");
        return false;
    }
    public String[] find(){
        String [] S=new String[100];
        int i=0;
        PreparedStatement prst=null;
        ResultSet res=null;
        String sql=" SELECT * FROM movie";
        System.out.println(sql);
        try{
            prst=conn.prepareStatement(sql);
            res=prst.executeQuery();
            while(res.next()){
                S[i++]=res.getString("name");
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
//        for (String str:S
//             ) {
//            System.out.println("operation :"+str);
//        }
        return S;
    }
}
