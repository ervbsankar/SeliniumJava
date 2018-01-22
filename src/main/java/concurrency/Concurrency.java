package com.concurrency;


import java.util.concurrent.CompletableFuture;

/**
 * Concurrency class for CompletableFuture
 */
public class Concurrency {

    public static void main(String[] args){
        final CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "42");
        completableFuture.thenAccept(Concurrency::print);
    }

    static void print(String c) { System.out.println(c);}

}
