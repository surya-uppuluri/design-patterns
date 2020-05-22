package surya.learns.designpatterns.singleton;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class EagerInitializedSingletonTest {

    @Test
    void getInstance() {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        log.info("instance1 hashCode : {}, instance2 hashCode: {}", instance1.hashCode(), instance2.hashCode());
        assertEquals(instance1, instance2);
    }
}