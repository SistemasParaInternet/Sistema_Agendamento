package ctrl;

import dao.MedicoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

public class MedicoBean {

    private Integer idMedico;
    private String nome;
    private String crm;
    private String msgmErro;
    private String texto;
    private List<MedicoBean> medicosBean = new ArrayList();
    private List<SelectItem> medicosSelect = new ArrayList();
    private boolean cb = false;

    public MedicoBean() {
    }

    public MedicoBean(Integer idMedico, String nome, String crm) {
        this.idMedico = idMedico;
        this.nome = nome;
        this.crm = crm;
        this.msgmErro = "";
    }

    public void cadastrar() {
        MedicoDAO medico = new MedicoDAO();
        medico.setIdMedico(null);
        medico.setNome(nome);
        medico.setCrm(crm);

        if (medico.cadastrar()) {
            limpar();
            setMsgmErro("Dados Gravados!");
        } else {
            setMsgmErro("Erro ao salvar Dados!");
        }
    }

    public void alterar() {
        MedicoDAO medico = new MedicoDAO(idMedico, nome, crm);
        if (medico.alterar()){
            setMsgmErro("Dados Alterados com Sucesso!");
        } else {
            setMsgmErro("Erro ao Alterar Dados!");
        }
                
    }

    public void remove() {
        ListDataModel ldm = new ListDataModel(medicosBean);
        medicosBean = (List<MedicoBean>) ldm.getWrappedData();

        int cont = 0;
        for (MedicoBean medicos : medicosBean) {
            if (medicos.isCb()) {
                MedicoDAO medicoDAO = new MedicoDAO(medicos.getIdMedico());
                medicoDAO.deleta();
                cont++;
            }
        }

        if (cont == 1) {
            setTexto("Medico removido com Sucesso!");
        } else {
            if (cont > 1) {
                setTexto("Medicos removidos com Sucesso!");
            }
        }
    }

    public MedicoBean getMedico() {
        MedicoDAO medico = new MedicoDAO(idMedico);
        medico = medico.getMedico();
        return new MedicoBean(medico.getIdMedico(), medico.getNome(), medico.getCrm());
    }

    public String carregarMedico() {
        ListDataModel ldm = new ListDataModel(medicosBean);
        medicosBean = (List<MedicoBean>) ldm.getWrappedData();

        setMsgmErro("");
        int pos = -1;
        for (int i = 0; i < ldm.getRowCount(); i++) {
            if (medicosBean.get(i).isCb()) {
                pos = i;
            }
        }

        if (pos > -1) {
            idMedico = medicosBean.get(pos).getIdMedico();
            nome = medicosBean.get(pos).getNome();
            crm = medicosBean.get(pos).getCrm();

            setTexto("");
            return "medico";
        } else {
            setTexto("Nenhum medico selecionado");
            return "notmedico";
        }
    }

    public DataModel listarMedicos() {
        MedicoDAO medicoDAO = new MedicoDAO();
        medicosBean.removeAll(medicosBean);

        if (medicoDAO.getMedicos() != null) {
            for (MedicoDAO mDao : medicoDAO.getMedicos()) {
                medicosBean.add(new MedicoBean(mDao.getIdMedico(), mDao.getNome(), mDao.getCrm()));
                System.out.println("Médico = " + mDao.getIdMedico() + " " + mDao.getNome() + " " + mDao.getCrm());
            }

            return new ListDataModel(medicosBean);
        } else {
            return null;
        }
    }

    public void limpar() {
        setNome("");
        setCrm("");
        setMsgmErro("");
    }

    public String listarM() {
        return "listarMed";
    }

    public List<SelectItem> getMedicosSelect() {
        MedicoDAO medicoDAO = new MedicoDAO();
        medicosSelect.removeAll(medicosSelect);

        if (medicoDAO.getMedicos() != null) {
            for (MedicoDAO mDAO : medicoDAO.getMedicos()) {
                medicosSelect.add(new SelectItem(mDAO.getIdMedico(), mDAO.getNome()));
            }
            return medicosSelect;
        } else {
            return null;
        }            
    }

    public void setMedicosSelect(List<SelectItem> medicosSelect) {
        this.medicosSelect = medicosSelect;
    }

    public List<MedicoBean> getMedicosBeans() {
        return medicosBean;
    }

    public void setMedicosBean(List<MedicoBean> medicosBean) {
        this.medicosBean = medicosBean;
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

    public boolean isCb() {
        return cb;
    }

    public void setCb(boolean cb) {
        this.cb = cb;
    }
}
