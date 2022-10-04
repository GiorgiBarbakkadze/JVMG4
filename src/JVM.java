import java.util.*;

public class JVM {
    public static void main(String[] args) {
//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
//        Task6();
//        int x, y;
//        System.out.print("X: ");
//        Scanner scanner = new Scanner(System.in);
//        x = scanner.nextInt();
//        System.out.print("Y: ");
//        y = scanner.nextInt();
//        System.out.println(Task7(x, y));
//        Task8();
//        Task9();
//        Task10();
//        Task11();
//        Task12();

    }

//    გამოიტანეთ დაპროგრამების ენების სახელები ცალ–ცალკე ხაზზე( C++, C#,
//    java, pascal, php, JavaScropt, ActionScript).

    static void Task1() {
        System.out.println("C++");
        System.out.println("C#");
        System.out.println("Java");
        System.out.println("Pascal");
        System.out.println("PHP");
        System.out.println("Javascript");
        System.out.println("ActionScript");
    }

//    დავწეროთ კოდი რომელიც გამოიტანს შეტანილი ორი მთელი რიცხვის
//    შემთხვევაში, პირველის მეორეზე გაყოფის შედეგად მიღებულ მთელ შედეგს
//    და მეორის პირველზე გაყოფის შედეგად მიღებულ ნაშთს. (ფორმატის
//    გათვალისწინებით).

    static void Task2() {
        int x, y;
        System.out.print("X: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.print("Y: ");
        y = sc.nextInt();
        System.out.println(x / y);
        System.out.println(y % x);


    }

//    შეიტანეთ სამი მთელი რიცხვი, გამოიტანეთ მათი ჯამი და ნამრავლი.

    static void Task3() {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        x = sc.nextInt();
        System.out.print("Y: ");
        y = sc.nextInt();
        System.out.print("Z: ");
        z = sc.nextInt();
        System.out.println("Sum: " + (x + y + z));
        System.out.println("Multiplication: " + x * y * z);
    }

//    შეიტანეთ სამნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრები ცალ-ცალკე
//    ხაზზე.

    static void Task4() {
        int x;
        System.out.print("X: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        while (x != 0) {
            int y = x % 10;
            x /= 10;
            System.out.println(y);
        }
    }

//    შეიტანეთ ოთხნიშნა მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.

    static void Task5() {
        int x, z = 0;
        System.out.print("X: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while (x != 0) {
            z += x % 10;
            x /= 10;
        }
        System.out.println(z);
    }

//    შეიტანეთ ნებისმიერი მთელი რიცხვი, დაბეჭდეთ რიცხვის ციფრთა ჯამი.

    static void Task6() {
        int x, z = 0;
        System.out.print("X: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while (x != 0) {
            z += x % 10;
            x /= 10;
        }
        System.out.println(z);
    }

//    იპოვეთ ორი მთელი რიცხვის უდიდესი საერთო გამყოფი და უმცირესი
//    საერთო ჯერადი.(ევკლიდეს ალგორითმი).

    static int Task7(int x, int y) {


        if (y == 0) {
            return x;
        } else {
            return Task7(y, x % y);
        }

    }

//    დაბეჭდეთ მთელი რიცხვები M-დან N-მდე.

    static void Task8() {
        int m, n;
        System.out.print("M: ");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        System.out.print("n: ");
        n = scanner.nextInt();
        while (n < m) {
            System.out.println("n should be grater than m: ");
            System.out.print("M: ");
            m = scanner.nextInt();
            System.out.print("N: ");
            n = scanner.nextInt();
        }

        for (int i = m; i <= n; i++) {
            System.out.println(i);
        }
    }

//    განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაბეჭდეთ მასივის
//    ელემენტები, მასივის უდიდესი და უმცირესი ელემენტი.

    static void Task9() {
        int[] arr = {45, 55, 3, 5, 6, 8, 12, -9};


        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println();
        System.out.println("Max: " + arr[0]);
        System.out.println("Min: " + arr[1]);
    }

//    განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, დაალაგეთ მასივი
//    ზრდადობით, დაბეჭდეთ მასივი.

    static void Task10() {
        int[] arr = {45, 55, 3, 5, 6, 8, 12, -9};
        Arrays.sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

//    განსაზღვრეთ 8 ელემენტიანი ნამდვილ რიცხვთა მასივი, ჩაწერეთ მასში
//    შემთხვევითი რიცხვები, დაბეჭდეთ მასივი.

    static void Task11() {
        int[] arr = new int[8];

        for (int i = 0; i <= arr.length - 1; i++) {
            Random randNum = new Random();
            arr[i] = randNum.nextInt();
            System.out.print(arr[i] + " ");
        }
    }

//    განსაზღვრეთ 8 ელემენტიანი მთელ რიცხვთა მასივი, ჩაწერეთ მასში
//    შემთხვევითი რიცხვები, დაალაგეთ მასივი კლებადობით, დაბეჭდეთ მასივი.

    static void Task12() {
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            Random randomNum = new Random();
            arr[i] = randomNum.nextInt();
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i-- ) {
            System.out.print(arr[i] + " ");
        }


    }
}
