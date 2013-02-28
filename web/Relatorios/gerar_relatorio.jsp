<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib  prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib  prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relatório de Exames</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>

        <f:view>
            <div class="container">
                <h:form id="gerar" prependId="false"  styleClass="form-horizontal">

                    <div class="control-group">
                        <div class="control-label">Data Inicial </div>    
                        <div class="controls">
                            <h:inputText id="nome" value="#{Relatorio.dataInicial}">
                                <f:convertDateTime pattern="dd/MM/yyyy" />
                            </h:inputText><br/><br/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Data Final: </div>    
                        <div class="controls">
                            <h:inputText id="valor" value="#{Relatorio.dataFinal}">
                                <f:convertDateTime pattern="dd/MM/yyyy" />
                            </h:inputText><br/><br/>
                        </div>
                    </div>

                    <h:selectBooleanCheckbox value="#{Relatorio.valor}"/> Valor<br/><br/>

                    <h:commandButton action="#{Relatorio.gerar()}" value="Gerar"/><br/><br/>         

                    <h:commandLink action="../faces/menu_agenda.jsp" value="Menu" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>

    </body>
</html>
