import settings.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PersonalFinance {
    public static void main(String[] args) {
        init();
//        System.out.println(Arrays.toString(Text.getMonths()));
//        System.out.println(Text.get("PROGRAMME_NAME"));
    }

    private static void init() {
        Text.init();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Roboto.ttf")));
        } catch (FontFormatException | IOException e) {
            System.out.println("Шрифт не найден!");;
        }
    }

}
