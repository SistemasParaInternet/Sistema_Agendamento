package conectar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

    private static EntityManagerFactory fGEntidade = null;
    private static EntityManager gEntidade = null;

    public static EntityManager getManager() {
        try {
            if (fGEntidade == null) {
                fGEntidade = Persistence.createEntityManagerFactory("TrabalhoFinalPU");
                gEntidade = fGEntidade.createEntityManager();
                System.out.println("Criando o gerenciador de Entidade");
            } else if (gEntidade == null) {
                gEntidade = fGEntidade.createEntityManager();
            } else {
                System.out.println("A entidade foi criada!");
            }
            return gEntidade;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
