import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner.*;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int volta = 1;
		double dasfinal = 0;
		while (volta >= 1){
		System.out.println("\n .-.-.-.-. CALCULADORA SIMPLES NACIONAL 2018 .-.-.-.-.");
		System.out.println("\nIndique o Anexo do cliente: \n 1- Anexo I \n 2- Anexo II \n 3- Anexo III \n 4- Anexo IV \n 5- Anexo V \n");
		int anexo = sc.nextInt();
		if(anexo > 5 || anexo < 1){
		    System.out.println("\nAnexo não encontrado");
		    return;
		}
	
		System.out.println("\nDigite a receita dos ultimos 12 meses: ");
		double rbt12 = sc.nextDouble();
		double por100 = 0;
		double mensal = 0;
		System.out.println("\n");
		System.out.println("Digite o valor da receita do mês: ");
		mensal = sc.nextDouble();
		System.out.println("\n");
		if( anexo == 1){
			por100 = anexo1(rbt12);
			System.out.println("Sua aliquota é: " + por100*100 + "\nO valor do DAS é: R$ " + por100*mensal);
		}else if( anexo == 2){
			por100 = anexo2(rbt12);
			System.out.println("Sua aliquota é: " + por100*100 + "\nO valor do DAS é: R$ " + por100*mensal);
		}else if( anexo == 3){
			por100 = anexo3(rbt12);
			System.out.println("Sua aliquota é: " + por100*100 + "\nO valor do DAS é: R$ " + por100*mensal);
		}else if( anexo ==4){
			por100 = anexo4(rbt12);
			System.out.println("Digite o valor da receita do mês: ");
			System.out.println("Sua aliquota é: " + por100*100 + "\nO valor do DAS é: R$ " + por100*mensal);
		}else if( anexo == 5){
			System.out.println("Digite o valor dos encargos (ex: 0.15)");
			double encargos = sc.nextDouble();
			System.out.println("\n");
			if (encargos >= 0.28){
				por100 = anexo3(rbt12);
				System.out.println("Sua aliquota é: " + por100*100 + "\nO valor do DAS é: R$ " + por100*mensal);
			}else{				
				por100 = anexo5(rbt12);
				System.out.println("Sua aliquota é: " + por100*100 + "\nO valor do DAS é: R$ " + por100*mensal);
			}		
		}
		char opcao;
		dasfinal+=(por100*mensal);
		if (volta > 1){
			System.out.println("\nDeseja somar com o valor anterior? \n s- Sim \n n- Não");
			opcao = sc.next().charAt(0);
			System.out.println("\n");
			switch (opcao){
			case 's': case 'S':
				System.out.println("\nSeu DAS somado é R$ " + dasfinal);
				break;
			default:
				dasfinal = 0;
				break;
		}}
		System.out.println("\nCalcular novamente? \n s - Sim \n n -não");
		opcao = sc.next().charAt(0);
		switch (opcao){
			case 's': case 'S':
				volta++;	
				break;
			default:
				volta = 0;
				break;
			}
		}	
	}
	
	static double anexo1 (double rbt12){ //comércio
	    double result = 0;
	    if(rbt12 <= 180000){
	    	result = (rbt12*0.04)/rbt12;
	    }
	    else if (rbt12 > 180000 && rbt12 <= 360000){
	    	result = ((rbt12*0.073)-5940)/rbt12;
	    	}
	    else if (rbt12 > 360000 && rbt12 <= 720000){
	    	result = ((rbt12*0.095)-13860)/rbt12;
	    	}
	    else if (rbt12 > 720000 && rbt12 <= 1800000){
	    	result = ((rbt12*0.1070)-22500)/rbt12;
	    	}
	    else if (rbt12 >1800000 && rbt12 <= 3600000){
	    	result = ((rbt12*0.1430)-87300)/rbt12;
	    	}
	    else if (rbt12 > 3600000 && rbt12 <= 4800000){
	    	result = ((rbt12*0.19)-378000)/rbt12;
	    	}
	    	else{
	    	System.out.println("Empresa não se enquadra");
	    	}
	    return result;
	}
	
	static double anexo2 (double rbt12){ //Industria
	    double result = 0;
	    if(rbt12 <= 180000){
	    	result = (rbt12*0.045)/rbt12;
	    }
	    else if (rbt12 > 180000 && rbt12 <= 360000){
	    	result = ((rbt12*0.078)-5940)/rbt12;
	    	}
	    else if (rbt12 > 360000 && rbt12 <= 720000){
	    	result = ((rbt12*0.10)-13860)/rbt12;
	    	}
	    else if (rbt12 > 720000 && rbt12 <= 1800000){
	    	result = ((rbt12*0.1120)-22500)/rbt12;
	    	}
	    else if (rbt12 >1800000 && rbt12 <= 3600000){
	    	result = ((rbt12*0.1470)-85500)/rbt12;
	    	}
	    else if (rbt12 > 3600000 && rbt12 <= 4800000){
	    	result = ((rbt12*0.30)-720000)/rbt12;
	    	}
	    	else{
	    	System.out.println("Empresa não se enquadra");
	    	}
	    return result;
	}
	
	static double anexo3 (double rbt12){ //Locação de bens, móveis e serviços
	    double result = 0;
	    if(rbt12 <= 180000){
	    	result = (rbt12*0.06)/rbt12;
	    }
	    else if (rbt12 > 180000 && rbt12 <= 360000){
	    	result = ((rbt12*0.112)-9360)/rbt12;
	    	}
	    else if (rbt12 > 360000 && rbt12 <= 720000){
	    	result = ((rbt12*0.135)-17640)/rbt12;
	    	}
	    else if (rbt12 > 720000 && rbt12 <= 1800000){
	    	result = ((rbt12*0.16)-35640)/rbt12;
	    	}
	    else if (rbt12 >1800000 && rbt12 <= 3600000){
	    	result = ((rbt12*0.21)-125640)/rbt12;
	    	}
	    else if (rbt12 > 3600000 && rbt12 <= 4800000){
	    	result = ((rbt12*0.33)-648000)/rbt12;
	    	}
	    	else{
	    	System.out.println("Empresa não se enquadra");
	    	}
	    return result;
	}
	
	static double anexo4 (double rbt12){ //Prestação de Serviços (§ 5º - C da LC 123/2006)
	    double result = 0;
	    if(rbt12 <= 180000){
	    	result = (rbt12*0.045)/rbt12;
	    }
	    else if (rbt12 > 180000 && rbt12 <= 360000){
	    	result = ((rbt12*0.09)-8100)/rbt12;
	    	}
	    else if (rbt12 > 360000 && rbt12 <= 720000){
	    	result = ((rbt12*0.1020)-12420)/rbt12;
	    	}
	    else if (rbt12 > 720000 && rbt12 <= 1800000){
	    	result = ((rbt12*0.140)-39780)/rbt12;
	    	}
	    else if (rbt12 >1800000 && rbt12 <= 3600000){
	    	result = ((rbt12*0.220)-183780)/rbt12;
	    	}
	    else if (rbt12 > 3600000 && rbt12 <= 4800000){
	    	result = ((rbt12*0.33)-828000)/rbt12;
	    	}
	    	else{
	    	System.out.println("Empresa não se enquadra");
	    	}
	    return result;
	}
	
	static double anexo5 (double rbt12){ //Prestação de Serviços (§ 5º - I da LC 123/2006)
	    double result = 0;
	    if(rbt12 <= 180000){
	    	result = (rbt12*0.155)/rbt12;
	    }
	    else if (rbt12 > 180000 && rbt12 <= 360000){
	    	result = ((rbt12*0.18)-4500)/rbt12;
	    	}
	    else if (rbt12 > 360000 && rbt12 <= 720000){
	    	result = ((rbt12*0.1950)-9900)/rbt12;
	    	}
	    else if (rbt12 > 720000 && rbt12 <= 1800000){
	    	result = ((rbt12*0.2050)-17100)/rbt12;
	    	}
	    else if (rbt12 >1800000 && rbt12 <= 3600000){
	    	result = ((rbt12*0.23)-62100)/rbt12;
	    	}
	    else if (rbt12 > 3600000 && rbt12 <= 4800000){
	    	result = ((rbt12*0.3050)-540000)/rbt12;
	    	}
	    	else{
	    	System.out.println("Empresa não se enquadra");
	    	}
	    return result;
	}
}





































