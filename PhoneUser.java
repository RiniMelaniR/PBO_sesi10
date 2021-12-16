/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rini Melani R
 */
public class PhoneUser{

  Phone phone;
  
  public PhoneUser(Phone phone){
    this.phone = phone;
  }
  
  void turnOn(){
    phone.powerOn();
  }
  
  void turnOff(){
    phone.powerOff();
  }
  
  void makeFullVolume(){
    phone.volumeUp();
  }
  
  void makeSilentVolume(){
    phone.volumeDown();
  }
}