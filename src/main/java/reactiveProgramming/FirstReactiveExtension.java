package reactiveProgramming;


import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Predicate;
import org.reactivestreams.Subscriber;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

import static java.util.Arrays.asList;

public class FirstReactiveExtension {

    public static void main(String[] args){

        //Observable is pushing data asynchronously (multiple)
        //Iterable is pull data synchronously (multiple)
        //Future is single value Async, future needs block (get())
        //CompletableFuture is more better than Future, you can do thenApply()
        //blocking API vs Observable API


        Integer[] intArr = {1,2,3};
        List<Integer> list = Arrays.asList(intArr);

        // Flowable and Observable are same name
        // Observable dont have back pressure
        Observable.just(1,2,3,4,5,6)
                .filter(integer -> integer%2 == 0)
                .subscribe(x ->  System.out.println(x));

        Flowable.just(1,2,3,4,5,6)
                .filter(x -> x/2 == 1)
                .subscribe(System.out::println);

        Flowable.fromArray(intArr);
        Flowable.fromIterable(list);

        Observable.fromCallable(() -> "Sankar");

        // Single -> one item with no  back pressure
        // Completable -> either complete or it fails and no back pressure
        // Maybe -> value  or no value or error and no back pressure

        //FlowableProcessor and Subject are same. subject -> no back pressure

        Observable.create(observableEmitter -> {
            observableEmitter.onNext("Sankar");
            observableEmitter.onComplete();
        });
    }


}
