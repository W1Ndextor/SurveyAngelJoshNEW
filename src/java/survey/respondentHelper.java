
package survey;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SQLQuery;



/**
 *
 * @author Angel
 */
public class respondentHelper {
    
    Session session = null;
    
    public respondentHelper(){
        try{
            this.session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
        } catch (Exception e){
            e.printStackTrace();
        }
    } 
    
    private int insertRespondent(String emailRespondent){
        
        int result = 0;
            
        String sql = "insert into respondent (Respondent_Email)"
                    + "value (:respondentEmail)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            q.addEntity(Respondent.class);           
            
                 // binds values to the placeholders in the query
                 q.setParameter("respondentEmail", emailRespondent);
           
                // executes the query
                result = q.executeUpdate();
            
                // commits the query to the database
                session.getTransaction().commit();
                
            }catch (Exception e){
                e.printStackTrace();               
            }
        return result;
    }
    
    public int getRespondentId(){
        
        List<Respondent> respondentList = null;
        
        String sql = "select * from respondent order by Respondent_ID desc limit 1";
        
        try{
             
         // if this transaction is not active, make it active
            if(!this.session.getTransaction().isActive()){
                session.beginTransaction();
            }
            
            // creating actual query that will be executed against the database
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating the actor table and the actor POJO
            q.addEntity(Respondent.class);
            
            // executes the query and returns it as a list
            respondentList = (List<Respondent>)q.list();
            
                       
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return respondentList.get(0).getRespondentId();
    }
    
    private int insertSurveyRespondent(int respondent, int survey){
        
        //SurveyRespondent surveyRespondent = null;
        int result = 0;
       
        String sql = "insert into survey_respondent(Survey_ID, Respondent_ID)"
                + "values (:surveyId, :respondentId)";
        
        try{
            // checks to see if the transaction is active
            if(!this.session.getTransaction().isActive()){   
                session.beginTransaction();
            }
            
            // creating a query that can be executed
            SQLQuery q = session.createSQLQuery(sql);
            
            // associating User POJO and table with a query
            
            q.addEntity(SurveyRespondent.class);        
            
            
            // binds values to the placeholders in the query
            
            q.setParameter("respondentId", respondent);   
            q.setParameter("surveyId", survey);
           
            // executes the query
            //surveyRespondent = q.executeUpdate();
            result = q.executeUpdate();
            
            // commits the query to the database
            session.getTransaction().commit();           
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
     

    public int insert(String respondentEmail, int surveyId){

        int result = 0;
        
        int respondentResult = insertRespondent(respondentEmail);
        
        
        int respondentId = getRespondentId();
        int surveyRespondentResult = insertSurveyRespondent(respondentId, surveyId);
        
        if(respondentResult == 1 && surveyRespondentResult == 1){
            result = 1;
        }
        
         return result;
    }
}
