/*package survey;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import java.util.List;*/



/**
 *
 * @author Angel
 */
/*public class responseHelper {
    
    Session session = null;
    
    public responseHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
    
    public int getQuestion(){
        
        List<Question> questionList = null;
        
        String sql = "select * from question order by Question_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Question.class);
            
            // executes the query and returns it as a list
            questionList = (List<Question>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return questionList.get(0).getQuestionId();
    }
    
    public int getSurveyRespondentId(){
        
        List<SurveyRespondent> respondentList = null;
        
        String sql = "select * from respondent order by Survey_Respondent_ID desc limit 1";
        
         try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(User.class);
            
            // executes the query and returns it as a list
            respondentList = (List<SurveyRespondent>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return respondentList.get(0).getSurveyRespondentId();
    }
    
    public int insertResponse(Response a){
        
        int result = 0;
        
        String sql = "insert into response (Question_ID, Rating_ID, Survey_Respondent_ID_"
                + "values (:question, :rating, :surveyRespondent)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Response.class);
            
            // binds values to the placeholders in the query
            q.setParameter("surveyName", a.getQuestion());
            q.setParameter("userId", a.getRating());
            q.setParameter("surveyRespondent", a.getSurveyRespondent());
           
            // executes the query
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
}*/