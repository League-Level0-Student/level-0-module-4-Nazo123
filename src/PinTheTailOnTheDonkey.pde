PImage donkey;
PImage tail;
void setup(){
donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(550,406);
tail.resize(40,200);
}
void draw(){
  background(donkey);
  int mousey = mouseX-30;
  image(tail,mousey, mouseY);
  rect(0, 0, 30, 30);
  rect(486, 125, 10, 10);
  if (dist(0, 0, mouseX, mouseY) < 30){
    rect(0,0,550,406);
  }
}
