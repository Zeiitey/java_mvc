import controller.UserController;
import model.User;

public class  Main1 {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.addNewUser(
                new User(1, "Tey", "Tey123@gmail.com"),
                new User(2, "koko", "koko123@gmail.com")
        );
        userController.deleteUserById(2);
        userController.updateUser(
                new User(1, "both", "both@gmail.com")
        );
        System.out.println("Updated list of users:");
        userController.getAllUsers()
                .forEach(System.out::println);
    }
}