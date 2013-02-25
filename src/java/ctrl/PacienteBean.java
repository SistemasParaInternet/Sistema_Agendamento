package ctrl;

import dao.PacienteDAO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

public class PacienteBean {

    private Integer idPaciente;
    private String nome;
    private Date dataNasc;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String msgmErro;
    private String texto;
    private List<PacienteBean> pacientesBean = new ArrayList();
    private List<SelectItem> pacientesSelect = new ArrayList();
    private boolean cb = false;

    public PacienteBean() {
        limpar();
    }

    public PacienteBean(Integer id, String nome, Date dataNasc, String logradouro, String numero, String bairro, String cidade, String uf) {
        limpar();
        this.idPaciente = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.msgmErro = "";       
    }

    public void cadastrar() {

        PacienteDAO paciente = new PacienteDAO();
        paciente.setIdPaciente(null);
        paciente.setNome(nome);
        paciente.setDataNasc(dataNasc);
        paciente.setLogradouro(logradouro);
        paciente.setNumero(numero);
        paciente.setBairro(bairro);
        paciente.setCidade(cidade);
        paciente.setUf(uf);

        if (paciente.cadastrar()) {
            limpar();
            setMsgmErro("Dados Gravados!");
        } else {
            setMsgmErro("Erro ao salvar Dados!");
        }
    }

    public void alterar() {

        PacienteDAO paciente = new PacienteDAO(idPaciente, nome, dataNasc, logradouro, numero,
                bairro, cidade, uf);
        if (paciente.alterar()) {
            setMsgmErro("Dados Alterados com Sucesso!");
        } else {
            setMsgmErro("Erro ao Alterar Dados!");
        }
        

    }

    public void remove() {
        ListDataModel ldm = new ListDataModel(pacientesBean);
        pacientesBean = (List<PacienteBean>) ldm.getWrappedData();

        int cont = 0;
        for (PacienteBean pacientes : pacientesBean) {
            if (pacientes.isCb()) {
                PacienteDAO pacienteDAO = new PacienteDAO(pacientes.getIdPaciente());
                pacienteDAO.deleta();
                cont++;
            }
        }

        if (cont == 1) {
            setTexto("Paciente removido com Sucesso!");
        } else {
            if (cont > 1) {
                setTexto("Pacientes removidos com Sucesso!");
            }
        }
    }

    public PacienteBean getPaciente() {

        PacienteDAO paciente = new PacienteDAO(idPaciente);
        paciente = paciente.getPaciente();
        return new PacienteBean(paciente.getIdPaciente(), paciente.getNome(), paciente.getDataNasc(),
                paciente.getLogradouro(), paciente.getNumero(), paciente.getBairro(), paciente.getCidade(), paciente.getUf());
    }

    public String carregarPaciente() {

        ListDataModel ldm = new ListDataModel(pacientesBean);
        pacientesBean = (List<PacienteBean>) ldm.getWrappedData();

        setMsgmErro("");
        int pos = -1;
        for (int i = 0; i < ldm.getRowCount(); i++) {
            if (pacientesBean.get(i).isCb()) {
                pos = i;
            }
        }

        if (pos > -1) {
            idPaciente = pacientesBean.get(pos).getIdPaciente();
            nome = pacientesBean.get(pos).getNome();
            dataNasc = pacientesBean.get(pos).getDataNasc();
            logradouro = pacientesBean.get(pos).getLogradouro();
            numero = pacientesBean.get(pos).getNumero();
            cidade = pacientesBean.get(pos).getCidade();
            bairro = pacientesBean.get(pos).getBairro();
            uf = pacientesBean.get(pos).getUf();

            setTexto("");
            return "paciente";
        } else {
            setTexto("Nenhum paciente selecionado");
            return "notpaciente";
        }
    }

    
    public DataModel listarPacientes(){
        
        PacienteDAO pacienteDAO = new PacienteDAO();
        pacientesBean.removeAll(pacientesBean);
        
        if (pacienteDAO.getPacientes() != null){
            for (PacienteDAO pDao : pacienteDAO.getPacientes()){
                pacientesBean.add(new PacienteBean(pDao.getIdPaciente(), pDao.getNome(), pDao.getDataNasc(),
                        pDao.getLogradouro(), pDao.getNumero(), pDao.getBairro(), pDao.getCidade(), pDao.getUf()));
            }
            
            return new ListDataModel(pacientesBean);
        } else {
            return null;
        }       
    }
    
    
    public void limpar() {
        setNome("");
        setDataNasc(null);
        setLogradouro("");
        setNumero("");
        setBairro("");
        setCidade("");
        setUf("");
        setMsgmErro("");
    }

    public List<SelectItem> getPacientesSelect() {
        PacienteDAO pacienteDAO = new PacienteDAO();
        pacientesSelect.removeAll(pacientesSelect);

        if (pacienteDAO.getPacientes() != null){            
            for (PacienteDAO pDAO : pacienteDAO.getPacientes()){
                pacientesSelect.add(new SelectItem(pDAO.getIdPaciente(), pDAO.getNome()));
            }            
            return pacientesSelect;
        } else {
            return null;
        }
        
    }

    public void setPacientesSelect(List<SelectItem> pacientesSelect) {
        this.pacientesSelect = pacientesSelect;
    }

    public String listarP() {
        return "listarPac";
    }    
    
    public List<PacienteBean> getPacientesBean() { 
        return pacientesBean;
    }

    public void setPacientesBean(List<PacienteBean> pacientesBean) {
        this.pacientesBean = pacientesBean;
    }    
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCb() {
        return cb;
    }

    public void setCb(boolean cb) {
        this.cb = cb;
    }    

    public String getMsgmErro() {
        return msgmErro;
    }

    public void setMsgmErro(String msgmErro) {
        this.msgmErro = msgmErro;
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
