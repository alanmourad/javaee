package br.com.estudo.servlet.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServelt
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Empresa empresa = new Empresa();
		Banco banco = new Banco();

		String nomeEmpresa = req.getParameter("nome");
		String dataAbertura = req.getParameter("data");
		
		Date dataAbertura1 = null;
		
	    try {
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        dataAbertura1 = sdf.parse(dataAbertura);
	    } catch (ParseException e) {
	            throw new ServletException(e);
	    }

		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura1);
		
		banco.adiciona(empresa);

		// chamar JSP
		RequestDispatcher requisicao = req.getRequestDispatcher("/novaEmpresaCriada.jsp");
		req.setAttribute("empresa", nomeEmpresa);
		req.setAttribute("data", dataAbertura);
		requisicao.forward(req, resp);

	}

}
