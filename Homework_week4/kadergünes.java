import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age;
        Scanner input=new Scanner(System.in);
        System.out.println("yaşınızı girin");
        age=input.nextInt();
        switch(age){
            case 0:
                System.out.println("yeni doğdun");
                break;
            case 1:
                System.out.println("bir yasındasın");
                break;
            case 5:
                System.out.println("5 yasındasın");
                break;
            case 10:
                System.out.println("okula gidiyorsun");
                break;

            case 15:
                System.out.println("liseye gidiyorsun");
                break;
            case 20:
                System.out.println("üniversiteye başladın");
                break;
            default:
                System.out.println("yaşlısın");
        }


    }
}
