package networking.UDP.clinet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	private static final int INPUT_BUFFER_SIZE = 1024;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String serverName = "localhost";
		int serverPort = 4444;
		int port = 4445;
		DatagramSocket clientSocket = null;
		try {
			// creating client socket
			clientSocket = new DatagramSocket(port);
			System.out.println("Client started on port "+port);
			String dataToSend = "";
			do {
			// creating data 
			System.out.println("Enter msg to send");
			 dataToSend = sc.nextLine();
			// creating datagram
			byte[] msgBytes = dataToSend.getBytes();
			DatagramPacket packetToSend = new DatagramPacket(msgBytes, msgBytes.length, InetAddress.getByName(serverName), serverPort);
			// sending packet
			clientSocket.send(packetToSend);
			// prepare packet for receiving data
			byte[] buffer = new byte[INPUT_BUFFER_SIZE];
			DatagramPacket receivedPacket = new DatagramPacket(buffer, INPUT_BUFFER_SIZE);
			// receive data from server
			clientSocket.receive(receivedPacket);
			// extract msg from server
			String serverMsg = new String(receivedPacket.getData()).trim();
			System.out.println("Server response: "+serverMsg);
			} while (!dataToSend.equals("quit"));
			
		} catch (SocketException e) {
			System.err.println("Client socket creation failed");
			e.printStackTrace();
		} catch (UnknownHostException e) {
			System.err.println("Server address not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Client failed to send datagram");
			e.printStackTrace();
		} finally {
			System.out.println("Client disconnected");
			sc.close();
			if (clientSocket != null)
				clientSocket.close();
		}

	}

}