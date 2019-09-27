package br.com.estudo.servlet.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresas
 */
@WebServlet("/listaEmpresa")
public class ListaEmpresas extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();

		RequestDispatcher requisicao = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("empresas", lista);
		requisicao.forward(request, response);

	}

}
