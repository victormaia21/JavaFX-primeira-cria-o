package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import mode.entities.Person;

public class ViewControle implements Initializable {

	@FXML
	private ComboBox<Person>combobox;
	
	private ObservableList<Person>obslist;
	
	@FXML
	private Button bt;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "VICTOR", "V@GMAIL.COM"));
		list.add(new Person(2, "VIC", "V@GMAIL.COM"));
		
		obslist = FXCollections.observableArrayList(list);
		combobox.setItems(obslist);

		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
			super.updateItem(item, empty);
			setText(empty ? "" : item.getNome());
			}
			};
			combobox.setCellFactory(factory);
			combobox.setButtonCell(factory.call(null));
	}
	

}
