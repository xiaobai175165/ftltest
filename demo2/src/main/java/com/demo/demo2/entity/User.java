package com.demo.demo2.entity;

public class User {
    private int id,status,typeid,money;
    private String name,password,lasttime,touxiang;
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getTypeid() {
        return typeid;
    }
    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLasttime() {
        return lasttime;
    }
    public void setLasttime(String lasttime) {
        this.lasttime = lasttime;
    }
    public String getTouxiang() {
        return touxiang;
    }
    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", status=" + status + ", typeid=" + typeid + ", money=" + money + ", name=" + name
                + ", password=" + password + ", lasttime=" + lasttime + ", touxiang=" + touxiang + "]";
    }


}
