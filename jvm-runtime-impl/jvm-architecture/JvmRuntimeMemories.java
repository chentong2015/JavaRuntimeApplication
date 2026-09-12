package memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

// TODO. 获取当前JVM内存数据: 验证JVM架构的正确性
public class JvmRuntimeMemoryPool {

    // Metaspace, G1 Eden Space, G1 Survivor Space, G1 Old Gen
    public static void main(String[] args) {
        List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans();
        for (MemoryPoolMXBean pool : pools) {
            System.out.println(pool.getName());
            System.out.println(pool.getType()); // Heap or Non-heap
            System.out.println(pool.getUsage());
            System.out.println(pool.getCollectionUsage());
            System.out.println(pool.getPeakUsage());
            System.out.println("------------------------------------");
        }
    }
}
