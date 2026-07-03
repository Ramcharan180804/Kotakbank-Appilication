package model;

public class User {

    private int userId;
    private String name;
    private String mobileNumber;

    public User() {
    }

    public User(int userId, String name, String mobileNumber) {
        this.userId = userId;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}