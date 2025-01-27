package Services.RegistrationService;

import Models.Registration.RegistrationModel;
import Repos.Registration.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private RegistrationRepo repository;

    @Autowired
    private RegistrationModel model;


    public boolean registerUser(String username, String password) {
        if (model.checkAUsername(username) && model.checkSUserPassword(password)) {
            return repository.saveUser(username, password);
        }
        return false;
    }

    public
}
