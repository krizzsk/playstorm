package com.saypromo.core;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorService {
    static ExecutorService instance;
    private final ThreadPoolExecutor Executor = new ThreadPoolExecutor(4, 6, 3, TimeUnit.MINUTES, new LinkedBlockingQueue());

    public static ExecutorService getInstance() {
        if (instance == null) {
            instance = new ExecutorService();
        }
        return instance;
    }

    public void ExecuteTask(Runnable runnable) {
        this.Executor.execute(runnable);
    }
}
