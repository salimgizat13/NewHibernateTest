package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ///////////////////////////////test//////////////////////////////////

        UserService userService = new UserServiceImpl();

        //userService.createUsersTable();
        //userService.dropUsersTable();
        //userService.saveUser("Max", "Kuzmin", (byte) 20);
        //System.out.println(userService.getAllUsers());
        //userService.removeUserById(1);
        //userService.cleanUsersTable();




        //userDao.createUsersTable();

        /*userDao.saveUser("Name1", "LastName1", (byte) 20);  //-- надо думать
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);

         */


        //userDao.removeUserById(1);
        //System.out.println(userDao.getAllUsers());        // -- надо думать
        //userDao.cleanUsersTable();     //-- надо думать
        //userDao.dropUsersTable();



    }
}
