package unit9;
import java.util.*;

public class TreeSetExample2 {
public static void main(String[] args) {
    
        TreeSet<String> s = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int i,n;
        String CityName;
        System.out.println("How many City ");    
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter City Name ");
            CityName=sc.next();
            s.add(CityName);
        }
        System.out.println("Citys in Sorted Order ");
        Iterator<String> itr=s.iterator();
        while(itr.hasNext())

        System.out.println(itr.next());
    }
    }

