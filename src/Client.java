public class Client {
    public static void main(String[] args) {
        Drink drink = new Drink("Coffee");

        Command order = new OderADrink(drink);
        Command cancelOrder = new CancelOrderADrink(drink);
        HighLandApp highLandApp = new HighLandApp(order, cancelOrder);
        highLandApp.clickOderADrink();
        highLandApp.clickCancelOrderADrink();
    }

}

//•	Client : chứa những “mệnh lệnh của người dùng”, đóng gói “mệnh lệnh của người dùng” thành “tên gọi mệnh lệnh” thích hợp và thiết lập code chi tiết của nó trong Receiver.