PImage creeper;     //at the top of your program
int X=450;
int Y=20;
int Yy=450;
int Xx=342;
boolean a = true;
boolean b = true;
void setup() {
  size(500, 500); //in setup method
  PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(width, height);          //in setup method
         background(minecraft);   //in setup method
creeper=loadImage("creeper.png");     //in setup method
creeper.resize(20, 20);     //in setup method
image(creeper, X, Y);   
image(creeper, Xx, Yy); //in draw method
}

void draw() {

  
if (dist(mouseX,mouseY,X,Y)<20){
  ellipse(X+10,Y+10,50,50);
  if (a){
  println("You found the creeper");
  a = false;

}


}
if (dist(mouseX,mouseY,Xx,Yy)<20){
  ellipse(Xx+10,Yy+10,50,50);
  if (b){
  println("You found the creeper");
  b = false;
}
}}
