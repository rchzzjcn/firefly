package com.firefly.utils.json.serializer;

import java.io.IOException;

import com.firefly.utils.json.JsonWriter;
import com.firefly.utils.json.Serializer;

public class DynamicObjectSerializer implements Serializer {

	@Override
	public void convertTo(JsonWriter writer, Object obj) throws IOException {
		SerialStateMachine.toJson(obj, writer);
	}

}
