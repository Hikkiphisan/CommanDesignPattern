package controller;

import command.Command;

public class HighLandApp {
     private Command commandOrderADrink;
     private Command commandCancelOrderADrink;
     private Command commandViewMenu;
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

     public void clickViewMenu(){
         commandViewMenu.execute();
     }

//•	Invoker : tiếp nhận những “mệnh lệnh của khách hàng” (view.Client) và gọi execute() của ConcreteCommand đ0ể thực thi mệnh lệnh.











    // Các phương thức settẻ để thay đổi command.Command cho hành động gọi và hủy món khác nhau
    public void setCommandOrderADrink(Command commandOrderADrink) {
        this.commandOrderADrink = commandOrderADrink;
    }

    public void setCommandCancelOrderADrink(Command commandCancelOrderADrink) {
        this.commandCancelOrderADrink = commandCancelOrderADrink;
    }
}
