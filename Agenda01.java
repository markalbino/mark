\\Inserindo registro


package agenda01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Agenda01 {

    public static Connection conexao;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;

    public static void main(String[] args) throws SQLException {

        int id;
        String nome;
        int telefone;
        int celular ;
        String Rua;
        int Numero;
        String Bairro;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Id");
        id = Integer.parseInt(in.nextLine());

        System.out.println("Digite o Nome Sobrenome");
        nome = in.nextLine();

        System.out.println("Digite o DDD+Telfone Residencial");
        telefone = Integer.parseInt(in.nextLine());
        
        System.out.println("Digite o Celular");
        celular = Integer.parseInt(in.nextLine());
        
        System.out.println("Digite o Logadouro");
        Rua = in.nextLine();
        
        System.out.println("Digite o Numero");
        Numero = Integer.parseInt(in.nextLine());
        
        System.out.println("Digite o Bairro");
        Bairro = in.nextLine();

        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "INSERT INTO contatos (Id, Nome, Telefone, celular, Rua, Numero, Bairro) VALUES (?, ?, ?,?, ?, ?, ?)";
        ps = conexao.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, nome);
        ps.setInt(3, telefone);
        ps.setInt(4, celular);
        ps.setString(5, Rua);
        ps.setInt(6, Numero);
        ps.setString(7, Bairro);

        ps.execute();
        ps.close();
        conexao.close();

        System.out.println("\n\nListando os Registros Gravados");
        
        
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM contatos ORDER BY nome";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("Id..:" + rs.getInt("id"));
            System.out.println("Nome:" + rs.getString("nome"));
            System.out.println("Telefone Residencial.:" + rs.getInt("telefone"));
            System.out.println("Celular.:" + rs.getInt("celular"));
            System.out.println("Rua.:" + rs.getString("rua"));
            System.out.println("Numero.:" + rs.getInt("numero"));
            System.out.println("Bairro.:" + rs.getString("bairro"));
            System.out.println("");
            break;
        }
        
        

    }
}


\\Pesquisando registros

package pesquisaagenda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PesquisaAgenda {

    public static Connection conexao;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static String sql;

    public static void main(String[] args) throws SQLException {

        String usuario = "root";
        String senha = "";
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "Select * FROM contatos  where = 'Nome'";
        ps = conexao.prepareStatement(sql);

       

        System.out.println("\n\nListando os Registros Gravados");
        
        
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM contatos ORDER BY Id";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("Id..:" + rs.getInt("id"));
            System.out.println("Nome:" + rs.getString("nome"));
            System.out.println("Telefone Residencial.:" + rs.getInt("telefone"));
            System.out.println("Celular.:" + rs.getInt("celular"));
            System.out.println("Rua.:" + rs.getString("rua"));
            System.out.println("Numero.:" + rs.getInt("numero"));
            System.out.println("Bairro.:" + rs.getString("bairro"));
            System.out.println("");
          
        }
        
        

    }
}

\\ Alterando 

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
        sql = "UPDATE contatos SET Id=?, Nome=?, Telefone=?, Celular=?, Rua=?, Numero=?, Bairro=? where id= 05";
        ps = conexao.prepareStatement(sql);

        int Id = 20;
        ps.setInt(1, Id);

        String nome = "Neide";
        ps.setString(2, nome);

        int telefone = 1139655214;
        ps.setInt(3, telefone);

        int celular = 970132255;
        ps.setInt(4, celular);
        
        String Rua = "Marques de São Vicente";
        ps.setString(5, Rua);
        
        int Numero = 100;
        ps.setInt(6, Numero);
        
        String Bairro = "Pompeia";
        ps.setString(7, Bairro);

        ps.execute();
        ps.close();
        conexao.close();

        System.out.println("\n\nListando os Registros Gravados");

        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM contatos ORDER BY nome";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

    }

}

\\Deletando

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
        sql = "DELETE FROM contatos where id=4";
        ps = conexao.prepareStatement(sql);

        ps.execute();
        ps.close();
        conexao.close();

        System.out.println("\n\nListando os Registros Gravados");

   
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", usuario, senha);
        sql = "SELECT * FROM contatos ORDER BY nome";
        ps = conexao.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

    }

}

