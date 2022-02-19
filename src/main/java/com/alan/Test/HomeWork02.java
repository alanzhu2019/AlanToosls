package com.alan.Test;

/**
 * @author Alan zhu
 * @date 2022/2/19 16:43
 */
public class HomeWork02 {

    public static void main(String[] args) {

        String name ="alan";
        String pwd = "12345@6";
        String mail = "aaa@qq.com";
        try {
            userRegister(name,pwd,mail);
            System.out.println("注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name ,String pwd ,String mail){

        int nameLength = name.length();
        if ( !(nameLength >= 2 && nameLength<= 4)){
            throw new RuntimeException("用户名长度为2-4！");
        }

        if ( !(pwd.length() == 6 && isDigital(pwd)) ){
            throw new RuntimeException("密码必须为6位数字");
        }

        int index = mail.indexOf("@");
        int j = mail.indexOf(".");
        if ( !(index > 0 && j > index) ){
            throw new RuntimeException("邮箱格式不正确！");
        }
    }


    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i:chars){

            boolean digit = Character.isDigit(i);
            if (!digit ){
                return false;
            }
        }
        return true;
    }
}
