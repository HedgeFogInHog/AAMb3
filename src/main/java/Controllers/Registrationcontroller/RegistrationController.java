package Controllers.Registrationcontroller;

import Models.Registration.RegistrationModel;
import Viewers.RegistrationViewer.RegistrationViewer;

import java.util.Scanner;

public class RegistrationController {
    private RegistrationViewer viewer;
    private RegistrationModel model;

    public RegistrationController(RegistrationViewer viewer, RegistrationModel model) {
        this.viewer = viewer;
        this.model = model;
    }

    public void registerUser(Scanner scanner) {
        viewer.showRegistrationPrompt();
        ///  name
        viewer.showRegistrationPromptName();
        String username = scanner.nextLine();
        ///  pass
        viewer.showRegistrationPromptPass();
        String password = scanner.nextLine();

        if (model.checkAUsername(username)||model.checkSUserPassword(password)) {
            viewer.showRegistrationSuccess(username);
        } else {
            viewer.showRegistrationError("Error. Please try again.");
        }
    }

}
