package Repos.Registration;

import org.springframework.stereotype.Repository;

@Repository
public class RegistrationRepo {

    public boolean saveUser(String username, String password) {
        try {
            // Placeholder for actual database logic (e.g., JDBC or JPA)
            System.out.printf("Saving user to the database: Username: %s, Password: %s\n", username, password);
            return true;
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
            return false;
        }
    }

    public boolean isUsernameA(String username) {
        try {
            // Placeholder for actual database logic (e.g., JDBC or JPA)
            System.out.println("Is available");
            return true;
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
            return false;
        }
    }
}