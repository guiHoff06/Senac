package login;
import java.util.Scanner;
public class Login01 {


	
	    
	    private static String[] usuarios = {"Guilherme", "Gustavo", "Aleatorio"};
	    private static String[] senhas = {"123", "456", "789"};

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        boolean loggedIn = false;

	        while (!loggedIn) {
	            System.out.println("Digite seu nome de usuário:");
	            String nomeUsuario = scanner.nextLine();
	            System.out.println("Digite sua senha:");
	            String senha = scanner.nextLine();

	            int indexUsuario = verificarUsuario(nomeUsuario);
	            if (indexUsuario != -1 && senhas[indexUsuario].equals(senha)) {
	                System.out.println("Login bem-sucedido! Bem-vindo, " + nomeUsuario + "!");
	                loggedIn = true;
	            } else {
	                if (indexUsuario == -1) {
	                    System.out.println("Nome de usuário incorreto. Tente novamente.");
	                } else {
	                    System.out.println("Senha incorreta. Tente novamente.");
	                }
	            }
	        }

	        scanner.close();
	    }

	    
	    private static int verificarUsuario(String usuario) {
	        for (int i = 0; i < usuarios.length; i++) {
	            if (usuarios[i].equals(usuario)) {
	                return i;
	            }
	        }
	        return -1; 
	    }
	}
