
void setup() {
    size(750,750);
     fill(243, 192, 107);
  ellipse(375,375,750,750);
  fill(255,75,75);
  ellipse(375,375,650,650);
  fill(#F0EC72);
  ellipse(375,375,625,625);
}
void draw() {
PImage mushroom;
mushroom = loadImage("mushroom.png");
mushroom.resize(100,60);
image(mushroom,345,365);
image(mushroom,242,535);
image(mushroom,323,285);
image(mushroom,384,261);
image(mushroom,183,198);
}
