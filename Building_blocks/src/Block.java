
public class Block {


  private int blockWidth;
  private int blockLength;
  private int blockHeight;


  public Block (int [] blockDimensions) {
      this.blockWidth = blockDimensions[0];
      this.blockLength = blockDimensions[1];
      this.blockHeight = blockDimensions[2];
  }

    public int getBlockWidth() {
        return blockWidth;
    }

    public int getBlockLength() {
        return blockLength;
    }

    public int getBlockHeight() {
        return blockHeight;
    }

    public int calculateBlockVolume() {
      return getBlockWidth() * getBlockLength() * getBlockHeight();
    }

    public int calculateSurfaceArea() {
      return ((blockLength * blockHeight) + (blockWidth * blockHeight) + (blockLength * blockWidth)) * 2;
    }
}
