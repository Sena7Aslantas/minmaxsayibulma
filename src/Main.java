import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int miktar;

        System.out.print("Kac tane sayı gireceksiniz:");
        Scanner input=new Scanner(System.in);
        miktar=input.nextInt();
        int min=0;
        int max=0;
        int number;
        for(int i=1;i<=miktar;i++){
            Scanner inputt=new Scanner(System.in);
            number= input.nextInt();
            System.out.println(i+".Sayi"+number);
            if(number<min || min==0){
                min=number;
            }
            if(number>max){
                max=number;
            }
        }
        System.out.println("En büyük sayı:"+max);
        System.out.print("En kücük sayı:"+min);


    }
}