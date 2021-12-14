package EntityServices;

import DAOs.UserDao;
import Entities.User;

import java.util.List;

public class UserEntityService {
    private UserDao userDao;

    public UserEntityService() {
        userDao = new UserDao();
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(Long id) {
        return userDao.findById(id);
    }
}
