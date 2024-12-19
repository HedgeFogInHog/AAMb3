package Entities;

public class Admin extends User{
    public Admin(String login, String password) {
        super(login, password);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getLogin() {
        return super.getLogin();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setLogin(String login) {
        super.setLogin(login);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }
}
