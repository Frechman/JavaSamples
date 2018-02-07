package ru.frechman.exercises.stepikAlt;

import java.util.ArrayList;
import java.util.List;

public class MainDepartment {

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        return departments.stream()
                .filter(department -> department.getCode().startsWith("111-"))
                .flatMap(department -> department.getList().stream())
                .filter(employee -> employee.salary >= threshold).count();
    }

    class Employee {

        String name;
        long salary;

        public String getName() {
            return name;
        }

        public long getSalary() {
            return salary;
        }
    }

    class Department {

        String code;
        String name;
        List<Employee> list = new ArrayList<>();

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public List<Employee> getList() {
            return list;
        }
    }
}
