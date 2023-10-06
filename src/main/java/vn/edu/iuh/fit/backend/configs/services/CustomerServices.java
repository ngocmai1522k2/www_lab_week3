package vn.edu.iuh.fit.backend.configs.services;

import vn.edu.iuh.fit.backend.configs.models.Customer;
import vn.edu.iuh.fit.backend.configs.respositories.CustomerRepository;

import java.util.List;

public class CustomerServices {
    private final CustomerRepository repository;
    public CustomerServices(){
        repository = new CustomerRepository();
    }
    public CustomerServices(CustomerRepository repository) {
        this.repository = repository;
    }

    public void insertCus(Customer customer) {
        repository.insertCus(customer);
    }

    public List<Customer> getAll() {
        return repository.getAllCust();
    }
}
