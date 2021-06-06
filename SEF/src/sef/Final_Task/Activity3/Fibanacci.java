package sef.Final_Task.Activity3;

public class Fibanacci {

    public static void main(String args[]){
        int count = 9;
        int n0 = 0;
        int n1 = 1;
        int n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= count; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();

    }
}


