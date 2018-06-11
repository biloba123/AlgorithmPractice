package DP_EX;


/**
 * 一句话功能描述
 * 功能详细描述
 *
 * @author Lv Qingyang
 * @date 2018/6/4
 * @email biloba12345@gamil.com
 * @github https://github.com/biloba123
 * @blog https://biloba123.github.io/
 * @see
 * @since
 */
public class FacadeTest {
    public static void main(String[] args) {
        SecurityFacade securityFacade=new SecurityFacade();
        securityFacade.activate();
        securityFacade.deactivate();

    }
}

class Camera{
    public void turnOn(){
        System.out.println("Turning on the camera");
    }

    public void turnOff(){
        System.out.println("Turning off the camera");
    }

    public void rotate(int degress){
        System.out.println("Rotating the camera by "+degress+" degress");
    }
}

class Light{
    public void turnOn(){
        System.out.println("Turning on the light");
    }

    public void turnOff(){
        System.out.println("Turning off the light");
    }

    public void changeBulb(){
        System.out.println("Change the light-bulb");
    }
}

class Sensor{
    public void activate(){
        System.out.println("activate the sensor");
    }

    public void deactivate(){
        System.out.println("deactivate the sensor");
    }

    public void trigger(){
        System.out.println("the sensor has triggered");
    }
}

class Alarm{
    public void activate(){
        System.out.println("activate the alarm");
    }

    public void deactivate(){
        System.out.println("deactivate the alarm");
    }

    public void stopRing(){
        System.out.println("the alarm stop ring");
    }
}

class SecurityFacade {
    private Camera mCamera;
    private Light mLight;
    private Sensor mSensor;
    private Alarm mAlarm;

    public SecurityFacade() {
        mCamera = new Camera();
        mLight = new Light();
        mSensor = new Sensor();
        mAlarm = new Alarm();
    }

    public void activate() {
        mCamera.turnOn();
        mLight.turnOn();
        mSensor.activate();
        mAlarm.activate();
    }

    public void deactivate() {
        mCamera.turnOff();
        mLight.turnOff();
        mSensor.deactivate();
        mAlarm.deactivate();
    }
}
