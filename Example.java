import java.util.*;
public class Example{
	
	public static void main (String [] args){
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("|                                                        Salary Information System                                                  |");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------\n\n");
		
		System.out.println("           [1]Calculate Income Tax");
		System.out.println("           [2]Calculate Anual Bonus");
		System.out.println("           [3]Calculate Loan Amount\n");
		
		Scanner input =new Scanner(System.in);
	    System.out.print("Enter an option:");
		int option=input.nextInt();
		
		switch(option){
			
			case  1:{
				System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		        System.out.println("|                                                    Calculate Income Tax                                                 |");
		        System.out.println("---------------------------------------------------------------------------------------------------------------------------\n\n");
				
			    System.out.print("Enter Your Name:");
			    String name=input.next();
			    
			   
			    System.out.print("Enter Your Salary:");
			    double salary=input.nextDouble();
			    
			    if(salary<=100000){
					System.out.println("you don't have to pay income tax");
					
					}
			    
			    else if(100000<salary && salary<=141667){
					
					double tax=(salary-100000)*0.06;
				    System.out.println("you have to pay income Tax per month ="+tax);	
					
					
					}
				else if(141667<salary && salary<=183333){
					
					double tax=((salary-141667)*0.12)+2500;
					  System.out.println("you have to pay income Tax per month ="+tax);
					
					}	
				else if(183333<salary && salary<=225000){
					
					double tax=((salary-183333)*0.18)+7500;
					  System.out.println("you have to pay income Tax per month ="+tax);
					
					}
				else if(225000<salary && salary<=266667){
					double tax=((salary-225000)*0.24)+15000;
					  System.out.println("you have to pay income Tax per month ="+tax);
					}	
					
				else if(266667<salary && salary<=308333){
					double tax=((salary-266667)*0.3)+25000;
					  System.out.println("you have to pay income Tax per month ="+tax);
					}	
					
				else if(308333<salary){
					double tax=((salary-308333)*0.36)+37500;
					  System.out.println("you have to pay income Tax per month ="+tax);
					}				
				
				
				break;
				}
				
			case 2:{
				System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		        System.out.println("|                                                     Calculate Anual Bonus                                               |");
		        System.out.println("---------------------------------------------------------------------------------------------------------------------------\n\n");
				
				System.out.print("Input Employee Name :");
				String name=input.next();
				
				System.out.print("Input Employee Salary :");
			    double salary=input.nextDouble();
			    
			    if (salary<100000){
					System.out.println("Anual Bonus - Rs.5000 :");
					}
				 
			    else if (100000<=salary&&salary<=199999){
					
					double bonus=salary*0.1;
					System.out.println("Anual Bonus -  "+bonus);
					}
				 else if (200000<=salary&&salary<=299999){
					
					double bonus=salary*0.15;
					System.out.println("Anual Bonus -  "+bonus);
					}	
					
				 else if (300000<=salary&&salary<=399999){
					
					double bonus=salary*0.2;
					System.out.println("Anual Bonus -  "+bonus);
					}
					
				 else if (400000<=salary){
					
					double bonus=salary*0.35;
					System.out.println("Anual Bonus -  "+bonus);
					}			
				
				
				
				break;
				}
			
			case 3:{
				System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		        System.out.println("|                                                     Calculate Loan Amount                                               |");
		        System.out.println("---------------------------------------------------------------------------------------------------------------------------\n\n");
				
				System.out.print("Input Employee Name :");
				String name=input.next();
				
				System.out.print("Input Employee Salary :");
				double salary=input.nextDouble();
				
				System.out.print("Enter Number Of years :");
				int years=input.nextInt();
				
				if(salary<50000){
					System.out.print("You cant Get the Loan because your salary less than Rs.50000....");
					break;
					}
				else if(years>5){
					System.out.print("You cant Get the Loan because The maximum number of the year is 5");
						break;
					}	
				else {
					
					double mit=salary*0.6;
					System.out.println(mit);
					int n=years*12;
					System.out.println(n);
					double r= 0.15;
					System.out.println(r);
					double Mrate= r/12;																			
					double power=Math.pow(1+Mrate,n);
				    System.out.println(power);
					//System.out.printf("%.2f",power);
					System.out.println("");
					double loanamount=mit*(1-(1/(power)))/(Mrate);
					
					
					if((loanamount%1000) > 500){
						int a=(int)((loanamount/1000)+1)*1000;
						System.out.println("you can get Loan Amount :"+a);
						}
						
					else{
						
						int a=(int)(loanamount/1000)*1000;
						System.out.println("you can get Loan Amount :"+a);
						}
						
						
					
						
					
		           // System.out.println("you can get Loan Amount : "+loanamount);
		            
					
					}	
				
				
				}		
			
			}

		}
	
	}
