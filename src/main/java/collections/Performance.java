import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Performance {
    public static void main(String[] args){
        Vector v=new Vector();
        Object element;
        Enumeration enumer;
        Iterator iter;
        long start;

        start=System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            v.add("New Element");
        }
        System.out.println("for took " + (System.currentTimeMillis()-start));

        enumer=v.elements();
        iter=v.iterator();
        //*****CODE BLOCK FOR ITERATOR**********************
        start=System.currentTimeMillis();
        while(iter.hasNext()){
            element=iter.next();
        }
        System.out.println("Iterator took " + (System.currentTimeMillis()-start));
        //*************END OF ITERATOR BLOCK************************

        System.gc();   //request to GC to free up some memory
        //*************CODE BLOCK FOR ENUMERATION*******************
        start=System.currentTimeMillis();
        while(enumer.hasMoreElements()){
            element=enumer.nextElement();
        }
        System.out.println("Enumeration took " + (System.currentTimeMillis()-start));
        //************END OF ENUMERATION BLOCK**********************
    }
}
