import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
       Map<String,Long> phonebook = new java.util.HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            long phone = in.nextLong();
            phonebook.put(name, phone);

        }
        while(in.hasNext())
        {
            String name = in.next(); 
            if(phonebook.containsKey(name)== true)
            {
                System.out.println(name  + "=" +phonebook.get(name));

            }else
            {
                 System.out.println("Not found");
            }

        }
        in.close();
    }
}
