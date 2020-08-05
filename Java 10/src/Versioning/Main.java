package Versioning;

public class Main {
    public static void main(String args[]){
        Runtime.Version version = Runtime.version();
        version.feature();
        version.interim();
        version.update();
        version.patch();
        System.out.println(version.update());

    }
}
