package controller;

import dao.ProductDAO;
import entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AddNewProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddNewProductServlet() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Add product Servlet Called........");
        String email = request.getParameter("pname");
        String password = request.getParameter("pprice");
        String brand =  request.getParameter("pbrand");

        Product product = new Product();
        product.setPname(email);
        product.setPprice(Integer.parseInt(password));
        product.setPbrand(brand);
        PrintWriter out = response.getWriter();
        if(ProductDAO.addProduct(product)) {
            response.sendRedirect("add_product.html");
        }
        else {
            System.out.println("Product Add Failed");
            response.sendRedirect("add_product.html");
        }

    }
}
