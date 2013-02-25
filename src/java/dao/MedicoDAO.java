package dao;

import bd.Medico;
import conectar.Conexao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.HibernateException;

public class MedicoDAO {
    private Integer idMedico;
    private String nome;
    private String crm;

    public MedicoDAO() {
    }

    public MedicoDAO(Integer idMedico) {
        this.idMedico = idMedico;
    }
    
    public MedicoDAO(Integer idMedico, String nome, String crm) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.crm = crm;
    }
    
    public EntityManager conecta() {
        EntityManager gEntidade = Conexao.getManager();
        return gEntidade;
    }
    
    public boolean cadastrar() {
        try {
            if (conecta() != null) {
                
                Medico medico = new Medico();
                medico.setIdMedico(null);
                medico.setNome(nome);
                medico.setCrm(crm);
                
                conecta().getTransaction().begin();
                conecta().persist(medico);
                conecta().getTransaction().commit();                
                return true;                                
            } else {                
                return false;
            }            
        } catch (Exception he) {
            if (conecta().getTransaction().isActive()) {
                conecta().getTransaction().rollback();
            }
            return false;
        } 
    }
    
    public boolean alterar() {
        
        try {
            if (conecta() != null) {
                Medico medico = conecta().find(Medico.class, idMedico);
                medico.setNome(nome);
                medico.setCrm(crm);
                
                conecta().getTransaction().begin();
                conecta().persist(medico);
                conecta().getTransaction().commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            if (conecta().getTransaction().isActive()){
                conecta().getTransaction().rollback();
            }
            return false;
        }
        
    }
    
    public boolean deleta() {
        try {
            if (conecta() != null){
                Medico medico = conecta().find(Medico.class, idMedico);
                
                conecta().getTransaction().begin();
                conecta().remove(medico);
                conecta().getTransaction().commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            if (conecta().getTransaction().isActive()){
                conecta().getTransaction().rollback();
            }
            return false;
        }
    }
    
    public MedicoDAO getMedico() {
        try {
            if (conecta() != null) {
                Query q = conecta().createQuery("SELECT m FROM Medico m WHERE m.idMedico = :idMedico");
                q.setParameter("idMedico", idMedico);
                
                if (q.getSingleResult() != null){
                    Medico medico = (Medico) q.getSingleResult();
                    MedicoDAO medicoDAO = new MedicoDAO(medico.getIdMedico(), medico.getNome(), medico.getCrm());
                    return medicoDAO;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<MedicoDAO> getMedicos() {
        try {
            if (conecta() != null) {
                Query q = conecta().createQuery("SELECT m FROM Medico m");
                
                List<Medico> medico = q.getResultList();
                List<MedicoDAO> medicoDAO = new ArrayList();
                
                for (Medico m : medico) {
                    medicoDAO.add(new MedicoDAO(m.getIdMedico(), m.getNome(), m.getCrm()));
                }
                
                return medicoDAO;
            } else {
                return null;
            }           
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
}
  
    