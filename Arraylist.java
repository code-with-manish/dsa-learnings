import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
            System.out.println(list);
        
        //System.out.println(list.get(i));
    }
    
}
}
