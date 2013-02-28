<%-- 
    Document   : index
    Created on : 21/02/2013, 19:43:24
    Author     : alaric
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema Agendamento de Exames - Menu</title>
    </head>
    <body>
        <f:view>
            <h:form>
                <h:commandLink action="Paciente/cadastrar_paciente.jsp">
                    <h:graphicImage value="Imagens/icones/paciente-icone.png" />
                </h:commandLink>
                <h:commandLink action="Medico/cadastrar_medico.jsp">
                    <h:graphicImage value="Imagens/icones/medico-icone.png" />
                </h:commandLink>
                <h:commandLink action="Exame/cadastrar_exame.jsp">
                    <h:graphicImage value="Imagens/icones/exame-icone.png" />
                </h:commandLink>
                <h:commandLink action="Agenda/cadastrar_agendamento.jsp">
                    <h:graphicImage value="Imagens/icones/agenda-icone.png" />
                </h:commandLink>
                <h:commandLink action="Relatorios/gerar_relatorio.jsp">
                    <h:graphicImage value="Imagens/icones/relatorio-icone.png" />
                </h:commandLink>
            </h:form>           
        </f:view>
    </body>
</html>
