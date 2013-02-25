<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Exame</title>
    </head>
    <body>
        <f:view>
            <h:form id="alterarExa" prependId="false">
                
                Nome: <br/><h:inputText id="nome" value="#{Exame.nome}"/><br/>
                Valor: <br/><h:inputText id="valor" value="#{Exame.valor}"/>
                <br/><br/>
                
                <h:commandButton action="#{Exame.alterar()}" value="Alterar Dados"/>
                <h:commandButton action="#{Exame.limpar()}" value="Limpar"/>
                <br/><br/>
                <h:outputText value="#{Exame.msgmErro}" style="color:#FF0000"/>
                <br><br>
                <a href="listar_exames.jsp">Voltar</a>
                
            </h:form>
        </f:view>
        
    </body>
</html>
