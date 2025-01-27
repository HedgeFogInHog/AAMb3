package Controllers.LoginController;

import Models.Login.LoginModel;
import Viewers.LoginViewer.LoginViewer;


import java.util.Scanner;

public class LoginController {
    private LoginViewer viewer;
    private LoginModel model;

    public LoginController(LoginViewer viewer, LoginModel model) {
        this.viewer = viewer;
        this.model = model;
    }

    public void loginUser(Scanner scanner) {
        viewer.showLoginPrompt();
        ///  name
        viewer.showLoginPromptName();
        String username = scanner.nextLine();
        ///  pass
        viewer.showLoginPromptPass();
        String password = scanner.nextLine();

        if (model.checkRUserName(username)||model.checkRUserPassword(password)) {
            model.loginUser();
            viewer.showLoginSuccess();
        } else {
            viewer.showLoginError("Error. Please try again.");
        }
    }
}
