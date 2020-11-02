package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
                System.out.println("A base de dados" + DB_NOME + ".db foi criada.");
                System.out.println("A tabela " + TABELA_FATURA + "foi criada.");

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
}
