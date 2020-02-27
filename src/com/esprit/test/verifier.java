/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.test;

import com.esprit.entities.Commande;
import com.esprit.entities.Panier;
import com.esprit.entities.Produit;
import com.esprit.services.impl.ServiceCommande;
import com.esprit.services.impl.ServicePanier;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ghazi
 */
public class verifier {
    public static  void main(String args[]) throws SQLException
    {  Produit produits[]= new Produit[10];
        produits[0]=new Produit(1);
        produits[1]=new Produit(60);
        produits[2]=new Produit(23);
        produits[3]=new Produit(45);
       /*
        Commande c= new Commande(new Date(2020, 2, 3), new Date(2017, 4, 28),produits,(float) 12.5,"carte",2);
        ServiceCommande sc = new ServiceCommande();
        sc.addCommande(c);*/
        //List<Commande> commandes;
        //commandes=sc.getAllCommande();
         // System.out.println(commandes);
       /* Produit pr1,pr2 ;
        pr1=new Produit(0);
        pr2=new Produit(1);
        /*Pannier p= new Pannier();
        p.addProduit(pr1);*/
        //p.addProduit(pr2);
        //Panier p= new Panier(8, 2, produits, 6,'v');
        //Panier p2= new Panier();
       // p2.setId_client(3);
    //   ServicePanier sp= new ServicePanier();
   //     sp.addPanier(p);
    //  List<Panier> paniers;
    //  paniers=sp.getAllPannier();
    //    System.out.println(paniers);
        
    }
}
