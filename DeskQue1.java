// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DeskQue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try{
            if(num<0){
            throw new Exception("Binary is not found");
            }
        }
        catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
      int binary[] = new int[40];
     int index = 0;
     while(num > 0){
       binary[index++] = num%2;
       num = num/2;
     }
     for(int i = index-1;i >= 0;i--){
       System.out.print(binary[i]);
     }
    }
}
