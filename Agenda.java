package agenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Agenda {

    public static Connection conexao;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;

    public static void main(String[] args) throws SQLException {

        int id;
        String nome;
        int telefone;
        int celular ;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Id");
        id = Integer.parseInt(in.nextLine());

        System.out.println("Digite o Nome");
        nome = in.nextLine();

        System.out.println("Digite o DDD+Telfone Residencial");
        telefone = Integer.parseInt(in.nextLine());
        
        System.out.println("Digite o Celular");
        celular = Integer.parseInt(in.nextLine());

        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "INSERT INTO agenda (Id, Nome, Telefone, celular) VALUES (?, ?, ?,?)";
        ps = conexao.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, nome);
        ps.setInt(3, telefone);
        ps.setInt(4, celular);
        

        ps.execute();
        ps.close();
        conexao.close();

        System.out.println("\n\nListando os Registros Gravados");
        
        
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM agenda ORDER BY nome";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("Id..:" + rs.getInt("id"));
            System.out.println("Nome:" + rs.getString("nome"));
            System.out.println("Telefone Residencial.:" + rs.getInt("telefone"));
            System.out.println("Celular.:" + rs.getInt("celular"));
            System.out.println("");
            break;
        }
        
        

    }
    
    

}


