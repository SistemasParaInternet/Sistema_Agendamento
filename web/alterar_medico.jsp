<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Médico</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <f:view>
            <div class="container">
                <h:form id="alterarMed" prependId="false" styleClass="form-horizontal">

                    <div class="control-group">
                        <div class="control-label">Nome: </div>    
                        <div class="controls">
                            <h:inputText id="nome" value="#{Medico.nome}"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">CRM: </div>    
                        <div class="controls">
                            <h:inputText id="crm" value="#{Medico.crm}"/>
                        </div>
                    </div>
                    <br/><br/>

                    <h:commandButton action="#{Medico.alterar()}" value="Alterar Dados"/>
                    <h:commandButton action="#{Medico.limpar()}" value="Limpar"/>
                    <br/><br/>
                    <h:outputText value="#{Medico.msgmErro}" style="color:#FF0000"/>
                    <br><br>

                    <h:commandLink action="listar_medicos.jsp" value="Listar Médicos" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>

    </body>
</html>
