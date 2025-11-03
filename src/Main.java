import java.util.*;

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
        int firstNum = input.nextInt();
        System.out.println("Second Number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum "+ sum);
        int mult = firstNum * secondNum;
        System.out.println("mult "+ mult);
        if (mult > 5000 && sum < 4000){
            System.out.println("Koşul sağlandı" + mult);
        }
    }

    public static void arrays(){
        int[][][] cube = new int[2][3][4];
        int val = 1;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = val++;
                }
            }
        }
        System.out.println("---- 3 Boyutlu Dizi (2x3x4) ----");
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.printf("cube[%d][%d][%d] = %d%n", i, j, k, cube[i][j][k]);
                }
            }
        }

        List<String> cities = new ArrayList<>(Arrays.asList(
                "İstanbul", "Ankara", "İzmir", "Bursa", "Antalya",
                "Adana", "Konya", "Gaziantep", "Şanlıurfa", "Kayseri"
        ));
        System.out.println("\n---- Şehir Listesi (10 adet) ----");
        for (int i = 0; i < cities.size(); i++) {
            System.out.printf("%2d) %s%n", i + 1, cities.get(i));
        }

        // 3) Map: plaka kodu -> şehir (LinkedHashMap: ekleme sırasını korur)
        Map<Integer, String> plates = new LinkedHashMap<>();
        plates.put(34, "İstanbul");
        plates.put(6,  "Ankara");
        plates.put(35, "İzmir");
        plates.put(16, "Bursa");
        plates.put(7,  "Antalya");
        plates.put(1,  "Adana");
        plates.put(42, "Konya");
        plates.put(27, "Gaziantep");
        plates.put(63, "Şanlıurfa");
        plates.put(38, "Kayseri");

        System.out.println("\n---- Plaka -> Şehir Map'i ----");
        plates.forEach((plate, city) -> System.out.printf("%02d -> %s%n", plate, city));
    }
    }

