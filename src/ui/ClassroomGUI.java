package ui;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import model.Classroom;
import model.UserAccount;

public class ClassroomGUI {
	
	@FXML
    private Pane mainPane;
	
	@FXML
    private TableView<UserAccount> tvUsers;

    @FXML
    private TableColumn<UserAccount, String> tcUserName;

    @FXML
    private TableColumn<UserAccount, String> tcGender;

    @FXML
    private TableColumn<UserAccount, String> tcCarrer;

    @FXML
    private TableColumn<UserAccount, String> tcBirthday;

    @FXML
    private TableColumn<UserAccount, String> tcBrowser;
    
    private ObservableList<UserAccount> observableList;
    private Classroom classroom;
    
    public ClassroomGUI() {
    	classroom = new Classroom();
    }
    
    private void itializeTableView() {
    	observableList = FXCollections.observableArrayList(classroom.getUsers());
    	
    	tvUsers.setItems(observableList);
    	tcUserName.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("username"));
    	tcGender.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("gender"));
    	tcCarrer.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("carrer"));
    	tcBirthday.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("birthday"));
    	tcBrowser.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("browser"));
    }

    @FXML
    void logIn(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("account-list.fxml"));
    	fxmlLoader.setController(this);
    	Parent window1 = fxmlLoader.load();
    	mainPane.getChildren().setAll(window1);
    	
    	itializeTableView();
    }

    @FXML
    void singUp(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));
    	fxmlLoader.setController(this);
    	Parent window2 = fxmlLoader.load();
    	mainPane.getChildren().setAll(window2);
    }
    
    @FXML
    void logOut(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
    	fxmlLoader.setController(this);
    	Parent window3 = fxmlLoader.load();
    	mainPane.getChildren().setAll(window3);
    }
    
    @FXML
    void addUser(ActionEvent event) {
    	
    }

}

