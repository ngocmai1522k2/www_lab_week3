package vn.edu.iuh.fit.backend.configs;

import vn.edu.iuh.fit.backend.configs.respositories.EmployeeRepository;
import vn.edu.iuh.fit.backend.configs.services.EmployeeServices;

public class main {
    public static void main(String[] args) {
        //EmployeeServices employeeServices = new EmployeeServices();
        MySessionFactory.getInstance();

    }
}
