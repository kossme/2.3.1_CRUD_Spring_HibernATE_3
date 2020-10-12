package web.Dao;

import web.Model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void createUsersTable();

    void removeUser(long id);

    User findUserById(long id);

    void clearUsersTable();

     void updateUser(User user);

    }
