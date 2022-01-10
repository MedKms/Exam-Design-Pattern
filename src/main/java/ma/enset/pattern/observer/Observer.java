package ma.enset.pattern.observer;

import ma.enset.aspects.Lock;
import ma.enset.aspects.Log;

public interface Observer {
    void update(ObservableImpl observable);
}
