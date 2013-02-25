<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Médico</title>
    </head>
    <body>
        <f:view>
            <h:form id="alterarMed" prependId="false">
                
                Nome: <br/><h:inputText id="nome" value="#{Medico.nome}"/><br/>
                CRM: <br/><h:inputText id="crm" value="#{Medico.crm}"/>
                <br/><br/>
                
                <h:commandButton action="#{Medico.alterar()}" value="Alterar Dados"/>
                <h:commandButton action="#{Medico.limpar()}" value="Limpar"/>
                <br/><br/>
                <h:outputText value="#{Medico.msgmErro}" style="color:#FF0000"/>
                <br><br>
                <a href="listar_medicos.jsp">Voltar</a>
                
            </h:form>
        </f:view>
        
    </body>
</html>
