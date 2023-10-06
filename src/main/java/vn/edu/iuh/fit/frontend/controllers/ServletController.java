package vn.edu.iuh.fit.frontend.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.iuh.fit.backend.configs.models.Customer;
import vn.edu.iuh.fit.backend.configs.models.Product;
import vn.edu.iuh.fit.backend.configs.services.CustomerServices;
import vn.edu.iuh.fit.frontend.model.CustomerModel;
import vn.edu.iuh.fit.frontend.model.ProductModel;

import java.io.IOException;
import java.util.List;

@WebServlet("/controls")
public class ServletController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Object actionObject= req.getParameter("action");
            if(actionObject != null){
                String action = actionObject.toString();
                if(action.equals("insert_products")){
                    ProductModel pm = new ProductModel();
                    pm.insertProduct(req,resp);
                }
                else if(action.equals("insertCustomer")){
                    CustomerModel c = new CustomerModel();
                    c.insertCustomer(req,resp);
                }
            }
        }catch (Exception e) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object actionObject= req.getParameter("action");
        if(actionObject != null){
            String action = actionObject.toString();
            if(action.equals("cust_list")){
//                    CustomerServices services = new CustomerServices();
//                    List<Customer> lst = services.getAll();
//                    HttpSession session = req.getSession(true);
//                    session.setAttribute("customers", lst);
                resp.sendRedirect("customers.jsp");
            }
        }
    }
}
