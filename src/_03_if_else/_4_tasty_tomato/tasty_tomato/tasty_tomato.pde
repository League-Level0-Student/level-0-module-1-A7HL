void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill (#D12A2A);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#73860E);
    rect(176, 103, 12, 32);

  if (mousePressed){
    fill(200,200,200);
    ellipse (75,200,50,50);
  }
}
