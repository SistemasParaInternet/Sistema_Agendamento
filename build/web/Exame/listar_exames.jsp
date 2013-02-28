<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Exame</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <f:view>
            <div class="container">
                <h:form id="listarExe" prependId="false">                
                    <h:dataTable styleClass="table table-hover table-condensed table-bordered"
                                 value="#{Exame.listarExames()}" var="exames" id="listarExames"
                                 width="500" cellpadding="2" cellspacing="1">

                        <h:column>
                            <f:facet name="header">
                                <i class="icon-share-alt"></i>
                                <h:outputText value=""/>
                            </f:facet>
                            <h:selectBooleanCheckbox value="#{exames.cb}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="ID"/>
                            </f:facet>
                            <h:outputText value="#{exames.idExame}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Exame"/>
                            </f:facet>
                            <h:outputText value="#{exames.nome}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Valor"/>
                            </f:facet>
                            <h:outputText value="#{exames.valor}"/>
                        </h:column>

                    </h:dataTable>

                    <br/><br/>

                    <h:commandButton value="Editar" action="#{Exame.carregarExame()}"/>
                    <h:commandButton value="Apagar" action="#{Exame.remove()}"/>

                    <br/><br/>
                    <h:outputText value="#{Exame.texto}"/>
                    <br/><br/>
                    <h:commandLink action="cadastrar_exame.jsp" value="Cadastrar" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>
    </body>
</html>
