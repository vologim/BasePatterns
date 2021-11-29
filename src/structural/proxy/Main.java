package structural.proxy;

public class Main {
    public static void main(String[] args) {
        File video = new ProxyVideo("https://www.youtube.com/", "/home/user/video");
        video.showFile();
    }
}
