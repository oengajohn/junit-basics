package org.example;


public class App 
{
   public int sum(int a, int b){
       return  a+b;
   }

    public static void main(String[] args) {
        App app =new App();
        int result = app.sum(12, 45);
        if(result !=57){
            System.out.println("Failed");
        }
        System.out.println(result);
    }
}
