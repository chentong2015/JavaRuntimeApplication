package unsafe_class;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeClassMemory {

    // Unsafe: 通过VarHandle开放给外部使用
    // 测试直接内存抛出异常OutOfMemoryError
    private static final int _1M = 1024 * 1024;

    public void testAllocateMemory() throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1M); // 申请分配内存的方法
        }
    }
}
