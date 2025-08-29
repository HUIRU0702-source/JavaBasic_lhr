package com.athuiru.exer.extends_exer;

import org.junit.Test;

public class AbstractTest {
    @Test
    public void test() {
        Employee developer = new Developer("学学", 28);
        developer.work();
        getWork(developer);

        Employee manager = new Manager("成成", 30);
        manager.work();
        getWork(manager);
    }

    private void getWork(Employee employee) {
        employee.work();
    }
}
