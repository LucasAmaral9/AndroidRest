import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.JSonFacade;
import to.Carro;
import dao.AcessoBD;
import dao.selecaoDao;
/**
* Servlet implementation class SelecionarCervejasJSon
*/
@WebServlet("/selecao.json")
public class selecaoJSon2 extends HttpServlet {
private static final long serialVersionUID = 1L;

AcessoBD bd = new AcessoBD();
Connection conn = null;
Carro carros = null;
/**
 * @see HttpServlet#HttpServlet()
 */
public selecaoJSon2() {
    super();
    // TODO Auto-generated constructor stub
}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
* response)
*/
protected void doGet(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {
doPost(request, response);
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
* response)
*/
protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8");
response.setContentType("application/json");
response.setCharacterEncoding("UTF-8");
String url = request.getRequestURL().toString();
url = url.substring(0, url.lastIndexOf('/'));
String marca = request.getParameter("marca");

Carro carro = selecaoDao.carregaCarro(conn,marca);
PrintWriter out = response.getWriter();


out.println(JSonFacade.listToJSon2(carro));
}
}