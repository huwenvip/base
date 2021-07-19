package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author huwen
 * @date 2021/1/12 14:54
 */
public class LinkDatabseDelete {
    public static  void main(String[] args) throws  ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.102.125:3306/business","iotapi","cmiot@2018");
        String sql = "delete from stu where id=?";//执行的sql语句
        PreparedStatement statement =connection.prepareCall(sql);
        //statement.setInt(1,11);
        //tatement.setString(2,"test");
        int i =statement.executeUpdate();
        System.out.println(i);
        statement.close();
        connection.close();

    }
}
