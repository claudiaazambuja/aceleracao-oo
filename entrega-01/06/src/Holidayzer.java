import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Holidayzer {
    private static Map<String, Holiday> holidays;

    static {
        holidays = new HashMap<>();
        holidays.put("01-01-2024", new Holiday("01-01-2024", "Confraternização Mundial"));
        holidays.put("12-02-2024", new Holiday("12-02-2024", "Carnaval"));
        holidays.put("13-02-2024", new Holiday("13-02-2024", "Carnaval"));
        holidays.put("29-03-2024", new Holiday("29-03-2024", "Sexta-feira Santa"));
        holidays.put("21-04-2024", new Holiday("21-04-2024", "Tiradentes"));
        holidays.put("01-05-2024", new Holiday("01-05-2024", "Dia do Trabalho"));
        holidays.put("30-05-2024", new Holiday("30-05-2024", "Corpus Christi"));
        holidays.put("07-09-2024", new Holiday("07-09-2024", "Independência do Brasil"));
        holidays.put("12-10-2024", new Holiday("12-10-2024", "Nossa Senhora Aparecida"));
        holidays.put("02-11-2024", new Holiday("02-11-2024", "Finados"));
        holidays.put("15-11-2024", new Holiday("15-11-2024", "Proclamação da República"));
        holidays.put("20-11-2024", new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        holidays.put("25-12-2024", new Holiday("25-12-2024", "Natal"));
    }

    public static void checkHoliday(String inputDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = sdf.parse(inputDate);
            String formattedDate = sdf.format(date);

            if (holidays.containsKey(formattedDate)) {
                Holiday holiday = holidays.get(formattedDate);
                System.out.println("Dia " + formattedDate + " é " + holiday.getName() + "! 🎉");
            } else {
                System.out.println("Dia " + formattedDate + " não é feriado 🥲");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
