public class Land{
  private int width;
  private int length;


  public Land(int width, int length){
      this.width = width;
      this.length = length;
  }

  public int getWidth(){
      return this.width;
  }

  public int getLength(){
      return this.length;
  }

  public int getArea(){
      return this.width*this.length;
  }

  @Override
  public boolean equals(Object obj){
    if (!(obj instanceof Land)) {
      return false;
    }

    Land land = (Land) obj;
      return this.getArea() == land.getArea();
  }

}
