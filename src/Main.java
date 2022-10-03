import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,result=0;
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        x=input.nextInt();
        System.out.println(x+" sayısına kadar olan 2'nin kuvvetleri: ");
        for (int i=1;i<=x;i=i*2){
            result=i;
            System.out.println(result);
        }


    }
}