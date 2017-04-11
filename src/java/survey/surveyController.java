package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Angel
 */
@Named(value = "surveyController")
@SessionScoped
public class surveyController implements Serializable {

    String surveyName;
    int userID;
    String response;
    int surveyID;
    surveyHelper helper;

    Survey survey;

    /**
     * Creates a new instance of surveyTitleController
     */
    public surveyController() {
        helper = new surveyHelper();
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    //find a way to call this only when it needs to be called
    public int getUserID() {
        if (userID != 0) {
            return userID;
        } else {
            userID = helper.getUser();
        }
        return userID;
    }
    
     public void clear(){
        //userID=0;
        surveyName=null;
        response=null;
        survey=null;
       // surveyID=getSurveyID();
       surveyID=getSurveyID();
        //surveyid not being cleared here but in questions clear method. maybe include it here.
        
        
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    //remake the getters and setter--done
    public int getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(int surveyID) {
        this.surveyID = surveyID;
    }

    public String getResponse() {
        response = null;
        if (surveyName != null) {//maybe put condition here to check for nonzero survey id

           // survey = new Survey(surveyName, getUserID());
           survey = new Survey(getSurveyName(), getUserID());

            if (helper.insertSurvey(survey) == 1) {
                //get the survey id here and assign it to survey id--done
                //call helper method to get survey id that gets the survey id for the survey that was just inserted--done
                surveyName = null;
                //set survey id = call method you moved into survey helper-done
                surveyID = helper.getSurveyID();
               // userID = 0; //take these set to zeros out--done
                //surveyID=0; //this may cause an insertion failure
                response = "Survey Title Added.";
                //return response;
            } else {
                surveyName = null;
                //userID = 0;
                //surveyID=0;
                response = "Survey Title Not Added.";
                //return response;
            }
        } else {
            response = " ";
            //return response;
        }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
