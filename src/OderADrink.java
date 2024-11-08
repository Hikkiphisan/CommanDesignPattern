public class OderADrink implements Command {
    // Lớp OrderADrink thực hiện quá trình gọi đồ uống
    Drink drink = new Drink();

    public OderADrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void execute() {
        drink.orderADrink();
    }
}

// Đây là ConcreteCommand : ‘mệnh  lệnh’ sẽ triển khai lớp trừu tượng Command. Ghi đè execute()