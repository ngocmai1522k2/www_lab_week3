package vn.edu.iuh.fit.frontend.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.backend.configs.models.Customer;
import vn.edu.iuh.fit.backend.configs.services.CustomerServices;

import java.util.List;

public class CustomerModel {
    private final CustomerServices services = new CustomerServices();
    public void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(name, email,phone,address);

        services.insertCus(customer);
        //xu ly sau insert
        response.sendRedirect("../webapp/index.jsp");
    }
    public List<Customer> getAllCustomers(){
        return services.getAll();
    }
}
