package projectoFinal;

import java.io.IOException;

import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.io.i2c.I2CFactory.UnsupportedBusNumberException;




public class Main {

	public static void main(String[] args) throws UnsupportedBusNumberException, IOException {
		final I2CBus bus = I2CFactory.getInstance(I2CBus.BUS_1);
		I2CDevice arduino = bus.getDevice(0x04);
		byte b;
		b=1;
		arduino.write(b);
		int leido;
		leido=arduino.read();
		System.out.println("Recibido: "+leido);
		
		
		

	}

}
