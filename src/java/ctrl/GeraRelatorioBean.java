package ctrl;

import dao.AgendaDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

public class GeraRelatorioBean {
    
    private Date dataInicial;
    private Date dataFinal;
    private AgendaBean agendaBean;
    private ExameBean exameBean;
    private PacienteBean pacienteBean;      
    private List<AgendaBean> agendasBean = new ArrayList();
    private boolean valor;
    private String dataInicialS;
    private String dataFinalS;
    private float soma;
 
    
    public DataModel listarRelatorio() {
        SimpleDateFormat formatarData = new SimpleDateFormat("yyyy-MM-dd");
        dataInicialS = formatarData.format(dataInicial);
        dataFinalS = formatarData.format(dataFinal);
        return listarAgendamentos("SELECT a FROM Agenda a WHERE dataHora BETWEEN '"+ dataInicialS +"' AND '"+ dataFinalS +" 23:59:00'");
    }
    
    public DataModel listarAgendamentos(String consulta) {
        soma = 0;
        AgendaDAO agendaDAO = new AgendaDAO();
        agendasBean.removeAll(agendasBean);
        
        if (agendaDAO.getAgendamentos(consulta) != null){
            for (AgendaDAO aDAO : agendaDAO.getAgendamentos(consulta)){
                
                AgendaBean agenda = (new AgendaBean(aDAO.getDataHora(), aDAO.getIdMedico(), aDAO.getIdPaciente(),
                        aDAO.getIdExame(), aDAO.getObs(), aDAO.getResultado()));
                
                ExameBean exame = new ExameBean();
                exame.setIdExame(aDAO.getIdExame()); 
                exameBean = exame.getExame();
                soma += exameBean.getValor();
                
                agenda.setExameBean(exameBean);
                
                PacienteBean paciente = new PacienteBean();
                paciente.setIdPaciente(aDAO.getIdPaciente());
                pacienteBean = paciente.getPaciente();
                agenda.setPacienteBean(pacienteBean);
                
                agendasBean.add(agenda);                
            }
            
            return new ListDataModel(agendasBean);
            
        } else {            
            return null;
        }
    }
    
    public String gerar(){
        listarRelatorio();
        if (isValor()){
            return "valor";
        } else {
            return "notvalor";
        }
    }
    
    public String soma(){
        return String.valueOf(soma);
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }    
    
    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }
    
    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public AgendaBean getAgendaBean() {
        return agendaBean;
    }

    public void setAgendaBean(AgendaBean agendaBean) {
        this.agendaBean = agendaBean;
    }

    public ExameBean getExameBean() {
        return exameBean;
    }

    public void setExameBean(ExameBean exameBean) {
        this.exameBean = exameBean;
    }

    public PacienteBean getPacienteBean() {
        return pacienteBean;
    }

    public void setPacienteBean(PacienteBean pacienteBean) {
        this.pacienteBean = pacienteBean;
    }

    public List<AgendaBean> getAgendasBean() {
        return agendasBean;
    }

    public void setAgendasBean(List<AgendaBean> agendasBean) {
        this.agendasBean = agendasBean;
    }
    
    
    
}
