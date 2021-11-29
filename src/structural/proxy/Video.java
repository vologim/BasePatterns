package structural.proxy;

public class Video implements File{
    private String url;
    private String path;

    public Video(String url, String path) {
        this.url = url;
        this.path = path;
        load();
        save();
    }

    public void load() {
        System.out.println("Download file from " + url);
    }

    public void save() {
        System.out.println("File is saved in " + path);
    }

    @Override
    public void showFile() {
        System.out.println("Video is played");
    }
}
