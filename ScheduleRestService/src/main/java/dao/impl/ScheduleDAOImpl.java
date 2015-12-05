package dao.impl;

import dao.ScheduleDAO;
import db.Connector;
import model.Schedule;
import model.User;

import java.util.ArrayList;

/**
 * Created by Julie on 05.12.2015.
 */
public class ScheduleDAOImpl implements ScheduleDAO{

    private Connector conn = new Connector("com.mysql.jdbc.Driver",
            "jdbc:mysql://localhost:3306/people",
            "root", "password");

    public ArrayList<User> getAllUsers() {
        return conn.getAllUsers();
    }
}
