/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

/*
* <applet code=TileImage width=400 height=345>
* <param name=img value=Lilies.jpg>
* </applet>
*/
import java.applet.*;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
public class TileImage extends Applet {
Image img;
int best=60;
Image cell[] = new Image[best*best];
int iw, ih;
int tw, th;
public void init() {
try {
try {
    URL url = new URL(getCodeBase(), "../../Mario-icon.png");
    img = ImageIO.read(url);
} catch (IOException e) {
        System.out.println("sadasd");
}

MediaTracker t = new MediaTracker(this);
t.addImage(img, 0);
t.waitForID(0);
iw = img.getWidth(null);
ih = img.getHeight(null);
tw = iw / best;
th = ih / best;
CropImageFilter f;
FilteredImageSource fis;
t = new MediaTracker(this);
for (int y=0; y<best; y++) {
for (int x=0; x<best; x++) {
f = new CropImageFilter(tw*x, th*y, tw, th);
fis = new FilteredImageSource(img.getSource(), f);
int i = y*best+x;
cell[i] = createImage(fis);
t.addImage(cell[i], i);
}
}
t.waitForAll();
for (int i=0; i<1; i++) {
int si = (int)(Math.random() * best *best);
int di = (int)(Math.random() * best *best);
Image tmp = cell[si];
cell[si] = cell[di];
cell[di] = tmp;
}
} catch (InterruptedException e) {
System.out.println("Interrupted");
}
}
public void update(Graphics g) {
paint(g);
}
public void paint(Graphics g) {
for (int y=0; y<best; y++) {
for (int x=0; x<best; x++) {
g.drawImage(cell[y*best+x], x * tw, y * th, null);
}
}
}
}

    

