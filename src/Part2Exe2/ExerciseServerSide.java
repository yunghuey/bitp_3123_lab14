package Part2Exe2;

import java.io.IOException;
import java.math.BigInteger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import serverside.SentenceProcessor;

/***
 * Lab exercise of server-Side application using UDP
 * @author yungh
 *
 */
public class ExerciseServerSide {

	public static void main(String[] args) {
		System.out.println("UDPServerSideApp: Demonstration of UDP Server-Side "
				+ "Application.");
		
		
		// Permissible port for this application
		int portNo = 8083;
		
		try {
			
			// 1. Bind a DatagramSocket's object to a port number
			DatagramSocket datagramSocket = new DatagramSocket(portNo);
			
			// Continually listen for request
			while(true) {
				
				 // 2. Variable to received data from the port
        		// 65535 is the maximum size for UDP packet
                byte[] receivedData = new byte[65535];
          
                // 3. Object represents packet from client
                DatagramPacket receivedPacket = 
                		new DatagramPacket(receivedData, receivedData.length);
                
                // 4. Receive packet
				datagramSocket.receive(receivedPacket);
				
				// 5. Extract data from packet
				receivedData = receivedPacket.getData();
				
				// 6. Further processing
				SentenceProcessing processor = 
						new SentenceProcessing(receivedData);
				String sentence = processor.getSentence();
				System.out.println("\nMessage received: " + sentence + ".\n");
				
				// More processing
				int vowel = processor.countVowels();
				int consonant = processor.countConsonants();
				int punctuation = processor.countPunctuation();
				String message = "\nTotal vowel: " + vowel + "\nTotal consonants: " +
						consonant+ "\nTotal punctuation: " + punctuation;
	            byte[] outData = message.getBytes();
	            
	            // 7. Get the client information
	            InetAddress clientAddress =  receivedPacket.getAddress();
	            int clientPort = receivedPacket.getPort();
	            int sizeOutData = outData.length;
	            
	            // 8. Wrap data into datagram packet
	            DatagramPacket outPacket = new DatagramPacket(outData, 
	            		sizeOutData, clientAddress, clientPort);
	            
	            // 9. Reply to client
	            datagramSocket.send(outPacket);
	            System.out.println("Message sent: " 
	            		+  message + ".\n");
	            
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("UDPClientSideApp: End of program.");
	}
}
