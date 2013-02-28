<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Agendamentos</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <f:view>
            <div class="container">
                <h:form id="listarAge" prependId="false">
                    <h:dataTable styleClass="table table-hover table-condensed table-bordered"
                                 value="#{Agenda.listarTodos()}" var="agenda" id="listarAgendamentos"
                                 width="600" cellpadding="2" cellspacing="1">

                        <h:column>
                            <f:facet name="header">
                                <i class="icon-share-alt"></i>
                                <h:outputText value=""/>
                            </f:facet>
                            <h:selectBooleanCheckbox value="#{agenda.agendaMarcado}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Data / Hora"/>
                            </f:facet>
                            <h:outputText value="#{agenda.dataHora}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Exame"/>
                            </f:facet>
                            <h:outputText value="#{agenda.exameBean.nome}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Médico"/>
                            </f:facet>
                            <h:outputText value="#{agenda.medicoBean.nome}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Paciente"/>
                            </f:facet>
                            <h:outputText value="#{agenda.pacienteBean.nome}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Resultado"/>
                            </f:facet>
                            <h:outputText value="#{agenda.resultado}"/>
                        </h:column>

                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Observação"/>
                            </f:facet>
                            <h:outputText value="#{agenda.obs}"/>
                        </h:column>

                    </h:dataTable>

                    <br/><br/>

                    <h:commandButton value="Editar" action="#{Agenda.carregarAgendamento()}"/>
                    <h:commandButton value="Apagar" action="#{Agenda.remove()}"/>

                    <br/><br/>

                    <h:outputText value="#{Agenda.texto}"/>

                    <br/><br/>

                    <h:commandLink action="cadastrar_agendamento.jsp" value="Cadastrar" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>
    </body>
</html>
