package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Gadya", "Petrovich", (byte) 33);
        userService.saveUser("Nastya", "Simonova", (byte) 62);
        userService.saveUser("Akim", "Ivanich", (byte) 18);
        userService.saveUser("Alex", "Kim", (byte) 29);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}