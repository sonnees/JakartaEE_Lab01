package vn.edu.iuh.fit.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import vn.edu.iuh.fit.entities.Account;

import java.util.List;

public class AccountDao {
    private EntityManager em;

    public AccountDao() {
        em = DbConnect.getInstance().getEmf().createEntityManager();
    }

    public void insertAccount(Account account){
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            em.persist(account);
            tr.commit();
        } catch (Exception e){
            tr.rollback();
            System.out.println(e.getMessage());
        }
    }

    public List<Account> getAccounts(){
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try {
            String sql ="select * from Account";
            List<Account> rl = em.createNativeQuery(sql, Account.class).getResultList();

            tr.commit();
            return rl;
        } catch (Exception e){
            tr.rollback();
            System.out.println(e.getMessage());
        }
        return null;
    }


}
