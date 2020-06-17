
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
public class ImageTest {
 
    public static void imageMainMethod() {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                ImageFrame frame = new ImageFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
 
}
class ImageFrame extends JFrame
{
    public ImageFrame()
    {
        setTitle("Variant 21066");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
         
        ImageComponent component = new ImageComponent();
        add(component);
    }
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 290;
}
class ImageComponent extends JComponent
{
    public ImageComponent()
    {
        // Получаем изображения.
        try
        {
            image = ImageIO.read(new File("image/area.png"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g)
    {
        if(image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);
         
        // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 0, 0, null);
         
        // Многократный вывод изображения в панели.
  
    }
    private Image image;
}