package Threading;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer> {

    int result =1;

    @Override
    public Integer call() throws Exception {
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new MyCallable());
        Integer result = future.get();
        System.out.println("Result is : " +result);
        executorService.shutdown();

    }
}
