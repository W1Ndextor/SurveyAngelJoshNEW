/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;*/

/**
 *
 * @author Angel
 */
/*@Named(value = "responseController")
@SessionScoped
public class responseController implements Serializable {*/

    /**
     * Creates a new instance of responseController
     */
    /*public responseController() {
    }
    
    int questionId;
    int rating;
    int surveyRespondent;
    String responses;
    String responseMessage;
    
    responseHelper helper;
    Response responseObject;
    
    String responseText;
    String responseText1;
    String responseText2;
    String responseText3;
    String responseText4;
    String responseText5;
    String responseText6;
    String responseText7;
    String responseText8;
    String responseText9;
    

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSurveyRespondent() {
       return surveyRespondent;
       
    }

    public void setSurveyRespondent(int surveyRespondent) {
        this.surveyRespondent = surveyRespondent;
    }

    public String getResponses() {
        return responses;
    }

    public void setResponses(String responses) {
        this.responses = responses;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Response getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(Response responseObject) {
        this.responseObject = responseObject;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public String getResponseText1() {
        return responseText1;
    }

    public void setResponseText1(String responseText1) {
        this.responseText1 = responseText1;
    }

    public String getResponseText2() {
        return responseText2;
    }

    public void setResponseText2(String responseText2) {
        this.responseText2 = responseText2;
    }

    public String getResponseText3() {
        return responseText3;
    }

    public void setResponseText3(String responseText3) {
        this.responseText3 = responseText3;
    }

    public String getResponseText4() {
        return responseText4;
    }

    public void setResponseText4(String responseText4) {
        this.responseText4 = responseText4;
    }

    public String getResponseText5() {
        return responseText5;
    }

    public void setResponseText5(String responseText5) {
        this.responseText5 = responseText5;
    }

    public String getResponseText6() {
        return responseText6;
    }

    public void setResponseText6(String responseText6) {
        this.responseText6 = responseText6;
    }

    public String getResponseText7() {
        return responseText7;
    }

    public void setResponseText7(String responseText7) {
        this.responseText7 = responseText7;
    }

    public String getResponseText8() {
        return responseText8;
    }

    public void setResponseText8(String responseText8) {
        this.responseText8 = responseText8;
    }

    public String getResponseText9() {
        return responseText9;
    }

    public void setResponseText9(String responseText9) {
        this.responseText9 = responseText9;
    }
    
    
    
    public String getResponse() {
    responseMessage=null;
        //loops here changing questiontext to "questiontext"1 ""2 "" 3...""10
        //case blocks would also work for each questiontext
        if (responseText != null && !responseText.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "1 response added";
                //return response;
            }
            
            if (responseText1 != null && !responseText1.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "2 response added";
                //return response;
            }
            
             if (responseText2 != null && !responseText2.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "3 response added";
                //return response;
            }
            
             if (responseText3 != null && !responseText3.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "4 response added";
                //return response;
            }
            
             if (responseText4 != null && !responseText4.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "5 response added";
                //return response;
            }
            
             if (responseText5 != null && !responseText5.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "6 response added";
                //return response;
            }
            
             if (responseText6 != null && !responseText6.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "7 response added";
                //return response;
            }
            
             if (responseText7 != null && !responseText7.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "8 response added";
                //return response;
            }
            
             if (responseText8 != null && !responseText8.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "9 response added";
                //return response;
            }
            
             if (responseText9!= null && !responseText9.isEmpty()) {

            responseObject = new Response(questionId, rating, surveyRespondent);

            if (helper.insertResponse(responseObject) == 1) {
                questionId = 0;
                rating = 0;
                surveyRespondent = 0;
                responseMessage = "10 response added";
                //return response;
            }
                
        

        }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    
}*/