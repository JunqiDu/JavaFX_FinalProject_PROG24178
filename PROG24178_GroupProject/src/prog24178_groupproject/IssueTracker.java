/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog24178_groupproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Junqi Du
 * This is the PROG 24178 group projetc.
 * This project is about OOP and Java FX.
 */
public class IssueTracker extends Application {

    Stage window;
    Scene loginScene, issueListScene, issueDetailScene, addNewScene;

    Label lblName = new Label("Name :");
    TextField txtName = new TextField();
    Label lblPassword = new Label("Password：");
    PasswordField txtPassword = new PasswordField();
    Button btnLogin = new Button("Login");

    Issue issue = new Issue();
    ListView<Issue> issueList = new ListView<Issue>();
    Button btnNewIssue = new Button("New Issue");
    //manger未使用
    Button btnAddNew = new Button("Add New");

    Label lblTitle = new Label("Title: ");
    TextField txtTitle = new TextField();
    Label lblSubmit = new Label("Submit: ");
    TextField txtSubmit = new TextField();
    Label lblDescription = new Label("Description: ");
    TextField txtDescription = new TextField();
    Label lblDate = new Label("Date: ");
    TextField txtDate = new TextField();
    Label lblStatus = new Label("Status: ");
    TextField txtStatus = new TextField();
    Label lblDeveloper = new Label("Developer: ");
    TextField txtDeveloper = new TextField();
    Button btnCancel = new Button("Cancel");
    Button btnSubmit = new Button("Submit");
    
    Button btnAssign = new Button("Assign");
    Button btnClose = new Button("Close");
    Button btnValidate = new Button("Validate");
    Button btnFail = new Button("Fail");
    
    Button btnOpen = new Button("Open");
    Button btnReject = new Button("Reject");
    Button btnResolve = new Button("Resolve");

    Label lblNewName = new Label("Name :");
    TextField txtNewName = new TextField();
    Label lblNewPassword = new Label("Password：");
    TextField txtNewPassword = new TextField();
    Label lblRole = new Label("Role");
    TextField txtRole = new TextField();
    Button btnNewCancel = new Button("Cancel");
    Button btnNewSubmit = new Button("Submit");

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        btnLogin.setOnAction(e -> window.setScene(issueListScene));

        GridPane pane1 = new GridPane();
        pane1.add(lblName, 0, 0);
        pane1.add(txtName, 1, 0);
        pane1.add(lblPassword, 0, 1);
        pane1.add(txtPassword, 1, 1);
        pane1.add(btnLogin, 0, 2);
        loginScene = new Scene(pane1, 300, 300);

        btnNewIssue.setOnAction(e -> window.setScene(issueDetailScene));

        GridPane pane2 = new GridPane();
        pane2.add(issueList, 0, 0);
        pane2.add(btnNewIssue, 0, 1);
        issueListScene = new Scene(pane2, 300, 300);

        btnCancel.setOnAction(e -> window.setScene(issueListScene));
        btnSubmit.setOnAction(e -> window.setScene(issueListScene));
        GridPane pane3 = new GridPane();
        pane3.add(lblTitle, 0, 0);
        pane3.add(txtTitle, 1, 0);
        pane3.add(lblSubmit, 0, 1);
        pane3.add(txtSubmit, 1, 1);
        pane3.add(lblDescription, 0, 2);
        pane3.add(txtDescription, 1, 2);
        pane3.add(lblDate, 0, 3);
        pane3.add(txtDate, 1, 3);
        pane3.add(lblStatus, 0, 4);
        pane3.add(txtStatus, 1, 4);
        pane3.add(lblDeveloper, 0, 5);
        pane3.add(txtDeveloper, 1, 5);
        pane3.add(btnCancel, 0, 6);
        pane3.add(btnSubmit, 1, 6);
        issueDetailScene = new Scene(pane3, 300, 300);

        btnNewCancel.setOnAction(e -> window.setScene(issueListScene));
        btnNewSubmit.setOnAction(e -> window.setScene(issueListScene));
        GridPane pane4 = new GridPane();
        pane4.add(lblNewName, 0, 0);
        pane4.add(txtNewName, 1, 0);
        pane4.add(lblNewPassword, 0, 1);
        pane4.add(txtNewPassword, 1, 1);
        pane4.add(lblRole, 0, 2);
        pane4.add(txtRole, 1, 2);
        pane4.add(btnNewCancel, 0, 3);
        pane4.add(btnNewSubmit, 1, 3);
        addNewScene = new Scene(pane4, 300, 300);
        window.setScene(loginScene);
        window.setTitle("Issue Tracker");
        window.show();
    }

    public void login() {

    }

    public void addNew() {

    }

    public void newIssue() {

    }

    public void cancel() {

    }

    public void submit() {

    }

    public void assign() {

    }

    public void close() {

    }

    public void validate() {

    }

    public void fail() {

    }

    public void open() {

    }

    public void reject() {

    }

    public void resolve() {

    }

    public void newCancel() {

    }

    public void newSubmit() {

    }

    public String getName() {
        return txtName.getText();
    }

    public void setName(String name) {
        txtName.setText(name);
    }

    public String getPassword() {
        return txtPassword.getText();
    }

    public void setPassword(String password) {
        txtPassword.setText(password);
    }

    public String getTitle() {
        return txtTitle.getText();
    }

    public void setTitle(String title) {
        txtTitle.setText(title);
    }

    public String getSubmit() {
        return txtSubmit.getText();
    }

    public void setSubmit(String submit) {
        txtSubmit.setText(submit);
    }

    public String getDescription() {
        return txtDescription.getText();
    }

    public void setDescription(String description) {
        txtDescription.setText(description);
    }

    public String getDate() {
        return txtDate.getText();
    }

    public void setDate(String date) {
        txtDate.setText(date);
    }

    public String getStatus() {
        return txtStatus.getText();
    }

    public void setStatus(String status) {
        txtStatus.setText(status);
    }

    public String getDeveloper() {
        return txtDeveloper.getText();
    }

    public void setDeveloper(String developer) {
        txtDeveloper.setText(developer);
    }

    public String getNewName() {
        return txtNewName.getText();
    }

    public void setNewName(String name) {
        txtNewName.setText(name);
    }

    public String getNewPassword() {
        return txtNewPassword.getText();
    }

    public void setNewPassword(String password) {
        txtNewPassword.setText(password);
    }

    public String getRole() {
        return txtRole.getText();
    }

    public void setRole(String role) {
        txtRole.setText(role);
    }
}