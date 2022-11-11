package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        //create table
        userService.createUsersTable();

        //create table rows
        userService.saveUser("Nikolay", "Kozlov", (byte) 14);
        userService.saveUser("Alexey", "Baranin", (byte) 21);
        userService.saveUser("Evgeni", "Chaykovsky", (byte) 33);
        userService.saveUser("Volya", "Medvedev", (byte) 62);

        //get all users
        System.out.println(userService.getAllUsers());

        //clear table
        userService.cleanUsersTable();

        //delete table
        userService.dropUsersTable();

    }
}
