package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)Lclient!rk;")
	public static Font method799(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(27) Font local27;
		if (GlRenderer.enabled) {
			local27 = new GlFont(arg0, SpriteLoader.xOffsets, SpriteLoader.yOffsets, SpriteLoader.innerWidths, SpriteLoader.innerHeights, SpriteLoader.pixels);
		} else {
			local27 = new SoftwareFont(arg0, SpriteLoader.xOffsets, SpriteLoader.yOffsets, SpriteLoader.innerWidths, SpriteLoader.innerHeights, SpriteLoader.pixels);
		}
		SpriteLoader.clear();
		return local27;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class3_Sub7 local9 = null;
		for (@Pc(14) Class3_Sub7 local14 = (Class3_Sub7) Static26.aClass69_27.method2289(); local14 != null; local14 = (Class3_Sub7) Static26.aClass69_27.method2288()) {
			if (local14.anInt918 == arg0 && arg3 == local14.anInt928 && local14.anInt916 == arg1 && arg6 == local14.anInt927) {
				local9 = local14;
				break;
			}
		}
		if (local9 == null) {
			local9 = new Class3_Sub7();
			local9.anInt928 = arg3;
			local9.anInt916 = arg1;
			local9.anInt918 = arg0;
			local9.anInt927 = arg6;
			Static226.method3898(local9);
			Static26.aClass69_27.addTail(local9);
		}
		local9.anInt926 = arg7;
		local9.anInt925 = arg8;
		local9.anInt924 = arg4;
		local9.anInt929 = arg5;
		local9.anInt922 = arg2;
	}

}