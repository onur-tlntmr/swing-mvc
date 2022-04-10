package dal;

import pojo.User;

import java.util.HashSet;

public class UserDAO implements IUserDAO {

    private final HashSet<User> data = new HashSet<>();

    public UserDAO() {

        data.add(new User("user","1234"));

    }


    @Override
    public boolean existUserByUsernameAndPassword(String username, String password) {
        return  data.stream().anyMatch(user -> user.getName().equals(username));
    }
}
