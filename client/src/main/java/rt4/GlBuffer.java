package rt4;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.nio.ByteBuffer;

@OriginalClass("client!ql")
public final class GlBuffer {

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "Lclient!vi;")
	public GlVertexBufferObject aClass155_4;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
	public ByteBuffer aByteBuffer8;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "Z")
	public boolean valid = false;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	public int anInt4777 = 0;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
	public int anInt4782 = 0;
}
