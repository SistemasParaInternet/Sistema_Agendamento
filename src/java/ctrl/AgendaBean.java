package ctrl;

import dao.AgendaDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

public class AgendaBean {

    private Date dataHora;
    private Integer idMedico;
    private Integer idPaciente;
    private Integer idExame;
    private String obs;
    private String resultado;
    private String msgmErro;
    private String texto;
    private List<AgendaBean> agendasBean = new ArrayList();
    private boolean agendaMarcado = false;
    private ExameBean exameBean;
    private MedicoBean medicoBean;
    private PacienteBean pacienteBean;    

    public AgendaBean() {
        limpar();
    }

    public AgendaBean(Date datahora, Integer idMedico, Integer idPaciente,
            Integer idExame, String obs, String resultado) {
        limpar();
        this.dataHora = datahora;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.idExame = idExame;
        this.obs = obs;
        this.resultado = resultado;
    }

    public void cadastrar() {
        AgendaDAO agendaDAO = new AgendaDAO();
        agendaDAO.setIdPaciente(idPaciente);
        agendaDAO.setIdMedico(idMedico);
        agendaDAO.setIdExame(idExame);
        agendaDAO.setObs(obs);
        agendaDAO.setResultado(resultado);
        
        if (agendaDAO.cadastrar()) {
            limpar();
            setMsgmErro("Dados Gravados!");            
        } else {
            setMsgmErro("Erro ao salvar Dados!");
        }
    }
    
    public void alterar() {
        AgendaDAO agenda = new AgendaDAO(dataHora, idMedico, idPaciente, idExame, obs, 
                resultado);
        if (agenda.alterar()) {
            setMsgmErro("Dados Alterados com Sucesso!");
        } else {
            setMsgmErro("Dados não foram Alterados!");
        }      
    }
    
    public void remove() {
        ListDataModel ldm = new ListDataModel(agendasBean);
        agendasBean = (List<AgendaBean>) ldm.getWrappedData();

        int cont = 0;
        for (AgendaBean agendas : agendasBean) {
            if (agendas.isAgendaMarcado()) {
                AgendaDAO agendaDAO = new AgendaDAO(agendas.getDataHora(), agendas.getIdMedico(), 
                        agendas.getIdPaciente(), agendas.getIdExame());
                agendaDAO.deleta();
                cont++;
            }
        }
        if (cont == 1) {
            setTexto("Agendamento removido com Sucesso!");
        } else {
            if (cont > 1) {
                setTexto("Agendamento removidos com Sucesso!");
            }
        }
    }
    
    public AgendaBean getAgendamento() {
        AgendaDAO agenda= new AgendaDAO(dataHora, idMedico, idPaciente, idExame);
        
        return new AgendaBean(agenda.getDataHora(), agenda.getIdMedico(), agenda.getIdPaciente(), 
                agenda.getIdExame(), agenda.getObs(), agenda.getResultado());
    }
    
    public String carregarAgendamento() {
        ListDataModel ldm = new ListDataModel(agendasBean);
        agendasBean = (List<AgendaBean>) ldm.getWrappedData();
        
        setMsgmErro("");
        int pos = -1;
        for (int i = 0; i < ldm.getRowCount(); i++) {
            if (agendasBean.get(i).isAgendaMarcado()) {
                pos = i;
            }
        }
        
        if (pos > -1) {
            dataHora = agendasBean.get(pos).getDataHora();
            idExame = agendasBean.get(pos).getIdExame();
            idMedico = agendasBean.get(pos).getIdMedico();
            idPaciente = agendasBean.get(pos).getIdPaciente();
            obs = agendasBean.get(pos).getObs();
            resultado = agendasBean.get(pos).getResultado();
            
            setTexto("");
            return "agenda";
        } else {
            setTexto("Nenhum agendamento selecionado");
            return "notagenda";
        }
    }
    
    public DataModel listarAgendamentos() {
        AgendaDAO agendaDAO = new AgendaDAO();
        agendasBean.removeAll(agendasBean);;
        
        if (agendaDAO.getAgendamentos() != null){
            for (AgendaDAO aDAO : agendaDAO.getAgendamentos()){
                
                AgendaBean agenda = (new AgendaBean(aDAO.getDataHora(), aDAO.getIdMedico(), aDAO.getIdPaciente(),
                        aDAO.getIdExame(), aDAO.getObs(), aDAO.getResultado()));
                
                ExameBean exame = new ExameBean();
                exame.setIdExame(aDAO.getIdExame()); 
                exameBean = exame.getExame();
                agenda.setExameBean(exameBean);
                
                MedicoBean medico = new MedicoBean();
                medico.setIdMedico(aDAO.getIdMedico());
                medicoBean = medico.getMedico();
                agenda.setMedicoBean(medicoBean);
                
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
    
    public void limpar(){
        setDataHora(null);
        setIdExame(null);
        setIdMedico(null);
        setIdPaciente(null);
        setMsgmErro("");
        setObs("");
        setResultado("");
    }
    
    public String listarA() {
        return "listarAge";
    }

    public ExameBean getExameBean() {
        return exameBean;
    }

    public void setExameBean(ExameBean exameBean) {
        this.exameBean = exameBean;
    }

    public MedicoBean getMedicoBean() {
        return medicoBean;
    }

    public void setMedicoBean(MedicoBean medicoBean) {
        this.medicoBean = medicoBean;
    }

    public PacienteBean getPacienteBean() {
        return pacienteBean;
    }

    public void setPacienteBean(PacienteBean pacienteBean) {
        this.pacienteBean = pacienteBean;
    }
    
    public String getMsgmErro() {
        return msgmErro;
    }

    public void setMsgmErro(String msgmErro) {
        this.msgmErro = msgmErro;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<AgendaBean> getAgendasBean() {
        return agendasBean;
    }

    public void setAgendasBean(List<AgendaBean> agendasBean) {
        this.agendasBean = agendasBean;
    }

    public boolean isAgendaMarcado() {
        return agendaMarcado;
    }

    public void setAgendaMarcado(boolean agendaMarcado) {
        this.agendaMarcado = agendaMarcado;
    }
    
    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdExame() {
        return idExame;
    }

    public void setIdExame(Integer idExame) {
        this.idExame = idExame;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
       
}
