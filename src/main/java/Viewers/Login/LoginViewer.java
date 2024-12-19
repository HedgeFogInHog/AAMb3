package Viewers.Login;

public class LoginViewer {

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showLoginPrompt() {
        System.out.println("Please enter user details to register.");
    }

    public void showLoginPromptName() {
        System.out.println("Name: ");
    }

    public void showLoginPromptPass() {
        System.out.println("Password: ");
    }

    public void showLoginSuccess() {
        System.out.println("Successful authorisation");
    }

    public void showLoginError(String message) {
        System.out.println("Error: " + message);
    }
}
