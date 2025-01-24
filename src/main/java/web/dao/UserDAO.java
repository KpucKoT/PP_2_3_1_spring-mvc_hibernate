package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers();

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    User getUser(int id);
}
