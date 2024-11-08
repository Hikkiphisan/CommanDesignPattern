public class CancelOrderADrink implements Command {
    // Lớp CancelOrderADrink thực hiện quá trình hủy gọi đồ uống
    public CancelOrderADrink(Drink drink) {
        this.drink = drink;
    }

    Drink drink = new Drink();
    @Override
    public void execute() {
          drink.cancelADrink();
    }
}

// Đây là ConcreteCommand : ‘mệnh  lệnh’ sẽ triển khai lớp trừu tượng Command. Ghi đè execute()