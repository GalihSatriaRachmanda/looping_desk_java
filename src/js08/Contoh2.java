package js08;

public class Contoh2 {
    public static void main(String[] args){
        int x = 1;
        for( x=1;x<=10;x++){
            System.out.print(x+" ");
        }
        System.out.println();
       
        x=1;
        
        while( x <= 10){
            System.out.print(x+" ");
            x++;
        }
        System.out.println();
        
        x=1;
        
        do {
            System.out.print(x+" ");
            x++;
        }
        while (x <= 10);
    }
}
