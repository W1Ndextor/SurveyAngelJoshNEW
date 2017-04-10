
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


/**
 *
 * @author Angel
 */
@Named(value = "respondentController")
@SessionScoped
public class respondentController implements Serializable {

    String respondentEmail;
    String respondentEmail1;
    String respondentEmail2;
    String respondentEmail3;
    String respondentEmail4;
    String response;
    
    int surveyId;
    int respondentId;
    int surveyIdArg;
    
    respondentHelper helper;
    
    Respondent respondent;
    Survey survey;
    
    String emailAddress;
    
    
    public respondentController() {
        helper = new respondentHelper();        
    }

    public String getRespondentEmail() {
        return respondentEmail;
    }

    public void setRespondentEmail(String respondentEmail) {
        this.respondentEmail = respondentEmail;
    }

    public String getRespondentEmail1() {
        return respondentEmail1;
    }

    public void setRespondentEmail1(String respondentEmail1) {
        this.respondentEmail1 = respondentEmail1;
    }

    public String getRespondentEmail2() {
        return respondentEmail2;
    }

    public void setRespondentEmail2(String respondentEmail2) {
        this.respondentEmail2 = respondentEmail2;
    }   

    public String getRespondentEmail3() {
        return respondentEmail3;
    }

    public void setRespondentEmail3(String respondentEmail3) {
        this.respondentEmail3 = respondentEmail3;
    }

    public String getRespondentEmail4() {
        return respondentEmail4;
    }

    public void setRespondentEmail4(String respondentEmail4) {
        this.respondentEmail4 = respondentEmail4;
    }

    
    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }
    
     public String getSurveyIds(int surveyIdArg){
        surveyId = surveyIdArg;
        return "respondent";
    }
   
    public int getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(int respondentId) {
        this.respondentId = respondentId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void dropItHard() {
      /* respondentEmail=null;
       respondentEmail1=null;
       respondentEmail2=null;
       respondentEmail3=null;
       respondentEmail4=null;
       emailAddress=null;
       surveyId=0;
       surveyIdArg=0;
       
        surveyController surveyController = new surveyController();
        //UserController UserController = new UserController();
        surveyController.surveyID=0;
        surveyController.survey=null;
        surveyController.surveyName=null;
     
        //gitsurveyController.surveyID=0;*/
        //user
       /* UserController UserController = new UserController();
         UserController.setUserFname(null);
    UserController.setUserLname(null);
    UserController.setUserEmail(null);
    UserController.setResponse(null);
    
    // this class uses hibernate to query the user table
    UserController.helper=null;
    
    UserController.user=null;
    
    //survey
     surveyController surveyController = new surveyController();
    surveyController.setSurveyName(null);
    surveyController.setUserID(0);
    surveyController.setResponse(null);
    surveyController.setSurveyID(0);
    surveyController.helper=null;
    surveyController.survey=null;
    
    //question
     QuestionController questionController = new QuestionController();
    questionController.setQuestionText(null);
    questionController.setQuestionText1(null);
    questionController.setQuestionText2(null);
    questionController.setQuestionText3(null);
    questionController.setQuestionText4(null);
    questionController.setQuestionText5(null);
    questionController.setQuestionText6(null);
    questionController.setQuestionText7(null);
    questionController.setQuestionText8(null);
    questionController.setQuestionText9(null);
    
    
    questionController.setSurveyID(0);
    questionController.setResponse(null);
    questionController.SurveyIdArg=0;//make getter and setter?
    //int surveyID;
    /**
     * Creates a new instance of QuestionController
     */
/*
    questionController.helper=null;

    questionController.question=null;*/
    
    //respondent
    respondentEmail=null;
    respondentEmail1=null;
    respondentEmail2=null;
    respondentEmail3=null;
    respondentEmail4=null;
    response=null;
    
    surveyId=getSurveyId();
    respondentId=0;
    surveyIdArg=0;
    
    helper=null;
    
    respondent=null;
    survey=null;
    
    emailAddress=null;
    

    }
    

    public String getResponse() {
        
        response = null;
        
        if(respondentEmail != null  && !respondentEmail.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            if(helper.insert(respondentEmail, surveyId)== 1){
                respondentEmail = null;
                surveyId = getSurveyId();
                response = "A Respondent Was Added.";
            }else{
                respondentEmail = null;
                surveyId = getSurveyId();
                response = "A Respondent Was Not Added.";
            }
        }
        
        if(respondentEmail1 != null && !respondentEmail1.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            

            if(helper.insert(respondentEmail1, surveyId)== 1){
                respondentEmail1 = null;                
                surveyId = getSurveyId();
                response = "Two Respondents Were Added.";
            }else{
                respondentEmail1 = null;
                surveyId = getSurveyId();
                response = "Two Respondents Were Not Added.";
            }
        }    
        
        if(respondentEmail2 != null && !respondentEmail2.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
 
            if(helper.insert(respondentEmail2, surveyId)== 1){
                respondentEmail2 = null;
                surveyId = getSurveyId();
                response = "Three Respondents Were Added.";
            }else{
                respondentEmail2 = null;
                surveyId = getSurveyId();
                response = "Three Respondents Were Not Added.";
            }
        }
        
        if(respondentEmail3 != null && !respondentEmail3.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            
            if(helper.insert(respondentEmail3, surveyId)== 1){
                respondentEmail3 = null;
                surveyId = getSurveyId();
                response = "Four Respondents Were Added.";
            }else{
                respondentEmail3 = null;
                surveyId = getSurveyId();
                response = "Four Respondents Were Not Added.";
            }
        } 
        
        if(respondentEmail4 != null && !respondentEmail4.isEmpty()){
    
            respondent = new Respondent(respondentEmail);
            
            
            if(helper.insert(respondentEmail4, surveyId)== 1){
                respondentEmail4 = null;
                surveyId = getSurveyId();
                response = "Five Respondents Were Added.";
            }else{
                respondentEmail4 = null;
                surveyId = getSurveyId();
                response = "Five Respondents Were Not Added.";
            }
        } 
     return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}
