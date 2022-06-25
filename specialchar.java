// is program me string me se special characters ko hta dete h 
import java.io.*;
import java.util.*;
class specialchar
{
    public void main()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String str2 = str.replaceAll("[^ A-Za-z0-9]","");
        System.out.println(str2);
    }
}
