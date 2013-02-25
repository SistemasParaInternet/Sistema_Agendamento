package dao;

import bd.Agenda;
import bd.AgendaPK;
import conectar.Conexao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.HibernateException;

public class AgendaDAO {
    
    private Date dataHora;
    private Integer idMedico;
    private Integer idPaciente;
    private Integer idExame;
    private String obs;
    private String resultado;

    public AgendaDAO () {
    }
    
    public AgendaDAO(Date dataHora, Integer idMedico, Integer idPaciente, Integer idExame) {
        this.dataHora = dataHora;
    }
    
    public AgendaDAO(Date dataHora, Integer idMedico, Integer idPaciente, Integer idExame,
            String obs, String resultado) {
        this.dataHora = dataHora;
        this.idMedico = idMedico;
        this.idPaciente = idPaciente;
        this.idExame = idExame;
        this.obs = obs;
        this.resultado = resultado;
    }

    public EntityManager conecta() {
        EntityManager gEntidade = Conexao.getManager();
        return gEntidade;
    }
    
    public boolean cadastrar() {        
        try {
            if (conecta() != null) {
                
                AgendaPK agendaPK = new AgendaPK();
                agendaPK.setDataHora(dataHora);
                agendaPK.setIdExame(idExame);
                agendaPK.setIdMedico(idMedico);
                agendaPK.setIdPaciente(idPaciente);
                
                Agenda agenda = new Agenda();
                agenda.setAgendaPK(agendaPK);               
                agenda.setObs(obs);
                agenda.setResultado(resultado);
                
                conecta().getTransaction().begin();
                conecta().persist(agenda);
                conecta().getTransaction().commit();               
                return true;
            } else {
                return false;
            }
                
        }
        catch (Exception e){
            if(conecta().getTransaction().isActive()) {
                conecta().getTransaction().rollback();
            }
            return false;
        }
    }
    
    public boolean alterar() {
        try {
            if (conecta() != null) {
                
                AgendaPK agendaPK = new AgendaPK();
                agendaPK.setDataHora(dataHora);
                agendaPK.setIdExame(idExame);
                agendaPK.setIdMedico(idMedico);
                agendaPK.setIdPaciente(idPaciente);
                
                Agenda agenda = new Agenda();
                agenda.setAgendaPK(agendaPK);               
                agenda.setObs(obs);
                agenda.setResultado(resultado);
                
                conecta().getTransaction().begin();
                conecta().persist(agenda);
                conecta().getTransaction().commit();               
                return true;
            } else {
                return false;
            }                
        }
        catch (Exception e){
            if(conecta().getTransaction().isActive()) {
                conecta().getTransaction().rollback();
            }
            return false;
        }         
    }

    public boolean deleta(){
        try {
            if (conecta() != null){
                AgendaPK agendaPK = new AgendaPK(dataHora, idMedico, idExame, idPaciente);
                Agenda agenda = conecta().find(Agenda.class, agendaPK);
                
                conecta().getTransaction().begin();
                conecta().remove(agenda);
                conecta().getTransaction().commit();
                
                System.out.println("======================ESTOU AQUI!====================");
                
                return true;
            } else {
                System.out.println("======================NOT AQUI!====================");
                return false;
            }
        } catch (Exception e){
            e.printStackTrace();
            if (conecta().getTransaction().isActive()){
                conecta().getTransaction().rollback();
            }
            System.out.println("======================EN AQUI!====================");
            return false;
        }
    }
    
    public List<AgendaDAO> getAgendamentos() {
        try{
            if (conecta() != null) {
                Query q = conecta().createQuery("SELECT a FROM Agenda a");
                
                List<Agenda> agenda = q.getResultList();
                List<AgendaDAO> agendaDAO = new ArrayList();
                
                for (Agenda a : agenda){
                    AgendaPK agendaPK = a.getAgendaPK();
                    agendaDAO.add(new AgendaDAO(agendaPK.getDataHora(), agendaPK.getIdMedico(), 
                            agendaPK.getIdPaciente(), agendaPK.getIdExame(), a.getObs(), a.getResultado()));
                }
                
                return agendaDAO;        
                
            } else {
                return null;
            }
        } catch (Exception e) {
            if(conecta().getTransaction().isActive()){
                conecta().getTransaction().rollback();
            }
            return null;
        }
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
