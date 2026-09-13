package runtime;

import java.util.Scanner;

// 创建程序关闭时的Hook，可在程序被异常关闭时执行额外操作
// 例如程序被强制关闭，需要清理临时备份出来的文件
public class JavaRuntimeHook {

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread("app-shutdown-hook") {
            @Override
            public void run() {
                // Run after program shutdown
                System.out.println("Shutdown resource connection");
            }
        });
        System.out.println("Hook created and wait..");
        String input = new Scanner(System.in).nextLine();

        // 以某个指定的状态推出当前的JVM虚拟机
        // System.exit(0);
        Runtime.getRuntime().exit(0);
    }
}
