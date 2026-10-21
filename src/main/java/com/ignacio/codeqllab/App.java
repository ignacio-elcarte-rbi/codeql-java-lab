package com.ignacio.codeqllab;

public class App {

    public static void main(String[] args) {

        String username = args.length > 0 ? args[0] : "admin";

        String sql =
                "SELECT * FROM users WHERE username = '" +
                username +
                "'";

        System.out.println(sql);
    }
}