/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author Josh
 */
public class QuestionHelper {
    Session session = null;
    
    // initializes a session
    public QuestionHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    
    //put in survey helper--done
    /* public int getSurvey(){
        
        List<Survey> surveyList = null;
        //int result = 0;
        
        String sql = "select * from survey order by Survey_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Question.class);
            
            //q.setParameter("userId", a.getUser());
            // executes the query and returns it as a list
            surveyList = (List<Survey>)q.list();
            //result = q.executeUpdate();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return surveyList.get(0).getSurveyId();
        //return result;
    }*/
    
    public int insertQuestion(String questionText, int surveyID){
        int result = 0;
        
        String sql = "insert into question(Question_Text, Survey_ID)"
                + "values (:question, :survey)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Question.class);
            
            // binds values to the placeholders in the query
            q.setParameter("question", questionText);
            //q.setParameter("survey", a.getSurvey());
            q.setParameter("survey", surveyID);
            
            // executes the query
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
}