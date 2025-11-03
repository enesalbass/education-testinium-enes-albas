import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Username: ");
        String name = input.nextLine();

        System.out.println("Password: ");
        String password = input.nextLine();

        if("admin".equalsIgnoreCase(name) && "1234".equals(password)){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Giriş Başarısız");
        }
    }
}
