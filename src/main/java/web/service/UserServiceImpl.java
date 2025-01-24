package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void createUser(User user) {
        if (0 == user.getId()) {
            userDAO.createUser(user);
        }
    }

    @Override
    public User updateUser(int id, User user) {
        userDAO.updateUser(user);
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }
}
