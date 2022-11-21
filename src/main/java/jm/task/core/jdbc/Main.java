package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Nikolay", "Kozlov", (byte) 14);
        userService.saveUser("Alexey", "Baranin", (byte) 21);
        userService.saveUser("Evgeni", "Chaykovsky", (byte) 33);
        userService.saveUser("Volya", "Medvedev", (byte) 62);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
