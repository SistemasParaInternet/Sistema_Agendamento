/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import bd.Usuario;
import dao.UsuarioDAO;
import java.io.IOException;
import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author alaric
 */
public class UsuarioBean {

    private Usuario usuario;
    private String msgemErro;

    public UsuarioBean() {
        usuario = new Usuario();
    }

    public String verificarLogin() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        FacesContext contexto = FacesContext.getCurrentInstance();
        Map<String, Object> sessao = contexto.getExternalContext().getSessionMap();

        System.out.println("Verifica ++++++++++++++++++++++++++++++++++");
        if (sessao.containsKey("usuario")) {
            System.out.println("Verifica1 ++++++++++++++++++++++++++++++++++");
            return null;
        } else if (usuario.getNome() == null || usuario.getSenha() == null) {
            try {
                System.out.println("Verifica2 ++++++++++++++++++++++++++++++++++");
                ExternalContext contextoExterno = contexto.getExternalContext();
                contextoExterno.redirect("faces/index.xhtml");
            } catch (IOException e) {
                System.out.println("Verifica3 ++++++++++++++++++++++++++++++++++");
                System.out.println("Erro: " + e.getMessage());
            }
            return null;
        } else if (usuarioDAO.getUsuario(usuario)) {
            System.out.println("Verifica3 ++++++++++++++++++++++++++++++++++");
            sessao.put("usuario", usuario);
            return "logou";
        } else {
            System.out.println("Verifica4 ++++++++++++++++++++++++++++++++++");
            setMsgemErro("Usuário ou Senha Incorretos!");
            return null;
        }
    }

    public void deslogar() {
        FacesContext contexto = FacesContext.getCurrentInstance();
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("usuario");

        HttpSession session = (HttpSession) contexto.getExternalContext().getSession(false);
        session.invalidate();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMsgemErro() {
        return msgemErro;
    }

    public void setMsgemErro(String msgemErro) {
        this.msgemErro = msgemErro;
    }
}
