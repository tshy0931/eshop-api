package eshop.api.serdes;

import com.google.protobuf.AbstractMessage;

public interface ProtoBufDeserializer<T> {

    T fromProtoBuf(AbstractMessage message);
}
