package Controllers.Registrationcontroller;

import Models.Registration.RegistrationModel;
import Services.RegistrationService.AuthService;
import Viewers.RegistrationViewer.RegistrationViewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationViewer viewer;
    private RegistrationModel model;
    @Autowired
    private AuthService service;

    public void registerUser(Scanner scanner) {
        viewer.showRegistrationPrompt();
        ///  name
        viewer.showRegistrationPromptName();
        String username = scanner.nextLine();
        ///  pass
        viewer.showRegistrationPromptPass();
        String password = scanner.nextLine();

        if (model.checkAUsername(username)||model.checkSUserPassword(password)) {   ///  A - available, S - Secure
            viewer.showRegistrationSuccess();
        } else {
            viewer.showRegistrationError("Incorrect username or password");
        }
    }

}
