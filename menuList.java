import java.util.Scanner;
class mainClass{
	public static void main(String[] args){
		System.out.println("*********************************");
		System.out.println("*  Reasturant Management System *");
		System.out.println("*********************************");
		Scanner scan = new Scanner(System.in);
		menu menuNew = new menu();
		menuNew.selection();
	}
}


class menu{
	Scanner scan = new Scanner(System.in);
	int choiceSubmenu = 0;
	int quantity = 0;
	int amount = 0;
	int sum = 0;
	void select(){
			System.out.println("Are you done with your order: \n1.yes \n2.no");
			int choiceYes = scan.nextInt();
			if(choiceYes == 1){
				System.out.println("Total amount to pay = "+amount);
				System.out.println("*************THANK YOU*************");
				System.exit(0);
			}
			else if(choiceYes == 2){
				selection();
			}
			else{
				System.out.println("Please give correct response!!");
				select();
			}
		}
	void selection(){
		while(true){
			System.out.println("1. Starter");
			System.out.println("2. Main Meal");
			System.out.println("3. Drinks");
			System.out.println("4. Done");
			System.out.print("Enter Your choice: ");
			int choice = scan.nextInt();
			switch(choice){
				case 1: //starter menu
				while(true){
					System.out.println("1.Chilli Chicken.............Rs.100");
					System.out.println("2.Aloo Tikki.................Rs.50");
					System.out.println("3.Cheese Puffs...............Rs.60");
					System.out.println("4.Main menu");
					System.out.println("5. Done");
					System.out.println("Enter your food choice: ");
					choiceSubmenu = scan.nextInt();
					switch(choiceSubmenu){
						case 1:
						System.out.println("Enter the quantity: ");
						quantity = scan.nextInt();
						if(quantity < 99){
							sum = (100 * quantity);
							amount += sum;
							break;
						}
						else{
							System.out.println("Sorry that much quantity is not possible!!");
						}
						case 2:
						System.out.println("Enter quantity");
						quantity = scan.nextInt();
						if(quantity < 99){
							sum = (50 * quantity);
							amount += sum;
							break;
						}
						else{
							System.out.println("Sorry that much quantity is not possible!!");
						}
						case 3:
						System.out.println("Enter quantity");
						quantity = scan.nextInt();
						if(quantity < 99){
							sum = (60 * quantity);
							amount += sum;
							break;
						}
						else{
							System.out.println("Sorry that much quantity is not possible!!");
						}
						case 4:
						selection();
						break;
						case 5:
						select();
						break;
					}
				}
				case 2: //main meal menu
				while(true){
					System.out.println("1.Traditional Meal Loaf......Rs.200");
					System.out.println("2.Sunday Roast Chicken.......Rs.350");
					System.out.println("3.Fried Chicken..............Rs.250");
					System.out.println("4.Main menu");
					System.out.println("5.Done");
					System.out.println("Enter your food choice: ");
					choiceSubmenu = scan.nextInt();
					switch(choiceSubmenu){
						case 1:
						System.out.println("Enter the quantity: ");
						quantity = scan.nextInt();
						sum = (200 * quantity);
						amount += sum;
						break;
						case 2:
						System.out.println("Enter quantity");
						quantity = scan.nextInt();
						sum = (350 * quantity);
						amount += sum;
						break;
						case 3:
						System.out.println("Enter quantity");
						quantity = scan.nextInt();
						sum = (250 * quantity);
						amount += sum;
						break;
						case 4:
						selection();
						break;
						case 5:
						select();
						break;
					}
				}
				case 3: //drinks menu
				while(true){
					System.out.println("1.Coco-cola..................Rs.20");
					System.out.println("2.Mountain Dew...............Rs.20");
					System.out.println("3.Maaza......................Rs.20");
					System.out.println("4. Main menu");
					System.out.println("5.Done");
					System.out.println("Enter your drink choice: ");
					choiceSubmenu = scan.nextInt();
					switch(choiceSubmenu){
						case 1:
						System.out.println("Enter the quantity: ");
						quantity = scan.nextInt();
						sum = (20 * quantity);
						amount += sum;
						break;
						case 2:
						System.out.println("Enter quantity");
						quantity = scan.nextInt();
						sum = (20 * quantity);
						amount += sum;
						break;
						case 3:
						System.out.println("Enter quantity");
						quantity = scan.nextInt();
						sum = (20 * quantity);
						amount += sum;
						break;
						case 4:
						selection();
						break;
						case 5:
						select();
						break;
					}
				}
				case 4:
				System.out.println("Total amount to be paid = "+amount);
				System.out.println("********************THANK YOU*******************");
				System.exit(0);
				default: {
					System.out.println("Sorry Wrong Input!! Try Again...");
					selection();
				}
			}
		}
	}
}
