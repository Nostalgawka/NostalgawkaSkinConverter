import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class NostalgawkaSkinConverter {
    public static void main(String args[]) throws IOException {
        File skinFile = new File(args[0]);
        ImageIO.write(ImageIO.read(skinFile).getSubimage(0, 0, 64, 32), "png", skinFile);
        System.out.println("Zapisano!");
    }
}
