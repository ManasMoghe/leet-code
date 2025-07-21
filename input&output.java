import java.util.Scanner;

public class printer
{
    public static void main(String[] args)
    {
        Solution sol=new Solution();
        int sc=sol.printNumber();
        System.out.println(sc);
    }
}

class Solution
{
    int printNumber()
    {
        Scanner s=new Scanner(System.in);
        int y=s.nextInt();
        return y;
    }
}