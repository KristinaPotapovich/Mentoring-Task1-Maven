package by.epam.com;

public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils utils = new StringUtils();
        boolean result = false;
        for (String data : str) {
            if (utils.isPositiveNumber(data)){
                result = true;
            }
        }
        return result;
    }
}
