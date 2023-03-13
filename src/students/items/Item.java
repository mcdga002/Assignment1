package students.items;

public class Item {
	//All items start at age 0, with the maturation age, death age, and monetary value set as part of its constructor. 
		private int age;
		private int deathAge;
		private int maturationAge;
		private int monetaryValue;
		
		public Item(int age, int deathAge, int maturationAge, int monetaryValue) {
			this.age = 0;
			this.deathAge = deathAge;
			this.monetaryValue = monetaryValue;
			this.maturationAge = maturationAge;
		}

	
}
