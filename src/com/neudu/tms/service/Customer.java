package com.neudu.tms.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;


public class Customer {
    private String name;
    private String birth;
    private int age;
    private String sex;
    private String ID;
    private String blood;
    private String family;
    private String phone;
    private String floor;
    private String room;
    private String bed;
    private String inTime;
    private String outTime;
    //此处也可以同枚举来定义type
    private String type;
    private Room.Bed assignedBed;
    private static final DateTimeFormatter FORMATTER=DateTimeFormatter.ofPattern("yyyy-MM-dd");



    public Customer() {
    }
                                 //此处的birth为出生日期，根据当前时间计算年龄
                                 //同时传的时候判断结束时间大于入住时间
    public Customer(String name,String birth, String sex, String ID, String blood, String family, String phone,
            String floor, String room, String bed, String inTime, String outTime) {
        this.name = name;
        this.sex = sex;
        this.ID = ID;
        this.blood = blood;
        this.family = family;
        this.phone = phone;
        this.floor = floor;
        this.room = room;
        this.bed = bed;
        this.inTime = inTime;
        this.outTime = outTime;
        this.age= CalculateAge(birth);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Room.Bed getAssignedBed() {
        return assignedBed;
    }

    public void setAssignedBed(Room.Bed assignedBed) {
        this.assignedBed = assignedBed;
        if(assignedBed!=null){
            this.floor=assignedBed.getRoom().getFloor();
            this.room=assignedBed.getRoom().getRoomId();
            this.bed=assignedBed.getBedNumber();
        }

    }

    //计算年龄
    public int CalculateAge(String birth){
        if(birth!=null||birth.isEmpty()){
            return 0;
        }
        try {
            LocalDate Birth = LocalDate.parse(birth, FORMATTER);
            LocalDate now = LocalDate.now();
            return Period.between(Birth, now).getYears();
        } catch (Exception e) {
            System.out.println("日期格式错误：" + e.getMessage());
            return 0;
        }


    }


//用于展示客户信息
    public void display(){
        System.out.println("===== 客户信息 =====");
        System.out.println("姓名: " + name);
        System.out.println("出生日期: " + birth);
        System.out.println("年龄: " + age);
        System.out.println("性别: " + sex);
        System.out.println("身份证号: " + ID);
        System.out.println("血型: " + blood);
        System.out.println("家属: " + family);
        System.out.println("电话: " + phone);
        System.out.println("楼栋: " + floor);
        System.out.println("房间号: " + room);
        System.out.println("床位号: " + bed);
        System.out.println("入住时间: " + inTime);
        System.out.println("预计退住时间: " + outTime);
        if (type != null) {
            System.out.println("客户类型: " + type);
        }
        System.out.println("===================");
    }


}
