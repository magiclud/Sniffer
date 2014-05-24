package tcp;

import net.sourceforge.jpcap.capture.CaptureDeviceNotFoundException;
import net.sourceforge.jpcap.capture.PacketCapture;

public class GetPacket {
	
	    public static void main(String args[]){
	        try {
	           PacketCapture capture = new PacketCapture();
	           String device=capture.findDevice();
	           System.out.println(device);
	        } catch (CaptureDeviceNotFoundException e) {
	           // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

}
