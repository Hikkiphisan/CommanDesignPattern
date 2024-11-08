package model;

public class Drink {
    String drinkName;
    public Drink() {
    }
    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    public void orderADrink() {
        //Mô tả chi tiết cách mà mệnh lệnh hoạt động
        System.out.println("Thực hiện mệnh lệnh: Đặt đồ uống " + drinkName);
    }
    public void cancelADrink() {
        //Mô tả chi tiết cách mà mệnh lệnh hoạt động
            System.out.println("Thực hiện mệnh lệnh: Huỷ đặt đồ uống " +  drinkName);
        }
}

//Receiver : đây là thành phần thực sự để viết chi tiết code cho từng mệnh lệnh.