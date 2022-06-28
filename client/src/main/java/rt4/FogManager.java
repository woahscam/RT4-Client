package rt4;

import com.jogamp.opengl.GL2;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class FogManager {

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int anInt3920;

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
	public static int anInt3921;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "F")
	private static float aFloat21;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[4];

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	private static int anInt3919 = -1;

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
	public static int anInt3922 = 13156520;

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "F")
	private static float aFloat19 = -1.0F;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "F")
	private static float aFloat20 = -1.0F;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[F")
	public static final float[] fogColor = new float[4];

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "[F")
	private static final float[] aFloatArray20 = new float[4];

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public static int anInt3923 = 16777215;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	private static int fogOffset = -1;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	private static int fogColorRGB = -1;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "()V")
	public static void method3058() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glLightfv(GL2.GL_LIGHT0, GL2.GL_POSITION, aFloatArray18, 0);
		local1.glLightfv(GL2.GL_LIGHT1, GL2.GL_POSITION, aFloatArray20, 0);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "()F")
	public static float method3059() {
		return aFloat19;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IFFF)V")
	public static void method3060(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		if (anInt3919 == arg0 && aFloat21 == arg1 && aFloat19 == arg2 && aFloat20 == arg3) {
			return;
		}
		anInt3919 = arg0;
		aFloat21 = arg1;
		aFloat19 = arg2;
		aFloat20 = arg3;
		@Pc(25) GL2 local25 = GlRenderer.gl;
		@Pc(34) float local34 = (float) (arg0 >> 16 & 0xFF) / 255.0F;
		@Pc(43) float local43 = (float) (arg0 >> 8 & 0xFF) / 255.0F;
		@Pc(50) float local50 = (float) (arg0 & 0xFF) / 255.0F;
		@Pc(75) float[] local75 = new float[]{arg1 * local34, arg1 * local43, arg1 * local50, 1.0F};
		local25.glLightModelfv(GL2.GL_LIGHT_MODEL_AMBIENT, local75, 0);
		@Pc(105) float[] local105 = new float[]{arg2 * local34, arg2 * local43, arg2 * local50, 1.0F};
		local25.glLightfv(GL2.GL_LIGHT0, GL2.GL_DIFFUSE, local105, 0);
		@Pc(139) float[] local139 = new float[]{-arg3 * local34, -arg3 * local43, -arg3 * local50, 1.0F};
		local25.glLightfv(GL2.GL_LIGHT1, GL2.GL_DIFFUSE, local139, 0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
	public static void method3062(@OriginalArg(0) int color, @OriginalArg(1) int offset) {
		if (fogColorRGB == color && fogOffset == offset) {
			return;
		}
		fogColorRGB = color;
		fogOffset = offset;
		@Pc(12) GL2 gl = GlRenderer.gl;
		fogColor[0] = (float) (color >> 16 & 0xFF) / 255.0F;
		fogColor[1] = (float) (color >> 8 & 0xFF) / 255.0F;
		fogColor[2] = (float) (color & 0xFF) / 255.0F;
		gl.glFogi(GL2.GL_FOG_MODE, GL2.GL_LINEAR);
		gl.glFogf(GL2.GL_FOG_DENSITY, 0.95F);
		gl.glHint(GL2.GL_FOG_HINT, GL2.GL_FASTEST);
		int fogEnd = GlobalConfig.VIEW_DISTANCE;
		@Pc(65) int fogStart = fogEnd - (int) (GlobalConfig.VIEW_FADE_DISTANCE * 2.0f) - offset;
		if (fogStart < 50) {
			fogStart = 50;
		}
		gl.glFogf(GL2.GL_FOG_START, (float) fogStart);
		gl.glFogf(GL2.GL_FOG_END, (float) fogEnd - GlobalConfig.VIEW_FADE_DISTANCE);
		gl.glFogfv(GL2.GL_FOG_COLOR, fogColor, 0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(FFF)V")
	public static void method3063(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		if (aFloatArray18[0] == arg0 && aFloatArray18[1] == arg1 && aFloatArray18[2] == arg2) {
			return;
		}
		aFloatArray18[0] = arg0;
		aFloatArray18[1] = arg1;
		aFloatArray18[2] = arg2;
		aFloatArray20[0] = -arg0;
		aFloatArray20[1] = -arg1;
		aFloatArray20[2] = -arg2;
		anInt3920 = (int) (arg0 * 256.0F / arg1);
		anInt3921 = (int) (arg2 * 256.0F / arg1);
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "()I")
	public static int method3064() {
		return anInt3919;
	}

	@OriginalMember(owner = "client!mk", name = "e", descriptor = "()V")
	public static void method3065() {
		@Pc(1) GL2 local1 = GlRenderer.gl;
		local1.glColorMaterial(GL2.GL_FRONT, GL2.GL_AMBIENT_AND_DIFFUSE);
		local1.glEnable(GL2.GL_COLOR_MATERIAL);
		@Pc(27) float[] local27 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
		local1.glLightfv(GL2.GL_LIGHT0, GL2.GL_AMBIENT, local27, 0);
		local1.glEnable(GL2.GL_LIGHT0);
		@Pc(55) float[] local55 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
		local1.glLightfv(GL2.GL_LIGHT1, GL2.GL_AMBIENT, local55, 0);
		local1.glEnable(GL2.GL_LIGHT1);
		anInt3919 = -1;
		fogColorRGB = -1;
		method3067();
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([F)V")
	public static void method3066(@OriginalArg(0) float[] arg0) {
		if (arg0 == null) {
			arg0 = fogColor;
		}
		@Pc(5) GL2 local5 = GlRenderer.gl;
		local5.glFogfv(GL2.GL_FOG_COLOR, arg0, 0);
	}

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "()V")
	private static void method3067() {
		method3060(anInt3923, 1.1523438F, 0.69921875F, 1.2F);
		method3063(-50.0F, -60.0F, -50.0F);
		method3062(anInt3922, 0);
	}

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "()F")
	public static float method3068() {
		return aFloat21;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
	public static void method3935(@OriginalArg(0) int arg0) {
		method3060(anInt3923, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		method3063(-50.0F, -60.0F, -50.0F);
		method3062(anInt3922, 0);
		method3058();
	}
}
