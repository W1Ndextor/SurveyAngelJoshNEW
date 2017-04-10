
package survey;

/**
 *
 * @author Angel
 */

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SQLQuery;

public class deleteSurveyHelper {
    
    Session session = null;
    
    public deleteSurveyHelper(){
    
    try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        } catch (Exception e){
            e.printStackTrace();
        }
}
    
    public int getSurveyId(){
        
        List<Survey> surveyList = null;
        
        String sql = "select * from survey order by Survey_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Survey.class);
            
            // executes the query and returns it as a list
            surveyList = (List<Survey>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return surveyList.get(0).getSurveyId();
    }
    
    public List getSurveyTitleByID(int surveyId){
        
        List<Survey> surveyList = null;
        
        //String sql = "select * from survey order by Survey_Name desc limit 1";
        String sql = "select * from survey order by Survey_Name desc limit 10";
        
        try{
             
            // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Survey.class);
            
            //q.setParameter("start", surveyId);
            //q.setParameter("end", 2);
            
            // executes the query and returns it as a list
            //survey = (Survey) q.uniqueResult();
            surveyList = (List<Survey>) q.list();
            
        }catch (Exception e){
            e.printStackTrace();
        }
             
        return surveyList;
    }
    
    public List getQuestions (int questionId){
        List<Question> questionList = null;
        
        
        String sql = "select * from question order by Question_Text limit :start, :end";
        
        try{
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            q.addEntity(Question.class);
            
            q.setParameter("start", questionId);
            q.setParameter("end", 10);
            
            questionList = (List<Question>) q.list();
            //question = (Question) q.uniqueResult();
            
        }catch (Exception e){
            e.printStackTrace();
        }
        //return question;
        return questionList;
    }
    
    public int deleteSurvey(int surveyId){
        //first delete from survey
        int result = 0;
        
        
        String sql = "delete from survey where Survey_ID = :survey";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Question.class);
            
            q.setParameter("survey", 1);
            
            // executes the query and returns it as a list
            result = q.executeUpdate();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
}
