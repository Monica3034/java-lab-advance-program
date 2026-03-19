import java.util.Scanner;
public class Prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean prime = true;
        for(int i=2;i<=n/2;i++){
            if(n%2 == 0){
            prime = false;
            break;
            }
        }
        if(prime){
            System.out.println("Given number is prime");
        }else{
            System.out.println("Given number is not prime");
        }
       
    }
}

(OR)
public class Prime{
    public static void main(String[]args){
        int n=34;
        boolean prime = true;
        for(int i=2;i<=n/2;i++){
            if(n%2 == 0){
            prime = false;
            break;
            }
        }
        if(prime){
            System.out.println("Given number is prime");
        }else{
            System.out.println("Given number is not prime");
        }
       
    }
}
