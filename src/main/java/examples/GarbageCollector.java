package com.Examples;


import java.util.Date;

public class GarbageCollector {

    public static void main(String[] args){
        GarbageCollector gc = new GarbageCollector();
        gc.demo();
        gc = new GarbageCollector();
        gc = null;

        //try to create lots of garbage
        for(int i = 0; i < 100000; i++) {new Date();}
        System.gc();
    }

    protected void finalize() throws Throwable {
        System.out.println( this + " in finalizer");
        super.finalize();
    }

    private void demo() {
        Date ref1 = new Date();
        Date ref2 = new Date();
        Date ref3 = ref1;
    }
}
