PImage face;
void setup(){
  
      face=loadImage("googlyEyes.png");
         
    size(800,600);
    face.resize(width,height);
    
    
    
    
    
}

void draw(){
  background(face);
  int mousey = mouseX;
  int mouseyy = mouseY;
  if(mouseX>240){
   mousey=240;
  }
  if(mouseX<155){
   mousey=155;
  }
   if(mouseY<260){
   mouseyy=260;
  }
   if(mouseY>344){
   mouseyy=344;
  }

  fill(255,255,255);
  ellipse(200,300,100,100);
  fill(0,0,0);
  ellipse(mousey,mouseyy,20,20);
    fill(255,255,255);
  ellipse(380,300,100,100);
  fill(0,0,0);
  ellipse(mousey+180,mouseyy,20,20);
  //rect(240,280,90,20);
}
