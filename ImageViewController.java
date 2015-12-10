import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ImageViewController 
{
    // Private fields for components 
    @FXML
    private ImageView myImage;
    private ImageView myImage1;

    @FXML
    private ToggleGroup myToggleGroup;

    @FXML
    private MenuBar myMenuBar;
    
    @FXML
    /*void showImage(ActionEvent event) {
        myImage.setImage();*/
    
    
    // Private fields for the panda and cat images
    private Image pandaImage;
    private Image catImage;
    private Image picnic1Image;
    private Image picnic2Image;
    private Image scenery1Image;
    private Image scenery2Image;
    private Image archi1Image;
  
    
    // Initialize method
    public void initialize() 
    {
      // Load the panda and cat images
      pandaImage = new Image("Panda.jpg");
      catImage=new Image("Cat.jpg");
      picnic1Image=new Image("picnic1.jpg");
      picnic2Image=new Image("picnic2.jpg");
      scenery1Image=new Image("scene1.jpg");
      scenery2Image=new Image("scene2.jpg");
      archi1Image=new Image("archi1.jpg");
     
    }
    public void start(Stage stage) throws Exception
    {  
       // Load the FXML file.
       Parent parent = FXMLLoader.load(
                getClass().getResource("ImageView2.fxml")); 
       
       // Build the scene graph.
       Scene scene = new Scene(parent); 
       
       // Display our window, using the scene graph.
      stage.setTitle("ImageView"); 
       stage.setScene(scene);
       stage.show(); }
  //event driven for the catImage selected
    //displayed in the new pane (enlarging the picture)
    public void catSelection(ActionEvent t){
    	
    	
    	myImage1.setImage(catImage);
    				
    				
    	}
    	
    	
  //event driven for the pandaImage selected
    //displayed in the new pane (enlarging the picture)
    public void pandaSelection(){
    	myImage1.setImage(pandaImage);
    }
    
  //event driven for the picnic1Image selected
    //displayed in the new pane (enlarging the picture)
    public void picnic1Selection(){
    	myImage1.setImage(picnic1Image);
    }
    
  //event driven for the picnic2Image selected
    //displayed in the new pane (enlarging the picture)
    public void picnic2Selection(){
    	myImage1.setImage(picnic2Image);
    }
    
  //event driven for the scenery1Image selected
    //displayed in the new pane (enlarging the picture)
    public void scenery1Selection(){
    	myImage1.setImage(scenery1Image);
    }
    
  //event driven for the scenery2Image selected
    //displayed in the new pane (enlarging the picture)
    public void scenery2Selection(){
    	myImage1.setImage(scenery2Image);
    }
    
  //event driven for the archi1Image selected
    //displayed in the new pane (enlarging the picture)
    public void archi1Selection(){
    	myImage1.setImage(archi1Image);
    }
    }
    

	