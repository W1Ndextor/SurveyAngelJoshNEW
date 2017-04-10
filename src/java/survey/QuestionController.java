/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Josh
 */
@Named(value = "questionController")
@SessionScoped
public class QuestionController implements Serializable {

    String questionText;
    String questionText1;
    String questionText2;
    String questionText3;
    String questionText4;
    String questionText5;
    String questionText6;
    String questionText7;
    String questionText8;
    String questionText9;
    int surveyID;
    String response;
    int SurveyIdArg;
    //int surveyID;
    /**
     * Creates a new instance of QuestionController
     */

    QuestionHelper helper;

    Question question;

    public QuestionController() {
        helper = new QuestionHelper();
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText1() {
        return questionText1;
    }

    public void setQuestionText1(String questionText1) {
        this.questionText1 = questionText1;
    }

    public String getQuestionText2() {
        return questionText2;
    }

    public void setQuestionText2(String questionText2) {
        this.questionText2 = questionText2;
    }

    public String getQuestionText3() {
        return questionText3;
    }

    public void setQuestionText3(String questionText3) {
        this.questionText3 = questionText3;
    }

    public String getQuestionText4() {
        return questionText4;
    }

    public void setQuestionText4(String questionText4) {
        this.questionText4 = questionText4;
    }

    public String getQuestionText5() {
        return questionText5;
    }

    public void setQuestionText5(String questionText5) {
        this.questionText5 = questionText5;
    }

    public String getQuestionText6() {
        return questionText6;
    }

    public void setQuestionText6(String questionText6) {
        this.questionText6 = questionText6;
    }

    public String getQuestionText7() {
        return questionText7;
    }

    public void setQuestionText7(String questionText7) {
        this.questionText7 = questionText7;
    }

    public String getQuestionText8() {
        return questionText8;
    }

    public void setQuestionText8(String questionText8) {
        this.questionText8 = questionText8;
    }

    public String getQuestionText9() {
        return questionText9;
    }

    public void setQuestionText9(String questionText9) {
        this.questionText9 = questionText9;
    }

    public int getSurvey() {
        return surveyID;
    }

    public void setSurvey(int surveyID) {
        this.surveyID = surveyID;
    }

    public int getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(int surveyID) {
        this.surveyID = surveyID;
    }

    public String getQuestions(int IDArg) {
        surveyID = IDArg;
        return "question";
    }

    public void clear() {
        questionText = null;
        questionText1 = null;
        questionText2 = null;
        questionText3 = null;
        questionText4 = null;
        questionText5 = null;
        questionText6 = null;
        questionText7 = null;
        questionText8 = null;
        questionText9 = null;
        //surveyID=0;
       // surveyID=getSurveyID();
        surveyController surveyController = new surveyController();
        //UserController UserController = new UserController();
        surveyController.userID=0;
        
        question=null;
        SurveyIdArg=0;
        response=null;
        
        
        
        //surveyController.surveyID=0;
        //gitsurveyController.surveyID=0;
        

    }

    //create emthod that tales survbey id takes the parameter and assigns it to the survey id field then retruns a string named question to display the page--done
    //it sets the value so it can be use in get resposne -- done
    public String getResponse() {
        response = null;
        // surveyID = 
        // surveyID=getSurveyID();
        //surveyID = getSurvey();

        //loops here changing questiontext to "questiontext"1 ""2 "" 3...""10
        //case blocks would also work for each questiontext
        if (questionText != null && surveyID >= 0 && !questionText.isEmpty()) {

            //  getSurveyID();
            // question = new Question(questionText, surveyID);
            if (helper.insertQuestion(questionText, surveyID) == 1) {
                questionText = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "1 Question Added.";
                //return response;
            }/*else{
                questionText = null;
                Survey = 0;
                response = "Must have at least 1 question!";
               // return response;
            }*/
            // surveyID = helper.getSurvey();
        }

        if (questionText1 != null && surveyID >= 0 && !questionText1.isEmpty()) {
            /* if (questionText1.isEmpty() == true) {
                questionText1 = null;
            }*/

            question = new Question(questionText1, surveyID);

            if (helper.insertQuestion(questionText1, surveyID) == 1) {
                questionText1 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "2 Questions Added.";
                //return response;
            }/*else{
                questionText1 = null;
                Survey = 0;
                response = "2 questions added.";
                //return response;
            }*/
        }

        if (questionText2 != null && surveyID >= 0 && !questionText2.isEmpty()) {
            /* if (questionText2.isEmpty() == true) {
                questionText2 = null;
            }*/

            question = new Question(questionText2, surveyID);

            if (helper.insertQuestion(questionText2, surveyID) == 1) {
                questionText2 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "3 Questions Added.";
                //return response;
            }/*else if (!questionText2.isEmpty()){
                questionText2 = null;
                Survey = 0;
                response = "3 questions added.";
                //return response;
            }*/
        }

        if (questionText3 != null && surveyID >= 0 && !questionText3.isEmpty()) {

            /*if (questionText3.isEmpty() == true) {
                questionText3 = null;
            }*/
            question = new Question(questionText3, surveyID);

            if (helper.insertQuestion(questionText3, surveyID) == 1) {
                questionText3 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "4 Questions Added.";
                // return response;
            }/*else{
                questionText3 = null;
                Survey = 0;
                response = "4 questions added.";
                //return response;
            }*/
        }

        if (questionText4 != null && surveyID >= 0 && !questionText4.isEmpty()) {

            /* if (questionText4.isEmpty() == true){
            questionText4 = null;
        }*/
            question = new Question(questionText4, surveyID);

            if (helper.insertQuestion(questionText4, surveyID) == 1) {
                questionText4 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "5 Questions Added.";
                //return response;
            }/*else{
                questionText4 = null;
                Survey = 0;
                response = "5 questions added.";
               // return response;
            }*/
        }

        if (questionText5 != null && surveyID >= 0 && !questionText5.isEmpty()) {
            /*if (questionText5.isEmpty() == true){
            questionText5 = null;
        }*/

            question = new Question(questionText5, surveyID);

            if (helper.insertQuestion(questionText5, surveyID) == 1) {
                questionText5 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "6 Questions Added.";
                //return response;
            }/*else{
                questionText5 = null;
                Survey = 0;
                response = "6 questions added.";
                //return response;
            }*/
        }

        if (questionText6 != null && surveyID >= 0 && !questionText6.isEmpty()) {
            /* if (questionText6.isEmpty() == true){
            questionText6 = null;
        }*/

            question = new Question(questionText6, surveyID);

            if (helper.insertQuestion(questionText6, surveyID) == 1) {
                questionText6 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "7 Questions Added.";
                //return response;
            }/*else{
                questionText6 = null;
                Survey = 0;
                response = "7 questions added.";
                //return response;
            }*/
        }

        if (questionText7 != null && surveyID >= 0 && !questionText7.isEmpty()) {
            /*if (questionText7.isEmpty() == true){
            questionText7 = null;
        }*/

            question = new Question(questionText7, surveyID);

            if (helper.insertQuestion(questionText7, surveyID) == 1) {
                questionText7 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "8 Questions Added.";
                //return response;
            }/*else{
                questionText7 = null;
                Survey = 0;
                response = "8 questions added.";
                //return response;
            }*/
        }

        if (questionText8 != null && surveyID >= 0 && !questionText8.isEmpty()) {
            /*  if (questionText8.isEmpty() == true){
            questionText8 = null;
        }*/

            question = new Question(questionText8, surveyID);

            if (helper.insertQuestion(questionText8, surveyID) == 1) {
                questionText8 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "9 Questions Added.";
                //return response;
            }//else{
            //  questionText8 = null;
            //Survey = 0;
            // response = "9 questions added.";
            //return response;
            //}
        }

        if (questionText9 != null && surveyID >= 0 && !questionText9.isEmpty()) {
            //if (questionText9.isEmpty() == true){
            //questionText9 = null;
            //}

            question = new Question(questionText9, surveyID);

            if (helper.insertQuestion(questionText9, surveyID) == 1) {
                questionText9 = null;
                surveyID = getSurveyID();
                //surveyID = 0;
                response = "All Questions Added.";
                //return response;
            }//else{
            //questionText9 = null;
            // Survey = 0;
            //response = "All questions Added.";
            //return response;
            //}
        } //else {
        // response = " ";
        // return response;
        // }
        surveyController surveyController = new surveyController();
        UserController UserController = new UserController();
        /* surveyController.userID=0;
        surveyController.surveyID=0;
        surveyController.response=null;
        surveyController.surveyName=null;
        UserController.UserEmail=null;
        UserController.UserFname=null;
        UserController.UserLname=null;
        UserController.response=null;
        surveyID=0;*/

 /*surveyController.setSurveyID(0);
        surveyController.setSurveyName(null);
        surveyController.setUserID(0);
        surveyController.setResponse(null);
        UserController.setUserEmail(null);
        UserController.setResponse(null);
        UserController.setUserFname(null);
        UserController.setUserLname(null);
        surveyID=0;*/
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
