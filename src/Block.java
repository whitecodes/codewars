/**
 * Created by white on 2015/10/10.
 */
public class Block {
    public int width;
    public int length;
    public int height;

    Block(int[] input) {
        this.width = input[0];
        this.length = input[1];
        this.height = input[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return this.width * this.length * this.height;
    }

    public int getSurfaceArea() {
        return 2 * (this.width * this.length + this.width * this.height + this.length * this.height);
    }
}