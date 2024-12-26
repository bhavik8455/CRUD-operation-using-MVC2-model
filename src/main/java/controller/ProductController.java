package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Product_Pojo;
import operations.Product_Implementation;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String i = req.getParameter("insert");
		String u = req.getParameter("update");
		String d = req.getParameter("delete");
		String s = req.getParameter("show");
		
		String flag = i + u + d + s;
		
		if(flag.equals("insertnullnullnull")) {
			Product_Pojo pojo = new Product_Pojo();
			pojo.setPname(req.getParameter("pname"));
			pojo.setPprice(Integer.parseInt(req.getParameter("pprice")));
			pojo.addProduct(pojo);
		
		}else if(flag.equals("nullupdatenullnull")) {
			Product_Pojo pojo = new Product_Pojo();
			pojo.setPname(req.getParameter("pname"));
			pojo.setPprice(Integer.parseInt(req.getParameter("pprice")));
			pojo.updateProduct(pojo);
			
		}else if(flag.equals("nullnulldeletenull")) {
			Product_Pojo pojo = new Product_Pojo();
			pojo.setPname(req.getParameter("pname"));
			pojo.deleteProduct(pojo);
			
		}else if(flag.equals("nullnullnullshow")) {
			List<Product_Pojo> data = new  Product_Implementation().show();
			req.setAttribute("data",data);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Show.jsp");
			dispatcher.forward(req, resp);
		}
		
		
		
	}

}
