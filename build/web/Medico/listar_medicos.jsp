<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Médicos</title>
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
            <h:form id="listarMed" prependId="false">
                <h:dataTable value="#{Medico.listarMedicos()}" var="medicos" id="listarMedicos"
                             width="500" border="1" cellpadding="2" cellspacing="1"
                             headerClass="cabecalho" columnClasses="colunaMarca, coluna, coluna, coluna">
                    
                    <h:column>
                        <f:facet name="header">
                        </f:facet>                        
                        <h:selectBooleanCheckbox value="#{medicos.cb}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="IdMedico"/>
                        </f:facet>                        
                        <h:outputText value="#{medicos.idMedico}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nome"/>
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
                
                <a href="cadastrar_medico.jsp">Voltar</a>
                
            </h:form>
        </f:view>
    </body>
</html>
