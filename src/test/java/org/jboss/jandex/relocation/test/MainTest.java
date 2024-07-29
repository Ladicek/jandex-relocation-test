package org.jboss.jandex.relocation.test;

import org.jboss.jandex.ClassInfo;
import org.jboss.jandex.Index;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class MainTest {
    @Test
    public void test() throws IOException {
        ClassInfo clazz = Index.singleClass(MainTest.class);
        System.out.println(clazz);
    }
}
