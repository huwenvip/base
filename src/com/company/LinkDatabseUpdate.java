package com.company;

/**
 * @author huwen
 * @date 2021/1/12 14:51
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author huwen
 * @date 2021/1/12 14:15
 */
public class LinkDatabseUpdate {

    public static  void main(String[] args) throws  ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.102.125:3306/business","iotapi","cmiot@2018");
        String sql = "update stu set name=?,age=? where id=?";//执行的sql语句
        PreparedStatement statement =connection.prepareCall(sql);
        //statement.setInt(1,11);
        //tatement.setString(2,"test");
        int i =statement.executeUpdate();
        System.out.println(i);
        statement.close();
        connection.close();

    }
}
