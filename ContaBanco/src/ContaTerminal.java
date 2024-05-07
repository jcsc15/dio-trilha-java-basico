import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero ;
        String agencia;
        String nomeCliente;
        String sobrenome;
        double saldo;
        
        System.out.println("Por favor, digite o número da Conta! ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência! ");
        agencia = sc.next();        
        
        System.out.println("Por favor, informe o seu nome! ");
        nomeCliente = sc.next();

        System.out.println("Por favor, informe o seu sobrenome! ");
        sobrenome = sc.next();
        
        System.out.println("Por favor, informe o seu saldo! ");
        saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        sc.close();
        
    }
}
