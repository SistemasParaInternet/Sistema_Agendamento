<%-- 
    Document   : index
    Created on : 24/02/2013, 00:19:56
    Author     : alaric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Login</title>
        <link href="Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <h2>Login</h2>
        
        <f:view>
            <h:form id="Login" prependId="false" styleClass="form-actions">
                
                Usuário : <br/><h:inputText id="usuario" value="#{Paciente.nome}"/><br/>
                
                Senha : <br/><h:inputText id="senha" value="#{Paciente.bairro}"/><br/>
                
                
            </h:form>

            <br/><a href="faces/menu_agenda.jsp" >Menu</a>            
                
        </f:view>
        
    </body>
</html>
