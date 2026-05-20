package com.neudu.tms.view;

import com.neudu.tms.service.Customer;
import com.neudu.tms.service.Room;

import java.util.ArrayList;
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
         System.out.println("==========入住登记===========");
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
                 RegisterCustomer();
                 break;

             case 3:
                 System.out.println("删除客户信息");
                 DelateCustomer();
                 break;
             case 4:
                 System.out.println("修改客户信息");
                 ModifyCustomer();
                 break;
             case 5:
                 return;
             default:
                 System.out.println("输入无效，请重新输入");
         }





     }

    }
    //重复使用的查询方法
    public ArrayList<Customer> Inquiry() {
        System.out.println("请输入客户姓名");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //读取文件数据，判断客户是否存在，此处可以遍历文件，一一比对姓名和客户类型信息，得到该用户
        //但是此处可能有多个用户，可以新建一个Arraylist集合存储所有符合条件的用户
        ArrayList< Customer> customersList = new ArrayList<>();
        return customersList;
    }
//查询客户信息
    public void InquiryCustomer(){
        ArrayList<Customer> customersList = Inquiry();
       Scanner sc= new Scanner(System.in);
        System.out.println("请输入客户类型");
        String type = sc.next();
        //将customerList集合中客户类型与该客户类型相同的取出来,得到rightCustomerList
        ArrayList< Customer>rightCustomerList = new ArrayList<>();
      //最后代码再判断指定用户并展示
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
        //此处应该有代码展示所有房间号，供管理员选择，还可以添加该房间是否有空闲床位
        System.out.println("请输入房间号");
        String room = sc.next();
        //此处管理员选择完房间号后，有代码能展示空闲的床位
        System.out.println("请输入床位号");
        String bed = sc.next();
        System.out.println("请输入入住时间");
        String inTime = sc.next();
        System.out.println("请输入预计退住时间");
        String outTime = sc.next();
        //此处还需要代码判断退住时间在入住时间之后
        Customer customer = new Customer(name,birth,sex,ID,blood,family,phone,floor,room,bed,inTime,outTime);
        //用户创建完毕，此处需要代码持久化存储用户信息

    }
    //删除客户信息
    public void DelateCustomer(){
        //此处应该先查询特定用户，但是我这个查询返回的是void,因为我是直接把查询封装为一个特定方法
        //不是通用的，所以此处有点矛盾，除非在查询功能中再调用一个方法能返回customer
        //这里先假设有要删除的用户
        Customer customer = new Customer();
        //这里的逻辑隐藏有两种方法：
        // 1.新增用户isDelated属性来逻辑删除用户
        //2.把用户信息真正从文件中删除 采用读取-过滤-重写
        Room.Bed bed=customer.getAssignedBed();
        bed.setCustomer(null);
        bed.setOccupied( false);
        //用户还有属性为床位使用详情信息，需要隐藏该床位使用详情信息

    }
    //修改客户信息
    public void ModifyCustomer(){
      Customer customer = new Customer();
      Scanner sc= new Scanner(System.in);
      System.out.println("请输入更改的退住时间");
      String outTime = sc.next();
      customer.setOutTime(outTime);
    }

       //2.退住登记
    public void customerManageFunction2(){
        while ( true){
            System.out.println("==========退住登记===========");
            System.out.println("1.浏览和审核退住登记信息");
            System.out.println("2.查询客户退住登记信息列表");
            System.out.println("3.审核退住申请");
            System.out.println("4.返回");
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入您的选择:");
            int result = sc.nextInt();
            switch (result) {
                case 1:
                    System.out.println("浏览和审核退住登记信息");
                    break;
                case 2:
                    System.out.println("查询客户退住登记信息列表");
                    break;
                case 3:
                    System.out.println("审核退住申请");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("输入无效，请重新输入");
                    continue;
            }
        }
    }
    //浏览和审核退住登记信息
    public void LookThroughCheckOut(){
          //遍历文件中所有退住登记信息，并展示
    }
    public void InquiryCheckOut(){


    }
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
            int a=10;
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
