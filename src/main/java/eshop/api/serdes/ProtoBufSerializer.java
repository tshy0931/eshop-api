package eshop.api.serdes;

import com.google.protobuf.AbstractMessage;

public interface ProtoBufSerializer<T> {

    AbstractMessage toProtoBuf(T t);
}
