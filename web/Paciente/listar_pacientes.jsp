<%-- 
    Document   : listar_paciente
    Created on : 21/02/2013, 15:14:17
    Author     : alaric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Pacientes</title>
        <style>
            .cabecalho {
                background-color: buttonface;
            }
            
            .colunaMarca {
                background-color: tomato
            }
            
            .coluna {
                background-color: azure
            }
            
        </style>
    </head>
    <body>
        <f:view>
            <h:form id="listarPac" prependId="false">
                <h:dataTable value="#{Paciente.listarPacientes()}" var="pacientes" id="listarPacientes"
                             width="700" border="1" cellpadding="2" cellspacing="1"
                             headerClass="cabecalho" columnClasses="colunaMarca, coluna, coluna, coluna, coluna,
                             coluna, coluna, coluna, coluna">
                    
                    <h:column>
                        <f:facet name="header">
                        </f:facet>                        
                        <h:selectBooleanCheckbox value="#{pacientes.cb}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="IdPaciente"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.idPaciente}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nome"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.nome}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="DataNasc"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.dataNasc}">
                            <f:convertDateTime pattern="dd/MM/yyyy"/>
                        </h:outputText>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Logradouro"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.logradouro}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Numero"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.numero}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Bairro"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.bairro}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Cidade"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.cidade}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Uf"/>
                        </f:facet>                        
                        <h:outputText value="#{pacientes.uf}"/>
                    </h:column>
                    
                </h:dataTable>
                
                <br/><br/>
                
                <h:commandButton value="Editar" action="#{Paciente.carregarPaciente()}"/>
                <h:commandButton value="Apagar" action="#{Paciente.remove()}"/>
                
                <br/><br/>
                
                <h:outputText value="#{Paciente.texto}"/>
                
                <br/><br/>
                
                <a href="cadastrar_paciente.jsp">Voltar</a>
                
            </h:form>
        </f:view>
    </body>
</html>
