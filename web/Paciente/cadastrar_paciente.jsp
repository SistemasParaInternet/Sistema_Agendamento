<%-- 
    Document   : index
    Created on : 20/02/2013, 21:38:13
    Author     : alaric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib  prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadatrar Paciente</title>
    </head>
    <body>        
        <f:view>
            <h:form id="cadastro" prependId="false">
                Nome: <br/><h:inputText id="nome" value="#{Paciente.nome}"/><br/>
                Data Nascimento: <br/><h:inputText id="dataNasc" value="#{Paciente.dataNasc}">
                                            <f:convertDateTime pattern="dd/MM/yyyy" />
                                      </h:inputText><br/>
                Logradouro: <br/><h:inputText id="logradouro" value="#{Paciente.logradouro}"/><br/>
                Numero: <br/><h:inputText id="numero" value="#{Paciente.numero}"/><br/>
                Bairro: <br/><h:inputText id="bairro" value="#{Paciente.bairro}"/><br/>
                Cidade: <br/><h:inputText id="cidade" value="#{Paciente.cidade}"/><br/>
                Estado: <br/><h:inputText id="uf" value="#{Paciente.uf}"/>
                <br/><br/>
                
                <h:commandButton action="#{Paciente.cadastrar()}" value="Cadastrar"/>
                <h:commandButton action="#{Paciente.limpar()}" value="Limpar"/>
                <br/><br/>
                <h:outputText value="#{Paciente.msgmErro}" style="color:#FF0000"/>
                <br/><br/>
                <h:commandLink action="#{Paciente.listarP()}" value="Listar Pacientes"/>
                <br/><br/><br/>
                <a href="../faces/index.jsp">Retornar Menu</a>
            </h:form>
                
        </f:view>
        
    </body>
</html>
