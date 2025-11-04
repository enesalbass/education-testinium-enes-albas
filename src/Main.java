import model.constructor.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Car car1=new Car(1,"BMW","red",2025);
        Car car2=new Car(2,"BMW","red");
        car.setModel("mercedes");




        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullnaıcı adını giriniz :");
        String userName = scanner.nextLine();
        System.out.println("Şifreyi Giriniz: ");
        String password = scanner.nextLine();
        if ("admin".equals(userName) && "1234".equals(password)) {
            System.out.println("Giriş Başarılı!!");
        } else {
            System.out.println("Hatalı Giriş!");

        }

        sum();
        multipleArray();

    }
    // İkinci Çalışma
    public static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("First Number: ");
        int firstNum = input.nextInt();
        System.out.println("Second Number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum "+ sum);
        int mult = firstNum * secondNum;
        System. out. println("mult "+ mult);
        if (mult > 5000 & sum < 4000) {
            System. out. println("Koşul sağlandı!" + mult);
        }
    }

    static void multipleArray() {
        int[][] multipleArray = new int[20][5];
        multipleArray[0][0] = 1;
        multipleArray[0][1] = 2;
        multipleArray[0][2] = 3;
        multipleArray[0][3] = 4;
        multipleArray[0][4] = 5;

        // Tüm elemanlar ekrana yazdırılıyor
        for (int i = 0; i < multipleArray.length; i++) {
            for (int j = 0; j < multipleArray[i].length; j++) {
                System.out.println("multipleArray[" + i + "][" + j + "] = " + multipleArray[i][j]);

            }
        }
    }


}
