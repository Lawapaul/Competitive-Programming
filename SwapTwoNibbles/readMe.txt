// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int swapnum;
        swapnum = ((a & 0x0F) << 4) | ((a & 0xF0) >> 4);
        System.out.println(a);
        System.out.println(swapnum);
        
    }
}