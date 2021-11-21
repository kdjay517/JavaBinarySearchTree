import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Operations operate = new Operations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Sorted Binary Tree Representation");
		System.out.println("\n1.Inorder\n2.PreOrder\n3.PostOrder\n4.check Element");
		switch(sc.nextInt()) {
		case 1:
			operate.inOrderTree();
			break;
		case 2:
			operate.preOrderTree();
			break;
		case 3:
			operate.postOrderTree();
			break;
		case 4:
			operate.containsNodeRecursive();
			break;
		default:
			sc.close();
			break;
		}
		sc.close();
	}
}
