package com.neudu.tms.view;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        while (true) {
            System.out.println("==========欢迎登录东软===========");
            System.out.println("1---------管理员登录");
            System.out.println("2---------护工登录");
            System.out.println("3---------退出");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的选择:");
            int result = sc.nextInt();

            switch (result) {
                case 1:
                    System.out.println("管理员登录");
                    AdminLoginMenu adminLoginMenu = new AdminLoginMenu();
                    adminLoginMenu.execute();
                    break;
                case 2:
                    System.out.println("护工登录");
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("输入无效，请重新输入");
                    break;


            }
        }
    }
}