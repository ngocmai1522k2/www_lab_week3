package vn.edu.iuh.fit.backend.configs;

import vn.edu.iuh.fit.backend.configs.connection.MySessionFactory;
import vn.edu.iuh.fit.backend.configs.models.Employee;
import vn.edu.iuh.fit.backend.configs.services.EmployeeServices;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MySessionFactory.getInstance();

//        EmployeeServices employeeServices = new EmployeeServices();
//        List<Employee> list =  employeeServices.getAll();
//        list.forEach(System.out::println);

    }
}
