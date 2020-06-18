/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services.impl;

import com.esprit.entities.ProduitPanier;
import com.esprit.utilities.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ghazi
 */
public class ServiceProduitPanier {
     Connection conn = DataSource.getInstance().getConnection();
    private ResultSet rs;
    private PreparedStatement ps;

   
    public void ajouterProduitCommande(ProduitPanier produit)  {
        System.out.println(produit);
        String req ="INSERT INTO `produit_commande`(`id_commande`,"
                + " `id_produit`,"
                + " `prix_produit`,"
                + " `quantite_produit`) VALUES (?,?,?,?)";
                
        try {
             ps = conn.prepareStatement(req);
            ps.setInt(1,produit.getId_commande());
            ps.setInt(2,produit.getId_produit());
            ps.setFloat(3,produit.getPrix_produit());
            ps.setDouble(4,produit.getQuantite());
            ps.execute();
            System.out.println("produit ajouté");
            
        } catch (SQLException ex) {
            System.out.println("Produit non ajouté"+ex);
        }
                
    }

  
    public void supprimerProduitCommande(ProduitPanier produit) {
        
        
        try {
                    String req="DELETE FROM `produit_commande` WHERE `id_produit`=?" ;

            ps = conn.prepareStatement(req);
            ps.setInt(1,produit.getId_produit());
            ps.execute();
             System.out.println("suppression validée");
            
        } catch (SQLException ex) {
            System.out.println("erreur de suppression" +ex);
        }
        
    }


    public List<ProduitPanier> listeProduitCommande() {
              List<ProduitPanier> produits = new ArrayList<>();
        String req = "SELECT * FROM `produit_commande`";
        
        try {
            ps = conn.prepareStatement(req);
             rs = ps.executeQuery();
           
               while (rs.next()) 
               {
                   ProduitPanier p=new ProduitPanier();
                   p.setId_commande(rs.getInt("id_commande"));
                  p.setId_produit(rs.getInt("id_produit"));
                   p.setPrix_produit(rs.getFloat("prix_commande"));
                   p.setQuantite(rs.getInt("quantite_produit"));
                
                      produits.add(p);

               }


        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println(produits + "\n");
        return produits;
    }

   
    
}
