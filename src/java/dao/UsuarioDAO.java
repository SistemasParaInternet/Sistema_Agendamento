/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bd.Usuario;
import conectar.Conexao;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author alaric
 */
public class UsuarioDAO {

    public UsuarioDAO() {
    }

    public EntityManager conecta() {
        EntityManager gEntidade = Conexao.getManager();
        return gEntidade;
    }

    public boolean getUsuario(Usuario usuario){
        try {
            if (conecta() != null) {
                Query q = conecta().createQuery("SELECT u FROM Usuario u WHERE nome = :nome AND senha = :senha");
                q.setParameter("nome", usuario.getNome());
                q.setParameter("senha", usuario.getSenha());
                
                if (q.getSingleResult() != null) {
                    return true;                            
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch(Exception e) {
            return false;
        }
    }
}
