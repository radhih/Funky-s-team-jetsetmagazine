/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jetsetmagazine.dao;

import edu.jestsetmagazine.utile.MyConnection;
import edu.jetsetmagazine.entities.Administrateur;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Talel
 */
public class AdministrateurDAO {
    
         public void insertAdmin(Administrateur a)
         {

            String requete = "insert into administrateur (nom_admin,prenom_admin,mail_admin,telephone_admin,login_admin,passwd_admin) values (?,?,?,?,?,?)";
            try {
                PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                ps.setString(1, a.getNom_admin());
                ps.setString(2, a.getPrenom_admin());
                ps.setString(3, a.getMail_admin());
                ps.setString(4, a.getTelephone_admin());
                ps.setString(5, a.getLogin_admin());
                ps.setString(6, a.getPasswd_admin());
                ps.executeUpdate();
                System.out.println("Ajout effectuée avec succès");
            } catch (SQLException ex) {
               //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erreur lors de l'insertion "+ex.getMessage());
            }
        }
         
             public void updateAdmin(Administrateur a)
             {
                String requete = "update administrateur set nom_admin=?, prenom_admin=?, mail_admin=?, telephone_admin=?, login_admin=?, passwd_admin=? where id_admin=?";
                try {
                    PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
                    ps.setString(1, a.getNom_admin());
                    ps.setString(2, a.getPrenom_admin());
                    ps.setString(3, a.getMail_admin());
                    ps.setString(4, a.getTelephone_admin());
                    ps.setString(5, a.getLogin_admin());
                    ps.setString(6, a.getPasswd_admin());
                    ps.setInt(7, a.getId_admin());
                    ps.executeUpdate();
                    System.out.println("Mise à jour effectuée avec succès");
                } catch (SQLException ex) {
                   //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("erreur lors de la mise à jour "+ex.getMessage());
                }

    }
    
}