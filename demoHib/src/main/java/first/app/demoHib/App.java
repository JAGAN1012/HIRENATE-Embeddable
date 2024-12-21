package first.app.demoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

       Domestic ipl =new Domestic();
       ipl.setTeamname("csk");
       ipl.setTropies(5);
       
        Player obj = new Player();
      obj.setAid(8);
      obj.setName("jaddu");
      obj.setrole("allround");
      obj.setD(ipl);
        
        // Print Alien details
       System.out.println(obj.getAid());
        System.out.println(obj.getName());
       System.out.println(obj.getrole());
       


        // Setting up Hibernate session
        Configuration con = new Configuration().configure("hibernate.cfg.xml")  // Configuring Hibernate
                                               .addAnnotatedClass(Player.class);  // Add your entity class
       
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        try {
            // Start a transaction
            session.beginTransaction();

            // Save the Alien object
            //session.save(obj);// hibernate which is convert the java code to sql.
           
           session.save(obj);
              obj=(Player)session.get(Player.class,7);// used to get from data base
            session.getTransaction().commit();
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the session
            session.close();
            sf.close();
        }
       
   
    }
}
