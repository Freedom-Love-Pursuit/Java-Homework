package com.neudu.tms.view;

import com.neudu.tms.service.Customer;

import java.util.Scanner;

public class AdminLoginMenu {
    public void execute(){
        while(true){
            System.out.println("==========系统管理员登陆===========");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            //此处读取文件数据，判断管理员是否存在，用while循环依次进行比对
            if(username.equals("111") && password.equalsIgnoreCase("111")){
              while(true) {
                  System.out.println("1.客户管理");
                  System.out.println("2.床位管理");
                  System.out.println("3.护理管理");
                  System.out.println("4.健康管家");
                  System.out.println("5.用户管理");
                  System.out.println("6.返回主菜单");
                  Scanner sc1 = new Scanner(System.in);
                  System.out.print("请输入您的选择:");
                  int result1 = sc.nextInt();
                  switch (result1) {
                      case 1:
                          System.out.println("客户管理");
                          customerManage();
                          break;
                      case 2:
                          System.out.println("床位管理");
                          bedManage();
                          break;
                      case 3:
                          System.out.println("护理管理");
                          nursingManage();
                          break;
                      case 4:
                          System.out.println("健康管家");
                          healthGuard();
                          break;
                      case 5:
                          System.out.println("用户管理");
                          userManage();
                          break;
                      case 6:
                         return;
                  }
              }
            }else{
                System.out.println("用户名或密码错误,请重新输入");
                continue;
            }
        }
    }

         //客户管理
    public void customerManage(){
       while(true) {
           System.out.println("==========客户管理===========");
           System.out.println("1.入住登记");
           System.out.println("2.退住登记");
           System.out.println("3.外出登记");
           System.out.println("4.返回");
           Scanner sc = new Scanner(System.in);
           System.out.print("请输入您的选择:");
           int result = sc.nextInt();
           switch (result) {
               case 1:
                   System.out.println("入住登记");
                   customerManageFunction1();
                   break;
               case 2:
                   System.out.println("退住登记");
                   customerManageFunction2();
                   break;
               case 3:
                   System.out.println("外出登记");
                   customerManageFunction3();
                   break;
               case 4:
                   return;

               default:
                   System.out.println("输入无效，请重新输入");
                   continue;
           }
       }
    }
        //客户管理的三个功能

       //1.入住登记
    public void customerManageFunction1(){
     while ( true){
         System.out.println("1.查询客户信息数据列表");
         System.out.println("2.登记客户入住信息");
         System.out.println("3.删除客户信息");
         System.out.println("4.修改客户信息");
         System.out.println("5.返回");
         Scanner sc = new Scanner(System.in);
         System.out.print("请输入您的选择:");
         int result = sc.nextInt();
         switch (result) {
             case 1:
                 System.out.println("查询客户信息数据列表");
                 InquiryCustomer();
                 break;
             case 2:
                 System.out.println("登记客户入住信息");
                 break;
             case 3:
                 System.out.println("删除客户信息");
                 break;
             case 4:
                 System.out.println("修改客户信息");
                 break;
             case 5:
                 return;
             default:
                 System.out.println("输入无效，请重新输入");
         }





     }

    }
//查询客户信息
    public void InquiryCustomer(){

        System.out.println("请输入客户姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入客户类型");
        String type = sc.next();
        //读取文件数据，判断客户是否存在，此处可以遍历文件，一一比对姓名和客户类型信息，得到该用户
        Customer customer = new Customer();
        //此处需要代码判断，如果客户不存在，则输出无此用户
        customer.display();

    }
    //登记客户入住信息
    public void RegisterCustomer(){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入客户姓名");
        String name = sc.next();
        System.out.println("请输入客户出生日期");
        String birth = sc.next();
        System.out.println("请输入客户性别");
        String sex = sc.next();
        System.out.println("请输入客户身份证号");
        String ID = sc.next();
        System.out.println("请输入客户血型");
        String blood = sc.next();
        System.out.println("请输入客户家属");
        String family = sc.next();
        System.out.println("请输入客户联系电话");
        String phone = sc.next();
        System.out.println("请输入楼栋");
        String floor = sc.next();
        System.out.println("请输入房间号");
        String room = sc.next();
        System.out.println("请输入床位号");
        String bed = sc.next();
        System.out.println("请输入入住时间");
        String inTime = sc.next();
        System.out.println("请输入预计退住时间");
        String outTime = sc.next();
        Customer customer = new Customer(name,birth,sex,ID,blood,family,phone,floor,room,bed,inTime,outTime);
        //此处需要代码存储用户信息




    }


       //2.退住登记
    public void customerManageFunction2(){}
       //3.外出登记
    public void customerManageFunction3(){}




       //床位管理
    public void bedManage(){
   while ( true) {
       System.out.println("==========床位管理===========");
       System.out.println("1.床位示意图");
       System.out.println("2.床位管理");
       System.out.println("3.返回");
       Scanner sc = new Scanner(System.in);
       System.out.print("请输入您的选择:");
       int result = sc.nextInt();
       switch (result) {
           case 1:
               System.out.println("床位分配");
               break;
           case 2:
               System.out.println("床位管理");
               break;
           case 3:
               return;
           default:
               System.out.println("输入无效，请重新输入");
               continue;
       }
   }
}
      //床位管理的两个功能
      //1.窗位示意图
    public void bedManageFunction1(){}
     //2.床位管理
    public void bedManageFunction2(){}


      //护理管理
    public void nursingManage(){
        while(true) {
            System.out.println("==========护理管理===========");
            System.out.println("1.护理级别");
            System.out.println("2.护理项目");
            System.out.println("3.客户护理设置");
            System.out.println("4.护理记录");
            System.out.println("5.返回");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的选择:");
            int result = sc.nextInt();
            switch (result) {
                case 1:
                    System.out.println("护理级别");
                    break;
                case 2:
                    System.out.println("护理项目");
                    break;
                case 3:
                    System.out.println("客户护理设置");
                    break;
                case 4:
                    System.out.println("护理记录");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("输入无效，请重新输入");
                    continue;
            }
        }

    }
    //护理管理的四个功能
    //1.护理级别
    public void nursingManageFunction1(){}
    //2.护理项目
    public void nursingManageFunction2(){}
    //3.客户护理设置
    public void nursingManageFunction3(){}
    //4.护理记录
    public void nursingManageFunction4(){}



    //健康管家
    public void healthGuard(){
        while(true) {

            System.out.println("==========健康管家===========");
            System.out.println("1.设置服务对象");
            System.out.println("2.服务关注");
            System.out.println("3.返回");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的选择:");
            int result = sc.nextInt();
            switch (result) {
                case 1:
                    System.out.println("设置服务对象");
                    break;
                case 2:
                    System.out.println("服务关注");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("输入无效，请重新输入");
                    continue;
            }
        }
    }
    //健康管家的两个功能
    //1.设置服务对象
    public void healthGuardFunction1(){}
    //2.服务关注
    public void healthGuardFunction2(){}

    //用户管理
    public void userManage() {
        while (true) {
            System.out.println("==========用户管理===========");
            System.out.println("1.基础数据维护");
            System.out.println("2.返回");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的选择:");
            int result = sc.nextInt();
            switch (result) {
                case 1:
                    System.out.println("基础数据维护");
                    userManageFunction1();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("输入无效，请重新输入");
                    continue;
            }
        }
    }
    //用户管理的一个功能
    //1.基础数据维护
    public void userManageFunction1(){}


}
