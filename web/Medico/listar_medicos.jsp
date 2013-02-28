<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Médicos</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <f:view>
            <div class="container">
                <h:form id="listarMed" prependId="false">
                    <h:dataTable styleClass="table table-hover table-condensed table-bordered"
                                 value="#{Medico.listarMedicos()}" var="medicos" id="listarMedicos"
                                 width="500" cellpadding="2" cellspacing="1">

                        <h:column>
                            <f:facet name="header">
                                <i class="icon-share-alt"></i>
                                <h:outputText value=""/>
                            </f:facet>
                            <h:selectBooleanCheckbox value="#{medicos.cb}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="ID"/>
                            </f:facet>
                            <h:outputText value="#{medicos.idMedico}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Médico"/>
                            </f:facet>
                            <h:outputText value="#{medicos.nome}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="CRM"/>
                            </f:facet>
                            <h:outputText value="#{medicos.crm}"/>
                        </h:column>

                    </h:dataTable>

                    <br/><br/>

                    <h:commandButton value="Editar" action="#{Medico.carregarMedico()}"/>
                    <h:commandButton value="Apagar" action="#{Medico.remove()}"/>

                    <br/><br/>

                    <h:outputText value="#{Medico.texto}"/>

                    <br/><br/>

                    <h:commandLink action="cadastrar_medico.jsp" value="Cadastrar" styleClass="btn"/>
                </h:form>
            </div>
        </f:view>
    </body>
</html>
