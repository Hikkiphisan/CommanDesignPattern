public class Drink {
    String drinkName;
    public Drink() {
    }
    public Drink(String drinkName) {
        this.drinkName = drinkName;
    }

    void orderADrink() {
        //Mô tả chi tiết cách mà mệnh lệnh hoạt động
        System.out.println("Thực hiện mệnh lệnh 1: Đặt đồ uống " + drinkName);
    }
    void cancelADrink() {
        //Mô tả chi tiết cách mà mệnh lệnh hoạt động
            System.out.println("Thực hiện mệnh lệnh 2: Huỷ đặt đồ uống " +  drinkName);
        }
}

//Receiver : đây là thành phần thực sự để viết chi tiết code cho từng mệnh lệnh.