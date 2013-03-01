package dao;
 
import bd.Paciente;
import conectar.Conexao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class PacienteDAO {
    private Integer idPaciente;
    private String nome;
    private Date dataNasc;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public PacienteDAO() {
    }
    
    public PacienteDAO(Integer id) {
        this.idPaciente = id;
    }

    public PacienteDAO(Integer id, String nome, Date dataNasc, String logradouro, String numero, String bairro, String cidade, String uf) {
        this.idPaciente = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public EntityManager conecta() {
        EntityManager gEntidade = Conexao.getManager();
        return gEntidade;
    }
    
    public boolean cadastrar() {
        try {
            if (conecta() != null)
            {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(null);
                paciente.setNome(nome);
                paciente.setDataNasc(dataNasc);
                paciente.setLogradouro(logradouro);
                paciente.setNumero(numero);
                paciente.setBairro(bairro);
                paciente.setCidade(cidade);
                paciente.setUf(uf);

                conecta().getTransaction().begin();
                conecta().persist(paciente);
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
                Paciente paciente = conecta().find(Paciente.class, idPaciente);
                paciente.setNome(nome);
                paciente.setDataNasc(dataNasc);
                paciente.setLogradouro(logradouro);
                paciente.setNumero(numero);
                paciente.setBairro(bairro);
                paciente.setCidade(cidade);
                paciente.setUf(uf);
                
                conecta().getTransaction().begin();
                conecta().persist(paciente);
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
    
    public void deleta() {
        try {
            if (conecta() != null){
                Paciente paciente = conecta().find(Paciente.class, idPaciente);
                
                conecta().getTransaction().begin();
                conecta().remove(paciente);
                conecta().getTransaction().commit();
            }
        } catch (Exception e) {
            if (conecta().getTransaction().isActive()){
                conecta().getTransaction().rollback();
            }
        }
    }

    public PacienteDAO getPaciente(){
        try {
            if (conecta() != null){
                Query q = conecta().createQuery("SELECT p FROM Paciente p WHERE p.idPaciente = :idPaciente");
                q.setParameter("idPaciente", idPaciente);
                
                if (q.getSingleResult() != null) {
                    Paciente paciente = (Paciente) q.getSingleResult();
                    PacienteDAO pacienteDAO = new PacienteDAO(paciente.getIdPaciente(), paciente.getNome(), paciente.getDataNasc(),
                                paciente.getLogradouro(), paciente.getNumero(), paciente.getBairro(), paciente.getCidade(), paciente.getUf());
                    return pacienteDAO;
                    
                } else {
                    return null;
                }               
            } else {
                return null;
            }
            
        } catch (Exception e){
            e.printStackTrace();
            return null;           
        }
    }
    
    public List<PacienteDAO> getPacientes()
    {
        try {
            if (conecta() != null) {
                Query q = conecta().createQuery("SELECT p FROM Paciente p");
                
                List<Paciente> paciente = q.getResultList();
                List<PacienteDAO> pacienteDAO = new ArrayList();
                
                for (Paciente p : paciente){
                    pacienteDAO.add(new PacienteDAO(p.getIdPaciente(), p.getNome(), p.getDataNasc(), p.getLogradouro(),
                            p.getNumero(), p.getBairro(), p.getCidade(), p.getUf()));
                }
                
                return pacienteDAO;
            } else {
                return null;
            }                
        } catch (Exception e){
            return null;
        }
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer id) {
        this.idPaciente = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
