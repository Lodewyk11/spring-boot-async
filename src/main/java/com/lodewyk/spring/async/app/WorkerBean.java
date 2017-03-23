package com.lodewyk.spring.async.app;

import java.util.concurrent.Future;


import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

public class WorkerBean {

    @Async
    public Future<Boolean> call() {
        try {
            System.out.println("Doing some long running task...");
            Thread.sleep(10000);
            System.out.println("Done with long running task");
            return new AsyncResult<Boolean>(Boolean.TRUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
          
        }
        return new AsyncResult<Boolean>(Boolean.FALSE);
    }

}