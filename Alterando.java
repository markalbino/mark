package alterando;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Alterando {

    public static Connection conexao;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;

    public static void main(String[] args) throws SQLException {

        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "UPDATE agenda SET Id=?, Nome=?, Telefone=?, Celular=? where id= 20";
        ps = conexao.prepareStatement(sql);

        int Id = 20;
        ps.setInt(1, Id);

        String nome = "Laryssa";
        ps.setString(2, nome);

        int telefone = 1139655214;
        ps.setInt(3, telefone);

        int celular = 970132255;
        ps.setInt(4, celular);

        ps.execute();
        ps.close();
        conexao.close();

        System.out.println("\n\nListando os Registros Gravados");

        // Leitura do Banco de Dados
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM agenda ORDER BY nome";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

    }

}
