<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relatório de Agendamentos</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <f:view>
            <div class="container">
                <h:form id="listarRel" prependId="false">
                    <h:dataTable styleClass="table table-hover table-condensed table-bordered"
                                 value="#{Relatorio.listarRelatorio()}" var="relatorio" id="listarRelatorio"
                                 width="600" cellpadding="2" cellspacing="1">

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="ID Exame"/>
                            </f:facet>
                            <h:outputText value="#{relatorio.exameBean.idExame}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Exame"/>
                            </f:facet>
                            <h:outputText value="#{relatorio.exameBean.nome}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Data / Hora"/>
                            </f:facet>
                            <h:outputText value="#{relatorio.dataHora}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Paciente"/>
                            </f:facet>
                            <h:outputText value="#{relatorio.pacienteBean.nome}"/>
                        </h:column>

                    </h:dataTable>

                    <br/><br/>

                    <a href="gerar_relatorio.jsp">Voltar</a>
                    <h:commandLink action="gerar_relatorio.jsp" value="Gerar" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>
    </body>
</html>
