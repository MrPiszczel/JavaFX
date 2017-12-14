package zajace.view;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import zajace.model.Ksiazki;

public class MainC {

    @FXML
    private TableView<Ksiazki> tableName;
    
    @FXML
    private TableColumn<Ksiazki, String> NameColumn;

    @FXML
    private TextField nameField;

    @FXML
    private TextField surnameField;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;
    
    @FXML
    private TextField authorField;
    
    @FXML
    private TextField yearField;
    
    @FXML
    private Label labelName;

    @FXML
    private Label labelAuthor;

    @FXML
    private Label labelYear;
    
    public ObservableList<Ksiazki> observableList; // ArrayList -> ObservableList -> ListProperty
    public ListProperty<Ksiazki> listProperty;
    private Ksiazki ksiazki;
    
    @FXML
    public void initialize(){
    	List<Ksiazki> lista = new ArrayList<>();
    	lista.add(new Ksiazki("pajace" , "jacka" , 1965));
    	
    	
    	listProperty = new SimpleListProperty();
    	observableList =FXCollections.observableArrayList(lista);
    	listProperty.set(observableList);
    	
    	tableName.itemsProperty().bindBidirectional(listProperty);
    	
    	tableName.getSelectionModel().selectedItemProperty().addListener(
    			(observable , oldValue , newValue) -> showList(newValue))  ; 
    	}
    @FXML
    void add(ActionEvent event) {
    	
        
    ksiazki = new Ksiazki(nameField.getText() , authorField.getText(), Integer.parseInt(yearField.getText()));
    observableList.add(ksiazki);
         
         NameColumn.setCellValueFactory(cellData -> cellData.getValue().getName());
       
    }

    @FXML
    void delete(ActionEvent event) {

    	Ksiazki ksiazki = tableName.getSelectionModel().getSelectedItem();
    	observableList.remove(ksiazki);
    	
    }
    
    public void showList(Ksiazki ksiazki){
    	labelName.setText(ksiazki.getN());
    	labelAuthor.setText(ksiazki.getA());
    	labelYear.setText(Integer.toString(ksiazki.getY()));
    	
    }
  

}
