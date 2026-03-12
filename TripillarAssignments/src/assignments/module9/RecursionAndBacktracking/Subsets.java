package assignments.module9.RecursionAndBacktracking;

public class Subsets {

    static void subset(String str, String current, int index){
        if(index == str.length()){
            System.out.println(current);
            return;
        }

        subset(str, current + str.charAt(index), index+1);
        subset(str, current, index+1);
    }

    public static void main(String[] args){
        subset("ABC","",0);
    }
}
