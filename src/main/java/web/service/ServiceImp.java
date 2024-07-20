package web.service;

import java.util.List;

public class ServiceImp {
    public static <T> List<T> getRequiredNumbersOfObjects(List<T> obj, int count) {
        return (count >= 5) ? obj : obj.subList(0, count);
    }
}
