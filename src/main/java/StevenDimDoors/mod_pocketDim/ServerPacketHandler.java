package StevenDimDoors.mod_pocketDim;

public class ServerPacketHandler
{

	//TODO 1.7
	/*
	public ServerPacketHandler()
	{
		PocketManager.registerDimWatcher(new DimWatcher());
		PocketManager.registerLinkWatcher(new LinkWatcher());
	}
	
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) { }
	
	private static class DimWatcher implements IUpdateWatcher<ClientDimData>
	{
		@Override
		public void onCreated(ClientDimData message)
		{
			sendDimPacket(PacketConstants.CREATE_DIM_PACKET_ID, message);
		}

		@Override
		public void onDeleted(ClientDimData message)
		{
			sendDimPacket(PacketConstants.DELETE_DIM_PACKET_ID, message);
		}

		@Override
		public void update(ClientDimData message)
		{
			// TODO Auto-generated method stub
			
		}	
	}
	
	private static class LinkWatcher implements IUpdateWatcher<ClientLinkData>
	{
		@Override
		public void onCreated(ClientLinkData message)
		{
			sendLinkPacket(PacketConstants.CREATE_LINK_PACKET_ID, message);
		}

		@Override
		public void onDeleted(ClientLinkData message)
		{
			sendLinkPacket(PacketConstants.DELETE_LINK_PACKET_ID, message);
		}

		@Override
		public void update(ClientLinkData message)
		{
			sendLinkPacket(PacketConstants.UPDATE_LINK_PACKET_ID, message);
		}
	}
	
	public static Packet250CustomPayload createLinkPacket(ClientLinkData data)
	{
		try
		{
			Packet250CustomPayload packet = new Packet250CustomPayload();
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			DataOutputStream writer = new DataOutputStream(buffer);
			writer.writeByte(PacketConstants.CREATE_LINK_PACKET_ID);
			data.write(writer);
			writer.close();
			packet.channel = PacketConstants.CHANNEL_NAME;
			packet.data = buffer.toByteArray();
			packet.length = packet.data.length;
			return packet;
		}
		catch (IOException e)
		{
			//This shouldn't happen...
			e.printStackTrace();
			return null;
		}
		
		
	}

	
	private static void sendDimPacket(byte id, ClientDimData data)
	{
		try
		{
			Packet250CustomPayload packet = new Packet250CustomPayload();
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			DataOutputStream writer = new DataOutputStream(buffer);
			writer.writeByte(id);
			data.write(writer);
			writer.close();
			packet.channel = PacketConstants.CHANNEL_NAME;
			packet.data = buffer.toByteArray();
			packet.length = packet.data.length;
			PacketDispatcher.sendPacketToAllPlayers(packet);
		}
		catch (IOException e)
		{
			//This shouldn't happen...
			e.printStackTrace();
		}
	}
	
	private static void sendLinkPacket(byte id, ClientLinkData message)
	{
		try
		{
			Packet250CustomPayload packet = new Packet250CustomPayload();
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			DataOutputStream writer = new DataOutputStream(buffer);
			writer.writeByte(id);
			message.write(writer);
			writer.close();
			packet.channel = PacketConstants.CHANNEL_NAME;
			packet.data = buffer.toByteArray();
			packet.length = packet.data.length;
			PacketDispatcher.sendPacketToAllPlayers(packet);
		}
		catch (IOException e)
		{
			//This shouldn't happen...
			e.printStackTrace();
		}
	}
	*/
}
