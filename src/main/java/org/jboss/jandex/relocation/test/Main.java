package org.jboss.jandex.relocation.test;

import java.io.IOException;

import org.jboss.jandex.ClassInfo;
import org.jboss.jandex.Index;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassInfo clazz = Index.singleClass(Main.class);
        System.out.println(clazz);
    }
}
