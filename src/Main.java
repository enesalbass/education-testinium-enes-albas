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

    public static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("First Number: ");
        int firstNum = input.nextLine();
        System.out.println("Second Number: ");
        int secondNum = input.nextLine();
        int sum = firstNum + secondNum;
        System.out.println("Sum "+ sum);
        int mult = firstNum + secondNum;
        System.out.println("mult "+ mult);
        if (mult > 5000 && sum < 4000){
            System.out.println("Koşul sağlandı" + mult);
        }
    }
}
