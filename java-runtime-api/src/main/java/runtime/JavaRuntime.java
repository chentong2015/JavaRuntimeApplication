package runtime;

// TODO. Runtime.getRuntime() 获取程序运行时系统信息
public class JavaRuntime {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        // 可用的处理器数量(Logical threads/hyper-threading)限制最大并发线程数
        int availableProcessors = runtime.availableProcessors();
        System.out.println(availableProcessors);

        // 内存大小决定最大加载到内存Object以及OOM异常控制
        long max = runtime.maxMemory();
        long total = runtime.totalMemory();
        long free = runtime.freeMemory();
        long used = total - free;
        System.out.println("Max  = " + max);
        System.out.println("Total = " + total);
        System.out.println("Used = " + used);
        System.out.println("Free = " + free);

        // 主动调用gc, JVM可能将其忽略
        Runtime.getRuntime().gc();
    }
}
