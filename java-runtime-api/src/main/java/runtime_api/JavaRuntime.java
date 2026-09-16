package runtime_api;

// TODO. Runtime.getRuntime() 获取程序运行时系统信息
public class JavaRuntime {

    public static void main(String[] args) {
        // 可用的处理器数量(Logical threads/hyper-threading)限制最大并发线程数
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors);

        // 内存大小决定最大加载到内存Object以及OOM异常控制
        long max = Runtime.getRuntime().maxMemory();
        long total = Runtime.getRuntime().totalMemory();
        long free = Runtime.getRuntime().freeMemory();
        System.out.println("Max  = " + max);
        System.out.println("Total = " + total);
        System.out.println("Free = " + free);

        // 主动调用gc, JVM可能将其忽略
        Runtime.getRuntime().gc();

        // Exit Status 以指定状态退出JVM, 自定义错误返回的不同状态码
        // 0: Successful completion
        // >0: An error occurred
        System.exit(0);
        Runtime.getRuntime().exit(1);
    }
}
