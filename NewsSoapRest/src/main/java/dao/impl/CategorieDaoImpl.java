/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.CategorieDAO;
import dbconnexion.ConnexionManager;
import domaine.Categorie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 */
@ApplicationScoped
public class CategorieDaoImpl implements CategorieDAO{

    private static final String SQL_SELECT_ALL = "select * from categorie";
    
    @Override
    public Categorie create(Categorie t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Categorie t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Categorie> getAll() {
         Connection connection = ConnexionManager.getConnection();
        PreparedStatement preparedStatement = null;
        List<Categorie> liste = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(SQL_SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Categorie cat = new Categorie();
                cat.setId(resultSet.getLong("id"));
                cat.setLibelle(resultSet.getString("libelle"));
                liste.add(cat);
            }
            resultSet.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        ConnexionManager.closeConnection(connection);
        return liste;
    }

    @Override
    public Categorie getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
