package deletando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

package deletando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletando {

    public static Connection conexao;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;

    public static void main(String[] args) throws SQLException {

        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "DELETE FROM Agenda where id=1";
        ps = conexao.prepareStatement(sql);

        ps.execute();
        ps.close();
        conexao.close();

        System.out.println("\n\nListando os Registros Gravados");

      
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM agenda ORDER BY nome";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

    }

}




        
        
