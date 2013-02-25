package ctrl;

import dao.ExameDAO;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

public class ExameBean {

    private Integer idExame;
    private String nome;
    private float valor;
    private String msgmErro;
    private String texto;
    private List<ExameBean> examesBean = new ArrayList();
    private List<SelectItem> examesSelect = new ArrayList();
    private boolean cb = false;

    public ExameBean() {
        limpar();
    }

    public ExameBean(Integer idExame, String nome, float valor) {
        limpar();
        this.idExame = idExame;
        this.nome = nome;
        this.valor = valor;
    }

    public void cadastrar() {
        ExameDAO exame = new ExameDAO();
        exame.setIdExame(null);
        exame.setNome(nome);
        exame.setValor(valor);

        if (exame.cadastrar()) {
            limpar();
            setMsgmErro("Dados Gravados!");
        } else {
            setMsgmErro("Erro ao salvar Dados!");
        }
    }

    public void alterar() {

        ExameDAO exame = new ExameDAO(idExame, nome, valor);
        if (exame.alterar()) {
            setMsgmErro("Dados Alterados com Sucesso!");
        } else {
            setMsgmErro("Erro ao Alterados Dados!");
        }
        
    }

    public void remove() {
        ListDataModel ldm = new ListDataModel(examesBean);
        examesBean = (List<ExameBean>) ldm.getWrappedData();

        int cont = 0;
        for (ExameBean exames : examesBean) {
            if (exames.isCb()) {
                ExameDAO exameDAO = new ExameDAO(exames.getIdExame());
                exameDAO.deleta();
                cont++;
            }
        }

        if (cont == 1) {
            setTexto("Exame removido com Sucesso!");
        } else {
            setTexto("Exames removidos com Sucesso!");
        }
    }

    public ExameBean getExame() {
        ExameDAO exame = new ExameDAO(idExame);
        exame = exame.getExame();
        return new ExameBean(exame.getIdExame(), exame.getNome(), exame.getValor());
    }

    public String carregarExame() {
        ListDataModel ldm = new ListDataModel(examesBean);
        examesBean = (List<ExameBean>) ldm.getWrappedData();

        setMsgmErro("");
        int pos = -1;
        for (int i = 0; i < ldm.getRowCount(); i++) {
            if (examesBean.get(i).isCb()) {
                pos = i;
            }
        }

        if (pos > -1) {
            idExame = examesBean.get(pos).getIdExame();
            nome = examesBean.get(pos).getNome();
            valor = examesBean.get(pos).getValor();

            setTexto("");
            return "exames";
        } else {
            setTexto("Nenhum paciente selecionado");
            return "notexames";
        }
    }

    public DataModel listarExames() {
        ExameDAO exameDAO = new ExameDAO();
        examesBean.removeAll(examesBean);

        if (exameDAO.getExames() != null) {
            for (ExameDAO eDao : exameDAO.getExames()) {
                examesBean.add(new ExameBean(eDao.getIdExame(), eDao.getNome(), eDao.getValor()));
            }

            return new ListDataModel(examesBean);
        } else {
            return null;
        }
    }

    public void limpar() {
        setNome("");
        setValor(0);
        setMsgmErro("");
    }

    public List<SelectItem> getExamesSelect() {
        ExameDAO exameDAO = new ExameDAO();
        examesSelect.removeAll(examesSelect);

        if (exameDAO.getExames() != null) {
            for (ExameDAO eDAO : exameDAO.getExames()) {
                examesSelect.add(new SelectItem(eDAO.getIdExame(), eDAO.getNome()));
            }
            return examesSelect;
        } else {
            return null;
        }

    }

    public void setExamesSelect(List<SelectItem> examesSelect) {
        this.examesSelect = examesSelect;
    }

    public List<ExameBean> getExamesBean() {
        return examesBean;
    }

    public void setExamesBean(List<ExameBean> examesBean) {
        this.examesBean = examesBean;
    }

    public String listarE() {
        return "listarExe";
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
