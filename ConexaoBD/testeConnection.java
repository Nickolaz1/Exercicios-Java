import java.sql.Connection;
import java.sql.DriverManager;

class testeConnection{
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "HACKnsp@52");
            System.out.println("Conectado ao banco de dados");
        }
        catch(Exception e){
            System.out.println("Erro");
        }
        
    }
}
