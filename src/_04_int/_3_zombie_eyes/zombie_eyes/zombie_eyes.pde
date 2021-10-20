
void setup() {
size (1200,675);
}
void draw() {
PImage tanjiro;
tanjiro= loadImage ("notAWeeb.jpg");
background (tanjiro);

println(mouseX+" "+mouseY);
fill(mouseX, 34, mouseY);
ellipse (514, 221, 129, 138);
ellipse (690, 248, 132, 136);

fill(#24252C);
ellipse (496,194, 10,11);
ellipse (688,223, 10,11);
}
