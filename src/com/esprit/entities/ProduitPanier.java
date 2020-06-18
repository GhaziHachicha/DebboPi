/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.entities;

/**
 *
 * @author ghazi
 */
public class ProduitPanier {
    private int id_commande;
    private int id_produit;
    private float prix_produit;
    private double quantite;

    public ProduitPanier() {
    }

    public ProduitPanier(int id_commande, int id_produit, float prix_produit, double quantite) {
        this.id_commande = id_commande;
        this.id_produit = id_produit;
        this.prix_produit = prix_produit;
        this.quantite = quantite;
    }

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public float getPrix_produit() {
        return prix_produit;
    }

    public void setPrix_produit(float prix_produit) {
        this.prix_produit = prix_produit;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
    
    
}
