package com.firefly.server.http;

import java.nio.ByteBuffer;

import com.firefly.net.Encoder;
import com.firefly.net.Session;
import com.firefly.net.buffer.FileRegion;

public class SSLEncoder implements Encoder {

	@Override
	public void encode(Object message, Session session) throws Throwable {
		if(message != null) {
			SessionAttachment sessionAttachment = (SessionAttachment)session.getAttachment();
			if (message instanceof ByteBuffer)
				sessionAttachment.sslSession.write((ByteBuffer) message);
			else if (message instanceof FileRegion)
				sessionAttachment.sslSession.transferFileRegion((FileRegion) message);
		}
	}

}
