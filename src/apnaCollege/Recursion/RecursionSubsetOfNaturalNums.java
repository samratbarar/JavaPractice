package apnaCollege.Recursion;

import java.util.*;

// print all the subsets of a set of first n natural numbers

public class RecursionSubsetOfNaturalNums {
    public static void printSubset(int n, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printSubset(n-1, str + Integer.toString(n) + " ");
        printSubset(n-1, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n ");
        printSubset(sc.nextInt(), "");
    }
}
/*
mam way using backtracking and arraylist which I do not know till now
import java.util.ArrayList;

public class Recursion3 {

   public static void printSubsets(ArrayList<Integer> subset) {
       for(int i=0; i<subset.size(); i++) {
           System.out.print(subset.get(i)+" ");
       }
       System.out.println();
   }

   public static void findSubsets(int n, ArrayList<Integer> subset) {
       if(n == 0) {
           printSubsets(subset);
           return;
       }

       findSubsets(n-1, subset);
       subset.add(n);
       findSubsets(n-1, subset);
       subset.remove(subset.size() - 1);
   }

   public static void main(String args[]) {
       int n = 3;
       findSubsets(n, new ArrayList<Integer> ());
   }
}
 */