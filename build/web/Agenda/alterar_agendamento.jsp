<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Agenda</title>
    </head>
    <body>
        <f:view>
            <h:form id="alterarAge" prependId="false">
                
                Data : <br/><h:inputText id="nome" value="#{Agenda.dataHora}">
                                    <f:convertDateTime pattern="dd/MM/yyyy HH:mm" />
                                </h:inputText><br/>
                
                Exame: <br/><h:selectOneMenu id="idExame" value="#{Agenda.idExame}" >
                            <f:selectItems value="#{Exame.examesSelect}" var="exame" itemLabel="exame.nome" itemValue="exame.idExame" />                            
                       </h:selectOneMenu><br/>
                            
                Medico: <br/><h:selectOneMenu id="idMedico" value="#{Agenda.idMedico}" >
                            <f:selectItems value="#{Medico.medicosSelect}" var="medico" itemValue="medico.idMedico" itemLabel="medico.nome"/>                            
                        </h:selectOneMenu><br/>                            

                Paciente: <br/><h:selectOneMenu id="idPaciente" value="#{Agenda.idPaciente}" >
                                <f:selectItems value="#{Paciente.pacientesSelect}" var="paciente" itemValue="paciente.idPaciente" itemLabel="paciente.nome"/>                            
                          </h:selectOneMenu><br/>

                Resultado: <br/><h:inputTextarea id="resultado" value="#{Agenda.resultado}" cols="35" rows="2"/><br/>
                            
                Observações: <br/><h:inputTextarea id="obs" value="#{Agenda.obs}" cols="35" rows="5"/><br/>                         
                
                <h:commandButton action="#{Agenda.cadastrar()}" value="Alterar Dados"/>
                <h:commandButton action="#{Agenda.limpar()}" value="Limpar"/>
                <br/><br/>
                <h:outputText value="#{Agenda.msgmErro}" style="color:#FF0000"/>
                <br/><br/>
                <a href="listar_agendamentos.jsp">Retornar Menu</a>
                
            </h:form>
        </f:view>
        
    </body>
</html>
