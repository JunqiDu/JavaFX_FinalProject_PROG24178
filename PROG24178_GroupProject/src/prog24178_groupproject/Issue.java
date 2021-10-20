/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178_groupproject;

/**
 *
 * @author Junqi Du
 */
public class Issue {

    private String title;
    private String submit;
    private String description;
    private String date;
    private String status;
    private String developer;

    public void Issue(String title, String submit, String description, String date, String status, String developer) {
        this.title = title;
        this.submit = submit;
        this.description = description;
        this.date = date;
        this.status = status;
        this.developer = developer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeveloper() {
        return developer;
    }
}