<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib  prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadatrar Exame</title>
    </head>
    <body>
        
        <f:view>
            <h:form id="cadastro" prependId="false">
                Nome: <br/><h:inputText id="nome" value="#{Exame.nome}"/><br/>
                Valor: <br/><h:inputText id="valor" value="#{Exame.valor}"/>
                <br/><br/>
                
                <h:commandButton action="#{Exame.cadastrar()}" value="Cadastrar"/>
                <h:commandButton action="#{Exame.limpar()}" value="Limpar"/>
                <br/><br/>
                <h:outputText value="#{Exame.msgmErro}" style="color:#FF0000"/>
                <br/><br/>
                <h:commandLink action="#{Exame.listarE()}" value="Listar Exames"/>
                <br/><br/><br/>
                <a href="../faces/index.jsp">Retornar Menu</a>
            </h:form>
                
        </f:view>
        
    </body>
</html>
