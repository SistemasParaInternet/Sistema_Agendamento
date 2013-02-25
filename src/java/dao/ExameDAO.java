package dao;

import bd.Exame;
import conectar.Conexao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.HibernateException;

public class ExameDAO {
    private Integer idExame;
    private String nome;
    private float valor;

    public ExameDAO() {
    }

    public ExameDAO(Integer idExame) {
        this.idExame = idExame;
    }    
    
    public ExameDAO(Integer idExame, String nome, float valor) {
        this.idExame = idExame;
        this.nome = nome;
        this.valor = valor;
    }
    
    public EntityManager conecta(){
        EntityManager gEntidade = Conexao.getManager();
        return gEntidade;
    }
    
    public boolean cadastrar() {
        try {
            if (conecta() != null)
            {
                Exame exame = new Exame();
                exame.setIdExame(null);
                exame.setNome(nome);
                exame.setValor(valor);
  
                conecta().getTransaction().begin();
                conecta().persist(exame);
                conecta().getTransaction().commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            if (conecta().getTransaction().isActive()) {
                conecta().getTransaction().rollback();
            }
            return false;
        } 
    }
    
    public boolean alterar() {
        try {
            if (conecta() != null) {
                Exame exame = conecta().find(Exame.class, idExame);
                exame.setNome(nome);
                exame.setValor(valor);
                
                conecta().getTransaction().begin();
                conecta().persist(exame);
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
    
    public boolean deleta() {
        try {
            if (conecta() != null){
                Exame exame = conecta().find(Exame.class, idExame);
                
                conecta().getTransaction().begin();
                conecta().remove(exame);
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
    
    public ExameDAO getExame() {
        try {
            if (conecta() != null){
                Query q = conecta().createQuery("SELECT e FROM Exame e WHERE e.idExame = :idExame");
                q.setParameter("idExame", idExame);
                
                if (q.getSingleResult() != null){
                    Exame exame = (Exame) q.getSingleResult();
                    ExameDAO exameDAO = new ExameDAO(exame.getIdExame(), exame.getNome(), exame.getValor());
                    return exameDAO;
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }catch (Exception e){
            return null;
        }
    }
    
    public List<ExameDAO> getExames() {
        try {
            if (conecta() != null){
                Query q = conecta().createQuery("SELECT e FROM Exame e");
                
                List<Exame> exame = q.getResultList();
                List<ExameDAO> exameDAO = new ArrayList();
                
                for (Exame e : exame) {
                    exameDAO.add(new ExameDAO(e.getIdExame(), e.getNome(), e.getValor()));
                }
                
                return exameDAO;
                
            } else {
                return null;
            }
        } catch (Exception e){
            return null;
        }
    }

    public Integer getIdExame() {
        return idExame;
    }

    public void setIdExame(Integer idExame) {
        this.idExame = idExame;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
