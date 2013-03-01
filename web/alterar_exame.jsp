<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Exame</title>

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <f:view>
            <div class="container">
                <h:form id="alterarExa" prependId="false" styleClass="form-horizontal">

                    <div class="control-group">
                        <div class="control-label">Nome: </div>    
                        <div class="controls"><h:inputText id="nome" value="#{Exame.nome}"/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Valor: </div>    
                        <div class="input-prepend"><span class="add-on">R$</span>
                            <h:inputText id="valor" value="#{Exame.valor}" styleClass="span2"/>
                        </div>
                    </div>
                    <br/><br/>

                    <h:commandButton action="#{Exame.alterar()}" value="Alterar Dados"/>
                    <h:commandButton action="#{Exame.limpar()}" value="Limpar"/>
                    <br/><br/>
                    <h:outputText value="#{Exame.msgmErro}" style="color:#FF0000"/>
                    <br><br>
                    <h:commandLink action="listar_exames.jsp" value="Listar Exames" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>

    </body>
</html>
