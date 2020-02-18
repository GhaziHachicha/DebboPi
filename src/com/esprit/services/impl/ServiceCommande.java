/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.services.impl;

import com.esprit.entities.Commande;
import com.esprit.entities.Produit;
import com.esprit.utilities.DataSource;
import com.sun.org.apache.bcel.internal.generic.D2F;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ghazi
 */
public class ServiceCommande {
     Connection cnx;

    public ServiceCommande() {
             cnx=DataSource.getInstance().getConnection();}
    
      public void addCommande(Commande c) throws SQLException{
         String ch="";
         Produit p[]=c.getListProduit();
         for(int i=0;i<c.getNbrProduit();i++)
         {
             ch=ch+p[i].getId_produit()+"-";
         }
          String req="INSERT INTO `commande`(list_produit,total,type_paiement,date_commande,date_exp,id_client) "
                  + "VALUES('"+ch+"','"+c.getMontant()+"','"+c.getType_paiement()+"','"+getDate((Date)c.getDateCommande())+"','"+getDate((Date)c.getDateExp())+"','"+c.getIdClient()+"')";
      PreparedStatement pst = cnx.prepareStatement(req);
      pst.executeUpdate(req);
    }


    public List<Commande> getAllCommande() throws SQLException {
      String req="SELECT * FROM `commande`";
      PreparedStatement pst = cnx.prepareStatement(req);
      ResultSet rst = pst.executeQuery(req);
      List <Commande> commandes= new ArrayList<>();
      Commande c= new Commande();
      while(rst.next())
      {   c.setIdCommande(rst.getInt("id_commande"));
          c.setDateCommande(rst.getDate("date_commande"));
          c.setDateExp(rst.getDate("date_exp"));
          c.setMontant(rst.getFloat("total"));
          c.setIdClient(rst.getInt("id_client"));
          String produit=rst.getString("list_produit");
          Produit list[];
          try{
          list = new Produit[100]; 
          String co="",num="0123456789"; 
          int k=0; Produit
           pr;int l=0;
          for(int i=0;i<produit.length();i++)
          { if(produit.charAt(i)!='-')
          {co=co+produit.charAt(i);k=0;}
            else
          {   for(int j=0;j<co.length();j++)
            { k=(k*10)+num.indexOf(co.charAt(j));
            }
            pr=new Produit(k);
              list[l]=pr; 
              l++;
          }
          }
          c.setListProduit(list);
          commandes.add(c);
          }catch(ArrayIndexOutOfBoundsException e){
              System.out.println("erreur");
          }
      }
          
      return commandes;
          }

    public void updateCommande(Commande c) throws SQLException {
         String ch="";
         Produit p[]=c.getListProduit();
         for(int i=0;i<c.getNbrProduit();i++)
         {
             ch=ch+p[i].getId_produit()+"-";
         }
        String req="UPDATE `commande` SET `list_produi`='"+ch+"',`type_paiement`='"+c.getType_paiement()+"',`date_commande`='" +getDate((Date)c.getDateCommande())+"',`date_exp`='"+getDate((Date)c.getDateExp())+"',`total`="+c.getMontant()+" where `id_commande`="+c.getIdCommande();
        PreparedStatement pst = cnx.prepareStatement(req);
        pst.executeUpdate(req);
    }


    public void deleteCommande(Commande c) throws SQLException {
         String req="DELETE FROM `commande` where `id_commande`="+c.getIdCommande();
      PreparedStatement pst = cnx.prepareStatement(req);
      pst.executeUpdate(req);
    }
   
    public String getDate(Date d)
    {
        String year=d.getYear()+"";
         String day=d.getDate()+"";
         String month=d.getMonth()+"";
        return(year+"-"+month+"-"+day);
    }
    
}
