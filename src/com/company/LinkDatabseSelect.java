package com.company;

import java.sql.*;

/**
 * @author huwen
 * @date 2021/1/12 14:56
 */
public class LinkDatabseSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册数据库的驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取数据库连接（里面内容依次是："jdbc:mysql://主机名:端口号/数据库名","用户名","登录密码"）
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.102.125:3306/test","iotapi","cmiot@2018");
        //3.需要执行的sql语句（?是占位符，代表一个参数）
        String sql = "select * from stu where age in(?,?)";
        //4.获取预处理对象，并给参数赋值
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1,1);  //字段类型是int，就是setInt；1代表第一个参数
        statement.setInt(2,4);  //字段类型是int，就是setInt；2代表第一个参数
        //5.执行sql语句（返回结果集）
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){    //如果有下一条记录
            String stu = resultSet.getString("stu");  //根据列名返回值
            String name = resultSet.getString("name");  //根据列名返回值
            int age = resultSet.getInt(3);  //根据列的顺序返回值
            String add = resultSet.getString(4);  //根据列的顺序返回值
            System.out.println(stu+"\t"+name+"\t"+age+"\t"+add);
        }
        //6.关闭jdbc连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}