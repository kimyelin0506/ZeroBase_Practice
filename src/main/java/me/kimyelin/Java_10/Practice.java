package me.kimyelin.Java_10;// Practice
// 아래 Device 추상 클래스를 이용하여
// UsbPort1 클래스와 WiFi 클래스를 자유롭게 구현해보세요.

abstract class Device {
    int deviceId;

    abstract void deviceInfo();
    abstract void connect();
    abstract void disconnect();
    abstract void send();
    abstract void receive();
}

// UsbPort1 클래스
class UsbPort1 extends Device{

    UsbPort1(int id){
        this.deviceId = id;
    }
    @Override
    void deviceInfo() {
        System.out.println("UsbPort1 id: "+ this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("UsbPort1 id: "+ this.deviceId +" - connect");
    }

    @Override
    void disconnect() {
        System.out.println("UsbPort1 id: "+ this.deviceId+" - disconnect");
    }

    @Override
    void send() {
        System.out.println("UsbPort1 id: "+ this.deviceId+" - send");
    }

    @Override
    void receive() {
        System.out.println("UsbPort1 id: "+ this.deviceId+" - receive");
    }
}

// WiFi 클래스
class WiFi extends Device{

    WiFi(int id){
        this.deviceId = id;
    }
    @Override
    void deviceInfo() {
        System.out.println("Wifi id: "+ this.deviceId);
    }

    @Override
    void connect() {
        System.out.println("Wifi id: "+ this.deviceId +" - connect");
    }

    @Override
    void disconnect() {
        System.out.println("Wifi id: "+ this.deviceId+" - disconnect");
    }

    @Override
    void send() {
        System.out.println("Wifi id: "+ this.deviceId+" - send");
    }

    @Override
    void receive() {
        System.out.println("Wifi id: "+ this.deviceId+" - receive");
    }
}

public class Practice {

    public static void main(String[] args) {
        // Test code
        UsbPort1 usb1 = new UsbPort1(1);
        WiFi wifi = new WiFi(0);

        Device[] devices = {usb1, wifi};
        for(Device item : devices){
            item.deviceInfo();
            item.disconnect();
            item.connect();
            item.send();
            item.receive();
            System.out.println("----");
        }
    }

}
