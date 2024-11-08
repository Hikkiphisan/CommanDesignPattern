public class Client {
    public static void main(String[] args) {
        Drink coffee = new Drink("Coffee");
        Drink tea = new Drink("[Trà Sữa trân châu], món đã được thay đổi do khách yêu cầu");

        // Tạo các Lệnh gọi và huỳ đặt món Coffee
        Command orderCoffee = new OderADrink(coffee);
        Command cancelOrderCoffee = new CancelOrderADrink(coffee);

        // Tạo các Lệnh gọi và huỷ đặt món Trà Sữa trân châu
        Command orderTea = new OderADrink(tea);
        Command cancelOrderTea = new CancelOrderADrink(tea);

        // Khởi tạo ứng dụng với lệnh gọi Coffee
        HighLandApp highLandApp = new HighLandApp(orderCoffee, cancelOrderCoffee);

        // Thực hiện lệnh gọi va huy Coffee
        highLandApp.clickOderADrink();
        highLandApp.clickCancelOrderADrink();

        //ưu điểm của command design pattern: Thay đổi từ mệnh lệnh gọi và huỷ Cà Phê sang mệnh lệnh gọi và huỷ Trà sữa mà không sửa đổi phương thức clickOderADrink và clickCancelOrderADrink
        highLandApp.setCommandOrderADrink(orderTea);
        highLandApp.setCommandCancelOrderADrink(cancelOrderTea);

        // Thực hiện lệnh gọi Trà Sữa
        highLandApp.clickOderADrink();

    }

}

//•	Client : chứa những “mệnh lệnh của người dùng”, đóng gói “mệnh lệnh của người dùng” thành “tên gọi mệnh lệnh” thích hợp và thiết lập code chi tiết của nó trong Receiver.