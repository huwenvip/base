package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author huwen
 * @date 2021/1/12 14:15
 */
public class LinkDatabseInsert {

    public static  void main(String[] args) throws  ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://10.19.102.125:3306/business","iotapi","cmiot@2018");
        String sql = "INSERT INTO `business`.`oper`(`oper_id`, `oper_name`, `acct`, `acct_level`, `pwd`, `email`, `phone`, `sex`, `status`, `fail_count`, `login_count`, `login_direct`, `reset_flag`, `create_by`, `modify_by`) VALUES (5, '一级管理员', 'admin_hw', 1, 'd1d322f4552c4452799346df6a24e191', 'zwkj099@163.com', '9090980', 0, 0, 0, 11, 0, 0, 1, 1)";
        PreparedStatement statement =connection.prepareCall(sql);
        //statement.setInt(1,11);
        //tatement.setString(2,"test");
        int i =statement.executeUpdate();
        System.out.println(i);
        statement.close();
        connection.close();

    }
}
