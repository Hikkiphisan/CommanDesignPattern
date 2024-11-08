package command;

import model.Drink;

public class CancelOrderADrink implements Command {
    // Lớp command.CancelOrderADrink thực hiện quá trình hủy gọi đồ uống
    public CancelOrderADrink(Drink drink) {
        this.drink = drink;
    }

    Drink drink = new Drink();
    @Override
    public void execute() {
          drink.cancelADrink();
    }
}

// Đây là ConcreteCommand : ‘mệnh  lệnh’ sẽ triển khai lớp trừu tượng command.Command. Ghi đè execute()