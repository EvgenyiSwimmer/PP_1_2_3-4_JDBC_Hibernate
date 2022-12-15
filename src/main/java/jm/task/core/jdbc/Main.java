package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
//    private final static UserService userServise = new UserServiceImpl();

    public static void main(String[] args) {
        UserService userServise = new UserServiceImpl();
        userServise.createUsersTable();

        userServise.saveUser("Nissan", "370Z", (byte) 14);
        userServise.saveUser("Audi", "TT", (byte) 24);
        userServise.saveUser("Mazda", "RX 7", (byte) 44);
        userServise.saveUser("Toyota", "Supra", (byte) 44);
        userServise.saveUser("BMW", "X5", (byte) 23);
        userServise.saveUser("Mercedes", "C200", (byte) 30);

//        userServise.removeUserById(2);
        userServise.getAllUsers();
//        userServise.cleanUsersTable();
//        userServise.dropUsersTable();
    }
}
