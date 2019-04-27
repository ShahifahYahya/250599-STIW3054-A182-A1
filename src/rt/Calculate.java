package rt;

import java.util.*;

public class Calculate extends CalcP {
	
	public Calculate(double sactor, double avactor, double comactor, double totactor) {
		super(sactor, avactor, comactor, totactor);
		// TODO Auto-generated constructor stub
	}


	@SuppressWarnings("unused")
	public static void main(String[]args)
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		//CalcP x =new CalcP();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("           Software Effort Estimation Calculator             ");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("______________________________________________________________");
		System.out.println("----------Weighting Actors for Complexity---------------------");
		System.out.println("______________________________________________________________");
		System.out.println("Simple "+":"+"Defined API                             \t\t"+":");
		double sactor=scan.nextDouble();
		CalcP.getSimpleActor();
		System.out.println("Average "+":"+"Interactive or Protocol driven interface\t\t"+":");
		double avactor=scan.nextDouble();
		CalcP.getAverageActor();
		System.out.println("Average "+":"+"Graphical User interface                 \t\t"+":");
		double comactor=scan.nextDouble();
		CalcP.getComplexActor();
		
		CalcP.cActor(sactor,avactor,comactor);
		double TAP=CalcP.getTotalActor();
		
		System.out.println("...............................................................");
		System.out.printf("  Total Actor Points :%.2f ",TAP);
		
