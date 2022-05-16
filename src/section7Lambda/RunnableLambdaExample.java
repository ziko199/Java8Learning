package section7Lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //--------------------------- Java 8 with Lambda --------------------------
        Runnable runnableLambda = () -> {
            System.out.println("Inside of Runnable lambda");
        };

        Runnable runnableLambda1 = () -> System.out.println("Inside of Runnable lambda 2");

        new Thread(runnableLambda).start();
        new Thread(runnableLambda1).start();

        new Thread(() -> System.out.println("Runnable lambda 3") ).start();
    }
}
