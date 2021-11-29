package behavioral.observer;

import java.util.List;

public interface Observer<T> {
    void event(List<T> strings);
}
