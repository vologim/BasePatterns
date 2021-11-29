package structural.proxy;

public class ProxyVideo implements File {
    private Video video;
    private String url;
    private String path;

    public ProxyVideo(String url, String path) {
        this.url = url;
        this.path = path;
    }

    @Override
    public void showFile() {
        if(video == null){
            video = new Video(url, path);
        }
        video.showFile();
    }
}
