import org.w3c.dom.ls.LSOutput;
import ru.netology.statistic.StatisticsService;


public class Main {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {
            12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12
    };
    long result = service.findMax(incomesInBillions);
}


