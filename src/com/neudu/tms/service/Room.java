package com.neudu.tms.service;

import java.util.ArrayList;

public class Room {
    private String roomId;
    private String floor;
    ArrayList<Bed> beds = new ArrayList<>();

    public class Bed{
        private String bedNumber;
        private boolean isOccupied;
        private Customer customer;

        public Bed() {
            this.isOccupied = false;
        }
        public Bed(String  bedNumber) {
            this.bedNumber = bedNumber;
            this.isOccupied = false;
        }
        public void setCustomer(Customer customer) {
            this.customer = customer;
            this.isOccupied=(customer!=null);
        }

        public Bed(String bedNumber, boolean isOccupied, Customer customer) {
            this.bedNumber = bedNumber;
            this.isOccupied = isOccupied;
            this.customer = customer;
        }

        public String getBedNumber() {
            return bedNumber;
        }

        public void setBedNumber(String bedNumber) {
            this.bedNumber = bedNumber;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

        public void setOccupied(boolean occupied) {
            isOccupied = occupied;
        }

        public Customer getCustomer() {
            return customer;
        }
        //从内部Bed类中获取外部Room类
        public Room getRoom() {
            return Room.this;
        }

    }

    public Room() {
    }

    public Room(String roomId, String floor) {
        this.roomId = roomId;
        this.floor = floor;
    }
    public Bed getBed(String  bedNumber) {
        for (Bed bed : beds) {
            if (bed.getBedNumber() == bedNumber) {
                return bed;
            }
        }
        return null;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public ArrayList<Bed> getBeds() {
        return beds;
    }

    public void setBeds(ArrayList<Bed> beds) {
        this.beds = beds;
    }
}
