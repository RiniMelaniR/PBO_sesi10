public class Samsung implements Phone {

  int volume;
  boolean isPower;
  
  public Samsung() {
   this.volume = 50;
  }


  public int getVolume() {
    return volume;
  }

  @Override
  public void powerOn() {
    isPower = true;
    System.out.println("HP Menyala");
    System.out.println("Welcome To Samsung Technologies");
  }

  @Override
  public void powerOff() {
    isPower = false;
    System.out.println("Shutting Down");
  }

  @Override
  public void volumeUp() {
    if (isPower) {
      if (volume == this.MAX_VOLUME) {
        System.out.println("Volume is Full 100%");
      } else {
        volume += 5;
        System.out.println("Volume is" + this.getVolume() + "%");
      }

    } else {
      System.out.println("Turn On Your Phone");
    }

  }

  @Override
  public void volumeDown() {
    if (isPower) {
      if (volume == this.MIN_VOLUME) {
        System.out.println("Volume is 0%");
      } else {
        volume -= 5;
        System.out.println("Volume is" + this.getVolume() + "%");
      }
    } else {
      System.out.println("Turn On Your Phone");
    }
  }
}