package part1;

import java.util.ArrayList;



public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    public static boolean search(ArrayList<Integer> array, int e)
    {
        System.out.println("Inside search");
        if(array==null) return false;
        for(int elt:array)
        {
            if(elt==e) return true;

        }
        return false;

    }

   /*  public static boolean equals(boolean[] a, boolean[] a2)
    {
        if(a==a2)
            return true;
        if(a==null || a2==null)
            return false;
        int len=a.length;
        if(a2.length!=len)
            return false;
        for(int i=0;i<len;i++)
            if(a[i]!=a2[i])
                return false;
        return true;
    } */
}