package ProcessHandleApi;

public class Main {
    public static void main(String args[]){
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Current Process Id: = " +currentProcess.pid());
    }

}
