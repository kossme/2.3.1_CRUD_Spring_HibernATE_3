package web.Service;

import web.Model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> listUsers();

    void createUsersTable();

    public void removeUser(long id);

    User findUserById(long id);



}
