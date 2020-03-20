package imageManageToolSceneBuilder;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.text.*;

public class ImageInfo {
    private File file;
    private BufferedImage image;
    private String path;
    private String name;
    private String format;
    public long size;
    public long date;
    private String resolution;
    // private Image image;

    public String color;
    public String camera;
    public String location;

    public ImageInfo() {
    }

    public ImageInfo(File image) {
        this.size = image.length();
        this.name = image.getName();
        this.path = image.getAbsolutePath();
        this.date = image.lastModified();

        this.file = image;
        // this.resolution = im.getHeight() + "*" + im.getWidth();

    }

    public String getName() {
        return name;
    }

    public String getType() {
        this.format = name.substring(path.lastIndexOf("."), path.length());
        return format;
    }

    public String getResolution() {
        BufferedImage images;
        try { // handle with IOexception
            images = ImageIO.read(file);
            this.resolution = images.getHeight() + "*" + images.getWidth();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
        return resolution;
    }

}