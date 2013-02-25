<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib  prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadatrar Médico</title>
    </head>
    <body>
        
        <f:view>
            <h:form id="cadastro" prependId="false">
                Nome: <br/><h:inputText id="nome" value="#{Medico.nome}"/><br/>
                CRM: <br/><h:inputText id="crm" value="#{Medico.crm}"/>
                <br/><br/>
                
                <h:commandButton action="#{Medico.cadastrar()}" value="Cadastrar"/>
                <h:commandButton action="#{Medico.limpar()}" value="Limpar"/>
                <br/><br/>
                <h:outputText value="#{Medico.msgmErro}" style="color:#FF0000"/>
                <br/><br/>
                <h:commandLink action="#{Medico.listarM()}" value="Listar Medicos"/>
                <br/><br/><br/>
                <a href="../faces/index.jsp">Retornar Menu</a>
            </h:form>
                
        </f:view>
        
    </body>
</html>
