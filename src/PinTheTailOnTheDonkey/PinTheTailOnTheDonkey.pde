PImage donkey;
PImage tail;
int mousey = 0;
  int mouseyy = 0;
boolean a = false;

void setup(){
donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(550,406);
tail.resize(40,200);
}
void draw(){

  background(donkey);

  if (mousePressed){
  //if (a){a=false;
  
  
  mousey = mouseX;
  mouseyy = mouseY-5;
   a = true;
  

}
  if (a){
    image(tail,mousey,mouseyy); 

  }
 else{
     
  image(tail,mouseX,mouseY-5); 
 }

  rect(0, 0, 30, 30);

  if (dist(0, 0, mouseX, mouseY) > 30 &&(mousey>516||mousey<486||mouseyy<125||mouseyy>155)){
    rect(0,0,550,406);
  }
  
 
 }
