/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.UserDao;
import domaine.User;
import java.util.List;

/**
 *
 * @author pbfall
 */
public class UserDaoImpl implements UserDao{
    private static String TABLE_NAME = "user";
    private static String SQL_SELECT_ALL = "select * from user";
    
    
    @Override
    public User create(User t) {
        return t;
    }

    @Override
    public void update(User t) {
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
