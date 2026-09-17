
// ProcessHandle: 关于Java进程的处理接口, 获取Process进程相关信息
public class JavaProcessId {

    // 在代码层面获取到进程ID
    public static void main(String[] args) {
        long pid = ProcessHandle.current().pid();
        System.out.println(pid);

        try {
            Thread.sleep(1600000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}