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
            <h:form id="listarExe" prependId="false">
                <h:dataTable value="#{Exame.listarExames()}" var="exames" id="listarExames"
                             width="500" border="1" cellpadding="2" cellspacing="1"
                             headerClass="cabecalho" columnClasses="colunaMarca, coluna, coluna">
                    
                    <h:column>
                        <f:facet name="header">
                        </f:facet>                        
                        <h:selectBooleanCheckbox value="#{exames.cb}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="IdExame"/>
                        </f:facet>                        
                        <h:outputText value="#{exames.idExame}"/>
                    </h:column>
                    
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="Nome"/>
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
                
                <a href="cadastrar_exame.jsp">Voltar</a>
                
            </h:form>
        </f:view>
    </body>
</html>
