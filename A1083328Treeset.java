
import java.util.*;
import java.util.Iterator;
import java.util.TreeSet;
import java.security.SecureRandom;

public class A1083328Treeset{
    public static void main(String args[]){
        TreeSet<Integer>tset= new TreeSet<Integer>();
        ArrayList<Integer>tset1=new ArrayList<Integer>();
        SecureRandom num1= new SecureRandom();
        for(int i= 1;i<=10;i++){
            int num2= 1+num1.nextInt(100);
            
            
            if(tset1.contains(num2)){
                i--;
            }else{
                tset1.add(num2);
                System.out.println("The Number of "+i+" is "+num2);
            }
        
        }
        for(Integer t:tset1){
            tset.add(t);
        }
        System.out.println("Many Number : "+tset.size());
        System.out.println("The Number from the lowest: "+tset);
        System.out.println("The first number: "+tset.first());
        System.out.println("The last number: "+tset.last());

        TreeSet<Integer> sub_set = new TreeSet<Integer>();
        sub_set = (TreeSet<Integer>)tset.subSet(30,70);
        Iterator iterate;
        iterate = sub_set.iterator();
        System.out.print("Number from 30-70 :" );
        while(iterate.hasNext()){
            System.out.print(iterate.next()+" ");
        }



        
       
    }

}