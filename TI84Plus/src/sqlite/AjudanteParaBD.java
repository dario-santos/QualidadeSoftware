package sqlite;

import java.sql.*;
import java.util.ArrayList;

public class AjudanteParaBD
{
    public static final String DB_PATH = "./Faturas.db";
    private static final String DB_NOME = "Fatuaras";

    // Table Names
    public static final String TABELA_FATURA = "Fatura";

    // Tabela Utilizador - Colunas
    public static final String FATURA_ID = "id";
    public static final String FATURA_VALOR = "valor";

    // Table Create Statements
    // User table create statement
    private static final String CREATE_TABELA_FATURA = "CREATE TABLE " + TABELA_FATURA + "("
            + FATURA_ID + " INTEGER PRIMARY KEY, "
            + FATURA_VALOR + " FLOAT "
            + ");";

    private AjudanteParaBD() {}

    public static void createNewDatabase()
    {
        String url = "jdbc:sqlite:" + DB_PATH;

        try (Connection conn = DriverManager.getConnection(url))
        {
            if (conn != null)
            {
                Statement stmt = conn.createStatement();

                // Cria as tabelas
                stmt.execute(CREATE_TABELA_FATURA);
                System.out.println("A base de dados " + DB_NOME + ".db foi criada.");
                System.out.println("A tabela " + TABELA_FATURA + " foi criada.");

            }
            else
                {
                    System.out.println("CONNECTION NULL");
                }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }

    public static Connection ConnectToDB()
    {
        Connection conn = null;
        try
        {
            String url = "jdbc:sqlite:" + DB_PATH;

            conn = DriverManager.getConnection(url);
            return conn;
        }
        catch(SQLException e)
        {
            System.out.println("AjudanteParaBD.ConnectToDB: " + e.getMessage());
        }
        return null;
    }

    public static void DisconnectFromDB(Connection conn)
    {
        try
        {
            if(conn != null)
                conn.close();
        }
        catch (SQLException e)
        {
            System.out.println("AjudanteParaBD.DisconnectFromDB: " + e.getMessage());
        }
    }

    public static boolean insertFaturaInFatura(float valor)
    {
        String sql = "INSERT INTO "+ TABELA_FATURA + "(" + FATURA_VALOR + ") VALUES(?)";

        try (Connection conn = ConnectToDB())
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setFloat(1, valor);
            pstmt.executeUpdate();

            return true;
        }
        catch (SQLException e)
        {
            System.out.println("AjudanteParaBD.insertFaturaInFatura: " + e.getMessage());
            return false;
        }
    }

    public static ArrayList<Fatura> selectFaturas()
    {
        String sql = "SELECT * FROM " + TABELA_FATURA
                + " ORDER BY " + FATURA_ID + " DESC;;";

        try (Connection conn = AjudanteParaBD.ConnectToDB();
             PreparedStatement pstmt = conn.prepareStatement(sql))
        {

            ResultSet rs = pstmt.executeQuery();

            ArrayList<Fatura> pontuacoes = new ArrayList<>();

            while(rs.next())
                pontuacoes.add(new Fatura(rs.getInt(FATURA_ID)
                        , rs.getFloat(FATURA_VALOR)));

            return pontuacoes;
        }
        catch (SQLException e)
        {
            System.out.println("AjudanteParaBD.selectNPontuacao: " + e.getMessage());
            return null;
        }
    }
}
