<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Agendamento de Exame</title>        

        <link href="../Estilo/bootstrap.css" rel="stylesheet" media="screen">
        <link href="../Estilo/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>        
        <f:view>
            <div class="container">
                <h:form id="alterarAge" styleClass="form-horizontal"
                        prependId="false">

                    <div class="control-group">
                        <div class="control-label">Data: </div>    
                        <div class="controls">
                            <h:inputText id="nome" value="#{Agenda.dataHora}">
                                <f:convertDateTime pattern="dd/MM/yyyy HH:mm" />
                            </h:inputText><br/>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Exame: </div>    
                        <div class="controls">
                            <h:selectOneMenu id="idExame" value="#{Agenda.idExame}" >
                                <f:selectItems value="#{Exame.examesSelect}" var="exame" itemLabel="exame.nome" itemValue="exame.idExame" />                            
                            </h:selectOneMenu>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Médico: </div>    
                        <div class="controls">
                            <h:selectOneMenu id="idMedico" value="#{Agenda.idMedico}" >
                                <f:selectItems value="#{Medico.medicosSelect}" var="medico" itemValue="medico.idMedico" itemLabel="medico.nome"/>                            
                            </h:selectOneMenu>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Paciente: </div>    
                        <div class="controls">
                            <h:selectOneMenu id="idPaciente" value="#{Agenda.idPaciente}" >
                                <f:selectItems value="#{Paciente.pacientesSelect}" var="paciente" itemValue="paciente.idPaciente" itemLabel="paciente.nome"/>                            
                            </h:selectOneMenu>
                        </div>
                    </div>

                    <div class="control-group">
                        <div class="control-label">Resultado: </div>    
                        <div class="controls">
                            <h:inputTextarea id="resultado" value="#{Agenda.resultado}" cols="35" rows="2"/><br/>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="control-label">Observações: </div>    
                        <div class="controls">
                            <h:inputTextarea id="obs" value="#{Agenda.obs}" cols="35" rows="5"/><br/>                         
                        </div>
                    </div>
                    <h:commandButton action="#{Agenda.cadastrar()}"  styleClass="btn" value="Alterar Dados"/>
                    <h:commandButton action="#{Agenda.limpar()}"  styleClass="btn" value="Limpar"/>
                    <br/><br/>
                    <h:outputText value="#{Agenda.msgmErro}" style="color:#FF0000"/>
                    <br/><br/>

                    <h:commandLink action="listar_agendamentos.jsp" value="Listar Agendamentos" styleClass="btn"/>

                </h:form>
            </div>
        </f:view>

    </body>
</html>
