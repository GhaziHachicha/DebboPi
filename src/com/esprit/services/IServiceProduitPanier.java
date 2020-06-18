/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services;

import com.esprit.entities.ProduitPanier;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ghazi
 */
public interface IServiceProduitPanier {
    public void addCommande(ProduitPanier pp) throws SQLException;
    public List<ProduitPanier> getAllCommande() throws SQLException;
    public void updateCommande(ProduitPanier pp) throws SQLException;
    public void deleteCommande(ProduitPanier pp) throws SQLException; 
}
