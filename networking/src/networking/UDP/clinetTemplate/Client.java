package networking.UDP.clinetTemplate;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static Scanner sc = new Scanner(System.in);
	private final int INPUT_BUFFER_SIZE = 1024;
	private int serverPort;
	private int port;
	private String serverName;
	private DatagramSocket clientSocket;

	public Client(int port, int serverPort, String serverName) throws SocketException, UnknownHostException {
		this.port = port;
		this.serverPort = serverPort;
		clientSocket = new DatagramSocket(port);
		this.serverName = serverName;
		System.out.println("Client started on port " + port);
	}

	public void send() {
		String dataToSend = "";
		try {
			do {
				System.out.println("Enter msg to send");
				dataToSend = sc.nextLine();
				// creating datagram
				byte[] msgBytes = dataToSend.getBytes();
				DatagramPacket packetToSend;

				packetToSend = new DatagramPacket(msgBytes, msgBytes.length, InetAddress.getByName(serverName),
						serverPort);

				// sending packet
				clientSocket.send(packetToSend);

			} while (!dataToSend.equals("quit"));
		} catch (UnknownHostException e) {
			System.err.println("Server address not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Client failed to send datagram");
			e.printStackTrace();
		}finally {
			System.out.println("Client disconnected");
			sc.close();
			if (clientSocket != null)
				clientSocket.close();
		}
	}

	public void receive() {
		while (true) {
			try {
				byte[] inputBuffer = new byte[INPUT_BUFFER_SIZE];
				// receive data from server
				DatagramPacket receivePacket = new DatagramPacket(inputBuffer, INPUT_BUFFER_SIZE);
				clientSocket.receive(receivePacket);
				// extract msg from server
				String msg = new String(receivePacket.getData()).trim();
				System.out.println("[SERVER] " + msg);
			} catch (IOException e) {
				System.err.println("Client failed to send datagram");
				e.printStackTrace();
			}finally {
				System.out.println("Client disconnected");
				sc.close();
				if (clientSocket != null)
					clientSocket.close();
			}

		}

	}
	
	public static void main(String[] args) throws SocketException, UnknownHostException {
		
			Client client = new Client(4445, 4444, "localHost");
			client.receive();
			client.send();
		
	}
	
	

}
