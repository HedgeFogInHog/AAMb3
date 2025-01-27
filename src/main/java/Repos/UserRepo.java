package Repos;

import Entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {

    public boolean findUserByUsername(String username) {
        try {
            // Placeholder for actual database logic (e.g., JDBC or JPA)
            System.out.printf("Saving user to the database: Username: %s, Password: %s\n", username);
            return User;
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
            return false;
        }
    }

    public boolean findUserById(int id) {
        try {
            // Placeholder for actual database logic (e.g., JDBC or JPA)
            System.out.printf("Saving user to the database: Username: %s, Password: %s\n", id);
            return true;
        } catch (Exception e) {
            System.err.println("Error saving user: " + e.getMessage());
            return false;
        }
    }
}
