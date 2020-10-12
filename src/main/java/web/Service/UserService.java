package web.Service;

import web.Model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> listUsers();

    void createUsersTable();

    void removeUser(long id);

    User findUserById(long id);

    void updateUser(User user);


}
