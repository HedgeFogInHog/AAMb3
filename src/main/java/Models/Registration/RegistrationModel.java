package Models.Registration;

import org.springframework.stereotype.Component;

@Component
public class RegistrationModel {

    /// Check Available username
    public boolean checkAUsername(String username) {
        username




                
        if (username) {

        }
    }
    /// Check if user password is Secure
    public boolean checkSUserPassword(String password) {
        return password.length() > 8 && password.matches(".*[a-zA-Z].*");
    }
    public void registerUser() {}

}
