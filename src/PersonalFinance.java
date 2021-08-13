import settings.Format;
import settings.Settings;
import settings.Text;

import java.awt.*;
import java.io.IOException;
import java.util.Date;

public class PersonalFinance {
    public static void main(String[] args) {
        init();
        System.out.println(Format.dateMonth(new Date()));
//        System.out.println(Arrays.toString(Text.getMonths()));
//        System.out.println(Text.get("PROGRAMME_NAME"));
    }

    private static void init() {
        try {
            Settings.init();
            Text.init();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Settings.FONT_ROBOTO));
        } catch (FontFormatException | IOException e) {
            System.out.println("Шрифт не найден!");
        }
    }

}
