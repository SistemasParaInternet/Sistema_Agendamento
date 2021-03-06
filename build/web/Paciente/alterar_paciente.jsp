<%-- 
    Document   : alterar_paciente
    Created on : 21/02/2013, 21:32:25
    Author     : alaric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Paciente</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <f:view>
            <div class="container">
                <h:form id="alterarPac" prependId="false" styleClass="form-horizontal">

                    <div class="control-group">
                        <div class="control-label">Nome: </div>    
                        <div class="controls">
                            <h:inputText id="nome" value="#{Paciente.nome}"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Data Nascimento: </div>    
                        <div class="controls">
                            <h:inputText id="dataNasc" value="#{Paciente.dataNasc}">
                                <f:convertDateTime pattern="dd/MM/yyyy" />
                            </h:inputText>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Logradouro: </div>    
                        <div class="controls">
                            <h:inputText id="logradouro" value="#{Paciente.logradouro}"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Número: </div>    
                        <div class="controls">
                            <h:inputText id="numero" value="#{Paciente.numero}"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Bairro: </div>    
                        <div class="controls">
                            <h:inputText id="bairro" value="#{Paciente.bairro}"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Cidade: </div>    
                        <div class="controls">
                            <h:inputText id="cidade" value="#{Paciente.cidade}"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Estado: </div>    
                        <div class="controls">
                            <h:inputText id="uf" value="#{Paciente.uf}"/>
                        </div>
                    </div>
                        
                    <br/><br/>

                    <h:commandButton action="#{Paciente.alterar()}" value="Alterar Dados"/>
                    <h:commandButton action="#{Paciente.limpar()}" value="Limpar"/>
                    <br/><br/>
                    <h:outputText value="#{Paciente.msgmErro}" style="color:#FF0000"/>
                    <br><br>
                    <h:commandLink action="listar_pacientes.jsp" value="Listar Pacientes" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>

    </body>
</html>
