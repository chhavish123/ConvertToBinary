// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DeskQue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        try{
            if(decimal<0){
            throw new Exception("Binary is not found");
            }
        }
        catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        int rv=0;
        int p=1;
        while(decimal>0)
        {
                int dig=decimal%2;
                decimal=decimal/2;
                rv=dig*p;
                p=p*10;
            
        }
        System.out.println("binary is:"+decimal);

    }
}