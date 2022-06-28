package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class DateUtil {

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "Ljava/util/Calendar;")
	public static final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	@OriginalMember(owner = "client!fn", name = "Z", descriptor = "Lclient!na;")
	public static final JagString aClass100_461 = JagString.parse(")1 ");
	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Lclient!na;")
	public static final JagString aClass100_1089 = JagString.parse(")2");
	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Lclient!na;")
	public static final JagString SPACE = JagString.parse(" ");
	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!na;")
	public static final JagString COLON = JagString.parse(":");
	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!na;")
	public static final JagString TIMEZONE = JagString.parse(" GMT");

	@OriginalMember(owner = "client!km", name = "tc", descriptor = "Lclient!na;")
	private static final JagString DEC = JagString.parse("Dec");

	@OriginalMember(owner = "client!km", name = "vc", descriptor = "Lclient!na;")
	private static final JagString JUL = JagString.parse("Jul");

	@OriginalMember(owner = "client!km", name = "xc", descriptor = "Lclient!na;")
	private static final JagString MAY = JagString.parse("May");

	@OriginalMember(owner = "client!km", name = "yc", descriptor = "Lclient!na;")
	private static final JagString NOV = JagString.parse("Nov");

	@OriginalMember(owner = "client!km", name = "zc", descriptor = "Lclient!na;")
	private static final JagString MAR = JagString.parse("Mar");

	@OriginalMember(owner = "client!km", name = "Gc", descriptor = "Lclient!na;")
	private static final JagString JAN = JagString.parse("Jan");

	@OriginalMember(owner = "client!km", name = "Hc", descriptor = "Lclient!na;")
	private static final JagString FEB = JagString.parse("Feb");

	@OriginalMember(owner = "client!km", name = "Tc", descriptor = "Lclient!na;")
	private static final JagString APR = JagString.parse("Apr");

	@OriginalMember(owner = "client!km", name = "Wc", descriptor = "Lclient!na;")
	private static final JagString JUN = JagString.parse("Jun");

	@OriginalMember(owner = "client!km", name = "Qc", descriptor = "Lclient!na;")
	private static final JagString AUG = JagString.parse("Aug");

	@OriginalMember(owner = "client!km", name = "cd", descriptor = "Lclient!na;")
	private static final JagString SEP = JagString.parse("Sep");

	@OriginalMember(owner = "client!km", name = "dd", descriptor = "Lclient!na;")
	private static final JagString OCT = JagString.parse("Oct");

	@OriginalMember(owner = "client!km", name = "Ac", descriptor = "[Lclient!na;")
	public static final JagString[] MONTHS = new JagString[]{JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
	@OriginalMember(owner = "client!rl", name = "T", descriptor = "Lclient!na;")
	private static final JagString SAT = JagString.parse("Sat");
	@OriginalMember(owner = "client!rl", name = "U", descriptor = "Lclient!na;")
	private static final JagString MON = JagString.parse("Mon");
	@OriginalMember(owner = "client!rl", name = "W", descriptor = "Lclient!na;")
	private static final JagString FRI = JagString.parse("Fri");
	@OriginalMember(owner = "client!rl", name = "db", descriptor = "Lclient!na;")
	private static final JagString SUN = JagString.parse("Sun");
	@OriginalMember(owner = "client!rl", name = "cb", descriptor = "Lclient!na;")
	private static final JagString TUE = JagString.parse("Tue");
	@OriginalMember(owner = "client!rl", name = "ab", descriptor = "Lclient!na;")
	private static final JagString WED = JagString.parse("Wed");
	@OriginalMember(owner = "client!rl", name = "bb", descriptor = "Lclient!na;")
	private static final JagString THU = JagString.parse("Thu");
	@OriginalMember(owner = "client!rl", name = "Y", descriptor = "[Lclient!na;")
	public static final JagString[] DAYS = new JagString[]{SUN, MON, TUE, WED, THU, FRI, SAT};

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(JB)Lclient!na;")
	public static JagString getDateString(@OriginalArg(0) long date) {
		calendar.setTime(new Date(date));
		@Pc(13) int local13 = calendar.get(Calendar.DAY_OF_WEEK);
		@Pc(17) int local17 = calendar.get(Calendar.DATE);
		@Pc(21) int local21 = calendar.get(Calendar.MONTH);
		@Pc(32) int local32 = calendar.get(Calendar.YEAR);
		@Pc(36) int local36 = calendar.get(Calendar.HOUR_OF_DAY);
		@Pc(40) int local40 = calendar.get(Calendar.MINUTE);
		@Pc(44) int local44 = calendar.get(Calendar.SECOND);
		return JagString.concatenate(new JagString[]{DAYS[local13 - 1], aClass100_461, JagString.parseInt(local17 / 10), JagString.parseInt(local17 % 10), aClass100_1089, MONTHS[local21], aClass100_1089, JagString.parseInt(local32), SPACE, JagString.parseInt(local36 / 10), JagString.parseInt(local36 % 10), COLON, JagString.parseInt(local40 / 10), JagString.parseInt(local40 % 10), COLON, JagString.parseInt(local44 / 10), JagString.parseInt(local44 % 10), TIMEZONE});
	}
}
