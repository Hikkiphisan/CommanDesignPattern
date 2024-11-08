public class HighLandApp {
     private Command commandOrderADrink;
     private Command commandCancelOrderADrink;
     public HighLandApp(Command commandOrderADrink, Command commandCancelOrderADrink) {
         this.commandCancelOrderADrink = commandCancelOrderADrink;
         this.commandOrderADrink = commandOrderADrink;
     }
     public void clickOderADrink() {
         System.out.println("Nguời dùng click vào nút gọi đồ uống." );
         commandOrderADrink.execute();
     }
     public void clickCancelOrderADrink() {
         System.out.println("Nguời dùng click vào nút huỷ gọi đồ uống.");
         commandCancelOrderADrink.execute();
     }


//•	Invoker : tiếp nhận những “mệnh lệnh của khách hàng” (Client) và gọi execute() của ConcreteCommand để thực thi mệnh lệnh.











    // Các phương thức settẻ để thay đổi Command cho hành động gọi và hủy món khác nhau
    public void setCommandOrderADrink(Command commandOrderADrink) {
        this.commandOrderADrink = commandOrderADrink;
    }

    public void setCommandCancelOrderADrink(Command commandCancelOrderADrink) {
        this.commandCancelOrderADrink = commandCancelOrderADrink;
    }
}
