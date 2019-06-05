import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import hype.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class hypeShapes extends PApplet {



public void setup() {
	
	H.init(this).background(0xff242424);

// ************************************************************************************ ROW 1

	HRect s1 = new HRect(100);
	s1.noStroke().fill(0xffECECEC).loc(50,50);
	H.add(s1);

	HRect s2 = new HRect(100);
	s2.rounding(10).noStroke().fill(0xffECECEC).loc(200,50);
	H.add(s2);

	HRect s3 = new HRect(100);
	s3.rounding(10).noStroke().fill(0xffECECEC).anchorAt(H.CENTER).rotation(45).loc(400,100);
	H.add(s3);

	HRect s4 = new HRect(100);
	s4.rounding(10).noStroke().fill(236).loc(500,50);
	H.add(s4);

// ************************************************************************************ ROW 2

	HRect s5 = new HRect();
	s5.rounding(10).noStroke().fill(0xffECECEC).size(50, 100).loc(50,200);
	H.add(s5);

	HRect s6 = new HRect();
	s6.rounding(10).strokeWeight(3).stroke(0xff666666).fill(0xffECECEC).size(150, 100).loc(150,200);
	H.add(s6);

	HRect s7 = new HRect(100);
	s7.rounding(10).noStroke().fill(0xffECECEC).loc(350,200).visibility(false);
	H.add(s7);

	HRect s8 = new HRect(100);
	s8.rounding(10).noStroke().fill(255, 51, 0).loc(500,200);
	H.add(s8);

// ************************************************************************************ ROW 3

	HRect s9 = new HRect(100);
	s9.rounding(10).strokeWeight(6).stroke(0xff000000).fill(0xffECECEC).alpha(100).loc(50,350);
	H.add(s9);

	HRect s10 = new HRect(100);
	s10.rounding(10).strokeWeight(6).stroke(0xff000000, 150).fill(0xffECECEC, 50).loc(200,350);
	H.add(s10);

	HRect s11 = new HRect(100);
	s11.rounding(10).strokeWeight(6).stroke(0xff000000, 100).fill(0xffECECEC).loc(350,350);
	H.add(s11);

	HRect s12 = new HRect(100);
	s12.rounding(10).noStroke().fill(0xffFF6600).loc(500,350);
	H.add(s12);

// ************************************************************************************ ROW 4

	HRect s13 = new HRect(100);
	s13.rounding(10).strokeWeight(6).stroke(0xffECECEC).noFill().loc(50,500);
	H.add(s13);

	HEllipse s14 = new HEllipse(50);
	s14.noStroke().fill(0xffECECEC).loc(200,500);
	H.add(s14);

	HEllipse s15 = new HEllipse(50);
	s15.stroke(0xffECECEC).noFill().loc(350,500);
	H.add(s15);

	HRect s16 = new HRect(100);
	s16.rounding(10).noStroke().fill(0xFFFF9900).loc(500,500);
	H.add(s16);

	H.drawStage();
	noLoop();
}

public void draw() {

}
  public void settings() { 	size(640,640); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "hypeShapes" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
