package Problem_01;

public class BalancingBracketsDriver{
	 
	public static void main(String[] args) {
		String brackets ="(([[{{}}]]))";
		boolean isBalanced=BalancingBrackets.checkBalancingBracktes(brackets);
		if(isBalanced) {
			System.out.println("Balanced bracktes");
		}
		else {
			System.out.println("Unbalanced brackets");
		}
	}
}