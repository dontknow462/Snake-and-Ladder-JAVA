package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DiceRoleSnake extends Application {

    public int rand;
    public Label randResult;

//    public int cirPos[][]= new int [10][10];


    public  static  final int Tile_Size = 60;
    public static  final  int width = 10;
    public static final int height =10; 

    public Circle player1;
    public Circle player2;
    public Circle player3;

    public int playerPosition1=1;
    public int playerPosition2=1;
    public int playerPosition3=1;

    public  boolean player1Turn=true;
    public  boolean player2Turn=false;
    public  boolean player3Turn=false;

    public boolean player1Biscuit= false;
    public boolean player2Biscuit= false;
    public boolean player3Biscuit= false;

    public boolean player1Stick= false;
    public boolean player2Stick= false;
    public boolean player3Stick= false;


    public static  int player1XPos=30;
    public static  int player1YPos=570;

    public static  int player2XPos=30;
    public static  int player2YPos=570;
    
    public static  int player3XPos=30;
    public static  int player3YPos=570;

    public int posCir1=1;
    public int posCir2=1;
    public int posCir3=1;

    public  boolean gameStart= false;
    public Button gameButton;


    
//    public class Tile extends Rectangle {
//        public Tile (int x, int y){
//            setWidth(DiceRoleSnake.Tile_Size);
//            setHeight(DiceRoleSnake.Tile_Size);
//
//            setFill(Color.PINK);
//            setStroke(Color.BLACK);
//        }
//
//    }

    
    private Group tileGroup = new Group();
    
    /// ALL buttons, cirlces, are added to tilegroup and tile group is added to root
    private Parent createConetent(){
        Pane root = new Pane();
        root.setPrefSize(width*Tile_Size, (height*Tile_Size)+80);
        root.getChildren().addAll(tileGroup);
        // 

        for(int i=0; i<height;i++){
            for(int j =0; j<width; j++){
               
            }
        }
        
      


        player1= new Circle(30);
        player1.setId("player1");
        player1.setFill(Color.AQUA);
        player1.getStyleClass().add("style.css");
        player1.setTranslateX(player1XPos);
        player1.setTranslateY(player1YPos);

        player2= new Circle(30);
        player2.setFill(Color.RED);
        player2.setId("player2  ");
        player2.getStyleClass().add("style.css");
        player2.setTranslateX(player2XPos);
        player2.setTranslateY(player2YPos);
        
        player3= new Circle(30);
        player3.setId("player2  ");
        player3.getStyleClass().add("style.css");
        player3.setTranslateX(player2XPos);
        player3.setTranslateY(player2YPos);

        Button button2Player = new Button("Player2");
        button2Player.setTranslateX(400);
       
        button2Player.setTranslateY(600);
        button2Player.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(gameStart){
                    if(player2Turn){
                        getDiceValue();
                        randResult.setText(String.valueOf(rand));
                        move2Player();
                        translatePlayer(player2XPos, player2YPos,player2);
                        player2Turn=false;
                        player1Turn=false;
                        player3Turn=true;
                        playerPosition2+=rand;


 //******************************Biscuits*******************************************************************************
                        if(player2XPos==510 && player2YPos==150){
                            
                        	player2Biscuit= true;
// 						Biscuit


                         }
                        if(player2XPos==510 && player2YPos==450){
                            
                        	player2Biscuit= true;
// 						Biscuit


                         }
//******************************biscuits*******************************************************************************
                        
//******************************Sticks*******************************************************************************   
                        
                        if(player2XPos==210 && player2YPos==570){
                            
                        	player2Stick= true;
                       
                         }
                        
                        if(player2XPos==30 && player2YPos==450){
                            
                        	player2Stick= true;


                         }
//******************************sticks*******************************************************************************
                        
 //******************************Ladders*******************************************************************************

                        ///Ladders with Stick
                        
                        if(player2XPos==450 && player2YPos==450 && player2Stick){ 
                            
                        	translatePlayer (player2XPos=30, player2YPos=90, player2);
//						28
                        	

                        }
                        
                        if(player2XPos==150 && player2YPos==390 && player2Stick){ 
                            
                        	translatePlayer (player2XPos=570, player2YPos=150, player2);
//						38
                        	

                        }
                         ///Ladders with stick
                        
                        ///Ladders WITHOUT STICK
                        
                        if(player2XPos==150 && player2YPos==570 ){ 
                            
                        	translatePlayer (player2XPos=330, player2YPos=330, player2);
//						3
                        	

                        }
                        
                        if(player2XPos==450 && player2YPos==450 && player2Stick==false){ 
                            
                        	translatePlayer (player2XPos=570, player2YPos=210, player2);
//						28
                        	

                        }
                        
                        if(player2XPos==150 && player2YPos==390 && player2Stick==false){ 
                            
                        	translatePlayer (player2XPos=30, player2YPos=270, player2);
//						38
                        	

                        }
                        
                        ///Ladders WITHOUT STICK
                        
//******************************ladders*******************************************************************************
                        
//*******************************Snakes*********************************************************************************
                        // Biscuits
                        
                        if(player2XPos==510 && player2YPos==450){
                            
                        	player2Biscuit=true;
//						29
                        	

                        }
                        
                        if(player2XPos==510 && player2YPos==150){
                            
                        	player2Biscuit=true;
//						72
                        	

                        }
                        
                        //Biscuits
                      
                        // Biscuits + SNAKES
                        
                        if(player2XPos==150 && player2YPos==450 && player2Biscuit){
                            
                        	player2Biscuit=false;
//						23
                        	

                        }
                        
                        if(player2XPos==390 && player2YPos==270 && player2Biscuit){
                            
                        	player2Biscuit=false;
//						86
                        	

                        }
                        if(player2XPos==270 && player2YPos==90 && player2Biscuit){
                            
                        	player2Biscuit=false;
//						86
  

                        }
                        
                        //SNAKES
                        
                        if(player2XPos==150 && player2YPos==450 && player2Biscuit==false){ 
                            
                        	translatePlayer (player2XPos=450, player2YPos=570, player2);
//						38
                        	

                        }
                        
                        if(player2XPos==390 && player2YPos==270 && player2Biscuit==false){ 
                            
                        	translatePlayer (player2XPos=510, player2YPos=510, player2);
//						38
                        	

                        }
 
						 if(player2XPos==270 && player2YPos==90 && player2Biscuit==false){ 
						     
						 	translatePlayer (player2XPos=510, player2YPos=210, player2);
						//	38
						 	
						
						 }
                        //SNAKES
                        
                        // Biscuits + SNAKES
                                             
//                        }
                    }
                }
            }
        });

        Button button3Player = new Button("Player3");
        button3Player.setTranslateX(500);
        button3Player.setTranslateY(600);
        button3Player.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(gameStart){
                    if(player3Turn){
                        getDiceValue();
                        randResult.setText(String.valueOf(rand));
                        move3Player();
                        translatePlayer(player3XPos, player3YPos,player3);
                        player3Turn=false;
                        player2Turn=false;
                        player1Turn=true;
                        playerPosition3+=rand;


 //******************************Biscuits*******************************************************************************
                        if(player3XPos==510 && player3YPos==150){
                            
                        	player3Biscuit= true;
// 						Biscuit


                         }
                        if(player3XPos==510 && player3YPos==450){
                            
                        	player3Biscuit= true;
// 						Biscuit


                         }
//******************************biscuits*******************************************************************************
                        
//******************************Sticks*******************************************************************************   
                        
                        if(player3XPos==210 && player3YPos==570){
                            
                        	player3Stick= true;
                       
                         }
                        
                        if(player3XPos==30 && player3YPos==450){
                            
                        	player3Stick= true;


                         }
//******************************sticks*******************************************************************************
                        
 //******************************Ladders*******************************************************************************

                        ///Ladders with Stick
                        
                        if(player3XPos==450 && player3YPos==450 && player3Stick){ 
                            
                        	translatePlayer (player3XPos=30, player3YPos=90, player3);
//						28
                        	

                        }
                        
                        if(player3XPos==150 && player3YPos==390 && player3Stick){ 
                            
                        	translatePlayer (player3XPos=570, player3YPos=150, player3);
//						38
                        	

                        }
                        
                        
                        
                        ///Ladders with stick
                        
                        ///Ladders WITHOUT STICK
                        
                        if(player3XPos==150 && player3YPos==570 ){ 
                            
                        	translatePlayer (player3XPos=330, player3YPos=330, player3);
//						3
                        	

                        }
                        
                        if(player3XPos==450 && player3YPos==450 && player3Stick==false){ 
                            
                        	translatePlayer (player3XPos=570, player3YPos=210, player3);
//						28
                        	

                        }
                        
                        if(player3XPos==150 && player3YPos==390 && player3Stick==false){ 
                            
                        	translatePlayer (player3XPos=30, player3YPos=270, player3);
//						38
                        	

                        }
                        
                        ///Ladders WITHOUT STICK
                        
//******************************ladders*******************************************************************************
                        
//*******************************Snakes*********************************************************************************
                        // Biscuits
                        
                        if(player3XPos==510 && player3YPos==450){
                            
                        	player3Biscuit=true;
//						29
                        	

                        }
                        
                        if(player3XPos==510 && player3YPos==150){
                            
                        	player3Biscuit=true;
//						72
                        	

                        }
                        
                        //Biscuits
                      
                        // Biscuits + SNAKES
                        
                        if(player3XPos==150 && player3YPos==450 && player3Biscuit){
                            
                        	player3Biscuit=false;
//						23
                        	

                        }
                        
                        if(player3XPos==390 && player3YPos==270 && player3Biscuit){
                            
                        	player3Biscuit=false;
//						86
                        	

                        }
                        if(player3XPos==270 && player3YPos==90 && player3Biscuit){
                            
                        	player3Biscuit=false;
//						86
  

                        }
                        
                        //SNAKES
                        
                        if(player3XPos==150 && player3YPos==450 && player3Biscuit==false){ 
                            
                        	translatePlayer (player3XPos=450, player3YPos=570, player3);
//						38
                        	

                        }
                        
                        if(player3XPos==390 && player3YPos==270 && player3Biscuit==false){ 
                            
                        	translatePlayer (player3XPos=510, player3YPos=510, player3);
//						38
                        	

                        }
 
						 if(player3XPos==270 && player3YPos==90 && player3Biscuit==false){ 
						     
						 	translatePlayer (player3XPos=510, player3YPos=210, player3);
						//	38
						 	
						
						 }
                        //SNAKES
                        
                        // Biscuits + SNAKES
                     
                       
//                        }
                    }
                }
            }
        });

        Button button1Player = new Button("Player 1");
        button1Player.setTranslateX(250);
        button1Player.setTranslateY(600);
        button1Player.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(gameStart){
                    if (player1Turn){
                        getDiceValue();
                        randResult.setText(String.valueOf(rand));
                        move1Player();
                        translatePlayer(player1XPos, player1YPos,player1);
                        player1Turn=false;
                        player2Turn=true;
                        player3Turn=false;
                        playerPosition1+=rand;
//******************************Biscuits*******************************************************************************
                        if(player1XPos==510 && player1YPos==150){
                            
                        	player1Biscuit= true;
// 						Biscuit


                         }
                        if(player1XPos==510 && player1YPos==450){
                            
                        	player1Biscuit= true;
// 						Biscuit


                         }
//******************************biscuits*******************************************************************************
                        
//******************************Sticks*******************************************************************************   
                        
                        if(player1XPos==210 && player1YPos==570){
                            
                        	player1Stick= true;
                       
                         }
                        
                        if(player1XPos==30 && player1YPos==450){
                            
                        	player1Stick= true;


                         }
//******************************sticks*******************************************************************************
                        
 //******************************Ladders*******************************************************************************

                        ///Ladders with Stick
                        
                        if(player1XPos==450 && player1YPos==450 && player1Stick){ 
                            
                        	translatePlayer (player1XPos=30, player1YPos=90, player1);
//						28
                        	

                        }
                        
                        if(player1XPos==150 && player1YPos==390 && player1Stick){ 
                            
                        	translatePlayer (player1XPos=570, player1YPos=150, player1);
//						38
                        	

                        }
                        
                        
                        
                        ///Ladders with stick
                        
                        ///Ladders WITHOUT STICK
                        
                        if(player1XPos==150 && player1YPos==570 ){ 
                            
                        	translatePlayer (player1XPos=330, player1YPos=330, player1);
//						3
                        	

                        }
                        
                        if(player1XPos==450 && player1YPos==450 && player1Stick==false){ 
                            
                        	translatePlayer (player1XPos=570, player1YPos=210, player1);
//						28
                        	

                        }
                        
                        if(player1XPos==150 && player1YPos==390 && player1Stick==false){ 
                            
                        	translatePlayer (player1XPos=30, player1YPos=270, player1);
//						38
                        	

                        }
                        
                        ///Ladders WITHOUT STICK
                        
//******************************ladders*******************************************************************************
                        
//*******************************Snakes*********************************************************************************
                        // Biscuits
                        
                        if(player1XPos==510 && player1YPos==450){
                            
                        	player1Biscuit=true;
//						29
                        	

                        }
                        
                        if(player1XPos==510 && player1YPos==150){
                            
                        	player1Biscuit=true;
//						29
                        	

                        }
                        
                        //Biscuits
                      
                        // Biscuits + SNAKES
                        
                        if(player1XPos==150 && player1YPos==450){
                            
                        	player1Biscuit=false;
//						23
                        	

                        }
                        
                        if(player1XPos==390 && player1YPos==270 && player1Biscuit){
                            
                        	player1Biscuit=false;
//						54
                        	

                        }
                        if(player1XPos==270 && player1YPos==90 && player1Biscuit){
                            
                        	player1Biscuit=false;
//						85
  

                        }
                        
                        //SNAKES
                        
                        if(player1XPos==150 && player1YPos==450 && player1Biscuit==false){ 
                            
                        	translatePlayer (player1XPos=450, player1YPos=570, player1);
//						38
                        	

                        }
                        
                        if(player1XPos==390 && player1YPos==270 && player1Biscuit==false){ 
                            
                        	translatePlayer (player1XPos=510, player1YPos=510, player1);
//						54
                        	

                        }
 
						 if(player1XPos==270 && player1YPos==90 && player1Biscuit==false){ 
						     
						 	translatePlayer (player1XPos=510, player1YPos=210, player1);
						//	85
						 	
						
						 }
                        //SNAKES
                        
                        // Biscuits + SNAKES
                      
                 
//*******************************Snakes*********************************************************************************                        
                        
                    }
                }
            }
        });
    gameButton=new Button("Start Game");
    gameButton.setTranslateX(100);
    gameButton.setTranslateY(600);
    gameButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            gameButton.setText("Game Started");
            player1XPos=30;
            player1YPos=570;

            player2XPos=30;
            player2YPos=570;

            player1.setTranslateX(player1XPos);
            player1.setTranslateY(player1YPos);
            player2.setTranslateX(player2XPos);
            player2.setTranslateY(player2YPos);
            gameStart=true;

        }
    });

        randResult= new Label("0");
        randResult.setTranslateX(200);
        randResult.setTranslateY(600);


        Image img = new Image("C:\\Users\\dontk\\OneDrive\\Desktop\\ZIEc\\zear\\src\\application\\snkupdated.jpg");
      
          ImageView bgImage = new ImageView();
          bgImage.setImage(img);
          bgImage.setFitHeight(600);
          bgImage.setFitWidth(600);


        tileGroup.getChildren().addAll(bgImage,player1,player2,player3, button2Player, button1Player,button3Player, gameButton,randResult );
        return root;

    }





    private  void getDiceValue(){
        rand = (int) (Math.random()*6+1);
    }

    private void move1Player(){
        for(int i=0;i<rand; i++){
            if(posCir1%2==1){
                player1XPos+=60;
            }
            if(posCir1%2==0){
                player1XPos-=60;
            }
            if(player1XPos>580){
                player1YPos-=60;
                player1XPos-=60;
                posCir1++;
            }
            if(player1XPos<40){
            player1YPos-=60;
            player1XPos+=60;
            posCir1++;
            }
            if(player1XPos<30 && player1YPos<30){
                player2XPos=40;
                player2YPos=40;
                randResult.setText("Player two won");
                gameButton.setText("Start Again");
            }
        }
    }

    private void move2Player(){
        for(int i=0;i<rand; i++){
            if(posCir2%2==1){
                player2XPos+=60;
            }
           
            if(posCir2%2==0){
                player2XPos-=60;
            }
           
            if(player2XPos>580){
                player2YPos-=60;
                player2XPos-=60;
                posCir2++;
            }
            if(player2XPos<40){
                player2YPos-=60;
                player2XPos+=60;
                posCir2++;
            }
            if(player2XPos<30 && player2YPos<30){
                player2XPos=40;
                player2YPos=40;
                randResult.setText("Player two won");
                gameButton.setText("Start Again");
            }
        }
    }
    
    
    private void move3Player(){
        for(int i=0;i<rand; i++){
            if(posCir3%2==1){
                player3XPos+=60;
            }
           
            if(posCir3%2==0){
                player3XPos-=60;
            }
           
            if(player3XPos>580){
                player3YPos-=60;
                player3XPos-=60;
                posCir3++;
            }
            if(player3XPos<40){
                player3YPos-=60;
                player3XPos+=60;
                posCir3++;
            }
            if(player3XPos<30 && player2YPos<30){
                player3XPos=40;
                player3YPos=40;
                randResult.setText("Player three won");
                gameButton.setText("Start Again");
            }
        }
    }

    private  void translatePlayer(int x, int y, Circle b){
        TranslateTransition animate= new TranslateTransition(Duration.millis(1000),b);
        animate.setToX(x);
        animate.setToY(y);
        animate.setAutoReverse(false);
        animate.play();
   }
    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene scene = new Scene(createConetent());
        primaryStage.setTitle("Snake and Leadder!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}