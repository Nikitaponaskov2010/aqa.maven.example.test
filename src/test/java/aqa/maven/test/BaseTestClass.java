package aqa.maven.test;

import org.junit.jupiter.api.BeforeAll;

public class BaseTestClass implements PropertiesReader{
    @BeforeAll
    public void readPropertiesLine() {
        readProperties();
    }
}
