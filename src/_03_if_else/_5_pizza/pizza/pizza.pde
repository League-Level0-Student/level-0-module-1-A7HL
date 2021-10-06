
void setup() {
 size(500,500);
}
void draw() {
  fill (#D6A961);
    ellipse (250,250, 270, 270);
   fill (#D6311E);
     ellipse (250,249, 242,243);
   fill (#FAF190);
     ellipse (251,250, 232,236);
 
 PImage pepperoni;
 pepperoni = loadImage ("pepperoni.png");
 pepperoni.resize (75,75);
 image (pepperoni, 150, 175);
 image (pepperoni, 250, 250);
 image (pepperoni, 250, 250);
 image (pepperoni, 170, 290);
 image (pepperoni, 280, 160);
 image (pepperoni, 200, 200);
 //I dont want to spend an hour doing a reduntant task of changing values
 //and copy and pasting the same lines pf  code, so you get a boring pepperoni pizza.
 
}
