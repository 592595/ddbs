package com.syx.user;

/**
 * @author 史翼璇
 * @create 2019/11/1
 */
public class userinfo {
    String username;
    String password;
    String zhandian;
    String leiyonghu;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getZhandian() {
        return zhandian;
    }

    public void setZhandian(String zhandian) {
        this.zhandian = zhandian;
    }

    public String getLeiyonghu() {
        return leiyonghu;
    }

    public void setLeiyonghu(String leiyonghu) {
        this.leiyonghu = leiyonghu;
    }

    @Override
    public String toString() {
        return "userinfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", zhandian='" + zhandian + '\'' +
                ", leiyonghu='" + leiyonghu + '\'' +
                '}';
    }
}
