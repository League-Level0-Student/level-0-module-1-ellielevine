PImage pepperoni;
PImage mushroom;
PImage olive;
void setup() {
 size(500, 500);
 background(200, 200, 200);
 noStroke();
  fill(#CBB454);
  ellipse(250, 250, 450, 450);
  fill(200, 0, 0);
  ellipse(250, 250, 400, 400);
  fill(#EAE007);
  ellipse(250, 250, 380, 380);
pepperoni = loadImage("pepperoni.png");
mushroom= loadImage("mushroom.png");
 olive = loadImage("olive.png");
     olive.resize(30, 30);
}
void draw() {
  if(mousePressed) {
  image(pepperoni, 200, 200);
  image(pepperoni, 300, 150);
  image(pepperoni, 270, 320);
  image(mushroom, 300, 250);
  image(mushroom, 100, 150);
  image(mushroom, 150, 300);
    image(olive, 100, 300);
   image(olive, 200, 250);
   image(olive, 300, 400);
   image(olive, 250, 100);
  }
}
