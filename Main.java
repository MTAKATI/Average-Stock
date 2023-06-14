
public class Main
{
	public static void main(String[] args){
		Stock company = new Stock();
		company.buy(36.6, 2000);
		company.buy(39.7, 3000);
		company.sell(42.9, 1000);
		System.out.println(company.getShares());
		System.out.println(company.getPrice());
		System.out.println(company.getAveragePrice());
	}
}
