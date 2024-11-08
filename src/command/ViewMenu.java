package command;

public class ViewMenu implements Command{
    @Override
    public void execute() {
        System.out.println("Xem danh sach cac mon");
    }
}
