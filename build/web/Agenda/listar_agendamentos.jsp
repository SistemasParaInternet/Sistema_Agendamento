<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Exame</title>
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
            <h:form id="listarAge" prependId="false">
                <h:dataTable value="#{Agenda.listarTodos()}" var="agenda" id="listarAgendamentos"
                             width="600" border="1" cellpadding="2" cellspacing="1"
                             headerClass="cabecalho" columnClasses="colunaMarca, coluna, coluna, coluna, coluna,
                             coluna, coluna">
                    
                    <h:column>
                        <f:facet name="header">
                        </f:facet>                        
                        <h:selectBooleanCheckbox value="#{agenda.agendaMarcado}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Data"/>
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
                            <h:outputText value="Medico"/>
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
                            <h:outputText value="Observacoes"/>
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
                
                <a href="cadastrar_agendamento.jsp">Voltar</a>
                
            </h:form>
        </f:view>
    </body>
</html>
