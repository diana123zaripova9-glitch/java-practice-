import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        TimeOfDay part = TimeOfDay.fromHour(now.getHour());
        System.out.println("Текущее время: "+now.withNano(0));
        System.out.println("Часть суток: "+part.getDescription());
        Level level=Level.MEDIUM;
        switch(level){case HIGH -> System.out.println("Высокий уровень"); case MEDIUM -> System.out.println("Средний уровень"); case LOW -> System.out.println("Низкий уровень");}
    }
}
