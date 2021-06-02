
void setup() {
PImage face = loadImage("download-1.png");
size(600,750);  
face.resize(600,750);
image(face,0,0);

}
void draw() {
  noStroke();
fill(255,0,0);
ellipse(170,248,105,98);
ellipse(418,228,105,98);
fill(mouseX,mouseY,0);
ellipse(170,248,105/2,98/2);
ellipse(418,228,105/2,98/2);
}
