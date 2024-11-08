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
}
//•	Invoker : tiếp nhận những “mệnh lệnh của khách hàng” (Client) và gọi execute() của ConcreteCommand để thực thi mệnh lệnh.