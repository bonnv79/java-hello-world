package bnv.com.example.oop.encapsulation;

public class Person {
    private int age; // thuộc tính đóng gói

    public int getAge() {
        return age; // phương thức getter
    }

    public void setAge(int age) {
        if (age > 0) { // phương thức setter với kiểm tra hợp lệ
            this.age = age;
        }
    }
}
