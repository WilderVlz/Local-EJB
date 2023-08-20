package mx.com.gm.sga.web;

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.sga.domain.Person;
import mx.com.gm.sga.service.PersonService;

@WebServlet("/persons")
public class PersonaServlet extends HttpServlet {
    
    
    // dependency injection CDI
    @Inject
    PersonService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        List<Person> persons = this.personaService.personList();
        System.out.println("persons = " + persons);
        
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/personList.jsp").forward(request, response);
    }
    
}