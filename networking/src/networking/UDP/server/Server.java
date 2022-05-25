package networking.UDP.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Server {

	private static final int INPUT_BUFFER_SIZE = 1024;
	private static final int OUTPUT_BUFFER_SIZE = 1024;

	public static void main(String[] args) {

		int port = 4444;
		try {
			DatagramSocket serverSocket = new DatagramSocket(port);
			System.out.println("Server started on port " + port);

			System.out.println("Server is listening on port " + port);

			// listening to clients

			while (true) {
				// handle data
				byte[] inputBuffer = new byte[INPUT_BUFFER_SIZE];
				DatagramPacket receivedPacket = new DatagramPacket(inputBuffer, INPUT_BUFFER_SIZE);
				// this is a blocking method - we stay here until we get input from client
				serverSocket.receive(receivedPacket);
				// get client address info
				InetAddress clientAddress = receivedPacket.getAddress();
				int clientPort = receivedPacket.getPort();
				// get client msg
				String clientMsg = new String(receivedPacket.getData()).trim();
				// print client msg for debugging purpose
				System.out.println("client " + clientAddress + " sent: " + clientMsg);
				// sending packet back to client
				byte[] myBytes = clientMsg.getBytes();
				DatagramPacket packetToSend = new DatagramPacket(myBytes, myBytes.length, clientAddress, clientPort);
				serverSocket.send(packetToSend);
				System.out.println("Server echo response sent");
			}

		} catch (SocketException e) {
			System.err.println("Server connection failed");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Server failed to connect with client");
			e.printStackTrace();
		}

	}

}