package org.upiita.spring.seguridad;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

public class LoginExitosoManejador extends SavedRequestAwareAuthenticationSuccessHandler {
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws ServletException, IOException {
		
		//SI EL LOGIN ES EXITOSO, REINICIAMOS EL CONTADOR DE LOGINS DALLIDOS
		request.getSession().setAttribute("loginsFallidos", 0);
		// TODO Auto-generated method stub
		super.onAuthenticationSuccess(request, response, authentication);
	}
	
}
