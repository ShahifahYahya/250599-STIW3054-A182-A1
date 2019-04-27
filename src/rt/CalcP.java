package rt;

public class CalcP {
	 private static double sactor;
	 private static double avactor;
	 private static double comactor;
	 private static double totactor;
	 
	public CalcP(double sactor,double avactor,double comactor, double totactor)
	{
		 CalcP.sactor=sactor;
		 CalcP.avactor=avactor;
		 CalcP.comactor=comactor;
		 CalcP.totactor=totactor;
	}

	 
	 public static void setSimpleActor(double sactor)
	 {
		 CalcP.sactor=sactor;
	 }
	 
	 public static void setAverageActor(double avactor)
	 {
		 CalcP.avactor=avactor;
	 }
	 
	 public static void setComplexActor(double comactor)
	 {
		 CalcP.comactor=comactor;
	 }
	 
	 public static void setTotalActor(double totactor)
	 {
		 CalcP.totactor=totactor;
	 }
	 
	 public static double getSimpleActor()
	 {
		 return sactor;
	 }
	 
	 public static double getAverageActor()
	 {
		 return avactor;
	 }
	 
	 public static double getComplexActor()
	 {
		 return comactor;
	 }
	 
	 public static double getTotalActor()
	 {
		 return totactor;
	 }
	 
	 public static double cActor(double sactor,double avactor,double comactor)
	 {
		 totactor=(sactor*1)+(avactor*2)+(comactor*3);
		 return totactor;
	 }
	 
	 public static double UUCP (double TAP, double TUC)
		{
			double uacp = TAP + TUC;
			return uacp;
		}
		
		public static double TCF (double Tfactor)
		{
			double cp = (0.01 * Tfactor)+0.6;
			return cp;
		}
		
		public static double SUC (double uacp, double cp)
		{
			double szuc = uacp * cp;
			return szuc;
		}
		
		public static double EF (double Efactor)
		{
			double e = (-0.03 * Efactor)+1.4;
			return e;
		}
		
		public static double UCP (double szuc, double e)
		{
			double usecase = szuc * e;
			return usecase;
		}
		
		public static double ManHour (double usecase)
		{
			double mh = 28 * usecase;
			return mh;
		}
		
		public static double AdjustManHour (double percent, double mh)
		{
			double p = percent / 100 ;
			double admh = (1.0 + p)*mh;
			return admh;
		}
		
		public static double TotalManHour (double amh, double rmh)
		{
			double tmh = amh + rmh;
			return tmh;
		}
		
		public static double Actor (double TAP)
		{
			double t = TAP;
			return t;
		}
		
		public static double UseCase (double TUC)
		{
			double u = TUC;
			return u;
		}
	 
	 
	 
	 
	 
	 
}
