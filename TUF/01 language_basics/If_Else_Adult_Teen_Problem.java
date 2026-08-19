import java.util.*;
class Solution {
    public void isAdult(int age) {
        if(age>=18){
             System.out.println("Adult");
        }
        else{
            System.out.println("Teen");
        }
     
    }
}

class Main {
    public static void main(String[] args){

        Solution solution = new Solution();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

         solution.isAdult(age);
    }
}