
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Pacientes</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>

        <f:view>
            <div class="container">
                <h:form id="listarPac" prependId="false">                    
                    <h:dataTable styleClass="table table-hover table-condensed table-bordered"
                                 value="#{Paciente.listarPacientes()}" var="pacientes" id="listarPacientes"
                                 cellpadding="2" cellspacing="1">

                        <h:column>
                            <f:facet name="header">
                                <i class="icon-share-alt"></i>
                                <h:outputText value=""/>
                            </f:facet>
                            <h:selectBooleanCheckbox value="#{pacientes.cb}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="ID"/>
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
                                <h:outputText value="Data de Nascimento"/>
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
                                <h:outputText value="Número"/>
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
                                <h:outputText value="UF"/>
                            </f:facet>
                            <h:outputText value="#{pacientes.uf}"/>
                        </h:column>

                    </h:dataTable>

                    <br/><br/>

                    <h:commandButton value="Editar" styleClass="btn" action="#{Paciente.carregarPaciente()}"/>
                    <h:commandButton value="Apagar" styleClass="btn" action="#{Paciente.remove()}"/>

                    <br/><br/>

                    <h:outputText value="#{Paciente.texto}"/>

                    <br/><br/>

                    <h:commandLink action="cadastrar_paciente.jsp" value="Cadastrar Pacientes" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>
    </body>
</html>
