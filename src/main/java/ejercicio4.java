
import java.util.ArrayList;
import java.util.List;


public class ejercicio4 {
    
    public static void main(String[] args) {
        int n1 = (int)(Math.random()*(15-5+1)+5);
        System.out.println("cantidad = " + n1);
        List <Integer> List1 = new ArrayList <Integer>();
        
        int n2 = (int)(Math.random()*(20-10+1)+10);
        System.out.println("cantidad = " + n2);
        List <Integer> List2 = new ArrayList <Integer>();
        
        int entrada=0;
        
        for(int i = 0;i < n1;i++)
        {   
            entrada = (int)(Math.random()*(550-50+1)+50);
            List1.add(entrada);
        }
        
        System.out.print("La 1ra lista es = ");
        System.out.println(List1);
        
        for(int i = 0;i < n2;i++)
        {   
            entrada = (int)(Math.random()*(550-50+1)+50);
            List2.add(entrada);
        }
        System.out.print("La 2da lista es = ");
        System.out.println(List2);
        
        //tercera Lista
        List <Integer> List3 = new ArrayList <Integer>();
        for(int i =0;i < n1; i++)
        {
            if(List2.contains(List1.get(i)) == false)
            {
                List3.add(List1.get(i));
            }
        }
        System.out.print("La 3ra lista = ");
        System.out.println(List3);
        //impares y pares
        List <Integer> List4 = new ArrayList <Integer>();
        for(int i =0;i < n1; i++)
        {
            if(List1.get(i) % 2 == 0)
            {
                List4.add(List1.get(i));
            }
        }
        for(int i =0;i < n2; i++)
        {
            if(List2.get(i) % 2 == 1)
            {
                List4.add(List2.get(i));
            }
        }
        System.out.print("La 4ta lista = ");
        System.out.println(List4);
        
        
        
        
    }
    
}