		System.out.println(""); System.out.println("");
		System.out.println("                                        Weighting Use Cases For Complexity                                ");
		System.out.println("      *************************************************************************************************** ");
		System.out.println("");
		System.out.println("        Please Insert the Quantity of Use Case                                                            ");
		System.out.println("      --------------------------------------------------------------------------------------------------- ");
		System.out.print  ("        Actor Type = Simple  : 3 Or Least Transaction                             : ");
		double simple1 = scan.nextDouble()*5;
		System.out.println("");
		System.out.print  ("        Actor Type = Average : 4 To 7 Transactions                                : ");
		double average1 = scan.nextDouble()*10;
		System.out.println("");
		System.out.print  ("        Actor Type = Complex : Greater Than 7 Transaction                         : ");
		double complex1 = scan.nextDouble()*15;
		System.out.println("      --------------------------------------------------------------------------------------------------- ");
		double TUC = simple1 + average1 + complex1;
		double u = UseCase(TUC);
		System.out.printf("        Total Use Cases                        : %.2f  \n ",u);
		System.out.println("      --------------------------------------------------------------------------------------------------- ");
		double uacp = UUCP(TAP,TUC);
		System.out.printf("        Unadjusted Use Case Point (UUCP)       : %.2f  \n ",uacp);
		System.out.println("      ................................................................................................... ");
		System.out.println(""); System.out.println("");
		System.out.println("                                            Weighting Technical Factors                                   ");
		System.out.println("      *************************************************************************************************** ");
		System.out.println("");
		System.out.println("        Please Insert The Quantity of Weight Factor                                                      ");
		System.out.println("      -------------------------------------------------------------------------------------------------- ");
		System.out.print  ("        [T1 ] Must have distributed solution                                        : ");
		double t1 = scan.nextDouble()*5;
		System.out.print  ("        [T2 ] Must respond to the specific performance objectives                       : ");
		double t2 = scan.nextDouble()*3;
		System.out.print  ("        [T3 ] Must meet end-user efficiency desires                                 : ");
		double t3 = scan.nextDouble()*5;
		System.out.print  ("        [T4 ] Complex internal processing                                           : ");
		double t4 = scan.nextDouble()*5;
		System.out.print  ("        [T5 ] Code must be reusable                                                 : ");
		double t5 = scan.nextDouble()*3;
		System.out.print  ("        [T6 ] Must be easy to install                                               : ");
		double t6 = scan.nextDouble()*3;
		System.out.print  ("        [T7 ] Must be easy to use                                                   : ");
		double t7 = scan.nextDouble()*3;
		System.out.print  ("        [T8 ] Must be portable                                                      : ");
		double t8 = scan.nextDouble()*0;
		System.out.print  ("        [T9 ] Must be easy to change                                                : ");
		double t9 = scan.nextDouble()*5;
		System.out.print  ("        [T10] Must allow concurrent users                                           : ");
		double t10 = scan.nextDouble()*0;
		System.out.print  ("        [T11] Includes special security features                                    : ");
		double t11 = scan.nextDouble()*5;
		System.out.print  ("        [T12] Must provide direct access for 3rd parties                            : ");
		double t12 = scan.nextDouble()*0;
		System.out.print  ("        [T13] Requires special user training facilities                             : ");
		double t13 = scan.nextDouble()*3;
		double Tfactor = t1 + t2 +t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10 + t11 + t12 + t13 ;
		System.out.println("      --------------------------------------------------------------------------------------------------- ");
		System.out.printf("        Total Tfactor                           : %.2f  \n ",Tfactor);
		System.out.println("      ----------------------------------------------------------------------------------------------------");
		double cp = TCF(Tfactor);
		System.out.printf("        Technical Complexity Factor (TCF)       : %.2f  \n ",cp);
		double szuc = SUC(uacp,cp);
		System.out.printf("        Size of the software (use case) [SUC]  : %.2f  \n ",szuc);
		System.out.println("      ................................................................................................... ");
		System.out.println(""); System.out.println("");
		System.out.println("                                           Weighting Experience Factors                                   ");
		System.out.println("      *************************************************************************************************** ");
		System.out.println("");
		System.out.println("        Please Insert The Quantity of Weight Factor                                                       ");
		System.out.println("      --------------------------------------------------------------------------------------------------- ");
		System.out.print  ("        [E1 ] Familiar with FPT software process                                    : ");
		double e1 = scan.nextDouble()*4;
		System.out.print  ("        [E2 ] Application experience                                                : ");
		double e2 = scan.nextDouble()*2;
		System.out.print  ("        [E3 ] Paradigm experience (OO)                                              : ");
		double e3 = scan.nextDouble()*4;
		System.out.print  ("        [E4 ] Lead analyst capability                                               : ");
		double e4 = scan.nextDouble()*4;
		System.out.print  ("        [E5 ] Motivation                                                            : ");
		double e5 = scan.nextDouble()*4;
		System.out.print  ("        [E6 ] Stable Requirements                                                   : ");
		double e6 = scan.nextDouble()*2;
		System.out.print  ("        [E7 ] Part-time workers                                                     : ");
		double e7 = scan.nextDouble()*0;
		System.out.print  ("        [E8 ] Difficulty of programming language                                    : ");
		double e8 = scan.nextDouble()*3;
		double Efactor = e1 + e2 + e3 + e4 + e5 + e6 + e7 + e8 ;
		System.out.println("     ---------------------------------------------------------------------------------------------------- ");
		System.out.printf("        Total Tfactor                : %.2f  \n ",Efactor);
		System.out.println("     ---------------------------------------------------------------------------------------------------- ");
		double e = EF(Efactor);
		System.out.printf("        Experience Factor (EF)       : %.2f  \n ",e);
		double usecase = UCP(szuc,e);
		System.out.printf("        Use Case Points (UCP)        : %.2f  \n ",usecase);
		System.out.println("      ----------------------------------------------------------------------------------------------------");
		System.out.println(""); System.out.println("");
		System.out.println("                                                 Man-Hours from UCP                                       ");
		System.out.println("      *************************************************************************************************** ");
		System.out.println("");
		double mh = ManHour(usecase);
		System.out.println("      --------------------------------------------------------------------------------------------------- ");
		System.out.printf("        Total Man-Hours From UCP              : %.2f  \n ",mh);
		System.out.println("     --------------------------------------------------------------------------------------------------- ");
		System.out.println(""); System.out.println("");
		System.out.println("                                       Adjusting Man-Hours for Risk                                       ");
		System.out.println("      *************************************************************************************************** ");
		System.out.println("");
		System.out.println("        Please Insert Percentage                                                     ");
		System.out.println("     ----------------------------------------------------------------------------------------------------- ");
		System.out.print  ("         Increase estimate for a new reuse effort                                   : ");
		double percent = scan.nextDouble();
		double admh = AdjustManHour(percent,mh);
		System.out.println("      ................................................................................................... ");
		System.out.printf("        Adjusted Man-Hours                    : %.2f  \n",admh );
		System.out.println("      ................................................................................................... ");
		System.out.println(""); System.out.println("");
		System.out.println("                                            Estimating For Reports                                        ");
		System.out.println("      *************************************************************************************************** ");
		System.out.println("");
		System.out.println("        Please Insert Quantity of Estimate Man-Hour                                                       ");
		System.out.println("     ---------------------------------------------------------------------------------------------------- ");
		System.out.print  ("        Report Type = Simple                    : ");
		double rspl = scan.nextDouble()*12;
		System.out.println("");
		System.out.print  ("        Report Type = Average                   : ");
		double ravrg = scan.nextDouble()*20;
		System.out.println("");
		System.out.print  ("        Report Type = Complex                   : ");
		double rc = scan.nextDouble()*40;
		System.out.println("      ---------------------------------------------------------------------------------------------------- ");
		double rmh = rspl + rspl + rc;
		System.out.printf("        Total Report For Man Hours Estimate        : %.2f  \n ",rspl,rspl,rc,rmh);
		System.out.println("      ................................................................................................... ");
		double tmh = TotalManHour(admh,rmh);
		System.out.printf("        Total Man Hours                       : %.2f  \n ",tmh);
		System.out.println("      ................................................................................................... ");
		
	}

		
		
		
	}


