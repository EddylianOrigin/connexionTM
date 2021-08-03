package com.company;
import java.sql.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
        Connection cnx= connecterDB();
        Statement st;
        ResultSet rst;
        st=cnx.createStatement();
        rst=st.executeQuery("SELECT `DATE_DE_NAISSANCE`,`NOMS_ET_PRENOMS` FROM liste_des_membres_adi_germany");

        while(rst.next()){
            System.out.println(rst.getString("NOMS ET PRENOMS"));
            System.out.println(rst.getInt("DATE DE NAISSANCE"));
        }

        st=cnx.createStatement();
    } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

        public static Connection connecterDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver oki");
            String url="jdbc:mysql://localhost:3306";
            String user="Eddylian";
            String password="Top#012@";
            Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("connexion bien etablie");
            return cnx;
    } catch(Exception e){
            e.printStackTrace();
            return null;
        }
}
}


