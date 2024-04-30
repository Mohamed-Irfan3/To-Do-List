package services;
import java.util.ArrayList;
import java.util.List;

import models.User;


public class UserService {
	private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public User registerUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
        return user;
    }

    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

	public User registerUser(String username, String password) {
		
		return null;
	}

}
