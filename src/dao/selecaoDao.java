package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeSet;

import javax.swing.*;

import to.Carro;

public class selecaoDao
{
   private Connection conn = null;
   

   public selecaoDao()
   {
      try 
      {
         AcessoBD bd = new AcessoBD();
         conn = bd.obtemConexao();
         conn.setAutoCommit(false);
      }
         catch(Exception e3)
         {
            JOptionPane.showMessageDialog(null,"Erro - Banco de Dados");
         }
   
      
   }
   
	 public static TreeSet<Carro> carregaCidade(Connection conn,String estado)
     {
		 String query = "select * from Carros where cidade = ?";
		 
		 ResultSet rs= null;
		 PreparedStatement pst = null;
		 TreeSet<Carro> to = new TreeSet<Carro>();
		 try{
			 pst = conn.prepareStatement(query);
			 pst.setString(1, estado);
			 rs = pst.executeQuery();
			 while(rs.next())
			 {
				 Carro carro = new Carro();
				 carro.setMarca(rs.getString(1));
				 carro.setFabricante(rs.getString(2));
				 carro.setPreco(rs.getDouble(3));
				 carro.setPrecoCon(rs.getDouble(4));
				 carro.setImagem(rs.getString(5));
				 carro.setEstado(rs.getString(5));
				 to.add(carro);
				 
			 }
		 
		 
		 }
           catch (Exception e)
           {
              e.printStackTrace();
              try
              {
                 conn.rollback();
              }
                 catch (SQLException e1)
                 {
                    System.out.print(e1.getStackTrace());
                 }
           }
        finally
        {
           if (pst != null)
           {
              try
              {
            	  pst.close();
              }
                 catch (SQLException e1)
                 {
                    System.out.print(e1.getStackTrace());
                 }
           }
        }
        
        return to;
     }

	 public static Carro carregaCarro(Connection conn,String marca)
     {
		 String query = "select distinct * from Carros where marca = ?";
		 
		 ResultSet rs= null;
		 PreparedStatement pst = null;
		 Carro carro = new Carro();

		 try{
			 pst = conn.prepareStatement(query);
			 pst.setString(1, marca);
			 rs = pst.executeQuery();
			 while(rs.next())
			 {
				 carro.setMarca(rs.getString(1));
				 carro.setFabricante(rs.getString(2));
				 carro.setPreco(rs.getDouble(3));
				 carro.setPrecoCon(rs.getDouble(4));
				 carro.setImagem(rs.getString(5));
				 carro.setEstado(rs.getString(5));
				 
			 }
		 
		 
		 }
           catch (Exception e)
           {
              e.printStackTrace();
              try
              {
                 conn.rollback();
              }
                 catch (SQLException e1)
                 {
                    System.out.print(e1.getStackTrace());
                 }
           }
        finally
        {
           if (pst != null)
           {
              try
              {
            	  pst.close();
              }
                 catch (SQLException e1)
                 {
                    System.out.print(e1.getStackTrace());
                 }
           }
        }
        
        return carro;
     }
   
   
   
}